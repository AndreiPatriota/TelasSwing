package telas;

import MinhasClasses.Pessoa;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import principal.Main;
import static principal.Main.arLsPessoas;

public class JFrTela2 extends javax.swing.JFrame 
{

    public JFrTela2() 
    {
        initComponents();
        
        //setIconImage(this.getImage("images/logo-br.gif"));
        setTitle("CADASTRO DE PESSOA");
        //setLocation((telaOffset*Main.dimTelaH)/num_telas+(Main.dimTelaH/num_telas - pnEmed.getWidth())/2,
        //       (Main.dimTelaV - pnEmed.getHeight())/3); 
        addWindowListener(new WindowAdapter() 
                        {
                            @Override
                            public void windowClosed(WindowEvent e)
                            {
                                super.windowClosed(e);
                                Main.app.setVisible(true);
                            }
                        });
        
        btnGrp.add(rdioFem);
        btnGrp.add(rdioMasc);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrp = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnSALVAR = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        spnData = new javax.swing.JSpinner();
        rdioMasc = new javax.swing.JRadioButton();
        rdioFem = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        btnCADASTRAR1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSALVAR.setForeground(new java.awt.Color(255, 51, 0));
        btnSALVAR.setText("SALVAR");
        btnSALVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSALVARActionPerformed(evt);
            }
        });
        jPanel1.add(btnSALVAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 230, 29));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nasc.:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Peso:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
        jPanel1.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 230, 29));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Altura:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        jPanel1.add(txtAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 230, 29));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btnVoltar.setForeground(new java.awt.Color(255, 51, 0));
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        spnData.setModel(new javax.swing.SpinnerDateModel());
        jPanel1.add(spnData, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 150, 30));

        rdioMasc.setText("Masc.");
        jPanel1.add(rdioMasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        rdioFem.setText("Fem");
        jPanel1.add(rdioFem, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Altura:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        btnCADASTRAR1.setForeground(new java.awt.Color(255, 51, 0));
        btnCADASTRAR1.setText("CADASTRAR");
        btnCADASTRAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCADASTRAR1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCADASTRAR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSALVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSALVARActionPerformed
        Pessoa umaPessoa = new Pessoa(txtNome.getText(),
                                    (Date) spnData.getValue(),
                                    rdioFem.isSelected(),
                                    Float.parseFloat(txtPeso.getText()),
                                    Float.parseFloat(txtAltura.getText()));

        
        
        umaPessoa.salvaPessoaBd(Main.con);
    }//GEN-LAST:event_btnSALVARActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCADASTRAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCADASTRAR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCADASTRAR1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCADASTRAR1;
    private javax.swing.ButtonGroup btnGrp;
    private javax.swing.JButton btnSALVAR;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdioFem;
    private javax.swing.JRadioButton rdioMasc;
    private javax.swing.JSpinner spnData;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
