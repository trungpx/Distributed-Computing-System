/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatclient;

import chatserver.ChatInterface;
import chatserver.Message;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import java.text.ParseException;

/**
 *
 * @author Admin
 */
public class ChatView extends javax.swing.JFrame {

    /**
     * Creates new form ChatView
     */
        String username;
    ChatInterface chat;
    List<Message> msgs = new ArrayList<>();
    List<String> users = new ArrayList<>();

    public ChatView(ChatInterface chat, String username) throws RemoteException {
        initComponents();
        this.chat = chat;
        this.username = username;
        chat.login(username);
        execute();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        userListTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chatListTextArea = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        chatInputText = new javax.swing.JTextPane();
        sendButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        luvLabel = new javax.swing.JLabel();
        hpyLabel = new javax.swing.JLabel();
        lghLabel = new javax.swing.JLabel();
        sadLabel = new javax.swing.JLabel();
        supLabel = new javax.swing.JLabel();
        angLabel = new javax.swing.JLabel();
        tngLabel = new javax.swing.JLabel();
        glsLabel = new javax.swing.JLabel();
        ywnLabel = new javax.swing.JLabel();
        kisLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat and share your ideas");

        jPanel4.setBackground(new java.awt.Color(102, 204, 255));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        userListTextArea.setBackground(new java.awt.Color(102, 204, 255));
        userListTextArea.setColumns(20);
        userListTextArea.setRows(5);
        jScrollPane3.setViewportView(userListTextArea);

        jLabel1.setText("Online people now");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));

        jScrollPane1.setViewportView(chatListTextArea);

        chatInputText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                chatInputTextKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(chatInputText);

        sendButton.setBackground(new java.awt.Color(204, 204, 204));
        sendButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sendButton.setText("Send");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        nameLabel.setText("Name");

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(sendButton)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));

        luvLabel.setText("9");

        hpyLabel.setText("0");
        hpyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hpyLabelMouseClicked(evt);
            }
        });

        lghLabel.setText("1");

        sadLabel.setText("2");

        supLabel.setText("3");

        angLabel.setText("4");

        tngLabel.setText("5");

        glsLabel.setText("6");

        ywnLabel.setText("7");

        kisLabel.setText("8");

        jLabel11.setText("Add emotions");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(hpyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lghLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(sadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(supLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(angLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(tngLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(glsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(ywnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(kisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(luvLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel11)
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hpyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lghLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(angLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tngLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(glsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ywnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(luvLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void execute() {
        userListTextArea.setLineWrap(true);     // to remove horizontal scrolling bar 
        //setTitle("Public Chat");
        setImages();
        //addListeners();
        this.nameLabel.setText("My name in this conversation: " + username);
        this.setVisible(true);
        setLocationRelativeTo(null);            // to visible the GUI in the middle of the screen
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    refresh();                  // this thread is used to refresh the chat window by every second 
                    try {                       // to display whole chat list
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ChatView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        t1.start();
    }
    public void displayChatList() throws RemoteException {
        chatListTextArea.setText("");
        msgs = chat.getAllMessages();
        //String doc = "<html><body><table>";
        String doc = "\n";
        for (Message m : msgs) {
            if (!((m.getUsername().equals(username)) && (m.getType().equals("join")))) {
                String smileyName = m.getSmiley();
                Date date = m.getDate();
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                String a = dateFormat.format(date);
                SimpleDateFormat parseFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                SimpleDateFormat printFormat = new SimpleDateFormat("HH:mm:ss");
                try {
                    Date time = parseFormat.parse(a);
                    if (smileyName == null) {
                        //doc += "<tr><td>"
                                doc += ""
                                + printFormat.format(time)
                                + "     "
                                + m.getUsername()
                                + ": "
                                + m.getMsg()
                                + "\n";
                    } else {
                        doc += ""
                                + printFormat.format(time)
                                + ""
                                + m.getUsername()
                                + "</b></font></td><td><img src= '"
                                + this.getClass().getResource("/images/" + smileyName)
                                + "' width=50 height=50 /> </td></tr>";
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(ChatView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        doc += "";
        chatListTextArea.setText(doc);
        chatListTextArea.setCaretPosition(chatListTextArea.getDocument().getLength());
    }

    private void displayUserList() throws RemoteException {
        userListTextArea.setText("");
        users = chat.getAllUsers();
        for (String u : users) {
            if (!u.equals(username)) {
                userListTextArea.append(" " + u + "\n");
                userListTextArea.setCaretPosition(userListTextArea.getDocument().getLength());
            }
        }
    }

    public void refresh() {
        try {
            displayChatList();
            displayUserList();
        } catch (RemoteException ex) {
            Logger.getLogger(ChatView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void setImages() {
        ImageIcon icons[] = new ImageIcon[10];
        for (int i = 0; i < 10; i++) {
            icons[i] = new ImageIcon(getClass().getResource("/images/" + i + ".png"));
        }
        hpyLabel.setIcon(icons[0]);
        lghLabel.setIcon(icons[1]);
        sadLabel.setIcon(icons[2]);
        supLabel.setIcon(icons[3]);
        tngLabel.setIcon(icons[4]);
        angLabel.setIcon(icons[5]);
        glsLabel.setIcon(icons[6]);
        ywnLabel.setIcon(icons[7]);
        kisLabel.setIcon(icons[8]);
        luvLabel.setIcon(icons[9]);
    }
    public void mouseClicked(MouseEvent e) {
        Message message = new Message();
        message.setUsername(username);
        message.setType("client");
        message.setDate(new Date());
        if (e.getSource() == hpyLabel) {
            message.setSmiley("0.png");
        } else if (e.getSource() == lghLabel) {
            message.setSmiley("1.png");
        } else if (e.getSource() == sadLabel) {
            message.setSmiley("2.png");
        } else if (e.getSource() == supLabel) {
            message.setSmiley("3.png");
        } else if (e.getSource() == tngLabel) {
            message.setSmiley("4.png");
        } else if (e.getSource() == angLabel) {
            message.setSmiley("5.png");
        } else if (e.getSource() == glsLabel) {
            message.setSmiley("6.png");
        } else if (e.getSource() == ywnLabel) {
            message.setSmiley("7.png");
        } else if (e.getSource() == kisLabel) {
            message.setSmiley("8.png");
        } else if (e.getSource() == luvLabel) {
            message.setSmiley("9.png");
        }
        try {
            chat.sendMessage(message);
        } catch (RemoteException ex) {
            Logger.getLogger(ChatView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*
    private void addListeners() {
        hpyLabel.addMouseListener((MouseListener) this);
        lghLabel.addMouseListener((MouseListener) this);
        sadLabel.addMouseListener((MouseListener) this);
        supLabel.addMouseListener((MouseListener) this);
        tngLabel.addMouseListener((MouseListener) this);
        angLabel.addMouseListener((MouseListener) this);
        glsLabel.addMouseListener((MouseListener) this);
        ywnLabel.addMouseListener((MouseListener) this);
        kisLabel.addMouseListener((MouseListener) this);
        luvLabel.addMouseListener((MouseListener) this);
        chatInputText.addKeyListener((KeyListener) this);
    } */
    
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            sendNewMessage();
        }
    }
    
    private void sendNewMessage() {
        String inputMessage = chatInputText.getText();
        chatInputText.setText("");
        Message message = new Message();
        message.setUsername(username);
        message.setMsg(inputMessage);
        message.setType("client");
        message.setDate(new Date());
        try {
            chat.sendMessage(message);
        } catch (RemoteException ex) {
            Logger.getLogger(ChatView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        try {
            chat.logout(username);  //use the reference "chat" to call remote methods
            System.exit(0);
            //catch the exceptions may occur, Rubbish URL, RemoteException
        } catch (RemoteException ex) {
            Logger.getLogger(ChatView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        // TODO add your handling code here:
        sendNewMessage();
    }//GEN-LAST:event_sendButtonActionPerformed

    private void hpyLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hpyLabelMouseClicked
        // TODO add your handling code here:
        Message message = new Message();
        message.setUsername(username);
        message.setType("client");
        message.setDate(new Date());
        message.setSmiley("0.png");
        try {
            chat.sendMessage(message);
        } catch (RemoteException ex) {
            Logger.getLogger(ChatView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_hpyLabelMouseClicked

    private void chatInputTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chatInputTextKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            sendNewMessage();
        }
    }//GEN-LAST:event_chatInputTextKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
/*        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatView().setVisible(true);
            }
        }); */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel angLabel;
    private javax.swing.JTextPane chatInputText;
    private javax.swing.JTextPane chatListTextArea;
    private javax.swing.JLabel glsLabel;
    private javax.swing.JLabel hpyLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel kisLabel;
    private javax.swing.JLabel lghLabel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel luvLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel sadLabel;
    private javax.swing.JButton sendButton;
    private javax.swing.JLabel supLabel;
    private javax.swing.JLabel tngLabel;
    private javax.swing.JTextArea userListTextArea;
    private javax.swing.JLabel ywnLabel;
    // End of variables declaration//GEN-END:variables
}
