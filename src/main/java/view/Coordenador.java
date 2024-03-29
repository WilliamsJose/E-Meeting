package view;

import contents.CriarReuniao;
import contents.ListaReunioes;

/**
 *
 * @author Williams
 */
public class Coordenador extends javax.swing.JFrame {
    CriarReuniao cr = new CriarReuniao();
    ListaReunioes lr = new ListaReunioes();
    
    public Coordenador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tela = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        itemCriarReuniao = new javax.swing.JMenuItem();
        itemEditarAtas = new javax.swing.JMenuItem();
        itemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("E-Meeting Coordenador");
        setResizable(false);

        jLabel1.setText("Coordenador");
        jLabel1.setEnabled(false);

        javax.swing.GroupLayout TelaLayout = new javax.swing.GroupLayout(Tela);
        Tela.setLayout(TelaLayout);
        TelaLayout.setHorizontalGroup(
            TelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(719, Short.MAX_VALUE))
        );
        TelaLayout.setVerticalGroup(
            TelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaLayout.createSequentialGroup()
                .addContainerGap(455, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jMenu.setText("Menu");

        itemCriarReuniao.setText("Criar Reunião");
        itemCriarReuniao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCriarReuniaoActionPerformed(evt);
            }
        });
        jMenu.add(itemCriarReuniao);

        itemEditarAtas.setText("Editar Atas");
        itemEditarAtas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarAtasActionPerformed(evt);
            }
        });
        jMenu.add(itemEditarAtas);

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
            .addComponent(Tela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemEditarAtasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarAtasActionPerformed
        Tela.removeAll();
        lr.carregaReunioes();
        Tela.add(lr.getContentPane());
        Tela.repaint();
    }//GEN-LAST:event_itemEditarAtasActionPerformed

    private void itemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSairActionPerformed
        Principal p = new Principal();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itemSairActionPerformed

    private void itemCriarReuniaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCriarReuniaoActionPerformed
        Tela.removeAll();
        Tela.add(cr.getContentPane());
        Tela.repaint();
    }//GEN-LAST:event_itemCriarReuniaoActionPerformed
    
    //<editor-fold defaultstate="collapsed" desc="Generated Code">
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Coordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Coordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Coordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Coordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Coordenador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Tela;
    private javax.swing.JMenuItem itemCriarReuniao;
    private javax.swing.JMenuItem itemEditarAtas;
    private javax.swing.JMenuItem itemSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
