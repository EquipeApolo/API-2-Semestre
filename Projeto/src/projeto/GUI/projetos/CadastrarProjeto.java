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
        jPanel1 = new javax.swing.JPanel();
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

        jPanel1.setBackground(new java.awt.Color(242, 189, 121));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        campoProjeto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoProjetoActionPerformed(evt);
            }
        });

        label_descricao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_descricao.setText("Descrição:");

        label_nomeCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_nomeCliente.setText("Nome do Cliente:");

        botaoCancelar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        campoCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoClienteActionPerformed(evt);
            }
        });

        label_nomeProjeto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_nomeProjeto.setText("Nome do Projeto:");

        label_cadastraoProjeto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label_cadastraoProjeto.setForeground(new java.awt.Color(126, 53, 4));
        label_cadastraoProjeto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_cadastraoProjeto.setText("Cadastro de Projeto");
        label_cadastraoProjeto.setFocusable(false);
        label_cadastraoProjeto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        botaoCadastrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        campoDescricao.setColumns(20);
        campoDescricao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campoDescricao.setLineWrap(true);
        campoDescricao.setRows(5);
        jScrollPane2.setViewportView(campoDescricao);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_cadastraoProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_nomeProjeto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_descricao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_nomeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoCancelar)
                        .addGap(26, 26, 26)
                        .addComponent(botaoCadastrar)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(118, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(410, 410, 410)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(label_cadastraoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nomeCliente)
                    .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nomeProjeto)
                    .addComponent(campoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(label_descricao)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoCadastrar))
                .addGap(12, 12, 12))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel2)
                    .addContainerGap(374, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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
    private javax.swing.JPanel jPanel1;
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
