package contents;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.UUID;

import db.DB;
import model.Sala;
/**
 *
 * @author Williams
 */
public class GestorCadNovoEspaco extends javax.swing.JFrame {
    DB db = new DB();
    
    public GestorCadNovoEspaco() {
        initComponents();
        preencheJTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaGestor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salasCadastradas = new javax.swing.JTable();
        btnAdicionarSala = new javax.swing.JButton();
        txtSala = new javax.swing.JTextField();
        lbSala = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        btnRemoverSala = new javax.swing.JButton();
        txtStatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        salasCadastradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Sala", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(salasCadastradas);
        if (salasCadastradas.getColumnModel().getColumnCount() > 0) {
            salasCadastradas.getColumnModel().getColumn(0).setMinWidth(0);
            salasCadastradas.getColumnModel().getColumn(0).setPreferredWidth(0);
            salasCadastradas.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        btnAdicionarSala.setText("Adicionar");
        btnAdicionarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarSalaActionPerformed(evt);
            }
        });

        lbSala.setText("Sala:");

        lbStatus.setText("Status:");

        btnRemoverSala.setText("Remover");
        btnRemoverSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverSalaActionPerformed(evt);
            }
        });

        txtStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponível", "Indisponível" }));

        javax.swing.GroupLayout TelaGestorLayout = new javax.swing.GroupLayout(TelaGestor);
        TelaGestor.setLayout(TelaGestorLayout);
        TelaGestorLayout.setHorizontalGroup(
            TelaGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaGestorLayout.createSequentialGroup()
                .addGroup(TelaGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaGestorLayout.createSequentialGroup()
                        .addContainerGap(30, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TelaGestorLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(TelaGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TelaGestorLayout.createSequentialGroup()
                                .addComponent(lbSala)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(TelaGestorLayout.createSequentialGroup()
                                .addGroup(TelaGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAdicionarSala)
                                    .addComponent(txtSala, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(TelaGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbStatus)
                                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRemoverSala))))))
                .addGap(25, 25, 25))
        );
        TelaGestorLayout.setVerticalGroup(
            TelaGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaGestorLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(TelaGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSala)
                    .addComponent(lbStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TelaGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarSala)
                    .addComponent(btnRemoverSala))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaGestor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaGestor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preencheJTable() {
        DefaultTableModel salasModel = (DefaultTableModel) salasCadastradas.getModel();
        for(Sala sala : db.getSalas()){
            Object[] salaObj = {sala.getId(), sala.getSala(), sala.getStatus()};
            salasModel.addRow(salaObj);
        }
    }
    
    private void btnAdicionarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarSalaActionPerformed
        if(!txtSala.getText().isEmpty()){
            String id = UUID.randomUUID().toString(), sala = txtSala.getText(), status = txtStatus.getSelectedItem().toString();
            
            // Adicionando linhas no jtable
            DefaultTableModel salasModel = (DefaultTableModel) salasCadastradas.getModel();
            Object[] dados = {id, sala, status};
            salasModel.addRow(dados);
            
            // Cria nova sala e adiciona no banco
            Sala salaObj = new Sala(id, sala, status);
            db.addSala(salaObj);
            
            txtSala.setText(null);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
        }
    }//GEN-LAST:event_btnAdicionarSalaActionPerformed

    private void btnRemoverSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverSalaActionPerformed
        DefaultTableModel salasModel = (DefaultTableModel) salasCadastradas.getModel();
        if(salasCadastradas.getSelectedRow() != -1) {
            int linha = salasCadastradas.getSelectedRow();
            String idSala = (String) salasModel.getValueAt(linha, 0);
            
            // Remove sala do "banco" e do jtable
            db.removeSala(idSala);
            salasModel.removeRow(linha);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um item para remover.");
        }
    }//GEN-LAST:event_btnRemoverSalaActionPerformed

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
            java.util.logging.Logger.getLogger(GestorCadNovoEspaco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestorCadNovoEspaco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestorCadNovoEspaco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestorCadNovoEspaco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestorCadNovoEspaco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TelaGestor;
    private javax.swing.JButton btnAdicionarSala;
    private javax.swing.JButton btnRemoverSala;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSala;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JTable salasCadastradas;
    private javax.swing.JTextField txtSala;
    private javax.swing.JComboBox<String> txtStatus;
    // End of variables declaration//GEN-END:variables
}
