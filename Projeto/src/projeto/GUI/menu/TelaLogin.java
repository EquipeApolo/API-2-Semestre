package projeto.GUI.menu;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import projeto.Main;
import projeto.model.Usuario;
import projeto.model.tipos.FuncaoUsuario;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
        
        setTitle("Pro4Tech");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e){
            Main.getConnectionFactory().closeConnection();
            System.exit(0);
        }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_usuario = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        botaoEntrar = new javax.swing.JButton();
        label_login = new javax.swing.JLabel();
        label_pro4Tech = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        label_usuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_usuario.setText("Usuário");

        campoUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Senha");

        campoSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        botaoEntrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botaoEntrar.setText("Entrar");
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });

        label_login.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_login.setText("Login ");

        label_pro4Tech.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/pro4tech.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(label_pro4Tech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoEntrar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_usuario)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(label_pro4Tech)
                .addGap(42, 42, 42)
                .addComponent(label_login)
                .addGap(35, 35, 35)
                .addComponent(label_usuario)
                .addGap(14, 14, 14)
                .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(botaoEntrar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        
        if(campoUsuario.getText().isEmpty() || campoSenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Favor preencher os campos obrigatórios");
            return;
        }
        
        if(!Main.getManager().existeUsuario(campoUsuario.getText())){
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");            
            return;
        }
        
        Usuario usuario = Main.getManager().getUsuarioByUserName(campoUsuario.getText());
     
        if(usuario == null){
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");            
            return;
        }
        
        if(!usuario.getSenha().equals(new String(campoSenha.getPassword()))){
               JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");    
            return;
        }
        
        Main.getManager().setUsuarioLogado(usuario);
        new MenuPrincipal().setVisible(true);
        dispose();

    }//GEN-LAST:event_botaoEntrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_login;
    private javax.swing.JLabel label_pro4Tech;
    private javax.swing.JLabel label_usuario;
    // End of variables declaration//GEN-END:variables
}
