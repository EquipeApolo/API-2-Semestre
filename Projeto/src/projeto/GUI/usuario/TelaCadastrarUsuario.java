package projeto.GUI.usuario;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import projeto.Main;
import projeto.model.Usuario;
import projeto.model.tipos.FuncaoUsuario;

public class TelaCadastrarUsuario extends javax.swing.JFrame {

    public TelaCadastrarUsuario() {
        initComponents();
        
        setTitle("Pro4Tech - Cadastro de usuário");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        if(Main.getManager().getUsuarioLogado().getFuncaoUsuario() != 2){
            labelTipoPerfil.setVisible(false);
            campoTipoPerfil.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_cadastro = new javax.swing.JLabel();
        label_nome = new javax.swing.JLabel();
        label_nomeUsuario = new javax.swing.JLabel();
        label_senha = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoLogin = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        labelTipoPerfil = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        campoTipoPerfil = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(242, 189, 121));

        label_cadastro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label_cadastro.setForeground(new java.awt.Color(126, 53, 4));
        label_cadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_cadastro.setText("Cadastro de Usuário");
        label_cadastro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        label_nome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_nome.setText("Nome:");

        label_nomeUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_nomeUsuario.setText("Login:");

        label_senha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_senha.setText("Senha:");

        campoNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        campoLogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        campoSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });

        labelTipoPerfil.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelTipoPerfil.setText("Tipo de perfil:");

        botaoCadastrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        campoTipoPerfil.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campoTipoPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um perfil", "Cliente", "Administrador", "Suporte" }));
        campoTipoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTipoPerfilActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Email:");

        campoEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoCadastrar)
                .addGap(108, 108, 108))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTipoPerfil)
                        .addGap(18, 18, 18)
                        .addComponent(campoTipoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_senha)
                                    .addComponent(jLabel1)
                                    .addComponent(label_nomeUsuario))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(label_cadastro)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nome)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nomeUsuario))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_senha)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTipoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTipoPerfil))
                .addGap(18, 18, 18)
                .addComponent(botaoCadastrar)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed

    }//GEN-LAST:event_campoSenhaActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed

        String comboBox = (campoTipoPerfil.getSelectedItem() + "").toLowerCase();
        
        if(campoNome.getText().isEmpty() || campoLogin.getText().isEmpty() || campoSenha.getText().isEmpty() || 
               campoEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Favor preencher os campos obrigatórios", "Atenção!", 2);
            return;
        }
        
        if(Main.getManager().getUsuarioLogado().getFuncaoUsuario() == 2 && comboBox.equals("selecione um perfil")){
             JOptionPane.showMessageDialog(null, "Favor preencher os campos obrigatórios", "Atenção!", 2);
            return;
        }
        
        if(Main.getManager().existeUsuario(campoLogin.getText())){
            JOptionPane.showMessageDialog(null, "Nome de usuário já cadastrado", "Atenção!", 2);
            return;
        }

        if(new String(campoSenha.getPassword()).length() < 8){
            JOptionPane.showMessageDialog(null, "A senha deve conter ao menos 8 caracteres", "Atenção!", 2);
            return;
        }

        if(!campoEmail.getText().contains("@")){
            JOptionPane.showMessageDialog(null, "Formato de email incorreto", "Atenção!", 2);
            return;
        }
        
        if(Main.getManager().getUsuarioLogado().getFuncaoUsuario() == 2){
            Main.getManager().criarUsuario(new Usuario(campoNome.getText(), campoLogin.getText(), new String(campoSenha.getPassword()), campoEmail.getText(),
                FuncaoUsuario.getFuncaoByName(comboBox).getId()));
        }else{
            Main.getManager().criarUsuario(new Usuario(campoNome.getText(), campoLogin.getText(), new String(campoSenha.getPassword()), campoEmail.getText(),
                FuncaoUsuario.CLIENTE.getId()));
        }
        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
        dispose();
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void campoTipoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTipoPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTipoPerfilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JComboBox<String> campoTipoPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTipoPerfil;
    private javax.swing.JLabel label_cadastro;
    private javax.swing.JLabel label_nome;
    private javax.swing.JLabel label_nomeUsuario;
    private javax.swing.JLabel label_senha;
    // End of variables declaration//GEN-END:variables
}
