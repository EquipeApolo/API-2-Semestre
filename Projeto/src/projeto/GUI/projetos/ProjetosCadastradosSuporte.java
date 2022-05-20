package projeto.GUI.projetos;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import projeto.Main;
import projeto.model.Projeto;
import projeto.model.Usuario;

public class ProjetosCadastradosSuporte extends javax.swing.JFrame {

    public ProjetosCadastradosSuporte() {
        initComponents();
        DefaultTableModel tabelaMensagens =  (DefaultTableModel) table_projetoCadastrado.getModel();
        table_projetoCadastrado.setRowSorter(new TableRowSorter(tabelaMensagens));
         
        readTable();

        setTitle("Pro4Tech - Consultar projetos");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_nomeProjeto = new javax.swing.JLabel();
        label_iconeMensagem = new javax.swing.JLabel();
        campoConsulta = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_projetoCadastrado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        label_nomeProjeto.setText("CONSULTA");

        label_iconeMensagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/Projeto.png"))); // NOI18N

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoConsulta)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_iconeMensagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_nomeProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(113, 113, 113))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_iconeMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nomeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(campoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        table_projetoCadastrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome do Projeto", "Nome do Cliente", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_projetoCadastrado.setName(""); // NOI18N
        table_projetoCadastrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_projetoCadastradoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_projetoCadastrado);
        if (table_projetoCadastrado.getColumnModel().getColumnCount() > 0) {
            table_projetoCadastrado.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoConsultaActionPerformed

    }//GEN-LAST:event_campoConsultaActionPerformed

    private void table_projetoCadastradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_projetoCadastradoMouseClicked

        int linhaSelecionada =  table_projetoCadastrado.getSelectedRow();
        String nome = (String)table_projetoCadastrado.getValueAt(linhaSelecionada, 0);
        Projeto projeto = Main.getManager().getProjetoByName(nome);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                ExibirProjetosTabela exibitExibirLinhasTabela = new ExibirProjetosTabela(projeto);
                exibitExibirLinhasTabela.setVisible(true);
            }
        });     
    }//GEN-LAST:event_table_projetoCadastradoMouseClicked

    private void campoConsultaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoConsultaKeyReleased

        String campo = campoConsulta.getText();
        List<Projeto> listaProjetos = new ArrayList<>();
        List<Integer> idsUsuarios = new ArrayList<>();

        DefaultTableModel tabelaProjetos = (DefaultTableModel) table_projetoCadastrado.getModel(); 
        tabelaProjetos.setNumRows(0);
        
        listaProjetos.addAll(Main.getManager().getProjetoDAO().getProjetosPorNome(campo));

        for(Usuario usuario : Main.getManager().getUsuarioDao().getUsuariosPorNome(campo)){
            idsUsuarios.add(usuario.getId());
        }
        for(Usuario usuario : Main.getManager().getUsuarioDao().getUsuariosPorNomeUsuario(campo)){
            if(!idsUsuarios.contains(usuario.getId())) idsUsuarios.add(usuario.getId());
        }

        for(int ids : idsUsuarios){
            listaProjetos.addAll(Main.getManager().getProjetoDAO().getProjetosPorCliente(ids));
        }

        List<Projeto> novaListaProjetos = listaProjetos.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<Projeto>(Comparator.comparingInt(Projeto::getId))),
                                                           ArrayList::new));
        for(Projeto projeto: novaListaProjetos){
            if(!Main.getManager().existeUsuario(projeto.getIdCliente())) return;
            Usuario cliente = Main.getManager().getUsuarioByID(projeto.getIdCliente());
              Object[] obj = (new Object[]{
                projeto.getNome(),
                cliente.getNome(),
                projeto.getDescricao()
                });
            tabelaProjetos.addRow(obj);
        }

        table_projetoCadastrado.getColumnModel().getColumn(2).setCellRenderer(new projeto.GUI.WordWrapRenderer());
  
    }//GEN-LAST:event_campoConsultaKeyReleased

    public void readTable(){

        DefaultTableModel tabelaProjetos =  (DefaultTableModel) table_projetoCadastrado.getModel();
        tabelaProjetos.setNumRows(0);
        
       List<Projeto> listaProjetos = Main.getManager().getProjetoDAO().getTodosProjetos();

        for(Projeto projeto: listaProjetos){
            if(!Main.getManager().existeUsuario(projeto.getIdCliente())) return;
            Usuario cliente = Main.getManager().getUsuarioByID(projeto.getIdCliente());
              tabelaProjetos.addRow(new Object[]{
                projeto.getNome(),
                cliente.getNome(),
                projeto.getDescricao()
                });
        }

        table_projetoCadastrado.getColumnModel().getColumn(2).setCellRenderer(new projeto.GUI.WordWrapRenderer());
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoConsulta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_iconeMensagem;
    private javax.swing.JLabel label_nomeProjeto;
    private javax.swing.JTable table_projetoCadastrado;
    // End of variables declaration//GEN-END:variables
}
