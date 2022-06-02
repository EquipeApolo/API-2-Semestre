package projeto.GUI.mensagem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import projeto.Main;
import projeto.model.Mensagem;
import projeto.model.MensagemColetiva;
import projeto.model.MensagemIndividual;
import projeto.model.Projeto;
import projeto.model.Usuario;

public class CadastrarMensagem extends javax.swing.JFrame {

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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        label_meioEnvio = new javax.swing.JLabel();
        label_conteudo = new javax.swing.JLabel();
        label_nomeCliente = new javax.swing.JLabel();
        button_cancelar = new javax.swing.JButton();
        campoDestinatario = new javax.swing.JTextField();
        label_cadastroMensagem = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoConteudo = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        campoTipoMensagem = new javax.swing.JComboBox<>();

        jLabel6.setText("jLabel6");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(242, 189, 121));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        label_meioEnvio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        label_conteudo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_conteudo.setText("Conteúdo:");

        label_nomeCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_nomeCliente.setText("Destinatário:");

        button_cancelar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        button_cancelar.setText("Cancelar");
        button_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cancelarActionPerformed(evt);
            }
        });

        campoDestinatario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campoDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDestinatarioActionPerformed(evt);
            }
        });

        label_cadastroMensagem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label_cadastroMensagem.setForeground(new java.awt.Color(126, 53, 4));
        label_cadastroMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_cadastroMensagem.setText("Cadastro de Mensagem");

        botaoCadastrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        campoConteudo.setColumns(20);
        campoConteudo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campoConteudo.setLineWrap(true);
        campoConteudo.setRows(5);
        jScrollPane2.setViewportView(campoConteudo);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Tipo de Mensagem:");

        campoTipoMensagem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campoTipoMensagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um campo", "Individual", "Projeto" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_nomeCliente)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTipoMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(label_cadastroMensagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_conteudo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_cancelar)
                .addGap(117, 117, 117))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(348, 442, Short.MAX_VALUE)
                            .addComponent(botaoCadastrar)
                            .addGap(2, 2, 2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel2))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(label_meioEnvio)
                                    .addGap(280, 521, Short.MAX_VALUE)))))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(label_cadastroMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoTipoMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nomeCliente)
                    .addComponent(campoDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(label_conteudo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(button_cancelar)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                    .addComponent(label_meioEnvio)
                    .addGap(357, 357, 357)
                    .addComponent(botaoCadastrar)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
         
    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed

        String comboBox = (campoTipoMensagem.getSelectedItem() + "").toLowerCase();
        
        if(campoDestinatario.getText().isEmpty() || campoConteudo.getText().isEmpty() || comboBox.equals("selecione um campo")){
            JOptionPane.showMessageDialog(null, "Faltou um campo para preencher");  
            return;
        }
        
        Mensagem mensagem = new Mensagem(Main.getManager().getUsuarioLogado().getId(), "sistema", campoConteudo.getText(), System.currentTimeMillis());
        if(comboBox.equals("individual")){
            if(!Main.getManager().existeUsuario(campoDestinatario.getText())){
                JOptionPane.showMessageDialog(null, "Usuário não encontrado");  
                return;
            }
            Usuario destinatario = Main.getManager().getUsuarioByUserName(campoDestinatario.getText());
            
            Main.getManager().getmIndiDAO().addMensagemToDatabase(new MensagemIndividual(mensagem, destinatario.getId()));
        }else{
            if(!Main.getManager().existeProjeto(campoDestinatario.getText())){
                JOptionPane.showMessageDialog(null, "Projeto não encontrado");  
                return; 
            }
            Projeto destinatario = Main.getManager().getProjetoByName(campoDestinatario.getText());
            
            Main.getManager().getmColeDAO().addMensagemToDatabase(new MensagemColetiva(mensagem, destinatario.getId()));
        }
        
        JOptionPane.showMessageDialog(null, "Mensagem cadastrada com sucesso!");
        dispose(); 
  
                
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void campoDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDestinatarioActionPerformed
        
    }//GEN-LAST:event_campoDestinatarioActionPerformed

    private void button_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_button_cancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton button_cancelar;
    private javax.swing.JTextArea campoConteudo;
    private javax.swing.JTextField campoDestinatario;
    private javax.swing.JComboBox<String> campoTipoMensagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel label_cadastroMensagem;
    private javax.swing.JLabel label_conteudo;
    private javax.swing.JLabel label_meioEnvio;
    private javax.swing.JLabel label_nomeCliente;
    // End of variables declaration//GEN-END:variables
}
