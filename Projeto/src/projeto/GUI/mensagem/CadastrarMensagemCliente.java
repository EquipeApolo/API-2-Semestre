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
import projeto.model.MensagemColetiva;
import projeto.model.MensagemIndividual;
import projeto.model.Projeto;
import projeto.model.Usuario;

/**
 *
 * @author jenny
 */
public class CadastrarMensagemCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarMensagem1
     */
    public CadastrarMensagemCliente() {
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
        label_meioEnvio = new javax.swing.JLabel();
        label_conteudo = new javax.swing.JLabel();
        label_nomeCliente = new javax.swing.JLabel();
        button_cancelar = new javax.swing.JButton();
        nomeClienteTextField = new javax.swing.JTextField();
        label_cadastroMensagem = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        conteudo = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        comboBoxTipoMensagem = new javax.swing.JComboBox<>();

        jLabel6.setText("jLabel6");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        label_meioEnvio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        label_conteudo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_conteudo.setText("Conteúdo:");

        label_nomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_nomeCliente.setText("Destinatário:");

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
        label_cadastroMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_cadastroMensagem.setText("Cadastro de Mensagem");

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        conteudo.setColumns(20);
        conteudo.setLineWrap(true);
        conteudo.setRows(5);
        jScrollPane2.setViewportView(conteudo);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Tipo de Mensagem:");

        comboBoxTipoMensagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um campo", "Individual", "Projeto" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(button_cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoCadastrar)
                .addGap(8, 8, 8))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(label_cadastroMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_nomeCliente)
                            .addComponent(jLabel1)
                            .addComponent(label_meioEnvio)
                            .addComponent(label_conteudo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeClienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxTipoMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(label_cadastroMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBoxTipoMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nomeCliente)
                    .addComponent(nomeClienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(label_meioEnvio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_conteudo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_cancelar)
                    .addComponent(botaoCadastrar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
         
    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        // TODO add your handling code here:
        
        String comboBox = (comboBoxTipoMensagem.getSelectedItem() + "").toLowerCase();
        
        if(nomeClienteTextField.getText().isEmpty() || conteudo.getText().isEmpty() || comboBox.equals("selecione um campo")){
            JOptionPane.showMessageDialog(null, "Faltou um campo para preencher");  
            return;
        }
        
        Mensagem mensagem = new Mensagem(Main.getManager().getUsuarioLogado().getId(), "sistema", conteudo.getText(), System.currentTimeMillis());
        if(comboBox.equals("individual")){
            if(!Main.getManager().existeUsuario(nomeClienteTextField.getText())){
                JOptionPane.showMessageDialog(null, "Usuário não encontrado");  
                return;
            }
            Usuario destinatario = Main.getManager().getUsuarioByUserName(nomeClienteTextField.getText());
            
            Main.getManager().getmIndiDAO().addMensagemToDatabase(new MensagemIndividual(mensagem, destinatario.getId()));
        }else{
            if(!Main.getManager().existeProjeto(nomeClienteTextField.getText())){
                JOptionPane.showMessageDialog(null, "Projeto não encontrado");  
                return; 
            }
            Projeto destinatario = Main.getManager().getProjetoByName(nomeClienteTextField.getText());
            
            Main.getManager().getmColeDAO().addMensagemToDatabase(new MensagemColetiva(mensagem, destinatario.getId()));
        }
        
        JOptionPane.showMessageDialog(null, "Mensagem cadastrada com sucesso!");
        dispose(); 
  
                
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void nomeClienteTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeClienteTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeClienteTextFieldActionPerformed

    private void button_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cancelarActionPerformed
        // TODO add your handling code here:
        
        dispose();
    }//GEN-LAST:event_button_cancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton button_cancelar;
    private javax.swing.JComboBox<String> comboBoxTipoMensagem;
    private javax.swing.JTextArea conteudo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel label_cadastroMensagem;
    private javax.swing.JLabel label_conteudo;
    private javax.swing.JLabel label_meioEnvio;
    private javax.swing.JLabel label_nomeCliente;
    private javax.swing.JTextField nomeClienteTextField;
    // End of variables declaration//GEN-END:variables
}
