package projeto.GUI.mensagem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import projeto.Main;
import projeto.model.MensagemColetiva;
import projeto.model.MensagemIndividual;
import projeto.model.Projeto;
import projeto.model.Usuario;
import projeto.model.tipos.FuncaoUsuario;

public class ConsultarMensagem extends javax.swing.JFrame {

    public ConsultarMensagem() {
        initComponents();
        DefaultTableModel tabelaMensagens =  (DefaultTableModel) tabelaTipoMensagem.getModel();
        tabelaTipoMensagem.setRowSorter(new TableRowSorter(tabelaMensagens));
         
        readTable();

        setTitle("Pro4Tech - Consultar mensagens");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaTipoMensagem = new javax.swing.JTable();
        campoTipoMensagem = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoMensagens = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        botaoRetornar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tabelaTipoMensagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaTipoMensagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaTipoMensagemMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaTipoMensagem);
        if (tabelaTipoMensagem.getColumnModel().getColumnCount() > 0) {
            tabelaTipoMensagem.getColumnModel().getColumn(0).setResizable(false);
            tabelaTipoMensagem.getColumnModel().getColumn(1).setMinWidth(0);
            tabelaTipoMensagem.getColumnModel().getColumn(1).setPreferredWidth(0);
            tabelaTipoMensagem.getColumnModel().getColumn(1).setMaxWidth(0);
        }

        campoTipoMensagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Coletiva" }));
        campoTipoMensagem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                campoTipoMensagemItemStateChanged(evt);
            }
        });

        jLabel1.setText("Tipo de mensagem:");

        campoMensagens.setEditable(false);
        campoMensagens.setColumns(20);
        campoMensagens.setLineWrap(true);
        campoMensagens.setRows(5);
        jScrollPane1.setViewportView(campoMensagens);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Histórico de mensagens");

        botaoRetornar.setText("Retornar");
        botaoRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRetornarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoRetornar)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTipoMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(107, 107, 107)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTipoMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(botaoRetornar)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRetornarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoRetornarActionPerformed

    private void campoTipoMensagemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_campoTipoMensagemItemStateChanged
        readTable();
    }//GEN-LAST:event_campoTipoMensagemItemStateChanged

    private void tabelaTipoMensagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaTipoMensagemMouseClicked

        int linhaSelecionada = tabelaTipoMensagem.getSelectedRow();
        int id = Integer.parseInt(tabelaTipoMensagem.getValueAt(linhaSelecionada, 1) + "");
        String selecionado = campoTipoMensagem.getSelectedItem() + "";
        
        if(selecionado.equalsIgnoreCase("Individual")){
            
            List<MensagemIndividual> mensagens = Main.getManager().getmIndiDAO().getMensagens(id, Main.getManager().getUsuarioLogado().getId());
            
            List<MensagemIndividual> novaLista = mensagens.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(()-> new TreeSet<MensagemIndividual>(Comparator.comparingLong(MensagemIndividual::getData))), ArrayList::new));
            String string = "";
            for(MensagemIndividual mensagem : novaLista){
                Usuario remetente = Main.getManager().getUsuarioByID(mensagem.getIdRemetente());
                string += "[" + Main.getManager().transformarData(mensagem.getData()).replace("-", "às") + "] " + remetente.getNome() + ": " + mensagem.getConteudo() + "\n";
            }
            
            campoMensagens.setText(string);
        }else{
            
            List<MensagemColetiva> mensagens = Main.getManager().getmColeDAO().getMensagensPorDestinatario(id);

            List<MensagemColetiva> novaLista = mensagens.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(()-> new TreeSet<MensagemColetiva>(Comparator.comparingLong(MensagemColetiva::getData))), ArrayList::new));
            
            String string = "";
            for(MensagemColetiva mensagem : novaLista){
                Usuario remetente = Main.getManager().getUsuarioByID(mensagem.getIdRemetente());
                string += "[" + Main.getManager().transformarData(mensagem.getData()).replace("-", "às") + "] " + remetente.getNome() + ": " + mensagem.getConteudo() + "\n";
            }
            
            campoMensagens.setText(string);
        }
    }//GEN-LAST:event_tabelaTipoMensagemMouseClicked

    
    public final void readTable(){
        String selecionado = campoTipoMensagem.getSelectedItem() + "";

        DefaultTableModel tabelaMensagens =  (DefaultTableModel) tabelaTipoMensagem.getModel();
        tabelaMensagens.setNumRows(0);
         
        if(selecionado.equalsIgnoreCase("Individual")){
             
            List<Integer> minhaLista = Main.getManager().getmIndiDAO().getTeste(Main.getManager().getUsuarioLogado().getId());
             
            for(int ids : minhaLista){
                Usuario remetente = Main.getManager().getUsuarioByID(ids);
                tabelaMensagens.addRow(new Object[]{
                    remetente.getNome(),
                    ids
                });
            }
             
        }else{
             
            List<Projeto> listaProjetos;
             
            if(Main.getManager().getUsuarioLogado().getFuncaoUsuario() == FuncaoUsuario.CLIENTE.getId()){
                listaProjetos = Main.getManager().getProjetoDAO().getProjetosPorCliente(Main.getManager().getUsuarioLogado().getId());
            }else{
                listaProjetos = Main.getManager().getProjetoDAO().getTodosProjetos();
            }
             
            for(Projeto projeto : listaProjetos){
                tabelaMensagens.addRow(new Object[] {
                    projeto.getNome(),
                    projeto.getId()
                });
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoRetornar;
    private javax.swing.JTextArea campoMensagens;
    private javax.swing.JComboBox<String> campoTipoMensagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaTipoMensagem;
    // End of variables declaration//GEN-END:variables
}
