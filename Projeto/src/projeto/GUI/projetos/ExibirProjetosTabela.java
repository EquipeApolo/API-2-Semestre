package projeto.GUI.projetos;

import javax.swing.JFrame;
import projeto.Main;
import projeto.model.Projeto;
import projeto.model.Usuario;

public class ExibirProjetosTabela extends javax.swing.JFrame {
    
    private Projeto projeto;
    
    public ExibirProjetosTabela(Projeto projeto) {
        initComponents();
        
        this.projeto = projeto;
        label_mensagemRegistrada.setText(projeto.getNome());
        label_mensagemRegistrada.setHorizontalAlignment(0);
        
        Usuario cliente = Main.getManager().getUsuarioByID(projeto.getIdCliente());
        nomeCliente.setText(cliente.getNome());
        campoConteudo.setText(projeto.getDescricao());

        
        setTitle("Pro4Tech - Exibindo projeto");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_conteudo = new javax.swing.JLabel();
        label_nomeCliente = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        label_mensagemRegistrada = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoConteudo = new javax.swing.JTextArea();
        nomeCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        label_conteudo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_conteudo.setText("Descrição:");

        label_nomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_nomeCliente.setText("Cliente:");

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        label_mensagemRegistrada.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        label_mensagemRegistrada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        campoConteudo.setEditable(false);
        campoConteudo.setColumns(20);
        campoConteudo.setLineWrap(true);
        campoConteudo.setRows(5);
        jScrollPane1.setViewportView(campoConteudo);

        nomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_mensagemRegistrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_conteudo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 444, Short.MAX_VALUE)
                                .addComponent(botaoVoltar))
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(label_nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_mensagemRegistrada, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nomeCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(label_conteudo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(botaoVoltar)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextArea campoConteudo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_conteudo;
    private javax.swing.JLabel label_mensagemRegistrada;
    private javax.swing.JLabel label_nomeCliente;
    private javax.swing.JLabel nomeCliente;
    // End of variables declaration//GEN-END:variables
}
