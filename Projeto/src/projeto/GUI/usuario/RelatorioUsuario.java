package projeto.GUI.usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.Main;
import projeto.model.Usuario;

public class RelatorioUsuario extends javax.swing.JFrame {

    public RelatorioUsuario() {
        initComponents();

        DefaultTableModel tabelaMensagens =  (DefaultTableModel) tabelaRelatorio.getModel();
        tabelaMensagens.setNumRows(0);

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRelatorio = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoMaisMandou = new javax.swing.JTextField();
        campoMenosMandou = new javax.swing.JTextField();
        botaoRelatorioGeral = new javax.swing.JButton();
        botaoRelatorioPesquisa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 189, 121));
        jPanel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(126, 53, 4));
        jLabel1.setText("Relatório de Mensagens Individuais");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        tabelaRelatorio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tabelaRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Quantidade de Mensagens"
            }
        ));
        tabelaRelatorio.setEnabled(false);
        jScrollPane1.setViewportView(tabelaRelatorio);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Usuário que mais manda mensagem:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Usuário que menos manda mensagem:");

        campoMaisMandou.setEditable(false);
        campoMaisMandou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMaisMandouActionPerformed(evt);
            }
        });

        campoMenosMandou.setEditable(false);

        botaoRelatorioGeral.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botaoRelatorioGeral.setText("Gerar Relatório Geral");
        botaoRelatorioGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRelatorioGeralActionPerformed(evt);
            }
        });

        botaoRelatorioPesquisa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botaoRelatorioPesquisa.setText("Gerar Relatório");
        botaoRelatorioPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRelatorioPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoNome)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoMaisMandou)
                            .addComponent(campoMenosMandou)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoRelatorioPesquisa)
                        .addGap(39, 39, 39)
                        .addComponent(botaoRelatorioGeral)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoMaisMandou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoMenosMandou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoRelatorioGeral)
                    .addComponent(botaoRelatorioPesquisa))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed

    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoMaisMandouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMaisMandouActionPerformed

    }//GEN-LAST:event_campoMaisMandouActionPerformed

    private void botaoRelatorioGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRelatorioGeralActionPerformed

        try{
            String sql = "select idremetente, count(*) from mensagem_individual group by idremetente order by count(*);";
            List<String> Lista = new ArrayList<>();
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tabelaRelatorio.getModel();
            model.setNumRows(0);
            
            while(rs.next()){
                int count = rs.getInt("count(*)");
                int idremetente = rs.getInt("idremetente");
                Usuario usuario = Main.getManager().getUsuarioByID(idremetente);
                model.addRow(new Object[] {
                   usuario.getNome(),
                    count
                });
                Lista.add(usuario.getNome());
            }
            
            campoMenosMandou.setText(Lista.get(0));
            campoMaisMandou.setText(Lista.get(Lista.size()-1));
            
        }catch(SQLException e){
            
        }
    }//GEN-LAST:event_botaoRelatorioGeralActionPerformed

    private void botaoRelatorioPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRelatorioPesquisaActionPerformed

        if(campoNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            return;
        }

        if(!Main.getManager().existeUsuario(campoNome.getText())){
            JOptionPane.showMessageDialog(null, "Usuário não encontrado");
            return;
        }

        try{
            String sql = "select idremetente, count(*) from mensagem_individual where idremetente = ?;";
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            Usuario usuario = Main.getManager().getUsuarioByUserName(campoNome.getText());
            statement.setInt(1, usuario.getId());
            
            ResultSet rs = statement.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tabelaRelatorio.getModel();
            model.setNumRows(0);
            
            while(rs.next()){
                int count = rs.getInt("count(*)");
                model.addRow(new Object[] {
                   usuario.getNome(),
                    count
                });
            }
            
        }catch(SQLException e){
            
        }
                   
    }//GEN-LAST:event_botaoRelatorioPesquisaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoRelatorioGeral;
    private javax.swing.JButton botaoRelatorioPesquisa;
    private javax.swing.JTextField campoMaisMandou;
    private javax.swing.JTextField campoMenosMandou;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaRelatorio;
    // End of variables declaration//GEN-END:variables
}
