/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forexconverter;
/**
 *
 * @author Jason
 */
public class ConverterGUI extends javax.swing.JFrame {

    /**
     * Creates new form ConverterGUI
     */
    public ConverterGUI() {
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

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        icnIndia = new javax.swing.JLabel();
        icnJapan = new javax.swing.JLabel();
        icnUK = new javax.swing.JLabel();
        icnChina = new javax.swing.JLabel();
        txtIndia = new javax.swing.JTextField();
        txtJapan = new javax.swing.JTextField();
        txtUK = new javax.swing.JTextField();
        txtChina = new javax.swing.JTextField();
        INR = new javax.swing.JLabel();
        JPY = new javax.swing.JLabel();
        GBP = new javax.swing.JLabel();
        RMB = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        outIndia = new javax.swing.JTextField();
        outJapan = new javax.swing.JTextField();
        outUK = new javax.swing.JTextField();
        outChina = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(291, 194));

        title.setFont(new java.awt.Font("Lucida Grande", 0, 17)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("FOREX CONVERTER");

        icnIndia.setIcon(new javax.swing.ImageIcon("/Users/jason/Downloads/ForexConverter/flags/india.png")); // NOI18N
        icnIndia.setText("jLabel2");

        icnJapan.setForeground(new java.awt.Color(255, 255, 255));
        icnJapan.setIcon(new javax.swing.ImageIcon("/Users/jason/Downloads/ForexConverter/flags/japan.png")); // NOI18N

        icnUK.setForeground(new java.awt.Color(255, 255, 255));
        icnUK.setIcon(new javax.swing.ImageIcon("/Users/jason/Downloads/ForexConverter/flags/uk.png")); // NOI18N

        icnChina.setForeground(new java.awt.Color(255, 255, 255));
        icnChina.setIcon(new javax.swing.ImageIcon("/Users/jason/Downloads/ForexConverter/flags/china.png")); // NOI18N

        txtIndia.setToolTipText("");
        txtIndia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIndiaActionPerformed(evt);
            }
        });

        txtJapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJapanActionPerformed(evt);
            }
        });

        txtUK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUKActionPerformed(evt);
            }
        });

        txtChina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChinaActionPerformed(evt);
            }
        });

        INR.setForeground(new java.awt.Color(255, 255, 255));
        INR.setText("INR");

        JPY.setForeground(new java.awt.Color(255, 255, 255));
        JPY.setText("JPY");

        GBP.setForeground(new java.awt.Color(255, 255, 255));
        GBP.setText("GBP");

        RMB.setForeground(new java.awt.Color(255, 255, 255));
        RMB.setText("RMB");

        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        outIndia.setEditable(false);
        outIndia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outIndiaActionPerformed(evt);
            }
        });

        outJapan.setEditable(false);
        outJapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outJapanActionPerformed(evt);
            }
        });

        outUK.setEditable(false);
        outUK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outUKActionPerformed(evt);
            }
        });

        outChina.setEditable(false);
        outChina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outChinaActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USD");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USD");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USD");
        jLabel4.setToolTipText("");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("USD");

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(title)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(icnIndia, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtIndia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(icnJapan)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtJapan, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(icnUK)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtUK, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(icnChina)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtChina, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(INR)
                                .addGap(18, 18, 18)
                                .addComponent(outIndia))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(GBP)
                                    .addComponent(RMB)
                                    .addComponent(JPY))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(0, 1, Short.MAX_VALUE))
                                    .addComponent(outJapan, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(outUK, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(outChina, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icnIndia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIndia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INR)
                    .addComponent(outIndia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icnJapan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtJapan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JPY)
                        .addComponent(outJapan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(icnUK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icnChina, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtChina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(RMB))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GBP)
                            .addComponent(outUK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(outChina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtJapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJapanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJapanActionPerformed

    private void txtIndiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIndiaActionPerformed
        System.out.println("390");        // TODO add your handling code here:
    }//GEN-LAST:event_txtIndiaActionPerformed

    private void txtUKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUKActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txtIndia.getText() != null && !txtIndia.getText().equals("")) {
            double inr = Double.parseDouble(txtIndia.getText()) * 0.014;
            outIndia.setText("" + Math.round(inr*100.0)/100.0);
        }
        
        if(txtJapan.getText() != null && !txtJapan.getText().equals("")) {
            double jpy = Double.parseDouble(txtJapan.getText())* 0.0089;
            outJapan.setText("" + Math.round(jpy*100.0)/100.0);
        }
        
        if(txtUK.getText() != null && !txtUK.getText().equals("")) {
            double gbp = Double.parseDouble(txtUK.getText()) * 1.31;
            outUK.setText("" + Math.round(gbp*100.0)/100.0);
        }
        
        if(txtChina.getText() != null && !txtChina.getText().equals("")) {
            double rmb = Double.parseDouble(txtChina.getText()) * 0.15;
            outChina.setText("" + Math.round(rmb*100.0)/100.0);

        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void outIndiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outIndiaActionPerformed
        txtIndia.setReadOnly(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_outIndiaActionPerformed

    private void outJapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outJapanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outJapanActionPerformed

    private void outUKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outUKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outUKActionPerformed

    private void outChinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outChinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outChinaActionPerformed

    private void txtChinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChinaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        outChina.setText("");
        outIndia.setText("");
        outJapan.setText("");
        outUK.setText("");
        txtChina.setText("");
        txtIndia.setText("");
        txtJapan.setText("");
        txtUK.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GBP;
    private javax.swing.JLabel INR;
    private javax.swing.JLabel JPY;
    private javax.swing.JLabel RMB;
    private javax.swing.JLabel icnChina;
    private javax.swing.JLabel icnIndia;
    private javax.swing.JLabel icnJapan;
    private javax.swing.JLabel icnUK;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField outChina;
    private javax.swing.JTextField outIndia;
    private javax.swing.JTextField outJapan;
    private javax.swing.JTextField outUK;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtChina;
    private javax.swing.JTextField txtIndia;
    private javax.swing.JTextField txtJapan;
    private javax.swing.JTextField txtUK;
    // End of variables declaration//GEN-END:variables
}