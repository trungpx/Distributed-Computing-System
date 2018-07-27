package movieonline;

import java.rmi.Naming;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BankServer {
    public static void main(String[] args) throws Exception {
        if(System.getSecurityManager()==null) {
            System.setSecurityManager(new SecurityManager());
        }
        BankImpl b = new BankImpl();
        //Registry registry = LocateRegistry.createRegistry(1099);
        //registry.rebind("TestBank", b);
        
        Naming.rebind("rmi://localhost:1099/TestBank", b);
        System.out.println("Bank server started...");
    }
}
