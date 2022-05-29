package projeto.GUI.projetos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import projeto.Main;
import projeto.model.Usuario;
import projeto.model.tipos.FuncaoUsuario;

public class CadastrarProjeto extends javax.swing.JFrame {

    public CadastrarProjeto() {
        initComponents();

        setTitle("Pro4Tech - Cadastro de projeto");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        campoProjeto = new javax.swing.JTextField();
        label_descricao = new javax.swing.JLabel();
        label_nomeCliente = new javax.swing.JLabel();
        botaoCancelar = new javax.swing.JButton();
        campoCliente = new javax.swing.JTextField();
        label_nomeProjeto = new javax.swing.JLabel();
        label_cadastraoProjeto = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoDescricao = new javax.swing.JTextArea();

        jLabel6.setText("jLabel6");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        campoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoProjetoActionPerformed(evt);
            }
        });

        label_descricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_descricao.setText("Descrição:");

        label_nomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_nomeCliente.setText("Nome do Cliente:");

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        campoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoClienteActionPerformed(evt);
            }
        });

        label_nomeProjeto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_nomeProjeto.setText("Nome do Projeto:");

        label_cadastraoProjeto.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        label_cadastraoProjeto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_cadastraoProjeto.setText("Cadastro de Projeto");
        label_cadastraoProjeto.setFocusable(false);
        label_cadastraoProjeto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        campoDescricao.setColumns(20);
        campoDescricao.setLineWrap(true);
        campoDescricao.setRows(5);
        jScrollPane2.setViewportView(campoDescricao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoCadastrar)
                .addGap(8, 8, 8))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_nomeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24)
                        .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_nomeProjeto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(label_cadastraoProjeto))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label_descricao)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(label_cadastraoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nomeCliente)
                    .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nomeProjeto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(label_descricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoCadastrar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
         
    private void campoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoProjetoActionPerformed
 
    }//GEN-LAST:event_campoProjetoActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed

        if(campoCliente.getText().isEmpty() || campoProjeto.getText().isEmpty() || campoDescricao.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Favor preencher os campos obrigatórios", "Atenção!", 2);
            return;
        }

        if(!Main.getManager().existeUsuario(campoCliente.getText())){
            JOptionPane.showMessageDialog(null, "Cliente não encontrado", "Atenção!", 2);
            return;
        }

        if(Main.getManager().existeProjeto(campoProjeto.getText())){
            JOptionPane.showMessageDialog(null, "O projeto informado já existe", "Atenção!", 2);
            return;
        }

        Usuario cliente = Main.getManager().getUsuarioByUserName(campoCliente.getText());
        if(cliente.getFuncaoUsuario() != FuncaoUsuario.CLIENTE.getId()){
            JOptionPane.showMessageDialog(null, "Cliente não encontrado", "Atenção!", 2);
            return;
        }
        
        Main.getManager().criarProjeto(new projeto.model.Projeto(campoProjeto.getText(), campoDescricao.getText(), cliente.getId()));
        JOptionPane.showMessageDialog(null, "Projeto cadastrado com sucesso");   
        dispose();
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void campoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoClienteActionPerformed

    }//GEN-LAST:event_campoClienteActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JTextField campoCliente;
    private javax.swing.JTextArea campoDescricao;
    private javax.swing.JTextField campoProjeto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel label_cadastraoProjeto;
    private javax.swing.JLabel label_descricao;
    private javax.swing.JLabel label_nomeCliente;
    private javax.swing.JLabel label_nomeProjeto;
    // End of variables declaration//GEN-END:variables

    private static class Projeto {

        public Projeto(String text, String text0, long currentTimeMillis) {
        }
    }
}