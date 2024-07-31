
package com.beans.wellnesswave.GUI;

import com.beans.wellnesswave.databaseControl.DBInsert;
import com.beans.wellnesswave.databaseControl.DBRead;

// -------------------

import java.awt.Color;
import java.util.Random;
import javax.swing.JLabel; 
import javax.swing.JOptionPane;


public class WindowHome extends javax.swing.JFrame {
    public WindowHome() {
        initComponents();
    }
    
    protected String userEmail;
    protected String userID; 
    public WindowHome(String inUserEmail){
        initComponents();
         
        this.userEmail = inUserEmail;
        System.out.println("Email: " + userEmail);
        this.changeEmail.setText(userEmail); 
        
        this.setUserInfo(userEmail);
    }
    
    public void setUserInfo(String email){
        DBRead.connect();
        String[] info = DBRead.readAllRecords("user_temp", 5, email);
        DBRead.terminate(); 
        
        System.out.println(info[0]);
        System.out.println(info[1]);
        System.out.println(info[2]);

        this.changeUsername.setText(info[0]);
        this.changeFirstName.setText(info[1]);
        this.changeLastName.setText(info[2]);
        

        this.userID = info[0];
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sidebar = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        homeLBtn = new javax.swing.JLabel();
        profileLBtn = new javax.swing.JLabel();
        journalLBtn = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        resourceLabel = new javax.swing.JLabel();
        advicePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        imgLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        imageProfile = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        changeUsername = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        changeFirstName = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        changeLastName = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        changeEmail = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        journalSpace = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wellness Wave");
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sidebar.setBackground(new java.awt.Color(59, 89, 22));
        Sidebar.setPreferredSize(new java.awt.Dimension(200, 600));

        jLabel11.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(193, 255, 114));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Wellness Wave");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NURTURING MINDS");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ENRICHING LIVES");

        homeLBtn.setBackground(new java.awt.Color(96, 119, 68));
        homeLBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        homeLBtn.setForeground(java.awt.Color.yellow);
        homeLBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeLBtn.setText("Home");
        homeLBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeLBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeLBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeLBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                homeLBtnMouseReleased(evt);
            }
        });

        profileLBtn.setBackground(new java.awt.Color(96, 119, 68));
        profileLBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        profileLBtn.setForeground(java.awt.Color.yellow);
        profileLBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileLBtn.setText("Profile");
        profileLBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileLBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileLBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileLBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileLBtnMouseExited(evt);
            }
        });

        journalLBtn.setBackground(new java.awt.Color(96, 119, 68));
        journalLBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        journalLBtn.setForeground(java.awt.Color.yellow);
        journalLBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        journalLBtn.setText("Journal");
        journalLBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        journalLBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                journalLBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                journalLBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                journalLBtnMouseExited(evt);
            }
        });

        exitLabel.setBackground(new java.awt.Color(255, 0, 0));
        exitLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exitLabel.setForeground(new java.awt.Color(255, 255, 255));
        exitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\jcbrm\\Documents\\#CPUT_all\\#CPUT_programming\\year2\\PRT2\\year_project\\wellness_wave_v0.0.4\\WellnessWave\\src\\main\\java\\com\\beans\\wellnesswave\\icons\\imageicons\\exit1.png")); // NOI18N
        exitLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SidebarLayout = new javax.swing.GroupLayout(Sidebar);
        Sidebar.setLayout(SidebarLayout);
        SidebarLayout.setHorizontalGroup(
            SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidebarLayout.createSequentialGroup()
                .addGroup(SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SidebarLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SidebarLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel7))
                    .addComponent(homeLBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profileLBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(journalLBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SidebarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SidebarLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        SidebarLayout.setVerticalGroup(
            SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidebarLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addGap(32, 32, 32)
                .addComponent(homeLBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(profileLBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(journalLBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(Sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -7, 210, 620));

        jTabbedPane1.setBackground(new java.awt.Color(51, 0, 255));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(800, 400));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(96, 119, 68));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Welcome to Wellness Wave");

        resourceLabel.setBackground(new java.awt.Color(59, 82, 4));
        resourceLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        resourceLabel.setForeground(new java.awt.Color(255, 255, 255));
        resourceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resourceLabel.setText("View Resources");
        resourceLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resourceLabel.setOpaque(true);
        resourceLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resourceLabelMouseClicked(evt);
            }
        });

        advicePanel.setBackground(new java.awt.Color(193, 255, 114));
        advicePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 255, 114), 2, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(150, 185, 12));
        jLabel1.setText("About Us");

        jScrollPane1.setBorder(null);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(193, 255, 114));
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("\nAt Wellness Wave, we believe that mental wellness is a journey to a happy and fulfilling life. \nOur mission is to provide a supportive community that guides you to growth and healing.\n\nBy joining the Wellness Wave, you will not only embark on a journey, \nbut also contribute to reducing stigma around mental health. \n\nWe, as Wellness Wave, want to nurture minds and enrich the lives of others.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout advicePanelLayout = new javax.swing.GroupLayout(advicePanel);
        advicePanel.setLayout(advicePanelLayout);
        advicePanelLayout.setHorizontalGroup(
            advicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(advicePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(advicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        advicePanelLayout.setVerticalGroup(
            advicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(advicePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );

        imgLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\jcbrm\\Documents\\#CPUT_all\\#CPUT_programming\\year2\\PRT2\\year_project\\wellness_wave_test3\\WellnessWave\\src\\main\\java\\com\\beans\\wellnesswave\\images\\HomeBg_resize1.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resourceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(advicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(imgLabel1)
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(advicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resourceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imgLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(96, 119, 68));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel4.setBackground(new java.awt.Color(193, 255, 114));
        jPanel4.setPreferredSize(new java.awt.Dimension(500, 400));

        header.setBackground(new java.awt.Color(105, 210, 28));

        imageProfile.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        imageProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageProfile.setIcon(new javax.swing.ImageIcon("C:\\Users\\jcbrm\\Documents\\#CPUT_all\\#CPUT_programming\\year2\\PRT2\\year_project\\wellness_wave_v0.0.4\\WellnessWave\\src\\main\\java\\com\\beans\\wellnesswave\\icons\\imageicons\\profile.png")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("User ID");
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 40));

        changeUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        changeUsername.setText("user_ID");
        changeUsername.setPreferredSize(new java.awt.Dimension(150, 40));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(imageProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changeUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(96, 119, 68));
        jLabel12.setText("First Name:");
        jLabel12.setPreferredSize(new java.awt.Dimension(150, 30));

        changeFirstName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        changeFirstName.setForeground(new java.awt.Color(56, 94, 10));
        changeFirstName.setText("first_name");
        changeFirstName.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(96, 119, 68));
        jLabel15.setText("Last Name:");
        jLabel15.setPreferredSize(new java.awt.Dimension(150, 30));

        changeLastName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        changeLastName.setForeground(new java.awt.Color(56, 94, 10));
        changeLastName.setText("last_name");
        changeLastName.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(96, 119, 68));
        jLabel13.setText("Email Address:");
        jLabel13.setPreferredSize(new java.awt.Dimension(150, 30));

        changeEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        changeEmail.setForeground(new java.awt.Color(56, 94, 10));
        changeEmail.setText("email_address");
        changeEmail.setPreferredSize(new java.awt.Dimension(150, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changeFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel4.setText("Account information");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(jLabel14))
                    .addComponent(jLabel4))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(jLabel14))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4)
                        .addGap(39, 39, 39)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        jPanel3.setBackground(new java.awt.Color(193, 255, 114));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel17.setText("Journal");

        journalSpace.setBackground(new java.awt.Color(243, 196, 167));
        journalSpace.setColumns(20);
        journalSpace.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        journalSpace.setLineWrap(true);
        journalSpace.setRows(5);
        journalSpace.setTabSize(4);
        journalSpace.setText("\n");
        journalSpace.setBorder(null);
        journalSpace.setMargin(new java.awt.Insets(10, 10, 10, 10));
        journalSpace.setMaximumSize(new java.awt.Dimension(2147483647, 350));
        journalSpace.setMinimumSize(new java.awt.Dimension(226, 35));
        journalSpace.setPreferredSize(new java.awt.Dimension(450, 250));
        journalSpace.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(journalSpace);

        jLabel18.setBackground(new java.awt.Color(193, 255, 114));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Add new entry");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel18.setOpaque(true);
        jLabel18.setPreferredSize(new java.awt.Dimension(150, 40));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(153, 153, 0));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("View entries");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel19.setOpaque(true);
        jLabel19.setPreferredSize(new java.awt.Dimension(150, 40));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, -27, -1, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void journalLBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_journalLBtnMouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_journalLBtnMouseClicked

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        int optionCode = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to exit?",
                "Exit",
                JOptionPane.PLAIN_MESSAGE);

        if (optionCode == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitLabelMouseClicked

    private void homeLBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLBtnMouseClicked
        jTabbedPane1.setSelectedIndex(0);
        homeLBtn.setBackground(Color.YELLOW);
        homeLBtn.setForeground(Color.BLACK);
//        homeLBtn.setBackground(Color.red);
//        homeLBtn.setForeground(Color.WHITE);
    }//GEN-LAST:event_homeLBtnMouseClicked

    private void profileLBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileLBtnMouseClicked
        jTabbedPane1.setSelectedIndex(1);
        this.offHover(homeLBtn);
    }//GEN-LAST:event_profileLBtnMouseClicked

    private void homeLBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLBtnMouseEntered
        this.onHover(homeLBtn);
    }//GEN-LAST:event_homeLBtnMouseEntered

    private void homeLBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLBtnMouseExited
        this.offHover(homeLBtn);
    }//GEN-LAST:event_homeLBtnMouseExited

    private void profileLBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileLBtnMouseEntered
        this.onHover(profileLBtn);
    }//GEN-LAST:event_profileLBtnMouseEntered

    private void profileLBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileLBtnMouseExited
        this.offHover(profileLBtn);
    }//GEN-LAST:event_profileLBtnMouseExited

    private void homeLBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLBtnMouseReleased
//        homeLBtn.setBackground(Color.YELLOW);
//        homeLBtn.setForeground(Color.BLACK);
        
//        this.onHover(homeLBtn);
    }//GEN-LAST:event_homeLBtnMouseReleased

    private void journalLBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_journalLBtnMouseEntered
        this.onHover(journalLBtn);
    }//GEN-LAST:event_journalLBtnMouseEntered

    private void journalLBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_journalLBtnMouseExited
        this.offHover(journalLBtn);
    }//GEN-LAST:event_journalLBtnMouseExited

    private void resourceLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resourceLabelMouseClicked
        // open a new frame
        //        JFrame rFrame = new JFrame("Resources");
        //
        //        rFrame.setSize(500, 300);
        //        rFrame.setVisible(true);
        //        rFrame.setLocale(null);
        //        rFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //

        new WindowResources().setVisible(true);
    }//GEN-LAST:event_resourceLabelMouseClicked

    
    private String generateRandomNumStr(){
        String rNum = "";
        
        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        int num3 = random.nextInt(100);

        rNum = String.valueOf(num1) + String.valueOf(num2) + String.valueOf(num3);
        return rNum;
    }
    
    // button
    // add new entry
    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        int confirmCode = JOptionPane.showConfirmDialog(
                null, 
                "Are your sure you want to add this to your journal?",
                "Add to journal",
                JOptionPane.PLAIN_MESSAGE
        );
        System.out.println("Code: " + confirmCode);
        
        if (confirmCode == 0){
            DBInsert insert = new DBInsert();
        
            String entry = journalSpace.getText();
            String journalID = this.generateRandomNumStr(); 
        
            insert.insertRecord("journal", journalID, this.userID, entry);
            insert.terminate();
            
            // display
            JOptionPane.showMessageDialog(
                null, 
                "Journal entry was saved successfully",
                "Success",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
        
        
    }//GEN-LAST:event_jLabel18MouseClicked

    // getting journal entries
    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        DBRead.connect();
        DBRead.readAndWrite("journal", 3, this.userID, this.userID);
//        DBRead.readAndWrite("journal", 3, this.userID);

        DBRead.terminate();
        
        // display
        JOptionPane.showMessageDialog(
                null, 
                "Journal entry was saved to a textfile",
                "Saved to textfile",
                JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_jLabel19MouseClicked

    // ==========================================================
    // CUSTOM METHODS
    
    // used for all buttons on side bar except for the exit button
    private void onHover(JLabel labelButton){
        labelButton.setBackground(Color.YELLOW);
        labelButton.setForeground(Color.BLACK);
    }
    private void offHover(JLabel labelButton){
        labelButton.setBackground(Color.BLACK);
        labelButton.setForeground(new Color(255,255,0));
    }
    
    // add custom icon
    
    // ==========================================================
    
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
            java.util.logging.Logger.getLogger(WindowHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowHome().setVisible(true);
            }
        });
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Sidebar;
    private javax.swing.JPanel advicePanel;
    private javax.swing.JLabel changeEmail;
    private javax.swing.JLabel changeFirstName;
    private javax.swing.JLabel changeLastName;
    private javax.swing.JLabel changeUsername;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel header;
    private javax.swing.JLabel homeLBtn;
    private javax.swing.JLabel imageProfile;
    private javax.swing.JLabel imgLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel journalLBtn;
    private javax.swing.JTextArea journalSpace;
    private javax.swing.JLabel profileLBtn;
    private javax.swing.JLabel resourceLabel;
    // End of variables declaration//GEN-END:variables
}
