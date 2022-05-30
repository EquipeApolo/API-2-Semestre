package projeto.GUI.usuario;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import projeto.Main;
import projeto.model.Usuario;
import projeto.model.tipos.FuncaoUsuario;

public class EditarUsuario extends javax.swing.JFrame {
    
    private Usuario usuario;
    private FuncaoUsuario funcaoUsuario;
    private TelaUsuariosCadastrados paginaUsuario;
    
    public EditarUsuario(TelaUsuariosCadastrados paginaUsuario, Usuario usuario, FuncaoUsuario funcaoUsuario) {
        initComponents();
        
        this.usuario = usuario;
        this.paginaUsuario = paginaUsuario;
        this.funcaoUsuario = funcaoUsuario;
        campoLogin.setText(usuario.getUserName());
        campoNome.setText(usuario.getNome());
        campoEmail.setText(usuario.getEmail());
        
        setTitle("Pro4Tech - Usuário");
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

        botaoVoltar = new javax.swing.JButton();
        campoNome = new javax.swing.JTextField();
        Button_atualizar = new javax.swing.JButton();
        label_nome = new javax.swing.JLabel();
        label_login = new javax.swing.JLabel();
        campoLogin = new javax.swing.JTextField();
        Button_excluir = new javax.swing.JButton();
        label_email = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        labelTipoPerfil = new javax.swing.JLabel();
        campoTipoPerfil = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        Button_atualizar.setText("Atualizar");
        Button_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_atualizarActionPerformed(evt);
            }
        });

        label_nome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_nome.setText("Nome:");

        label_login.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_login.setText("Login:");
        label_login.setPreferredSize(new java.awt.Dimension(40, 20));

        campoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLoginActionPerformed(evt);
            }
        });

        Button_excluir.setText("Excluir");
        Button_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_excluirActionPerformed(evt);
            }
        });

        label_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_email.setText("Email:");
        label_email.setPreferredSize(new java.awt.Dimension(40, 20));

        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });

        labelTipoPerfil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTipoPerfil.setText("Tipo de perfil:");

        campoTipoPerfil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoTipoPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um perfil", "Cliente", "Administrador", "Suporte" }));
        campoTipoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTipoPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Button_excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button_atualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, Short.MAX_VALUE)
                        .addComponent(botaoVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_nome)
                                    .addComponent(label_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(campoLogin)
                                    .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                                    .addComponent(campoEmail)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTipoPerfil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoTipoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nome)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipoPerfil)
                    .addComponent(campoTipoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar)
                    .addComponent(Button_atualizar)
                    .addComponent(Button_excluir))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void Button_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_atualizarActionPerformed

        String comboBox = (campoTipoPerfil.getSelectedItem() + "").toLowerCase();
       
        if(campoNome.getText().isEmpty() || campoLogin.getText().isEmpty() ||
                comboBox.equals("selecione um perfil") || campoEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Favor preencher os campos obrigatórios", "Atenção!", 2);
            return;
        }
        
        if((!campoLogin.getText().equalsIgnoreCase(usuario.getUserName())) && Main.getManager().existeUsuario(campoLogin.getText())){
            JOptionPane.showMessageDialog(null, "Login já cadastrado", "Atenção!", 2);
            return;
        }

        if((!campoNome.getText().equalsIgnoreCase(usuario.getNome())) && Main.getManager().existeUsuarioNome(campoNome.getText())){
            JOptionPane.showMessageDialog(null, "Nome de usuário já cadastrado", "Atenção!", 2);
            return;
        }
        
        if(!campoEmail.getText().contains("@")){
            JOptionPane.showMessageDialog(null, "Formato de email incorreto", "Atenção!", 2);
            return;
        }

        FuncaoUsuario funcao = FuncaoUsuario.getFuncaoByName(comboBox);
        
        usuario.setEmail(campoEmail.getText());
        usuario.setNome(campoNome.getText());
        usuario.setUserName(campoLogin.getText());
        usuario.setFuncaoUsuario(funcao.getId());

        Main.getManager().editarUsuario(usuario);
        JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso");
        dispose();
        paginaUsuario.readTable();
    }//GEN-LAST:event_Button_atualizarActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed

    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLoginActionPerformed

    }//GEN-LAST:event_campoLoginActionPerformed

    private void Button_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_excluirActionPerformed
        // TODO add your handling code here:
        Main.getManager().getUsuarioDao().deleteUsuario(usuario.getId());
        JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso");   
        dispose();
        paginaUsuario.readTable();
    }//GEN-LAST:event_Button_excluirActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    private void campoTipoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTipoPerfilActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_campoTipoPerfilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_atualizar;
    private javax.swing.JButton Button_excluir;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JTextField campoNome;
    private javax.swing.JComboBox<String> campoTipoPerfil;
    private javax.swing.JLabel labelTipoPerfil;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_login;
    private javax.swing.JLabel label_nome;
    // End of variables declaration//GEN-END:variables
}
