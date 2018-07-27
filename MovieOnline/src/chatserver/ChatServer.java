/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver;

import java.rmi.Naming;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ChatServer {
        public static void main(String[] args) throws Exception {
        if(System.getSecurityManager()==null) 
        {
            System.setSecurityManager(new SecurityManager());
        }
        try 
        {
        System.out.println("Starting Chat Server");
        ChatImpl b = new ChatImpl();
        //Registry registry = LocateRegistry.createRegistry(1099);
        //registry.rebind("TestBank", b);
        Naming.rebind("rmi://localhost:1099/chatServer", b);
        System.out.println("Chat server started...");
        } catch (Exception ex) {
            Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
