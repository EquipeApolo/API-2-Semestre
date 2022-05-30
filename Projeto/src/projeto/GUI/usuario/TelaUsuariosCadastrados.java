package projeto.GUI.usuario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import projeto.Main;
import projeto.model.Usuario;
import projeto.model.tipos.FuncaoUsuario;

public class TelaUsuariosCadastrados extends javax.swing.JFrame {

    private FuncaoUsuario funcaoUsuario;

    public TelaUsuariosCadastrados() {
        initComponents();
        
        DefaultTableModel tabelaMensagens =  (DefaultTableModel) tableUsuarioCadastrado.getModel();
        tableUsuarioCadastrado.setRowSorter(new TableRowSorter(tabelaMensagens));
         
        readTable();
        
        setTitle("Pro4Tech - Consultar usuários");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        label_nomeUsuario = new javax.swing.JLabel();
        campoConsulta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsuarioCadastrado = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        label_nomeUsuario.setText("NOME DO USUÁRIO");

        campoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoConsultaActionPerformed(evt);
            }
        });
        campoConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoConsultaKeyReleased(evt);
            }
        });

        tableUsuarioCadastrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Login", "Email", "Função"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableUsuarioCadastrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUsuarioCadastradoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUsuarioCadastrado);
        if (tableUsuarioCadastrado.getColumnModel().getColumnCount() > 0) {
            tableUsuarioCadastrado.getColumnModel().getColumn(0).setResizable(false);
            tableUsuarioCadastrado.getColumnModel().getColumn(1).setResizable(false);
            tableUsuarioCadastrado.getColumnModel().getColumn(2).setResizable(false);
            tableUsuarioCadastrado.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/User.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(campoConsulta)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_nomeUsuario)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(label_nomeUsuario))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoConsultaActionPerformed

    }//GEN-LAST:event_campoConsultaActionPerformed

    private void campoConsultaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoConsultaKeyReleased

        String campo = campoConsulta.getText();
        List<Usuario> listaUsuarios = new ArrayList<>();
        List<Integer> idsUsuarios = new ArrayList<>();

        DefaultTableModel tabelaUsuarios = (DefaultTableModel) tableUsuarioCadastrado.getModel(); 
        tabelaUsuarios.setNumRows(0);

        for(Usuario usuario : Main.getManager().getUsuarioDao().getUsuariosPorNome(campo)){
            idsUsuarios.add(usuario.getId());
        }
        for(Usuario usuario : Main.getManager().getUsuarioDao().getUsuariosPorNomeUsuario(campo)){
            if(!idsUsuarios.contains(usuario.getId())) idsUsuarios.add(usuario.getId());
        }

        for(int ids : idsUsuarios){
            listaUsuarios.add(Main.getManager().getUsuarioByID(ids));
        }

        for(Usuario usuario : listaUsuarios){
            tabelaUsuarios.addRow(new Object[]{
                usuario.getNome(),
                usuario.getUserName(),
                usuario.getEmail(),
                FuncaoUsuario.getFuncaoByID(usuario.getFuncaoUsuario()).toString()
                });
        }

    }//GEN-LAST:event_campoConsultaKeyReleased

    private void tableUsuarioCadastradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUsuarioCadastradoMouseClicked
        // TODO add your handling code here:
        int linhaSelecionada =  tableUsuarioCadastrado.getSelectedRow();
        String userName = (String)tableUsuarioCadastrado.getValueAt(linhaSelecionada, 1);
        Usuario usuario = Main.getManager().getUsuarioByUserName(userName);

        
        EditarUsuario exibitExibirUsuarioTabela = new EditarUsuario(this, usuario, funcaoUsuario);
        exibitExibirUsuarioTabela.setVisible(true);
    }//GEN-LAST:event_tableUsuarioCadastradoMouseClicked

    public void readTable(){

        DefaultTableModel tabelaUsuarios =  (DefaultTableModel) tableUsuarioCadastrado.getModel();
        tabelaUsuarios.setNumRows(0);
        
        List<Usuario> listaUsuarios = Main.getManager().getUsuarioDao().getTodosUsuarios();

        for(Usuario usuario: listaUsuarios){
            tabelaUsuarios.addRow(new Object[]{
                usuario.getNome(),
                usuario.getUserName(),
                usuario.getEmail(),
                FuncaoUsuario.getFuncaoByID(usuario.getFuncaoUsuario()).toString()
                });
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoConsulta;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_nomeUsuario;
    private javax.swing.JTable tableUsuarioCadastrado;
    // End of variables declaration//GEN-END:variables
}
