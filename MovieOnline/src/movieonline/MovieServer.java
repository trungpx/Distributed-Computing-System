package movieonline;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MovieServer {
    public static void main(String[] args) throws Exception {
        if(System.getSecurityManager()==null) {
            System.setSecurityManager(new SecurityManager());
        }

        MovieImpl m = new MovieImpl();
        //Registry registry = LocateRegistry.createRegistry(9999);
        //Registry registry = LocateRegistry.createRegistry(1098);
        //registry.rebind("TestMovie", m);
        Naming.rebind("rmi://localhost:1099/TestMovie", m);
        System.out.println("Movie server started...");
    }
}
