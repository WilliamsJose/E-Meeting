package view;

/**
 *
 * @author Williams
 */
public class ContentCriarReuniao extends javax.swing.JFrame {

    public ContentCriarReuniao() {
        initComponents();
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
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        saidaParticipantes = new javax.swing.JTextArea();
        btnAdicionarParticipante = new javax.swing.JButton();
        btnRemoverParticipante = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnCriar = new javax.swing.JButton();
        btnLimparTudo = new javax.swing.JButton();
        lbAta = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAta = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTema.setText("Tema da Reunião ou Ata:");

        lbData.setText("Data:");

        lbSala.setText("Sala:");

        txtSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sala I", "Sala II", "Sala III", "Bloco Central" }));
        txtSala.setToolTipText("Sugira uma sala onde acontecerá a reunião");

        jLabel1.setText("Adicionar Participantes:");

        jTextField1.setText("CPF:");

        saidaParticipantes.setColumns(20);
        saidaParticipantes.setRows(5);
        jScrollPane1.setViewportView(saidaParticipantes);

        btnAdicionarParticipante.setText("Adicionar");

        btnRemoverParticipante.setText("Remover");

        javax.swing.GroupLayout JPCriarReuniaoLayout = new javax.swing.GroupLayout(JPCriarReuniao);
        JPCriarReuniao.setLayout(JPCriarReuniaoLayout);
        JPCriarReuniaoLayout.setHorizontalGroup(
            JPCriarReuniaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCriarReuniaoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(JPCriarReuniaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPCriarReuniaoLayout.createSequentialGroup()
                        .addGroup(JPCriarReuniaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSala)
                            .addComponent(lbData)
                            .addComponent(lbTema))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JPCriarReuniaoLayout.createSequentialGroup()
                        .addGroup(JPCriarReuniaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPCriarReuniaoLayout.createSequentialGroup()
                                .addComponent(btnAdicionarParticipante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRemoverParticipante))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtData, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTema, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSala, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 25, Short.MAX_VALUE))))
        );
        JPCriarReuniaoLayout.setVerticalGroup(
            JPCriarReuniaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCriarReuniaoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbTema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPCriarReuniaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarParticipante)
                    .addComponent(btnRemoverParticipante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        btnCriar.setText("Criar Reunião");

        btnLimparTudo.setText("Limpar Tudo");

        lbAta.setText("Ata:");

        jScrollPane2.setViewportView(txtAta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimparTudo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addComponent(btnCriar))
                    .addComponent(jScrollPane2))
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbAta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbAta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCriar)
                    .addComponent(btnLimparTudo))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPCriarReuniao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPCriarReuniao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ContentCriarReuniao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContentCriarReuniao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContentCriarReuniao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContentCriarReuniao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContentCriarReuniao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPCriarReuniao;
    private javax.swing.JButton btnAdicionarParticipante;
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnLimparTudo;
    private javax.swing.JButton btnRemoverParticipante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbAta;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbSala;
    private javax.swing.JLabel lbTema;
    private javax.swing.JTextArea saidaParticipantes;
    private javax.swing.JTextPane txtAta;
    private javax.swing.JTextField txtData;
    private javax.swing.JComboBox<String> txtSala;
    private javax.swing.JTextField txtTema;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
