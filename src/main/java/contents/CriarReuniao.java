package contents;
import db.DB;
import javax.swing.table.DefaultTableModel;
import model.Sala;
import model.Usuario;
/**
 *
 * @author Williams
 */
public class CriarReuniao extends javax.swing.JFrame {
    DB db = new DB();

    public CriarReuniao() {
        initComponents();
        preencheComboSalas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPCriarReuniao = new javax.swing.JPanel();
        lbTema = new javax.swing.JLabel();
        txtTema = new javax.swing.JTextField();
        lbData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        lbSala = new javax.swing.JLabel();
        txtSala = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtParticipante = new javax.swing.JTextField();
        btnAdicionarParticipante = new javax.swing.JButton();
        btnRemoverParticipante = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        saidaParticipantes = new javax.swing.JTable();
        btnLimparTudo = new javax.swing.JButton();
        btnCriarReuniao = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAta = new javax.swing.JTextPane();
        lbAta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 477));

        lbTema.setText("Tema da Reunião ou Ata:");

        txtTema.setToolTipText("Digite o tem da reunião");

        lbData.setText("Data:");

        txtData.setToolTipText("Digite a data de quando acontecerá a reunião");

        lbSala.setText("Sala:");

        txtSala.setToolTipText("Sugira uma sala onde acontecerá a reunião");

        jLabel1.setText("Adicionar Participantes:");

        txtParticipante.setToolTipText("Digite aqui o usuário do participante");
        txtParticipante.setActionCommand("<Not Set>");

        btnAdicionarParticipante.setText("Adicionar");
        btnAdicionarParticipante.setToolTipText("Adiciona um novo participante a lista");
        btnAdicionarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarParticipanteActionPerformed(evt);
            }
        });

        btnRemoverParticipante.setText("Remover");
        btnRemoverParticipante.setToolTipText("Remover participante selecionado");
        btnRemoverParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverParticipanteActionPerformed(evt);
            }
        });

        saidaParticipantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Usuário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(saidaParticipantes);

        btnLimparTudo.setText("Limpar Tudo");
        btnLimparTudo.setToolTipText("Limpa todos os campos");
        btnLimparTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparTudoActionPerformed(evt);
            }
        });

        btnCriarReuniao.setText("Criar Reunião");
        btnCriarReuniao.setToolTipText("Clique para finalizar e criar reunião");
        btnCriarReuniao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarReuniaoActionPerformed(evt);
            }
        });

        txtAta.setToolTipText("Aqui você pode digitar toda sua ata.");
        jScrollPane2.setViewportView(txtAta);

        lbAta.setText("Ata:");

        javax.swing.GroupLayout JPCriarReuniaoLayout = new javax.swing.GroupLayout(JPCriarReuniao);
        JPCriarReuniao.setLayout(JPCriarReuniaoLayout);
        JPCriarReuniaoLayout.setHorizontalGroup(
            JPCriarReuniaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCriarReuniaoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(JPCriarReuniaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPCriarReuniaoLayout.createSequentialGroup()
                        .addComponent(lbTema)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JPCriarReuniaoLayout.createSequentialGroup()
                        .addGroup(JPCriarReuniaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPCriarReuniaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPCriarReuniaoLayout.createSequentialGroup()
                                    .addComponent(btnAdicionarParticipante)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                                    .addComponent(btnRemoverParticipante))
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtData, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTema, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSala, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtParticipante, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(lbSala)
                            .addComponent(lbData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(JPCriarReuniaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAta)
                            .addGroup(JPCriarReuniaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(JPCriarReuniaoLayout.createSequentialGroup()
                                    .addComponent(btnLimparTudo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCriarReuniao))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))))
        );
        JPCriarReuniaoLayout.setVerticalGroup(
            JPCriarReuniaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCriarReuniaoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(JPCriarReuniaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTema)
                    .addComponent(lbAta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPCriarReuniaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPCriarReuniaoLayout.createSequentialGroup()
                        .addComponent(txtTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbSala)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(JPCriarReuniaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdicionarParticipante)
                            .addComponent(btnRemoverParticipante))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                    .addGroup(JPCriarReuniaoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(18, 18, 18)
                        .addGroup(JPCriarReuniaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCriarReuniao)
                            .addComponent(btnLimparTudo))))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPCriarReuniao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPCriarReuniao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarParticipanteActionPerformed
        String p = txtParticipante.getText();
        DefaultTableModel participantesModel = (DefaultTableModel) saidaParticipantes.getModel();
        
        for(Usuario u : db.getUsuarios()) {
            if(u.getUsuario().equals(p)){
                Object[] usuario = {u.getNome(), u.getTelefone(), u.getUsuario()};
                participantesModel.addRow(usuario);
            }
        }
        
        txtParticipante.setText(null);
    }//GEN-LAST:event_btnAdicionarParticipanteActionPerformed

    private void btnRemoverParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverParticipanteActionPerformed
        DefaultTableModel participantesModel = (DefaultTableModel) saidaParticipantes.getModel();
        participantesModel.removeRow(saidaParticipantes.getSelectedRow());
    }//GEN-LAST:event_btnRemoverParticipanteActionPerformed

    private void btnLimparTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparTudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparTudoActionPerformed

    private void btnCriarReuniaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarReuniaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCriarReuniaoActionPerformed

    private void preencheComboSalas(){
        for(Sala sala : db.getSalas()) {
            txtSala.addItem(sala.getSala());
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Main e Variáveis Geradas Automaticamente"> 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CriarReuniao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarReuniao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarReuniao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarReuniao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarReuniao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPCriarReuniao;
    private javax.swing.JButton btnAdicionarParticipante;
    private javax.swing.JButton btnCriarReuniao;
    private javax.swing.JButton btnLimparTudo;
    private javax.swing.JButton btnRemoverParticipante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbAta;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbSala;
    private javax.swing.JLabel lbTema;
    private javax.swing.JTable saidaParticipantes;
    private javax.swing.JTextPane txtAta;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtParticipante;
    private javax.swing.JComboBox<String> txtSala;
    private javax.swing.JTextField txtTema;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
