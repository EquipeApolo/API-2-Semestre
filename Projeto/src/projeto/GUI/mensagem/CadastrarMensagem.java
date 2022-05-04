/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto.GUI.mensagem;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import projeto.Main;
import projeto.model.Mensagem;

/**
 *
 * @author jenny
 */
public class CadastrarMensagem extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarMensagem1
     */
    public CadastrarMensagem() {
        initComponents();

        setTitle("Pro4Tech - Cadastro de mensagem");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        meioEnvioTextField = new javax.swing.JTextField();
        label_meioEnvio = new javax.swing.JLabel();
        label_conteudo = new javax.swing.JLabel();
        label_nomeCliente = new javax.swing.JLabel();
        button_cancelar = new javax.swing.JButton();
        nomeClienteTextField = new javax.swing.JTextField();
        label_cadastroMensagem = new javax.swing.JLabel();
        button_cadastrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        conteudo = new javax.swing.JTextArea();

        jLabel6.setText("jLabel6");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        meioEnvioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meioEnvioTextFieldActionPerformed(evt);
            }
        });

        label_meioEnvio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_meioEnvio.setText("Meio de envio(opcional):");

        label_conteudo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_conteudo.setText("Conteúdo:");

        label_nomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_nomeCliente.setText("Nome do Cliente:");

        button_cancelar.setText("Cancelar");
        button_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cancelarActionPerformed(evt);
            }
        });

        nomeClienteTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeClienteTextFieldActionPerformed(evt);
            }
        });

        label_cadastroMensagem.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        label_cadastroMensagem.setText("Cadastro de Mensagem");

        button_cadastrar.setText("Cadastrar");
        button_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cadastrarActionPerformed(evt);
            }
        });

        conteudo.setColumns(20);
        conteudo.setRows(5);
        jScrollPane2.setViewportView(conteudo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(button_cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_cadastrar)
                .addGap(8, 8, 8))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addComponent(label_cadastroMensagem)
                .addGap(186, 186, 186))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_nomeCliente)
                            .addComponent(label_meioEnvio))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meioEnvioTextField)
                            .addComponent(nomeClienteTextField, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_conteudo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(label_cadastroMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nomeCliente)
                    .addComponent(nomeClienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_meioEnvio)
                    .addComponent(meioEnvioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(label_conteudo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_cancelar)
                    .addComponent(button_cadastrar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
         
    private void button_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cadastrarActionPerformed
        // TODO add your handling code here:
        
        if ((nomeClienteTextField.getText().isEmpty())) {
            label_nomeCliente.setForeground(Color.red);
        }
        
        if ((meioEnvioTextField.getText().isEmpty())) {
            label_meioEnvio.setForeground(Color.red);
        }
        
        if ((conteudo.getText().isEmpty())) {
            label_conteudo.setForeground(Color.red);
         
        }
        if  (!((nomeClienteTextField.getText().isEmpty()) || (meioEnvioTextField.getText().isEmpty()) || (conteudo.getText().isEmpty()))){
            
                    
//               Main.getManager().cadastrarMensagem(new Mensagem(jTextField1.getText(), jTextField4.getText(), jTextField2.getText(), jTextArea2.getText(), System.currentTimeMillis() ));
               JOptionPane.showMessageDialog(null, "Mensagem cadastrada com sucesso!");
               dispose(); 
            
        }else{
                JOptionPane.showMessageDialog(null, "Faltou um campo para preencher.");
        }
        
        {
   
    }
                
    }//GEN-LAST:event_button_cadastrarActionPerformed

    private void nomeClienteTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeClienteTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeClienteTextFieldActionPerformed

    private void meioEnvioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meioEnvioTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meioEnvioTextFieldActionPerformed

    private void button_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cancelarActionPerformed
        // TODO add your handling code here:
        
        dispose();
    }//GEN-LAST:event_button_cancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_cadastrar;
    private javax.swing.JButton button_cancelar;
    private javax.swing.JTextArea conteudo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel label_cadastroMensagem;
    private javax.swing.JLabel label_conteudo;
    private javax.swing.JLabel label_meioEnvio;
    private javax.swing.JLabel label_nomeCliente;
    private javax.swing.JTextField meioEnvioTextField;
    private javax.swing.JTextField nomeClienteTextField;
    // End of variables declaration//GEN-END:variables
}
