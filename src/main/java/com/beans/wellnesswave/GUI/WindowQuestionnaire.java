
package com.beans.wellnesswave.GUI; 

import com.beans.wellnesswave.utilities.QuestionnaireLogic;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;


public class WindowQuestionnaire extends javax.swing.JFrame {
    public WindowQuestionnaire() {
        initComponents();
    }

    protected String userID; 
    public WindowQuestionnaire(String inUserID) {
        initComponents();
        
        this.userID = inUserID; 
        System.out.println("user ID: " + this.userID);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wellBeing1 = new javax.swing.ButtonGroup();
        symtomsButtonGroup1 = new javax.swing.ButtonGroup();
        symtomsButtonGroup2 = new javax.swing.ButtonGroup();
        symtomsButtonGroup3 = new javax.swing.ButtonGroup();
        symtomsButtonGroup4 = new javax.swing.ButtonGroup();
        diagionsisButtonGroup1 = new javax.swing.ButtonGroup();
        diagionsisButtonGroup2 = new javax.swing.ButtonGroup();
        diagionsisButtonGroup3 = new javax.swing.ButtonGroup();
        diagionsisButtonGroup4 = new javax.swing.ButtonGroup();
        diagionsisButtonGroup5 = new javax.swing.ButtonGroup();
        diagionsisButtonGroup6 = new javax.swing.ButtonGroup();
        medicalHistory1 = new javax.swing.ButtonGroup();
        medicalHistory2 = new javax.swing.ButtonGroup();
        medicalHistory3 = new javax.swing.ButtonGroup();
        medicalHistory4 = new javax.swing.ButtonGroup();
        sidePane = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnSubmit1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rb1a = new javax.swing.JRadioButton();
        rb1b = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wellness Wave - Questionnaire");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePane.setBackground(new java.awt.Color(96, 119, 68));
        sidePane.setPreferredSize(new java.awt.Dimension(250, 500));

        jButton1.setBackground(new java.awt.Color(193, 255, 114));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Intro");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(193, 255, 114));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Symtoms");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(193, 255, 114));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Diagonsis");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(118, 137, 72));
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("SUBMIT");
        btnSubmit.setBorder(null);
        btnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubmit.setPreferredSize(new java.awt.Dimension(180, 40));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(193, 255, 114));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Wellness Wave");
        jLabel5.setPreferredSize(new java.awt.Dimension(180, 40));

        btnSubmit1.setBackground(new java.awt.Color(118, 137, 72));
        btnSubmit1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnSubmit1.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit1.setText("RESET");
        btnSubmit1.setBorder(null);
        btnSubmit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubmit1.setPreferredSize(new java.awt.Dimension(180, 40));
        btnSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePaneLayout = new javax.swing.GroupLayout(sidePane);
        sidePane.setLayout(sidePaneLayout);
        sidePaneLayout.setHorizontalGroup(
            sidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePaneLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(sidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePaneLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(sidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        sidePaneLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3});

        sidePaneLayout.setVerticalGroup(
            sidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePaneLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(77, 77, 77)
                .addComponent(btnSubmit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        sidePaneLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3});

        getContentPane().add(sidePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, -1));

        jTabbedPane1.setBackground(new java.awt.Color(96, 119, 68));

        jPanel3.setBackground(new java.awt.Color(71, 98, 38));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(193, 255, 114));
        jLabel2.setText("Questionnaire");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(193, 255, 114));
        jLabel6.setText("This questionnaire is used to understand you and");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(193, 255, 114));
        jLabel8.setText("provide the necessary resources to help you conquer");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(193, 255, 114));
        jLabel12.setText("your mental-health disorder.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addContainerGap(397, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(315, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel3);

        jPanel4.setBackground(new java.awt.Color(193, 255, 114));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("Symtoms");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Do you often feel sad, hopeless, or empty? ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Have you experienced intense worry or anxiety that is difficult to control? ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Have you had thoughts of harming yourself or others? ");

        rb1a.setBackground(new java.awt.Color(193, 255, 114));
        symtomsButtonGroup1.add(rb1a);
        rb1a.setText("Yes");
        rb1a.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb1aItemStateChanged(evt);
            }
        });

        rb1b.setBackground(new java.awt.Color(193, 255, 114));
        symtomsButtonGroup1.add(rb1b);
        rb1b.setText("No");

        jRadioButton15.setBackground(new java.awt.Color(193, 255, 114));
        symtomsButtonGroup2.add(jRadioButton15);
        jRadioButton15.setText("Yes");
        jRadioButton15.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton15ItemStateChanged(evt);
            }
        });

        jRadioButton16.setBackground(new java.awt.Color(193, 255, 114));
        symtomsButtonGroup2.add(jRadioButton16);
        jRadioButton16.setText("No");

        jRadioButton17.setBackground(new java.awt.Color(193, 255, 114));
        symtomsButtonGroup3.add(jRadioButton17);
        jRadioButton17.setText("Yes");
        jRadioButton17.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton17ItemStateChanged(evt);
            }
        });

        jRadioButton18.setBackground(new java.awt.Color(193, 255, 114));
        symtomsButtonGroup3.add(jRadioButton18);
        jRadioButton18.setText("No");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jRadioButton17)
                        .addGap(139, 139, 139)
                        .addComponent(jRadioButton18))
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jRadioButton15)
                        .addGap(135, 135, 135)
                        .addComponent(jRadioButton16))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rb1a)
                        .addGap(134, 134, 134)
                        .addComponent(rb1b))
                    .addComponent(jLabel7)
                    .addComponent(jLabel3))
                .addContainerGap(386, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb1a)
                    .addComponent(rb1b))
                .addGap(40, 40, 40)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton15)
                    .addComponent(jRadioButton16))
                .addGap(31, 31, 31)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton17)
                    .addComponent(jRadioButton18))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel4);

        jPanel5.setBackground(new java.awt.Color(193, 255, 114));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setText("Diagnosis");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Have you experienced feelings of worthlessness or guilt?");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Do you have specific fears or phobias that interfere with your daily life? ");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Have you experienced a traumatic event that continues to affect you emotionally? ");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Do you have difficulty paying attention, staying organized, or completing tasks? ");

        jRadioButton19.setBackground(new java.awt.Color(193, 255, 114));
        diagionsisButtonGroup1.add(jRadioButton19);
        jRadioButton19.setText("Yes");
        jRadioButton19.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton19ItemStateChanged(evt);
            }
        });

        jRadioButton20.setBackground(new java.awt.Color(193, 255, 114));
        diagionsisButtonGroup1.add(jRadioButton20);
        jRadioButton20.setText("No");

        jRadioButton21.setBackground(new java.awt.Color(193, 255, 114));
        diagionsisButtonGroup2.add(jRadioButton21);
        jRadioButton21.setText("Yes");
        jRadioButton21.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton21ItemStateChanged(evt);
            }
        });

        jRadioButton22.setBackground(new java.awt.Color(193, 255, 114));
        diagionsisButtonGroup2.add(jRadioButton22);
        jRadioButton22.setText("No");

        jRadioButton27.setBackground(new java.awt.Color(193, 255, 114));
        diagionsisButtonGroup3.add(jRadioButton27);
        jRadioButton27.setText("Yes");
        jRadioButton27.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton27ItemStateChanged(evt);
            }
        });

        jRadioButton28.setBackground(new java.awt.Color(193, 255, 114));
        diagionsisButtonGroup3.add(jRadioButton28);
        jRadioButton28.setText("No");

        jRadioButton29.setBackground(new java.awt.Color(193, 255, 114));
        diagionsisButtonGroup4.add(jRadioButton29);
        jRadioButton29.setText("Yes");
        jRadioButton29.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton29ItemStateChanged(evt);
            }
        });

        jRadioButton30.setBackground(new java.awt.Color(193, 255, 114));
        diagionsisButtonGroup4.add(jRadioButton30);
        jRadioButton30.setText("No");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jRadioButton19)
                        .addGap(134, 134, 134)
                        .addComponent(jRadioButton20))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jRadioButton21)
                        .addGap(134, 134, 134)
                        .addComponent(jRadioButton22))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jRadioButton27)
                        .addGap(134, 134, 134)
                        .addComponent(jRadioButton28))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jRadioButton29)
                        .addGap(134, 134, 134)
                        .addComponent(jRadioButton30)))
                .addContainerGap(332, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel11, jLabel13, jLabel15, jLabel16});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton19)
                    .addComponent(jRadioButton20))
                .addGap(40, 40, 40)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton21)
                    .addComponent(jRadioButton22))
                .addGap(40, 40, 40)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton27)
                    .addComponent(jRadioButton28))
                .addGap(40, 40, 40)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton29)
                    .addComponent(jRadioButton30))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel11, jLabel13, jLabel15, jLabel16});

        jTabbedPane1.addTab("tab3", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, -41, 860, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
//        if (!isRadioButtonSelected(wellBeing1) || !isRadioButtonSelected(symtomsButtonGroup1) || !isRadioButtonSelected(symtomsButtonGroup2)
//                || !isRadioButtonSelected(symtomsButtonGroup3) || !isRadioButtonSelected(symtomsButtonGroup4) || !isRadioButtonSelected(diagionsisButtonGroup1)
//                || !isRadioButtonSelected(diagionsisButtonGroup2) || !isRadioButtonSelected(diagionsisButtonGroup3) || !isRadioButtonSelected(diagionsisButtonGroup4)
//                || !isRadioButtonSelected(diagionsisButtonGroup5) || !isRadioButtonSelected(diagionsisButtonGroup6) || !isRadioButtonSelected(medicalHistory1)
//                || !isRadioButtonSelected(medicalHistory2) || !isRadioButtonSelected(medicalHistory3) || !isRadioButtonSelected(medicalHistory4)) 
//        {
            
        if (
            !isRadioButtonSelected(symtomsButtonGroup1) || 
            !isRadioButtonSelected(symtomsButtonGroup2) || 
            !isRadioButtonSelected(symtomsButtonGroup3) || 
            !isRadioButtonSelected(diagionsisButtonGroup1) || 
            !isRadioButtonSelected(diagionsisButtonGroup2) || 
            !isRadioButtonSelected(diagionsisButtonGroup3) || 
            !isRadioButtonSelected(diagionsisButtonGroup4) 
        ){
            JOptionPane.showMessageDialog(null, "Please answer all questions.");
        } 
        
        else {
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to submit the form?", "Submit Form", JOptionPane.YES_NO_OPTION);
            
            // SUCCESS
            if (response == JOptionPane.YES_OPTION) {
                String disorder = QuestionnaireLogic.displayDisorder();
                String completeMessge = (
                    "Most likely disorder: " + 
                    disorder + 
                    "\nNOTE: This is simply a suggestion based on your answers" + 
                    "\n\nSelect the disorder that you think you have in the next window"
                );
                
                JOptionPane.showMessageDialog(
                        null, 
                        completeMessge,
                        "Results",
                        JOptionPane.INFORMATION_MESSAGE
                );

                this.dispose(); 
//                new WindowBill().setVisible(true);
                new WindowSelectDisorder(this.userID).setVisible(true);
            } 
            
            // CANCELLED
//            else {
//                JOptionPane.showMessageDialog(null, "Form submission cancelled.");
//            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private boolean isRadioButtonSelected(ButtonGroup group) {
        for (Enumeration<AbstractButton> buttons = group.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return true;
            }
        }
        return false;
    }


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        symtomsButtonGroup1.clearSelection();
        symtomsButtonGroup2.clearSelection();
        symtomsButtonGroup3.clearSelection();
        
        diagionsisButtonGroup1.clearSelection();
        diagionsisButtonGroup2.clearSelection();
        diagionsisButtonGroup3.clearSelection();
        diagionsisButtonGroup4.clearSelection();
        
        QuestionnaireLogic.counterD1 = 0;
        QuestionnaireLogic.counterD2 = 0;
        QuestionnaireLogic.counterD3 = 0;
        QuestionnaireLogic.counterD4 = 0;
        QuestionnaireLogic.counterD5 = 0;
        QuestionnaireLogic.counterD6 = 0;
    }//GEN-LAST:event_btnResetActionPerformed

    
    // COUNTERS and radio buttons
    private void counter(){
        
    }
    
    QuestionnaireLogic logic = new QuestionnaireLogic();
    private void rb1aItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb1aItemStateChanged
        System.out.println(evt.getStateChange()); 
        
        if (evt.getStateChange() == 1){
            System.out.println("yes");
                        
            QuestionnaireLogic.counterD1 += 1;
            QuestionnaireLogic.counterD2 += 1;
            QuestionnaireLogic.counterD4 += 1;
            QuestionnaireLogic.counterD6 += 1;

        }
        logic.updateList();
        System.out.println(logic.counters);

    }//GEN-LAST:event_rb1aItemStateChanged

    private void jRadioButton15ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton15ItemStateChanged
        System.out.println(evt.getStateChange()); 
        
        if (evt.getStateChange() == 1){
            System.out.println("yes");
                        
            logic.counterD1 += 1;
            logic.counterD2 += 1;
            logic.counterD5 += 1;

        }
        logic.updateList();
        System.out.println(logic.counters);
    }//GEN-LAST:event_jRadioButton15ItemStateChanged

    private void jRadioButton17ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton17ItemStateChanged
        System.out.println(evt.getStateChange()); 
        
        if (evt.getStateChange() == 1){
            System.out.println("yes");
                        
            logic.counterD3 += 1;
            logic.counterD5 += 1;
            logic.counterD6 += 1;

        }
        logic.updateList();
        System.out.println(logic.counters);
    }//GEN-LAST:event_jRadioButton17ItemStateChanged
    // END OF SECTION1 //

    // START OF SECTION2 //
    private void jRadioButton19ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton19ItemStateChanged
       System.out.println(evt.getStateChange()); 
        
        if (evt.getStateChange() == 1){
            System.out.println("yes");
                        
            logic.counterD4 += 1;
            logic.counterD5 += 1;
            logic.counterD6 += 1;

        }
        logic.updateList();
        System.out.println(logic.counters);
    }//GEN-LAST:event_jRadioButton19ItemStateChanged

    private void jRadioButton21ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton21ItemStateChanged
        System.out.println(evt.getStateChange()); 
        
        if (evt.getStateChange() == 1){
            System.out.println("yes");
                        
            logic.counterD1 += 1;
            logic.counterD2 += 1;
            logic.counterD3 += 1;
            logic.counterD4 += 1;
        }
        logic.updateList();
        System.out.println(logic.counters);
    }//GEN-LAST:event_jRadioButton21ItemStateChanged

    private void jRadioButton27ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton27ItemStateChanged
        System.out.println(evt.getStateChange()); 
        
        if (evt.getStateChange() == 1){
            System.out.println("yes");
                        
            logic.counterD2 += 1;
            logic.counterD3 += 1;
            logic.counterD4 += 1;
            logic.counterD5 += 1;
        }
        logic.updateList();
        System.out.println(logic.counters);
    }//GEN-LAST:event_jRadioButton27ItemStateChanged

    private void jRadioButton29ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton29ItemStateChanged
        System.out.println(evt.getStateChange()); 
        
        if (evt.getStateChange() == 1){
            System.out.println("yes");
                        
            logic.counterD1 += 1;
        }
        logic.updateList();
        System.out.println(logic.counters);
    }//GEN-LAST:event_jRadioButton29ItemStateChanged
    // END OF SECTION2 //
    
   
    
    
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
            java.util.logging.Logger.getLogger(WindowQuestionnaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowQuestionnaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowQuestionnaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowQuestionnaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new WindowQuestionnaire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnSubmit1;
    private javax.swing.ButtonGroup diagionsisButtonGroup1;
    private javax.swing.ButtonGroup diagionsisButtonGroup2;
    private javax.swing.ButtonGroup diagionsisButtonGroup3;
    private javax.swing.ButtonGroup diagionsisButtonGroup4;
    private javax.swing.ButtonGroup diagionsisButtonGroup5;
    private javax.swing.ButtonGroup diagionsisButtonGroup6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.ButtonGroup medicalHistory1;
    private javax.swing.ButtonGroup medicalHistory2;
    private javax.swing.ButtonGroup medicalHistory3;
    private javax.swing.ButtonGroup medicalHistory4;
    private javax.swing.JRadioButton rb1a;
    private javax.swing.JRadioButton rb1b;
    private javax.swing.JPanel sidePane;
    private javax.swing.ButtonGroup symtomsButtonGroup1;
    private javax.swing.ButtonGroup symtomsButtonGroup2;
    private javax.swing.ButtonGroup symtomsButtonGroup3;
    private javax.swing.ButtonGroup symtomsButtonGroup4;
    private javax.swing.ButtonGroup wellBeing1;
    // End of variables declaration//GEN-END:variables

}
