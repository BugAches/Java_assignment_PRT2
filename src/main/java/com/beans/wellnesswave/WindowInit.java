
package com.beans.wellnesswave;

import com.beans.wellnesswave.GUI.WindowHome;
import com.beans.wellnesswave.older.WindowAdmin;
import com.beans.wellnesswave.GUI.WindowQuestionnaire;
import com.beans.wellnesswave.databaseControl.DBInsert;
import com.beans.wellnesswave.databaseControl.DBUpdate;
import com.beans.wellnesswave.utilities.Tools;
import com.beans.wellnesswave.utilities.Validation;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class WindowInit extends javax.swing.JFrame {

    public WindowInit() {
        initComponents();
        
        // maybe add this to all inputs? 
        // listens to keys being typed in for whitespaces
//        txtFieldUName1.addKeyListener(new java.awt.event.KeyAdapter() {
//            public void keyTyped(java.awt.event.KeyEvent evt) {
//                txtFieldUNameKeyTyped(evt);
//            }
//        });
        

//         Validation databaseSetup = new Validation();
//        databaseSetup.connect();
        
//        setDefaultCloseOperation(JOptionPane.showConfirmDialog(null,
//            "Are you sure you want to close the app?",
//            "Close app",
//            JOptionPane.OK_CANCEL_OPTION)); 
//https://stackoverflow.com/questions/6084039/create-custom-operation-for-setdefaultcloseoperation


//        jTabbedPane1.setSelectedIndex(7);
//        jTabbedPane1.setSelectedIndex(8);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        coverPane = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        enterAppBtn = new javax.swing.JLabel();
        paneForgotPassword = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lblEmail3 = new javax.swing.JLabel();
        lblConPassword6 = new javax.swing.JLabel();
        lblConPassword7 = new javax.swing.JLabel();
        resetEmail = new javax.swing.JTextField();
        resetPassword1 = new javax.swing.JPasswordField();
        resetPassword2 = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        paneLogin = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        paneAdminLogin = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lblFuName3 = new javax.swing.JLabel();
        lblUsername3 = new javax.swing.JLabel();
        ALoginEmail = new javax.swing.JTextField();
        ALoginPassword = new javax.swing.JPasswordField();
        signupLBtn3 = new javax.swing.JLabel();
        enterAppBtn2 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        paneUserLogin = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblFuName2 = new javax.swing.JLabel();
        lblUsername2 = new javax.swing.JLabel();
        PLoginEmail = new javax.swing.JTextField();
        PLoginPassword = new javax.swing.JPasswordField();
        signupLBtn2 = new javax.swing.JLabel();
        enterAppBtn1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        paneSignup = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        paneSignupA = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblFuName5 = new javax.swing.JLabel();
        txtFieldFName2 = new javax.swing.JTextField();
        lblUsername5 = new javax.swing.JLabel();
        txtFieldUName2 = new javax.swing.JTextField();
        lblEmail4 = new javax.swing.JLabel();
        txtFieldEmail2 = new javax.swing.JTextField();
        lblCreatePassword1 = new javax.swing.JLabel();
        txtFieldCreatePassword2 = new javax.swing.JPasswordField();
        lblConPassword3 = new javax.swing.JLabel();
        txtFieldConfirmPassword2 = new javax.swing.JPasswordField();
        signInBtn1 = new javax.swing.JButton();
        waveTitle1 = new javax.swing.JLabel();
        enterAppBtn4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        paneSignupP = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblFuName1 = new javax.swing.JLabel();
        txtFieldFName1 = new javax.swing.JTextField();
        lblUsername1 = new javax.swing.JLabel();
        txtFieldUName1 = new javax.swing.JTextField();
        lblEmail1 = new javax.swing.JLabel();
        txtFieldEmail1 = new javax.swing.JTextField();
        lblCreatePassword = new javax.swing.JLabel();
        txtFieldCreatePassword1 = new javax.swing.JPasswordField();
        lblConPassword2 = new javax.swing.JLabel();
        txtFieldConfirmPassword1 = new javax.swing.JPasswordField();
        signInBtn = new javax.swing.JButton();
        waveTitle = new javax.swing.JLabel();
        enterAppBtn3 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wellness Wave");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(2, 35, 100));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setOpaque(true);
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(600, 500));

        coverPane.setBackground(new java.awt.Color(47, 59, 4));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\jcbrm\\Documents\\#CPUT_all\\#CPUT_programming\\year2\\PRT2\\year_project\\wellness_wave_test3\\WellnessWave\\src\\main\\java\\com\\beans\\wellnesswave\\images\\WellnessWave_Logo_resize1.png")); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel22.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Cambria", 2, 48)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(135, 247, 85));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Wellness Wave");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel23.setPreferredSize(new java.awt.Dimension(80, 20));

        enterAppBtn.setBackground(new java.awt.Color(0, 0, 0));
        enterAppBtn.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        enterAppBtn.setForeground(new java.awt.Color(255, 255, 255));
        enterAppBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterAppBtn.setText("ENTER");
        enterAppBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        enterAppBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterAppBtn.setPreferredSize(new java.awt.Dimension(80, 20));
        enterAppBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterAppBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout coverPaneLayout = new javax.swing.GroupLayout(coverPane);
        coverPane.setLayout(coverPaneLayout);
        coverPaneLayout.setHorizontalGroup(
            coverPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coverPaneLayout.createSequentialGroup()
                .addGap(0, 211, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coverPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enterAppBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
            .addGroup(coverPaneLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        coverPaneLayout.setVerticalGroup(
            coverPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coverPaneLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(enterAppBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab7", coverPane);

        paneForgotPassword.setBackground(new java.awt.Color(118, 137, 72));

        jLabel19.setFont(new java.awt.Font("Cambria", 3, 30)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Reset your password");

        jPanel13.setBackground(new java.awt.Color(47, 59, 4));

        lblEmail3.setBackground(new java.awt.Color(47, 59, 4));
        lblEmail3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblEmail3.setForeground(new java.awt.Color(204, 204, 0));
        lblEmail3.setText("Email");
        lblEmail3.setOpaque(true);
        lblEmail3.setPreferredSize(new java.awt.Dimension(32, 40));

        lblConPassword6.setBackground(new java.awt.Color(47, 59, 4));
        lblConPassword6.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblConPassword6.setForeground(new java.awt.Color(204, 204, 0));
        lblConPassword6.setText("Password");
        lblConPassword6.setOpaque(true);
        lblConPassword6.setPreferredSize(new java.awt.Dimension(55, 40));

        lblConPassword7.setBackground(new java.awt.Color(47, 59, 4));
        lblConPassword7.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblConPassword7.setForeground(new java.awt.Color(204, 204, 0));
        lblConPassword7.setText("Confirm password");
        lblConPassword7.setOpaque(true);
        lblConPassword7.setPreferredSize(new java.awt.Dimension(108, 40));

        resetEmail.setBackground(new java.awt.Color(47, 59, 4));
        resetEmail.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        resetEmail.setForeground(new java.awt.Color(255, 255, 255));
        resetEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        resetEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        resetEmail.setPreferredSize(new java.awt.Dimension(1, 40));
        resetEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetEmailActionPerformed(evt);
            }
        });

        resetPassword1.setBackground(new java.awt.Color(47, 59, 4));
        resetPassword1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        resetPassword1.setForeground(new java.awt.Color(255, 255, 255));
        resetPassword1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        resetPassword1.setCaretColor(new java.awt.Color(255, 255, 255));
        resetPassword1.setPreferredSize(new java.awt.Dimension(1, 40));
        resetPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetPassword1ActionPerformed(evt);
            }
        });

        resetPassword2.setBackground(new java.awt.Color(47, 59, 4));
        resetPassword2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        resetPassword2.setForeground(new java.awt.Color(255, 255, 255));
        resetPassword2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        resetPassword2.setCaretColor(new java.awt.Color(255, 255, 255));
        resetPassword2.setPreferredSize(new java.awt.Dimension(1, 40));
        resetPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetPassword2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConPassword6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConPassword7, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resetEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetPassword2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(resetEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEmail3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblConPassword6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resetPassword1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resetPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConPassword7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Update password");
        jLabel20.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.setPreferredSize(new java.awt.Dimension(80, 20));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(47, 59, 4));
        jLabel21.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Back to Login");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.setOpaque(true);
        jLabel21.setPreferredSize(new java.awt.Dimension(80, 20));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paneForgotPasswordLayout = new javax.swing.GroupLayout(paneForgotPassword);
        paneForgotPassword.setLayout(paneForgotPasswordLayout);
        paneForgotPasswordLayout.setHorizontalGroup(
            paneForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneForgotPasswordLayout.createSequentialGroup()
                .addGroup(paneForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneForgotPasswordLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneForgotPasswordLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneForgotPasswordLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paneForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneForgotPasswordLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneForgotPasswordLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230))))
        );
        paneForgotPasswordLayout.setVerticalGroup(
            paneForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneForgotPasswordLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel19)
                .addGap(32, 32, 32)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("tab8", paneForgotPassword);

        paneLogin.setBackground(new java.awt.Color(118, 137, 72));
        paneLogin.setPreferredSize(new java.awt.Dimension(600, 500));

        jPanel6.setBackground(new java.awt.Color(47, 59, 4));
        jPanel6.setPreferredSize(new java.awt.Dimension(360, 200));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Administrator");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setPreferredSize(new java.awt.Dimension(140, 40));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Patient");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setPreferredSize(new java.awt.Dimension(140, 40));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jLabel1.setFont(new java.awt.Font("Cambria", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        jLabel9.setBackground(new java.awt.Color(149, 237, 136));
        jLabel9.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Create an account");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.setOpaque(true);
        jLabel9.setPreferredSize(new java.awt.Dimension(140, 40));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paneLoginLayout = new javax.swing.GroupLayout(paneLogin);
        paneLogin.setLayout(paneLoginLayout);
        paneLoginLayout.setHorizontalGroup(
            paneLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLoginLayout.createSequentialGroup()
                .addGroup(paneLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneLoginLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneLoginLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel1))
                    .addGroup(paneLoginLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(139, 139, 139))
        );
        paneLoginLayout.setVerticalGroup(
            paneLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLoginLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Login", paneLogin);

        paneAdminLogin.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Cambria", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Login");

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\jcbrm\\Documents\\#CPUT_all\\#CPUT_programming\\year2\\PRT2\\year_project\\wellness_wave_test3\\WellnessWave\\src\\main\\java\\com\\beans\\wellnesswave\\icons\\imageicons\\icons8-back-32.png")); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.setPreferredSize(new java.awt.Dimension(40, 40));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(223, 223, 91));

        lblFuName3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblFuName3.setText("Email");

        lblUsername3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblUsername3.setText("Password");

        ALoginEmail.setBackground(new java.awt.Color(223, 223, 91));
        ALoginEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        ALoginEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALoginEmailActionPerformed(evt);
            }
        });

        ALoginPassword.setBackground(new java.awt.Color(223, 223, 91));
        ALoginPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        ALoginPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALoginPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuName3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ALoginEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ALoginPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ALoginEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuName3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ALoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername3))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        signupLBtn3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        signupLBtn3.setForeground(new java.awt.Color(255, 255, 255));
        signupLBtn3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signupLBtn3.setText("LOGIN");
        signupLBtn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        signupLBtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupLBtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupLBtn3MouseClicked(evt);
            }
        });

        enterAppBtn2.setBackground(new java.awt.Color(0, 0, 0));
        enterAppBtn2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        enterAppBtn2.setForeground(new java.awt.Color(255, 255, 255));
        enterAppBtn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterAppBtn2.setText("Forgot password?");
        enterAppBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterAppBtn2.setPreferredSize(new java.awt.Dimension(80, 20));
        enterAppBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterAppBtn2MouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Administrator");

        javax.swing.GroupLayout paneAdminLoginLayout = new javax.swing.GroupLayout(paneAdminLogin);
        paneAdminLogin.setLayout(paneAdminLoginLayout);
        paneAdminLoginLayout.setHorizontalGroup(
            paneAdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneAdminLoginLayout.createSequentialGroup()
                .addGroup(paneAdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneAdminLoginLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addGroup(paneAdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(paneAdminLoginLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addGroup(paneAdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(signupLBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(enterAppBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneAdminLoginLayout.createSequentialGroup()
                .addGap(0, 126, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        paneAdminLoginLayout.setVerticalGroup(
            paneAdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneAdminLoginLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(383, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneAdminLoginLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addGap(51, 51, 51)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(signupLBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(enterAppBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        jTabbedPane1.addTab("AdminL", paneAdminLogin);

        paneUserLogin.setBackground(new java.awt.Color(47, 59, 4));

        jLabel5.setFont(new java.awt.Font("Cambria", 3, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Login");

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\jcbrm\\Documents\\#CPUT_all\\#CPUT_programming\\year2\\PRT2\\year_project\\wellness_wave_test3\\WellnessWave\\src\\main\\java\\com\\beans\\wellnesswave\\icons\\imageicons\\icons8-back-32.png")); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.setPreferredSize(new java.awt.Dimension(40, 40));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(223, 223, 91));

        lblFuName2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblFuName2.setText("Email");

        lblUsername2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblUsername2.setText("Password");

        PLoginEmail.setBackground(new java.awt.Color(223, 223, 91));
        PLoginEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        PLoginEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLoginEmailActionPerformed(evt);
            }
        });

        PLoginPassword.setBackground(new java.awt.Color(223, 223, 91));
        PLoginPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        PLoginPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLoginPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuName2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PLoginEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PLoginPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PLoginEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuName2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername2))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        signupLBtn2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        signupLBtn2.setForeground(new java.awt.Color(255, 255, 255));
        signupLBtn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signupLBtn2.setText("LOGIN");
        signupLBtn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        signupLBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupLBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupLBtn2MouseClicked(evt);
            }
        });

        enterAppBtn1.setBackground(new java.awt.Color(0, 0, 0));
        enterAppBtn1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        enterAppBtn1.setForeground(new java.awt.Color(255, 255, 255));
        enterAppBtn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterAppBtn1.setText("Forgot password?");
        enterAppBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterAppBtn1.setPreferredSize(new java.awt.Dimension(80, 20));
        enterAppBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterAppBtn1MouseClicked(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Patient");

        javax.swing.GroupLayout paneUserLoginLayout = new javax.swing.GroupLayout(paneUserLogin);
        paneUserLogin.setLayout(paneUserLoginLayout);
        paneUserLoginLayout.setHorizontalGroup(
            paneUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneUserLoginLayout.createSequentialGroup()
                .addGroup(paneUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneUserLoginLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addGroup(paneUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(signupLBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(enterAppBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(paneUserLoginLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneUserLoginLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addGroup(paneUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        paneUserLoginLayout.setVerticalGroup(
            paneUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneUserLoginLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(paneUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addGap(51, 51, 51)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(signupLBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(enterAppBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PatientL", paneUserLogin);

        paneSignup.setBackground(new java.awt.Color(47, 59, 4));

        jLabel6.setFont(new java.awt.Font("Cambria", 3, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Sign up");

        jPanel7.setBackground(new java.awt.Color(118, 137, 72));
        jPanel7.setPreferredSize(new java.awt.Dimension(360, 200));

        jLabel7.setBackground(new java.awt.Color(47, 59, 4));
        jLabel7.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Administrator");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setPreferredSize(new java.awt.Dimension(140, 40));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(47, 59, 4));
        jLabel8.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Patient");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setPreferredSize(new java.awt.Dimension(140, 40));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        jLabel12.setBackground(new java.awt.Color(149, 237, 136));
        jLabel12.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Go to Login");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.setOpaque(true);
        jLabel12.setPreferredSize(new java.awt.Dimension(140, 40));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paneSignupLayout = new javax.swing.GroupLayout(paneSignup);
        paneSignup.setLayout(paneSignupLayout);
        paneSignupLayout.setHorizontalGroup(
            paneSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneSignupLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
            .addGroup(paneSignupLayout.createSequentialGroup()
                .addGroup(paneSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneSignupLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneSignupLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel6)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        paneSignupLayout.setVerticalGroup(
            paneSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneSignupLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel6)
                .addGap(48, 48, 48)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SignUp", paneSignup);

        paneSignupA.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(223, 223, 91));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 240));

        lblFuName5.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        lblFuName5.setText("First name");
        lblFuName5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblFuName5.setPreferredSize(new java.awt.Dimension(120, 30));

        txtFieldFName2.setBackground(new java.awt.Color(223, 223, 91));
        txtFieldFName2.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        txtFieldFName2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtFieldFName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldFName2ActionPerformed(evt);
            }
        });

        lblUsername5.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        lblUsername5.setText("Last name");
        lblUsername5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblUsername5.setPreferredSize(new java.awt.Dimension(120, 30));

        txtFieldUName2.setBackground(new java.awt.Color(223, 223, 91));
        txtFieldUName2.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        txtFieldUName2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtFieldUName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldUName2ActionPerformed(evt);
            }
        });

        lblEmail4.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        lblEmail4.setText("Email");
        lblEmail4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblEmail4.setPreferredSize(new java.awt.Dimension(120, 30));

        txtFieldEmail2.setBackground(new java.awt.Color(223, 223, 91));
        txtFieldEmail2.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        txtFieldEmail2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtFieldEmail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldEmail2ActionPerformed(evt);
            }
        });

        lblCreatePassword1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        lblCreatePassword1.setText("Create password");
        lblCreatePassword1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblCreatePassword1.setPreferredSize(new java.awt.Dimension(120, 30));

        txtFieldCreatePassword2.setBackground(new java.awt.Color(223, 223, 91));
        txtFieldCreatePassword2.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        txtFieldCreatePassword2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtFieldCreatePassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldCreatePassword2ActionPerformed(evt);
            }
        });

        lblConPassword3.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        lblConPassword3.setText("Confirm password");
        lblConPassword3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblConPassword3.setPreferredSize(new java.awt.Dimension(120, 30));

        txtFieldConfirmPassword2.setBackground(new java.awt.Color(223, 223, 91));
        txtFieldConfirmPassword2.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        txtFieldConfirmPassword2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtFieldConfirmPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldConfirmPassword2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblUsername5, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFuName5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCreatePassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConPassword3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldUName2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldFName2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldCreatePassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtFieldConfirmPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFieldFName2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuName5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFieldUName2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFieldEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCreatePassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldCreatePassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblConPassword3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldConfirmPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        signInBtn1.setBackground(new java.awt.Color(255, 255, 255));
        signInBtn1.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        signInBtn1.setForeground(new java.awt.Color(255, 255, 255));
        signInBtn1.setText("Already have an account?");
        signInBtn1.setBorderPainted(false);
        signInBtn1.setContentAreaFilled(false);
        signInBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInBtn1MouseClicked(evt);
            }
        });
        signInBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInBtn1ActionPerformed(evt);
            }
        });

        waveTitle1.setFont(new java.awt.Font("Cambria", 3, 48)); // NOI18N
        waveTitle1.setForeground(new java.awt.Color(193, 255, 114));
        waveTitle1.setText("Sign Up");

        enterAppBtn4.setBackground(new java.awt.Color(223, 223, 91));
        enterAppBtn4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        enterAppBtn4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterAppBtn4.setText("SIGN UP");
        enterAppBtn4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(48, 234, 46)));
        enterAppBtn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterAppBtn4.setOpaque(true);
        enterAppBtn4.setPreferredSize(new java.awt.Dimension(80, 20));
        enterAppBtn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterAppBtn4MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(193, 255, 114));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Administrator");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(193, 255, 114));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon("C:\\Users\\jcbrm\\Documents\\#CPUT_all\\#CPUT_programming\\year2\\PRT2\\year_project\\wellness_wave_test3\\WellnessWave\\src\\main\\java\\com\\beans\\wellnesswave\\icons\\imageicons\\icons8-back-32.png")); // NOI18N
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paneSignupALayout = new javax.swing.GroupLayout(paneSignupA);
        paneSignupA.setLayout(paneSignupALayout);
        paneSignupALayout.setHorizontalGroup(
            paneSignupALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneSignupALayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneSignupALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(paneSignupALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(waveTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(213, 213, 213))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneSignupALayout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addGroup(paneSignupALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(enterAppBtn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(signInBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(209, 209, 209))
        );
        paneSignupALayout.setVerticalGroup(
            paneSignupALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneSignupALayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(paneSignupALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(waveTitle1)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(enterAppBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signInBtn1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab9", paneSignupA);

        paneSignupP.setBackground(new java.awt.Color(47, 59, 4));

        jPanel1.setBackground(new java.awt.Color(223, 223, 91));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 240));

        lblFuName1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        lblFuName1.setText("First name");
        lblFuName1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblFuName1.setPreferredSize(new java.awt.Dimension(120, 30));

        txtFieldFName1.setBackground(new java.awt.Color(223, 223, 91));
        txtFieldFName1.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        txtFieldFName1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtFieldFName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldFName1ActionPerformed(evt);
            }
        });

        lblUsername1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        lblUsername1.setText("Last name");
        lblUsername1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblUsername1.setPreferredSize(new java.awt.Dimension(120, 30));

        txtFieldUName1.setBackground(new java.awt.Color(223, 223, 91));
        txtFieldUName1.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        txtFieldUName1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtFieldUName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldUName1ActionPerformed(evt);
            }
        });

        lblEmail1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        lblEmail1.setText("Email");
        lblEmail1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblEmail1.setPreferredSize(new java.awt.Dimension(120, 30));

        txtFieldEmail1.setBackground(new java.awt.Color(223, 223, 91));
        txtFieldEmail1.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        txtFieldEmail1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtFieldEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldEmail1ActionPerformed(evt);
            }
        });

        lblCreatePassword.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        lblCreatePassword.setText("Create password");
        lblCreatePassword.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblCreatePassword.setPreferredSize(new java.awt.Dimension(120, 30));

        txtFieldCreatePassword1.setBackground(new java.awt.Color(223, 223, 91));
        txtFieldCreatePassword1.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        txtFieldCreatePassword1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtFieldCreatePassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldCreatePassword1ActionPerformed(evt);
            }
        });

        lblConPassword2.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        lblConPassword2.setText("Confirm password");
        lblConPassword2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblConPassword2.setPreferredSize(new java.awt.Dimension(120, 30));

        txtFieldConfirmPassword1.setBackground(new java.awt.Color(223, 223, 91));
        txtFieldConfirmPassword1.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        txtFieldConfirmPassword1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtFieldConfirmPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldConfirmPassword1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUsername1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFuName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCreatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldUName1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldFName1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldCreatePassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFieldConfirmPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFieldFName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFieldUName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFieldEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCreatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldCreatePassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblConPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldConfirmPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        signInBtn.setBackground(new java.awt.Color(255, 255, 255));
        signInBtn.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        signInBtn.setForeground(new java.awt.Color(255, 255, 255));
        signInBtn.setText("Already have an account?");
        signInBtn.setBorderPainted(false);
        signInBtn.setContentAreaFilled(false);
        signInBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInBtnMouseClicked(evt);
            }
        });
        signInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInBtnActionPerformed(evt);
            }
        });

        waveTitle.setFont(new java.awt.Font("Cambria", 3, 48)); // NOI18N
        waveTitle.setForeground(new java.awt.Color(193, 255, 114));
        waveTitle.setText("Sign Up");

        enterAppBtn3.setBackground(new java.awt.Color(223, 223, 91));
        enterAppBtn3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        enterAppBtn3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterAppBtn3.setText("SIGN UP");
        enterAppBtn3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(48, 234, 46)));
        enterAppBtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterAppBtn3.setOpaque(true);
        enterAppBtn3.setPreferredSize(new java.awt.Dimension(80, 20));
        enterAppBtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterAppBtn3MouseClicked(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(193, 255, 114));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Patient");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(193, 255, 114));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\jcbrm\\Documents\\#CPUT_all\\#CPUT_programming\\year2\\PRT2\\year_project\\wellness_wave_test3\\WellnessWave\\src\\main\\java\\com\\beans\\wellnesswave\\icons\\imageicons\\icons8-back-32.png")); // NOI18N
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paneSignupPLayout = new javax.swing.GroupLayout(paneSignupP);
        paneSignupP.setLayout(paneSignupPLayout);
        paneSignupPLayout.setHorizontalGroup(
            paneSignupPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneSignupPLayout.createSequentialGroup()
                .addGroup(paneSignupPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneSignupPLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneSignupPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27)
                        .addGap(170, 170, 170)
                        .addGroup(paneSignupPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(waveTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneSignupPLayout.createSequentialGroup()
                .addContainerGap(212, Short.MAX_VALUE)
                .addGroup(paneSignupPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(signInBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enterAppBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(211, 211, 211))
        );
        paneSignupPLayout.setVerticalGroup(
            paneSignupPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneSignupPLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(paneSignupPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(waveTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(enterAppBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signInBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab9", paneSignupP);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        this.goToLogin();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
       this.goToLogin();
    }//GEN-LAST:event_jLabel10MouseClicked

    // go to sign up link
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        jTabbedPane1.setSelectedIndex(5);
        this.setTitle("Welless Wave - Sign up");
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        this.goToLogin();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void PLoginEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLoginEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PLoginEmailActionPerformed

    private void PLoginPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLoginPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PLoginPasswordActionPerformed

    // SIGNUP
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_jLabel8MouseClicked
    // -------------------------
    
    private void ALoginEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALoginEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ALoginEmailActionPerformed

    private void ALoginPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALoginPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ALoginPasswordActionPerformed

    private void resetEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetEmailActionPerformed

    private void resetPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetPassword1ActionPerformed

    private void resetPassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetPassword2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetPassword2ActionPerformed

    // =============================
    // COVER
    private void enterAppBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterAppBtnMouseClicked
        jTabbedPane1.setSelectedIndex(2);
//        this.setTitle("Login");
        this.setTitle("Wellness Wave - Login");
    }//GEN-LAST:event_enterAppBtnMouseClicked

    private void enterAppBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterAppBtn1MouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_enterAppBtn1MouseClicked

    private void enterAppBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterAppBtn2MouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_enterAppBtn2MouseClicked

    private void txtFieldFName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldFName1ActionPerformed
        // to be coded...
    }//GEN-LAST:event_txtFieldFName1ActionPerformed

    private void txtFieldUName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldUName1ActionPerformed
        // to be coded...
    }//GEN-LAST:event_txtFieldUName1ActionPerformed

    private void txtFieldEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldEmail1ActionPerformed
        // to be coded...
    }//GEN-LAST:event_txtFieldEmail1ActionPerformed

    private void txtFieldCreatePassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCreatePassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldCreatePassword1ActionPerformed

    private void txtFieldConfirmPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldConfirmPassword1ActionPerformed
        // to be coded...
    }//GEN-LAST:event_txtFieldConfirmPassword1ActionPerformed

    private void signInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signInBtnActionPerformed

    // SIGN UP (patient)
    private void enterAppBtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterAppBtn3MouseClicked
        String name = txtFieldFName1.getText();
        String username = txtFieldUName1.getText();
        String email = txtFieldEmail1.getText();
        String createPassword = txtFieldCreatePassword1.getText();
        String confirmPassword = txtFieldConfirmPassword1.getText();

        if (name.isEmpty() && username.isEmpty() && email.isEmpty() && createPassword.isEmpty() && confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill In the Sign Up Form", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        else if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Full Name Is Required", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (username.equals("")) {
            JOptionPane.showMessageDialog(null, "Username Is Mandatory", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "Email Address Is Mandatory", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (createPassword.equals("")) {
            JOptionPane.showMessageDialog(null, "Password Is Mandatory", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (confirmPassword.equals("")) {
            JOptionPane.showMessageDialog(null, "Confirming password Is Mandatory", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (!username.matches("^[a-z0-9_]*$")) {
            JOptionPane.showMessageDialog(null, "Error: Username can only contain lowercase letters, numbers, and underscores (_).", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (!email.contains("@") || !email.contains(".")) {
            JOptionPane.showMessageDialog(null, "Invalid Email Address. It should contain '@' symbol and domain name", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (createPassword.length() > 14) {
            JOptionPane.showMessageDialog(null, "Password should not exceed 14 characters", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (confirmPassword.length() > 14) {
            JOptionPane.showMessageDialog(null, "Password should not exceed 14 characters", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (!createPassword.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(null, "Password does not match", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        // successful sign up
        else {
            JOptionPane.showMessageDialog(null, "You Have Signed Up Successfully", "SIGNED UP", JOptionPane.PLAIN_MESSAGE);

            // close current window
            this.dispose();
            
            // add to database
            DBInsert DBC = new DBInsert();
            DBC.connect();
            
            String ID = Tools.createUserID(name, email); 
            DBC.insertRecord("user_temp", ID, name, username, email, "patient");
            DBC.insertRecord("login", email, createPassword);

            DBC.terminate();
            
            // next window
            new WindowQuestionnaire(ID).setVisible(true);
//            new WindowSelectDisorder().setVisible(true);
        }
    }//GEN-LAST:event_enterAppBtn3MouseClicked

    private void signInBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInBtnMouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_signInBtnMouseClicked

    private void txtFieldFName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldFName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldFName2ActionPerformed

    private void txtFieldUName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldUName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldUName2ActionPerformed

    private void txtFieldEmail2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldEmail2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldEmail2ActionPerformed

    private void txtFieldCreatePassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCreatePassword2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldCreatePassword2ActionPerformed

    private void txtFieldConfirmPassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldConfirmPassword2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldConfirmPassword2ActionPerformed

    private void signInBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInBtn1MouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_signInBtn1MouseClicked

    private void signInBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signInBtn1ActionPerformed

    // SIGN UP (admin)
    private void enterAppBtn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterAppBtn4MouseClicked
        String name = txtFieldFName2.getText();
        String username = txtFieldUName2.getText();
        String email = txtFieldEmail2.getText();
        String createPassword = txtFieldCreatePassword2.getText();
        String confirmPassword = txtFieldConfirmPassword2.getText();

        if (name.isEmpty() && username.isEmpty() && email.isEmpty() && createPassword.isEmpty() && confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill In the Sign Up Form", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        else if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Full Name Is Required", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (username.equals("")) {
            JOptionPane.showMessageDialog(null, "Username Is Mandatory", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "Email Address Is Mandatory", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (createPassword.equals("")) {
            JOptionPane.showMessageDialog(null, "Password Is Mandatory", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (confirmPassword.equals("")) {
            JOptionPane.showMessageDialog(null, "Confirming password Is Mandatory", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (!username.matches("^[a-z0-9_]*$")) {
            JOptionPane.showMessageDialog(null, "Error: Username can only contain lowercase letters, numbers, and underscores (_).", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (!email.contains("@") || !email.contains(".")) {
            JOptionPane.showMessageDialog(null, "Invalid Email Address. It should contain '@' symbol and domain name", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (createPassword.length() > 14) {
            JOptionPane.showMessageDialog(null, "Password should not exceed 14 characters", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (confirmPassword.length() > 14) {
            JOptionPane.showMessageDialog(null, "Password should not exceed 14 characters", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (!createPassword.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(null, "Password does not match", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        // successful sign up
        else {
            JOptionPane.showMessageDialog(null, "You Have Signed Up Successfully", "SIGNED UP", JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null, "Log in with your credentials", "Navigating to LOGIN", JOptionPane.PLAIN_MESSAGE);

            
            // re-direct login
            this.jTabbedPane1.setSelectedIndex(2);
            
            // add to database
            DBInsert DBC = new DBInsert();
            DBC.connect();
            
            String ID = Tools.createUserID(name, email); 
            DBC.insertRecord("user_temp", ID, name, username, email, "admin");
            DBC.insertRecord("login", email, createPassword);
            DBC.terminate();
        }
    }//GEN-LAST:event_enterAppBtn4MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        jTabbedPane1.setSelectedIndex(2);
        this.setTitle("Wellness Wave - Login");
    }//GEN-LAST:event_jLabel21MouseClicked

    // SIGN UP
    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        this.goToSignUp();
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        this.goToSignUp();
    }//GEN-LAST:event_jLabel27MouseClicked
    // =============================

    // LOGIN
    // Validation v = new Validation();

    // patient
    private void signupLBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupLBtn2MouseClicked
        Validation v = new Validation();

        String adminEmail = PLoginEmail.getText();
        String adminPassword = PLoginPassword.getText();
        
        System.out.println(adminEmail + " " + adminPassword);
        
        boolean a = v.checkLoginPair(adminEmail, adminPassword);
        System.out.println("correct credentials: " + a);
        v.terminate();

        if (a){
            this.dispose();
//            new WindowHome().setVisible(true);
            new WindowHome(adminEmail).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(
                null,
                "Incorrect credentials"    
            );
        }
        
    }//GEN-LAST:event_signupLBtn2MouseClicked

    // admin
    private void signupLBtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupLBtn3MouseClicked
        String adminEmail = ALoginEmail.getText();
        String adminPassword = ALoginPassword.getText();
        
        System.out.println("NEW---------");
        System.out.println(adminEmail + " " + adminPassword);
        
        Validation v = new Validation();
        boolean a = v.checkLoginPair(adminEmail, adminPassword);
        System.out.println("correct credentials: " + a);
        v.terminate();

        if (a){
            this.dispose();
//            new WindowAdmin().setVisible(true);
            new WindowAdmin(adminEmail).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(
                null,
                "Incorrect credentials"    
            );
        }
        
        
//        DBRead.connect();
//        DBRead.readAllRecords("login", 2);
//        DBRead.terminate();
    }//GEN-LAST:event_signupLBtn3MouseClicked

    
    // RESET PASSWORD
    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        String resetEmail = this.resetEmail.getText();
        String resetPassword = resetPassword1.getText(); 
        String resetPasswordConfirm = resetPassword2.getText(); 

        if (resetPassword.equals(resetPasswordConfirm)){
            // Validation v = new Validation();
            DBUpdate.connect();
            DBUpdate.update("login", resetEmail, resetPassword);
            
            System.out.println(resetEmail);
            
            System.out.println(resetPassword);

            // DBUpdate.checkIfKeyInDB("login", "email", resetEmail);
            
//        boolean a = v.checkLoginPair(adminEmail, adminPassword);
//        System.out.println("correct credentials: " + a);
//        v.terminate();
//
//        if (a){
//            this.dispose();
//            new WindowAdmin().setVisible(true);
//        }
//        else{
//            JOptionPane.showMessageDialog(
//                null,
//                "Incorrect credentials"    
//            );
//        }
        }
        
        else{
            JOptionPane.showMessageDialog(
                null,
                "Passwords do not match"    
            );
        }
//      
    }//GEN-LAST:event_jLabel20MouseClicked
    
    // =============================

    // ----------------------------------

    // code for closing the frame
    public void closeFrame(){
        int closeCode = JOptionPane.showConfirmDialog(null, 
                "Are you sure you want to close the app?",
                "Close app",
                JOptionPane.OK_CANCEL_OPTION);
        System.out.println(closeCode);
        
        if (closeCode == 0){
            System.out.println("closing...");
            this.dispose();
        }
    }
    
    public void goToLogin(){
        jTabbedPane1.setSelectedIndex(2);
        this.setTitle("Wellness Wave - Login");
    }
    public void goToSignUp(){
        jTabbedPane1.setSelectedIndex(5);
        this.setTitle("Wellness Wave - Sign Up");
    }
  
    
    // ----------------------------------
    // MAIN
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
            java.util.logging.Logger.getLogger(WindowInit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowInit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowInit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowInit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowInit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ALoginEmail;
    private javax.swing.JPasswordField ALoginPassword;
    private javax.swing.JTextField PLoginEmail;
    private javax.swing.JPasswordField PLoginPassword;
    private javax.swing.JPanel coverPane;
    private javax.swing.JLabel enterAppBtn;
    private javax.swing.JLabel enterAppBtn1;
    private javax.swing.JLabel enterAppBtn2;
    private javax.swing.JLabel enterAppBtn3;
    private javax.swing.JLabel enterAppBtn4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblConPassword2;
    private javax.swing.JLabel lblConPassword3;
    private javax.swing.JLabel lblConPassword6;
    private javax.swing.JLabel lblConPassword7;
    private javax.swing.JLabel lblCreatePassword;
    private javax.swing.JLabel lblCreatePassword1;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblEmail3;
    private javax.swing.JLabel lblEmail4;
    private javax.swing.JLabel lblFuName1;
    private javax.swing.JLabel lblFuName2;
    private javax.swing.JLabel lblFuName3;
    private javax.swing.JLabel lblFuName5;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JLabel lblUsername2;
    private javax.swing.JLabel lblUsername3;
    private javax.swing.JLabel lblUsername5;
    private javax.swing.JPanel paneAdminLogin;
    private javax.swing.JPanel paneForgotPassword;
    private javax.swing.JPanel paneLogin;
    private javax.swing.JPanel paneSignup;
    private javax.swing.JPanel paneSignupA;
    private javax.swing.JPanel paneSignupP;
    private javax.swing.JPanel paneUserLogin;
    private javax.swing.JTextField resetEmail;
    private javax.swing.JPasswordField resetPassword1;
    private javax.swing.JPasswordField resetPassword2;
    private javax.swing.JButton signInBtn;
    private javax.swing.JButton signInBtn1;
    private javax.swing.JLabel signupLBtn2;
    private javax.swing.JLabel signupLBtn3;
    private javax.swing.JPasswordField txtFieldConfirmPassword1;
    private javax.swing.JPasswordField txtFieldConfirmPassword2;
    private javax.swing.JPasswordField txtFieldCreatePassword1;
    private javax.swing.JPasswordField txtFieldCreatePassword2;
    private javax.swing.JTextField txtFieldEmail1;
    private javax.swing.JTextField txtFieldEmail2;
    private javax.swing.JTextField txtFieldFName1;
    private javax.swing.JTextField txtFieldFName2;
    private javax.swing.JTextField txtFieldUName1;
    private javax.swing.JTextField txtFieldUName2;
    private javax.swing.JLabel waveTitle;
    private javax.swing.JLabel waveTitle1;
    // End of variables declaration//GEN-END:variables
}
