/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.view;

import br.com.controller.Votacao;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexm
 */
public class Tela extends javax.swing.JFrame {
    Votacao v = new Votacao();
    /**
     * Creates new form Tela
     */
    public Tela() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRvotar1 = new javax.swing.JRadioButton();
        jRvotar2 = new javax.swing.JRadioButton();
        jBcalcularVoto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTmatricula = new javax.swing.JTextField();
        jBfinalizar = new javax.swing.JButton();
        jLresultvotos40 = new javax.swing.JLabel();
        jLresultvotos44 = new javax.swing.JLabel();
        jLmaisvotos = new javax.swing.JLabel();
        jLqtdfunc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("VOTAÇÃO");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/view/1672309.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Escolha uma das opções para votar na jornada de trabalho");

        jRvotar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRvotar1.setText("40 Horas");

        jRvotar2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRvotar2.setText("44 Horas");

        jBcalcularVoto.setBackground(new java.awt.Color(204, 0, 0));
        jBcalcularVoto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jBcalcularVoto.setForeground(new java.awt.Color(255, 255, 255));
        jBcalcularVoto.setText("VOTAR");
        jBcalcularVoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcalcularVotoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Digite sua matricula para votar: ");

        jBfinalizar.setBackground(new java.awt.Color(0, 204, 0));
        jBfinalizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBfinalizar.setForeground(new java.awt.Color(255, 255, 255));
        jBfinalizar.setText("FINALIZAR A VOTAÇÃO");
        jBfinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfinalizarActionPerformed(evt);
            }
        });

        jLresultvotos40.setText("Quantidade de votos em (40 horas): ");

        jLresultvotos44.setText("Quantidade de votos em (44 horas): ");

        jLmaisvotos.setText("Opção com mais votos: ");

        jLqtdfunc.setText("Quantidade de funcionários que votaram: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTmatricula))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(132, 132, 132)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRvotar1)
                                        .addComponent(jRvotar2)
                                        .addComponent(jBcalcularVoto))
                                    .addGap(68, 68, 68)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jBfinalizar)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLresultvotos40)
                            .addComponent(jLresultvotos44)
                            .addComponent(jLmaisvotos)
                            .addComponent(jLqtdfunc))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRvotar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRvotar2)
                        .addGap(18, 18, 18)
                        .addComponent(jBcalcularVoto)
                        .addGap(18, 18, 18)
                        .addComponent(jLresultvotos40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLresultvotos44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLmaisvotos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLqtdfunc))
                    .addComponent(jBfinalizar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcalcularVotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcalcularVotoActionPerformed
        // TODO add your handling code here:
        v.setMatricula(jTmatricula.getText());
         if(jTmatricula.getText().equals("")){
             JOptionPane.showMessageDialog(rootPane, "campo obrigatorio!");
             jTmatricula.setText("");
             jTmatricula.requestFocus();
         } else {      
        jTmatricula.setText("");
        jTmatricula.requestFocus();
        if(jRvotar1.isSelected()){
            v.votar();
            JOptionPane.showMessageDialog(rootPane,"Voto registrado com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
            jRvotar1.setSelected(false);
        }else if (jRvotar2.isSelected()){
            v.votar(v.getVotos44());
            JOptionPane.showMessageDialog(rootPane,"Voto registrado com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
            jRvotar2.setSelected(false);
        } else {
           JOptionPane.showMessageDialog(rootPane, "É necessário votar em um horario!!"); 
        }
        
      }
    }//GEN-LAST:event_jBcalcularVotoActionPerformed

    private void jBfinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfinalizarActionPerformed
        // TODO add your handling code here:
        jLresultvotos40.setText("Quantidade de votos em (40 horas): "+v.getVotos40());
        jLresultvotos44.setText("Quantidade de votos em (44 horas): "+v.getVotos44());
        if(v.getVotos40() > v.getVotos44()){
            jLmaisvotos.setText("Opção com mais votos é 40 horas com "+v.getVotos40());
        } else jLmaisvotos.setText("Opção com mais votos é 44 horas com "+v.getVotos44());
        jLqtdfunc.setText("Quantidade de funcionários que votaram: "+(v.getVotos40()+v.getVotos44()));
    }//GEN-LAST:event_jBfinalizarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcalcularVoto;
    private javax.swing.JButton jBfinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLmaisvotos;
    private javax.swing.JLabel jLqtdfunc;
    private javax.swing.JLabel jLresultvotos40;
    private javax.swing.JLabel jLresultvotos44;
    private javax.swing.JRadioButton jRvotar1;
    private javax.swing.JRadioButton jRvotar2;
    private javax.swing.JTextField jTmatricula;
    // End of variables declaration//GEN-END:variables
}
