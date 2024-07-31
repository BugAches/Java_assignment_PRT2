package com.beans.wellnesswave.GUI;

import com.beans.wellnesswave.WindowInit;
import com.beans.wellnesswave.databaseControl.DBInsert;
import com.beans.wellnesswave.utilities.Tools;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;

public class WindowBill extends javax.swing.JFrame {

    public WindowBill() {
        initComponents();
        //setSize(Toolkit.getDefaultToolkit().getScreenSize()); //suitable to certain screen size of device
    }

    protected String userID;

    public WindowBill(String inUserID) {
        initComponents();

        this.userID = inUserID;
        System.out.println("user ID: " + this.userID);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        formPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblFuName = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        inAccNum = new javax.swing.JTextField();
        inCardType = new javax.swing.JComboBox<>();
        heading = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wellness Wave (Payment)");
        setBackground(new java.awt.Color(150, 185, 12));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(118, 137, 72));
        mainPanel.setPreferredSize(new java.awt.Dimension(600, 500));

        formPanel.setBackground(new java.awt.Color(118, 137, 72));

        jPanel3.setBackground(new java.awt.Color(150, 185, 12));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFuName.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblFuName.setText("Account number");

        lblUsername.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblUsername.setText("Price per month: R200");

        lblEmail.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblEmail.setText("Card type");

        inAccNum.setBackground(new java.awt.Color(150, 185, 12));
        inAccNum.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        inAccNum.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        inAccNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inAccNumActionPerformed(evt);
            }
        });

        inCardType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Debit", "Credit" }));
        inCardType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                inCardTypeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inCardType, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblFuName, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuName))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(inCardType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(lblUsername)
                .addGap(39, 39, 39))
        );

        heading.setBackground(new java.awt.Color(193, 255, 114));
        heading.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
        heading.setForeground(new java.awt.Color(193, 255, 114));
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("Payment details");

        errorMessage.setForeground(new java.awt.Color(255, 255, 255));
        errorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setBackground(new java.awt.Color(193, 255, 114));
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGN UP");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 40));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(heading))
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(heading)
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(formPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inAccNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inAccNumActionPerformed
        // to be coded...
    }//GEN-LAST:event_inAccNumActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // verify input fields

//- bill(order_ID, user_ID, account_num, card_type, price)
//        else if (!email.contains("@") || !email.contains(".")) {
//            JOptionPane.showMessageDialog(null, "Invalid Email Address. It should contain '@' symbol and domain name", "ERROR", JOptionPane.ERROR_MESSAGE);
//        } else if (createPassword.length() > 14) {
//            JOptionPane.showMessageDialog(null, "Password should not exceed 14 characters", "ERROR", JOptionPane.ERROR_MESSAGE);
//        }
        String accNum = inAccNum.getText();

//        if (accNum.contains("abcdefghijklmnopqrstuvwxyz")) {
//            JOptionPane.showMessageDialog(
//                    null,
//                    "Cannot contain letters",
//                    "ERROR",
//                    JOptionPane.ERROR_MESSAGE
//            );
//
//            this.errorMessage.setText("Account number cannot contain letters");
//        } 
  
        if (!this.checkIfInt(accNum)){
//            JOptionPane.showMessageDialog(
//                    null,
//                    "Cannot contain letters",
//                    "ERROR",
//                    JOptionPane.ERROR_MESSAGE
//            );

            this.errorMessage.setText("Account number cannot contain letters");
        }
        
        else if (inAccNum.getText().equals("")) {
            this.errorMessage.setText("Enter an account number");
        } 
        else if (accNum.length() < 8) {
//            JOptionPane.showMessageDialog(
//                null, 
//                "Account number should be 16 digits long", 
//                "ERROR", 
//                JOptionPane.ERROR_MESSAGE
//            );
            this.errorMessage.setText("Account number should be 8 digits or longer");
        } // success
        //        else if (!inAccNum.getText().equals("")){
        else {

            System.out.println(selectedCardType);
            System.out.println(accNum);
            String orderID = Tools.createUserID(accNum, this.userID);

            // add to table
            DBInsert insert = new DBInsert();
            insert.insertRecord(
                    "bill_temp",
                    orderID,
                    this.userID,
                    accNum,
                    selectedCardType,
                    "R200"
            );

            JOptionPane.showMessageDialog(
                    null,
                    "Log in with your credentials",
                    "Success",
                    JOptionPane.PLAIN_MESSAGE
            );
            this.dispose();

            // go to login window
            new WindowInit().setVisible(true);
        }

    }//GEN-LAST:event_jLabel1MouseClicked

    private String selectedCardType = "Debit";
    private void inCardTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_inCardTypeItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            System.out.println("SELECTED...");

            Object item = evt.getItem();

            System.out.println(item.toString());

            selectedCardType = item.toString();
        }
    }//GEN-LAST:event_inCardTypeItemStateChanged

    // from 
    // https://www.studytonight.com/java-examples/check-if-input-is-integer-in-java#:~:text=hasNextInt()%20method%20checks%20whether,otherwise%20it%20will%20return%20false.
    
    public boolean checkIfInt(String input) {
//		String input = "1234";           
        Boolean flag = true;
        for (int a = 0; a < input.length(); a++) {
            if (a == 0 && input.charAt(a) == '-') {
                continue;
            }
            if (!Character.isDigit(input.charAt(a))) {
                flag = false;
            }
        }
//        if (flag) {
//            System.out.println(input + " is valid Integer");
//        }
        return flag;

    }

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
            java.util.logging.Logger.getLogger(WindowSelectDisorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowSelectDisorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowSelectDisorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowSelectDisorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorMessage;
    private javax.swing.JPanel formPanel;
    private javax.swing.JLabel heading;
    private javax.swing.JTextField inAccNum;
    private javax.swing.JComboBox<String> inCardType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFuName;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
