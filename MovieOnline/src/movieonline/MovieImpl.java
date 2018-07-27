package movieonline;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MovieImpl extends UnicastRemoteObject implements Movie {
    Bank b; // create Back object
    HashMap<String, HashMap<String, MovieInfo>> proList = new HashMap<>();
    HashMap<String, UsrInfo> usrList = new HashMap<>();
    HashMap<Integer, Account> orderAccount = new HashMap<>();

    public MovieImpl() throws RemoteException, NotBoundException, MalformedURLException {
        /*
        class init
         */
        super();
        this.b = (Bank) Naming.lookup("rmi://localhost:1099/TestBank"); // Seller Movie try rmi connection with Bank Object.
        proList.put("Action", new HashMap<>());
        proList.put("Emotion", new HashMap<>());
        proList.put("Fight", new HashMap<>());
        proList.put("Horrific", new HashMap<>());



        proList.get("Action").put("100", new MovieInfo("Holliwood", 500, 25, "100"));
        proList.get("Emotion").put("101", new MovieInfo("One Disney", 400, 13, "101"));
        proList.get("Fight").put("110", new MovieInfo("Viet Nam", 300, 6, "110"));
        proList.get("Horrific").put("111", new MovieInfo("Korea", 200, 8, "111"));

        usrList.put("123", new UsrInfo("123", 123));
        usrList.put("456", new UsrInfo("456", 456));
        usrList.put("20188134", new UsrInfo("20188134", 20188134));
    }

    @Override
    public Boolean checkCustomer(String usrName, int usrPwd) throws RemoteException {
        /*
        proving login user is Shop's customer using user ID(name), password(pwd).
         */
        Boolean check = true;

        for (String key : usrList.keySet()) {
            if (key.equals(usrName)) {
                if (usrList.get(key).usrPwd == usrPwd)
                    check = false;
            }
        }
        return check;
    }

    @Override
    public ArrayList<MovieInfo> getProInfoByPrice(int from, int to) throws RemoteException {
        /*
        provide product information list by price
         */
        ArrayList<MovieInfo> productsInfo = new ArrayList<>();

        for (String type : proList.keySet()) {
            for (String ID : proList.get(type).keySet()) {
                if (proList.get(type).get(ID).price >= from && proList.get(type).get(ID).price <= to) {
                    productsInfo.add(proList.get(type).get(ID));
                }
            }
        }

        return productsInfo;
    }

    @Override
    public HashMap<String, MovieInfo> getProInfoByType(String type) throws RemoteException {
        /*
        provide product information list by type
         */
        return proList.get(type);
    }

    @Override
    public ArrayList<MovieInfo> getProInfoByBrand(String brand) throws RemoteException {
        /*
        provide product information list by brand
         */
        ArrayList<MovieInfo> productsInfo = new ArrayList<>();

        for (String type : proList.keySet()) {
            for (String ID : proList.get(type).keySet()) {
                if (brand.equals(proList.get(type).get(ID).brand)) {
                    productsInfo.add(proList.get(type).get(ID));
                }
            }
        }

        return productsInfo;
    }

    @Override
    public MovieInfo getProInfoByID(String ID) throws RemoteException {
        /*
        provide product information list by product ID
         */
        MovieInfo productInfo = new MovieInfo();

        for (String type : proList.keySet()) {
            for (String key : proList.get(type).keySet()) {
                if (ID.equals(proList.get(type).get(key).ID)) {
                    productInfo = proList.get(type).get(key);
                }
            }
        }

        return productInfo;
    }

    @Override
    public OrderInfo usrBuy(String usrName, String usrAdr, String type, String proID, int amount, String seats) throws RemoteException {
        /*
        user submit order
         */
        HashMap<String, MovieInfo> goodList = proList.get(type);
        OrderInfo info = null;

        if (goodList.get(proID) != null) {
            if (goodList.get(proID).amount >= amount) { // check product amount redundant or not

                Random random = new Random();
                int accPwd = random.nextInt(999) + 1; // create virtual account's random password

                Account account = b.makeVirtualAccount(accPwd); // call object BankImpl's makeVirtualAccount method

                // make order information and add order list
                info = new OrderInfo(account.accName, usrAdr, proID, amount, goodList.get(proID).price * amount, "not purchased", seats);
                orderAccount.put(info.orderID, account);
                usrList.get(usrName).usrOrder.add(info);

                // when submit order is completed, edit product amount.
                if (goodList.get(proID).amount == amount)
                    this.delProInfo(type, proID);
                else
                    this.editProInfo(type, proID, goodList.get(proID).price, goodList.get(proID).amount - amount);

            }
        }
        return info;
    }

    @Override
    public UsrInfo getOrderList(String usrName) throws RemoteException {
        /*
        provide order list information related user ID.
         */
        return usrList.get(usrName);
    }

    @Override
    public void addProInfo(String type, String brand, int price, int amount, String ID) throws RemoteException {
        /*
        add the new product information.
         */
        HashMap<String, MovieInfo> goodList = proList.get(type);
        goodList.put(ID, new MovieInfo(brand, price, amount, ID));

        System.out.println(goodList.get(ID));
    }

    @Override
    public void editProInfo(String type, String ID, int price, int amount) throws RemoteException {
        /*
        edit the product's amount about product ID.
         */
        HashMap<String, MovieInfo> goodList = proList.get(type);
        if (goodList.get(ID) != null) {
            goodList.get(ID).price = price;
            goodList.get(ID).amount = amount;
        }
    }

    @Override
    public void delProInfo(String type, String ID) throws RemoteException {
        /*
        delete the product information about product ID.
         */
        if (proList.get(type).get(ID) != null) {
            proList.get(type).remove(ID);
        }
    }

    @Override
    public HashMap<String, UsrInfo> checkTransfer() throws RemoteException {
        /*
        when seller request check transfer money from customer, check what order ID is purchased or not using notPurchasedOrder method.
        then, comparing not purchased order ID's virtualAccount's balance to order's totalPrice.
        when equal each other, ShopServer do transfer money virtualAccount to Seller account and edit order's purchased information to "purchased".
        */
        for (String key : usrList.keySet()) {
            for (int i = 0; i < usrList.get(key).usrOrder.size(); i++) {
                if (usrList.get(key).usrOrder.get(i).notPurchasedOrder()) {
                    if (b.checkDeposit(usrList.get(key).usrOrder.get(i).virtualAccount) == usrList.get(key).usrOrder.get(i).totalPrice) { // call object BankImpl's checkDeposit method
                        b.transfer(orderAccount.get(usrList.get(key).usrOrder.get(i).orderID).accName, orderAccount.get(usrList.get(key).usrOrder.get(i).orderID).accPwd, 456, b.checkDeposit(usrList.get(key).usrOrder.get(i).virtualAccount));
                        // call object BankImpl's transfer method
                        usrList.get(key).usrOrder.get(i).purchased = "Purchased";
                    }
                }
            }
        }
        return usrList;
    }
}
