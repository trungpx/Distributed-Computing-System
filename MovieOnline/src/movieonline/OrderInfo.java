package movieonline;

public class OrderInfo implements java.io.Serializable{
    /*
    OrderInfo class is define order's information to structure.
    orderCount = manage orderID not overlapping each other
    orderID = orderID
    virtualAccount = virtual account ID
    usrAdr = user address
    proID = product ID
    amount = order amount
    totalPrice = totalPrice related to order
    purchased = check purchased or not
    */
    private static int orderCount = 1;
    int orderID;
    int virtualAccount;
    String usrAdr;
    String proID;
    int amount;
    int totalPrice;
    String purchased;
    String name;
    String email;
    String seats;
    OrderInfo() { }

    OrderInfo(int virtualAccount, String usrAdr, String proID, int amount, int totalPrice, String purchased, String seats) {
        this.orderID = orderCount++;
        this.virtualAccount = virtualAccount;
        this.usrAdr = usrAdr;
        this.proID = proID;
        this.amount = amount;
        this.totalPrice = totalPrice;
        this.purchased = purchased;
        this.seats = seats;
        //this.name = name;
        //this.email = email;
    }

    boolean notPurchasedOrder () {
        return this.purchased.equals("not purchased");
    } // check purchased or not to know what order was not purchased.

    @Override
    public String toString() {
        return String.format("OrderID : %d,\n Account: %d,\n Address : %s,\n Film ID : %s,\n No. ticket : %d,\n Price : %d,\n purchased : %s, \n Seats selected: %s", orderID, virtualAccount, usrAdr, proID, amount, totalPrice, purchased, seats);
    }
}
