package projeto.GUI.projetos;

import javax.swing.JOptionPane;
import projeto.Main;
import projeto.model.Projeto;

public class EditarProjeto extends javax.swing.JFrame {
    
    private Projeto projeto;
    private ProjetosCadastrados paginaSuporte;
    
    public EditarProjeto(ProjetosCadastrados paginaSuporte, Projeto projeto) {
        initComponents();
        
        this.projeto = projeto;
        this.paginaSuporte = paginaSuporte;
        campoProjeto.setText(projeto.getNome());
        campoConteudo.setText(projeto.getDescricao());

        setTitle("Pro4Tech - Editando projeto");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_conteudo = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        label_mensagemRegistrada = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoConteudo = new javax.swing.JTextArea();
        Button_atualizar = new javax.swing.JButton();
        label_nomeProjeto = new javax.swing.JLabel();
        campoProjeto = new javax.swing.JTextField();
        Button_excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        label_conteudo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_conteudo.setText("Descrição:");

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        label_mensagemRegistrada.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        label_mensagemRegistrada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        campoConteudo.setColumns(20);
        campoConteudo.setLineWrap(true);
        campoConteudo.setRows(5);
        jScrollPane1.setViewportView(campoConteudo);

        Button_atualizar.setText("Atualizar");
        Button_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_atualizarActionPerformed(evt);
            }
        });

        label_nomeProjeto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_nomeProjeto.setText("Nome do Projeto:");

        campoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoProjetoActionPerformed(evt);
            }
        });

        Button_excluir.setText("Excluir");
        Button_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_mensagemRegistrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button_excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button_atualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoVoltar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_conteudo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_nomeProjeto)
                                .addGap(18, 18, 18)
                                .addComponent(campoProjeto)))
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_mensagemRegistrada, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nomeProjeto)
                    .addComponent(campoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(label_conteudo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
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
        // TODO add your handling code here:
        
        if(campoProjeto.getText().isEmpty() || campoConteudo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Favor preencher os campos obrigatórios", "Atenção!", 2);
            return;
        }

        if((!campoProjeto.getText().equalsIgnoreCase(projeto.getNome())) && Main.getManager().existeProjeto(campoProjeto.getText())){
            JOptionPane.showMessageDialog(null, "O projeto informado já existe", "Atenção!", 2);
            return;
        }
  
        projeto.setNome(campoProjeto.getText());
        projeto.setDescricao(campoConteudo.getText());
      
        Main.getManager().editarProjeto(projeto);
        JOptionPane.showMessageDialog(null, "Projeto atualizado com sucesso");   
        dispose();
        paginaSuporte.readTable();
    }//GEN-LAST:event_Button_atualizarActionPerformed

    private void campoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoProjetoActionPerformed

    }//GEN-LAST:event_campoProjetoActionPerformed

    private void Button_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_excluirActionPerformed
        // TODO add your handling code here:
        Main.getManager().getProjetoDAO().deleteProjeto(projeto.getId());
        JOptionPane.showMessageDialog(null, "Projeto excluído com sucesso");   
        dispose();
        paginaSuporte.readTable();
    }//GEN-LAST:event_Button_excluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_atualizar;
    private javax.swing.JButton Button_excluir;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextArea campoConteudo;
    private javax.swing.JTextField campoProjeto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_conteudo;
    private javax.swing.JLabel label_mensagemRegistrada;
    private javax.swing.JLabel label_nomeProjeto;
    // End of variables declaration//GEN-END:variables
}
