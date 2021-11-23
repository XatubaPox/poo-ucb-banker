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
public class OpenAccountBankGUI extends javax.swing.JFrame {

    /**
     * Creates new form OpenAccountBankGUI
     */
    public OpenAccountBankGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        openAccountPanel = new javax.swing.JPanel();
        typeComboBox = new javax.swing.JComboBox<>();
        typeLabel = new javax.swing.JLabel();
        gainMonthLabel = new javax.swing.JLabel();
        gainMonthField = new javax.swing.JFormattedTextField();
        separatorGainMonth = new javax.swing.JSeparator();
        registerCardButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(450, 300));

        titlePanel.setBackground(new java.awt.Color(74, 31, 61));
        titlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(187, 187, 187));
        titleLabel.setText("Abrir Conta Bancaria");
        titlePanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        exitLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exitLabel.setForeground(new java.awt.Color(250, 250, 250));
        exitLabel.setText("X");
        exitLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        titlePanel.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, -1));

        openAccountPanel.setBackground(new java.awt.Color(186, 79, 74));
        openAccountPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        typeComboBox.setBackground(new java.awt.Color(186, 79, 74));
        typeComboBox.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CORRENTE", "POUPANCA" }));
        openAccountPanel.add(typeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 200, 30));

        typeLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        typeLabel.setText("Tipo de conta:");
        openAccountPanel.add(typeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        gainMonthLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        gainMonthLabel.setText("Ganho Mensal:");
        openAccountPanel.add(gainMonthLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        gainMonthField.setBackground(new java.awt.Color(186, 79, 74));
        gainMonthField.setBorder(null);
        gainMonthField.setForeground(new java.awt.Color(187, 187, 187));
        gainMonthField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤#,##0.00"))));
        openAccountPanel.add(gainMonthField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 200, 30));

        separatorGainMonth.setBackground(new java.awt.Color(204, 204, 204));
        separatorGainMonth.setForeground(new java.awt.Color(204, 204, 204));
        openAccountPanel.add(separatorGainMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 200, 10));

        registerCardButton.setBackground(new java.awt.Color(186, 79, 74));
        registerCardButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        registerCardButton.setForeground(new java.awt.Color(187, 187, 187));
        registerCardButton.setText("Cadastrar Cartao");
        registerCardButton.setBorder(null);
        registerCardButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerCardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerCardButtonMouseClicked(evt);
            }
        });
        openAccountPanel.add(registerCardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
            .addComponent(openAccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(openAccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void registerCardButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerCardButtonMouseClicked
        RegisterCardGUI rc = new RegisterCardGUI();
        rc.setVisible(true);
        rc.pack();
        rc.setLocationRelativeTo(null);
        rc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_registerCardButtonMouseClicked

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
            java.util.logging.Logger.getLogger(OpenAccountBankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpenAccountBankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpenAccountBankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpenAccountBankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpenAccountBankGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exitLabel;
    private javax.swing.JFormattedTextField gainMonthField;
    private javax.swing.JLabel gainMonthLabel;
    private javax.swing.JPanel openAccountPanel;
    private javax.swing.JButton registerCardButton;
    private javax.swing.JSeparator separatorGainMonth;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}
