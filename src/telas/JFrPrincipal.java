package telas;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import principal.Main;

public class JFrPrincipal extends javax.swing.JFrame 
{
    private JFrTela1 pnTela1 = null;
    private JFrTela2 pnTela2 = null;
    private JFrTela3 pnTela3 = null;
    private JFrTela4 pnTela4 = null;
    
    public JFrPrincipal() 
    {
        initComponents();
        this.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnTela1 = new javax.swing.JButton();
        btnTela2 = new javax.swing.JButton();
        btnTela3 = new javax.swing.JButton();
        btnTela4 = new javax.swing.JButton();
        btnSAIR = new javax.swing.JButton();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btnTela1.setBackground(new java.awt.Color(255, 102, 0));
        btnTela1.setText("Tela1");
        btnTela1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTela1ActionPerformed(evt);
            }
        });

        btnTela2.setBackground(new java.awt.Color(255, 102, 0));
        btnTela2.setText("Tela2");
        btnTela2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTela2ActionPerformed(evt);
            }
        });

        btnTela3.setBackground(new java.awt.Color(255, 102, 0));
        btnTela3.setText("Tela3");
        btnTela3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTela3ActionPerformed(evt);
            }
        });

        btnTela4.setBackground(new java.awt.Color(255, 102, 0));
        btnTela4.setText("Tela4");
        btnTela4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTela4ActionPerformed(evt);
            }
        });

        btnSAIR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSAIR.setText("SAIR");
        btnSAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAIRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTela3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTela4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btnTela1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(btnTela2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSAIR)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTela1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTela2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnTela3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnTela4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnSAIR)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAIRActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSAIRActionPerformed

    private void btnTela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTela1ActionPerformed
        pnTela1 = new JFrTela1();
        
        this.setVisible(false);
        pnTela1.setVisible(true);  
    }//GEN-LAST:event_btnTela1ActionPerformed

    private void btnTela2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTela2ActionPerformed
        pnTela2 = new JFrTela2();
                
        this.setVisible(false);
        pnTela2.setVisible(true);
    }//GEN-LAST:event_btnTela2ActionPerformed

    private void btnTela3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTela3ActionPerformed
        pnTela3 = new JFrTela3();
                
        this.setVisible(false);
        pnTela3.setVisible(true);
    }//GEN-LAST:event_btnTela3ActionPerformed

    private void btnTela4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTela4ActionPerformed
        pnTela4 = new JFrTela4();
                
        //this.setVisible(false);
        pnTela4.setVisible(true);
    }//GEN-LAST:event_btnTela4ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSAIR;
    private javax.swing.JButton btnTela1;
    private javax.swing.JButton btnTela2;
    private javax.swing.JButton btnTela3;
    private javax.swing.JButton btnTela4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
