package projeto.GUI.usuario;

import projeto.GUI.projetos.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import projeto.Main;
import projeto.connection.dao.ProjetoDAO;
import projeto.connection.dao.UsuarioDAO;
import projeto.model.Projeto;
import projeto.model.Usuario;
import projeto.model.tipos.FuncaoUsuario;

public class ExibirPerfil extends javax.swing.JFrame {
    
    private Usuario usuario;
    private TelaUsuariosCadastrados paginaUsuario;

    
    public ExibirPerfil(Usuario usuario, TelaUsuariosCadastrados paginaUsuario) {
        initComponents();
        
        this.usuario = usuario;
        this.paginaUsuario = paginaUsuario;
        campoLogin.setText(usuario.getUserName());
        campoNome.setText(usuario.getNome());
        campoEmail.setText(usuario.getEmail());
        campoSenha.setText(usuario.getSenha());
//        Usuario cliente = Main.getManager().getUsuarioByID(usuario.UserName());
//        campoNome.setText(cliente.getNome());  
//        
        setTitle("Pro4Tech - Usuário");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoVoltar = new javax.swing.JButton();
        Button_atualizar = new javax.swing.JButton();
        label_nome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        label_login = new javax.swing.JLabel();
        campoLogin = new javax.swing.JTextField();
        label_email = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        label_senha = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
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

        campoNome.setEditable(false);
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        label_login.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_login.setText("Login:");

        campoLogin.setEditable(false);
        campoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLoginActionPerformed(evt);
            }
        });

        label_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_email.setText("Email:");

        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });

        label_senha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_senha.setText("Senha");

        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
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
                        .addComponent(Button_atualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                        .addComponent(botaoVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_nome)
                            .addComponent(label_login)
                            .addComponent(label_email)
                            .addComponent(label_senha))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(campoLogin)
                            .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                            .addComponent(campoEmail)
                            .addComponent(campoSenha))
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
                    .addComponent(label_login))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_email))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_senha)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar)
                    .addComponent(Button_atualizar))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void Button_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_atualizarActionPerformed
       
        if(campoNome.getText().isEmpty() || campoLogin.getText().isEmpty() || campoEmail.getText().isEmpty() || 
                campoSenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Favor preencher os campos obrigatórios", "Atenção!", 2);
            return;
        }
//        
//        if(Main.getManager().existeUsuario(campoLogin.getText())){
//            JOptionPane.showMessageDialog(null, "Login já cadastrado", "Atenção!", 2);
//            return;
//        }

//        if(Main.getManager().existeUsuarioNome(campoNome.getText())){
//            JOptionPane.showMessageDialog(null, "Nome de usuário já cadastrado", "Atenção!", 2);
//            return;
//        }
        
        if(!campoEmail.getText().contains("@")){
            JOptionPane.showMessageDialog(null, "Formato de email incorreto", "Atenção!", 2);
            return;
        }
        
        usuario.setEmail(campoEmail.getText());
        usuario.setNome(campoNome.getText());
        usuario.setUserName(campoLogin.getText());

        Main.getManager().editarUsuario(usuario);
        JOptionPane.showMessageDialog(null, "Perfil atualizado com sucesso");
        dispose();
        paginaUsuario.readTable();
    }//GEN-LAST:event_Button_atualizarActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed

    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLoginActionPerformed

    }//GEN-LAST:event_campoLoginActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed

    }//GEN-LAST:event_campoSenhaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_atualizar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_login;
    private javax.swing.JLabel label_nome;
    private javax.swing.JLabel label_senha;
    // End of variables declaration//GEN-END:variables
}
