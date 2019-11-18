package view;

import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Williams
 */
public class Gestor extends javax.swing.JFrame {
    
    public Gestor() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaGestor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salasCadastradas = new javax.swing.JTable();
        btnAdicionarSala = new javax.swing.JButton();
        txtSala = new javax.swing.JTextField();
        lbSala = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        btnRemoverSala = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        itemCadNovoEspaco = new javax.swing.JMenuItem();
        itemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor");
        setResizable(false);

        salasCadastradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sala", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(salasCadastradas);

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

        javax.swing.GroupLayout TelaGestorLayout = new javax.swing.GroupLayout(TelaGestor);
        TelaGestor.setLayout(TelaGestorLayout);
        TelaGestorLayout.setHorizontalGroup(
            TelaGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaGestorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaGestorLayout.createSequentialGroup()
                        .addGroup(TelaGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSala, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(TelaGestorLayout.createSequentialGroup()
                                .addComponent(btnAdicionarSala)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemoverSala))
                            .addComponent(lbSala))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(TelaGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbStatus)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        TelaGestorLayout.setVerticalGroup(
            TelaGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaGestorLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(TelaGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSala)
                    .addComponent(lbStatus))
                .addGap(18, 18, 18)
                .addGroup(TelaGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(TelaGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarSala)
                    .addComponent(btnRemoverSala))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu.setText("Menu");

        itemCadNovoEspaco.setText("Cadastrar novo espaço");
        jMenu.add(itemCadNovoEspaco);

        itemSair.setText("Sair");
        itemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSairActionPerformed(evt);
            }
        });
        jMenu.add(itemSair);

        jMenuBar.add(jMenu);

        setJMenuBar(jMenuBar);

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

    private void itemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSairActionPerformed
        Principal p = new Principal();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itemSairActionPerformed

    private void btnAdicionarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarSalaActionPerformed
       DefaultTableModel salasModel = (DefaultTableModel) salasCadastradas.getModel();
       Object[] dados = {txtSala.getText(), txtStatus.getText()};
       salasModel.addRow(dados);
    }//GEN-LAST:event_btnAdicionarSalaActionPerformed

    private void btnRemoverSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverSalaActionPerformed
        DefaultTableModel salasModel = (DefaultTableModel) salasCadastradas.getModel();
        if(salasCadastradas.getSelectedRow() != -1) {
            salasModel.removeRow(salasCadastradas.getSelectedRow());
        } else {
            System.out.println("Selecione um item para remover.");
        }
    }//GEN-LAST:event_btnRemoverSalaActionPerformed

    //<editor-fold defaultstate="collapsed" desc="Generated Code">
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
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TelaGestor;
    private javax.swing.JButton btnAdicionarSala;
    private javax.swing.JButton btnRemoverSala;
    private javax.swing.JMenuItem itemCadNovoEspaco;
    private javax.swing.JMenuItem itemSair;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSala;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JTable salasCadastradas;
    private javax.swing.JTextField txtSala;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
