package movieonline;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

public interface Movie extends Remote {
    Boolean checkCustomer(String usrName, int usrPwd) throws RemoteException;
    ArrayList<MovieInfo> getProInfoByPrice(int from, int to) throws RemoteException;
    HashMap<String, MovieInfo> getProInfoByType(String type) throws RemoteException;
    ArrayList<MovieInfo> getProInfoByBrand(String brand) throws RemoteException;
    MovieInfo getProInfoByID(String ID) throws RemoteException;
    OrderInfo usrBuy(String usrName, String usrAdr, String type, String proID, int amount, String seats) throws RemoteException;
    UsrInfo getOrderList(String usrName) throws RemoteException;
    void addProInfo(String type, String brand, int price, int amount, String ID) throws RemoteException;
    void editProInfo(String type, String ID, int price, int amount) throws RemoteException;
    void delProInfo(String type, String ID) throws RemoteException;
    HashMap<String, UsrInfo> checkTransfer() throws RemoteException;
}
