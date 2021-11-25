/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Xatuba Pox
 */
public class LoginGUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginGUI
     */
    public LoginGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        welcomePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        titleLabel1 = new javax.swing.JLabel();
        titleLabel2 = new javax.swing.JLabel();
        titleLabel3 = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        userField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        separatorPass = new javax.swing.JSeparator();
        separatorUser = new javax.swing.JSeparator();
        exitLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        passwordLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        welcomePanel.setBackground(new java.awt.Color(74, 31, 61));

        titleLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(187, 187, 187));
        titleLabel.setText("POO UCB BANKER");

        titleLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        titleLabel1.setForeground(new java.awt.Color(187, 187, 187));
        titleLabel1.setText("GABRIEL D' NILLO");

        titleLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        titleLabel2.setForeground(new java.awt.Color(187, 187, 187));
        titleLabel2.setText("JOÃO MARCELO");

        titleLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        titleLabel3.setForeground(new java.awt.Color(187, 187, 187));
        titleLabel3.setText("MATEUS COLARES");

        javax.swing.GroupLayout welcomePanelLayout = new javax.swing.GroupLayout(welcomePanel);
        welcomePanel.setLayout(welcomePanelLayout);
        welcomePanelLayout.setHorizontalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel3)
                    .addGroup(welcomePanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(titleLabel2))
                    .addComponent(titleLabel1)
                    .addComponent(titleLabel))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        welcomePanelLayout.setVerticalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(titleLabel)
                .addGap(64, 64, 64)
                .addComponent(titleLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titleLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titleLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loginPanel.setBackground(new java.awt.Color(186, 79, 74));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userField.setBackground(new java.awt.Color(186, 79, 74));
        userField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        userField.setForeground(new java.awt.Color(187, 187, 187));
        userField.setText("Usuario");
        userField.setBorder(null);
        userField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userFieldFocusGained(evt);
            }
        });
        userField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFieldActionPerformed(evt);
            }
        });
        loginPanel.add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 96, 200, 30));

        passwordField.setBackground(new java.awt.Color(186, 79, 74));
        passwordField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        passwordField.setForeground(new java.awt.Color(187, 187, 187));
        passwordField.setText("Senha");
        passwordField.setBorder(null);
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
        });
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        loginPanel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 144, 200, 30));

        separatorPass.setBackground(new java.awt.Color(204, 204, 204));
        separatorPass.setForeground(new java.awt.Color(204, 204, 204));
        loginPanel.add(separatorPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 180, 200, 10));

        separatorUser.setBackground(new java.awt.Color(204, 204, 204));
        separatorUser.setForeground(new java.awt.Color(204, 204, 204));
        loginPanel.add(separatorUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 130, 200, 10));

        exitLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exitLabel.setText("X");
        exitLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        loginPanel.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        loginButton.setBackground(new java.awt.Color(186, 79, 74));
        loginButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(187, 187, 187));
        loginButton.setText("Entrar");
        loginButton.setBorder(null);
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginPanel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 210, 90, 30));

        registerButton.setBackground(new java.awt.Color(186, 79, 74));
        registerButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        registerButton.setForeground(new java.awt.Color(187, 187, 187));
        registerButton.setText("Registrar");
        registerButton.setBorder(null);
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
        });
        loginPanel.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 210, 90, 30));

        passwordLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        passwordLabel.setText("Senha:");
        loginPanel.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        userLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        userLabel.setText("Usuario:");
        loginPanel.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(welcomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userFieldActionPerformed

    private void userFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFieldFocusGained
        userField.setText("");
    }//GEN-LAST:event_userFieldFocusGained

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        passwordField.setText("");
    }//GEN-LAST:event_passwordFieldFocusGained

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseClicked
        RegisterGUI reg = new RegisterGUI();
        reg.setVisible(true);
        reg.pack();
        reg.setLocationRelativeTo(null);
        reg.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_registerButtonMouseClicked

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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JSeparator separatorPass;
    private javax.swing.JSeparator separatorUser;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titleLabel1;
    private javax.swing.JLabel titleLabel2;
    private javax.swing.JLabel titleLabel3;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userLabel;
    private javax.swing.JPanel welcomePanel;
    // End of variables declaration//GEN-END:variables
}