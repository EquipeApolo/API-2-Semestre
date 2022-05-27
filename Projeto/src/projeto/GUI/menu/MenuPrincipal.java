package projeto.GUI.menu;

import projeto.GUI.mensagem.ConsultarMensagem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import projeto.GUI.mensagem.CadastrarMensagem;
import projeto.Main;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        setTitle("Pro4Tech");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

        jMenuItem3 = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        label_pro4Tech = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuMensagens = new javax.swing.JMenu();
        botaoAdicionarMensagem = new javax.swing.JMenuItem();
        botaoConsultarMensagens = new javax.swing.JMenuItem();
        menuPerfil = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenu();

        jMenuItem3.setText("jMenuItem3");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        label_pro4Tech.setBackground(new java.awt.Color(255, 255, 255));
        label_pro4Tech.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/pro4tech.png"))); // NOI18N

        jDesktopPane1.setLayer(label_pro4Tech, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_pro4Tech, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(label_pro4Tech)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        menuBar.setBackground(new java.awt.Color(204, 204, 204));

        menuMensagens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/email_attach.png"))); // NOI18N
        menuMensagens.setText("Mensagens");
        menuMensagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMensagensActionPerformed(evt);
            }
        });

        botaoAdicionarMensagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/+.png"))); // NOI18N
        botaoAdicionarMensagem.setText("Adicionar");
        botaoAdicionarMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarMensagemActionPerformed(evt);
            }
        });
        menuMensagens.add(botaoAdicionarMensagem);

        botaoConsultarMensagens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/Lupa.png"))); // NOI18N
        botaoConsultarMensagens.setText("Consultar");
        botaoConsultarMensagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarMensagensActionPerformed(evt);
            }
        });
        menuMensagens.add(botaoConsultarMensagens);

        menuBar.add(menuMensagens);

        menuPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/User.png"))); // NOI18N
        menuPerfil.setText("Perfil");
        menuPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPerfilActionPerformed(evt);
            }
        });
        menuBar.add(menuPerfil);

        menuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/exclamation.png"))); // NOI18N
        menuSobre.setText("Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        menuBar.add(menuSobre);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAdicionarMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarMensagemActionPerformed
        new CadastrarMensagem().setVisible(true);   
    }//GEN-LAST:event_botaoAdicionarMensagemActionPerformed

    private void menuMensagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMensagensActionPerformed

    }//GEN-LAST:event_menuMensagensActionPerformed

    private void botaoConsultarMensagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarMensagensActionPerformed

        new ConsultarMensagem().setVisible(true);
    }//GEN-LAST:event_botaoConsultarMensagensActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed

    }//GEN-LAST:event_menuSobreActionPerformed

    private void menuPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPerfilActionPerformed
        //new ().setVisible(true);
    }//GEN-LAST:event_menuPerfilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem botaoAdicionarMensagem;
    private javax.swing.JMenuItem botaoConsultarMensagens;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel label_pro4Tech;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuMensagens;
    private javax.swing.JMenu menuPerfil;
    private javax.swing.JMenu menuSobre;
    // End of variables declaration//GEN-END:variables
}
