package view;

/**
 *
 * @author Williams
 */
public class Comum extends javax.swing.JFrame {
    ContentCriarReuniao reuniao = new ContentCriarReuniao();
    
    public Comum() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaComum = new javax.swing.JPanel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        itemCriarReuniao = new javax.swing.JMenuItem();
        itemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout TelaComumLayout = new javax.swing.GroupLayout(TelaComum);
        TelaComum.setLayout(TelaComumLayout);
        TelaComumLayout.setHorizontalGroup(
            TelaComumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        TelaComumLayout.setVerticalGroup(
            TelaComumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        jMenu.setText("Menu");

        itemCriarReuniao.setText("Criar Reunião");
        itemCriarReuniao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCriarReuniaoActionPerformed(evt);
            }
        });
        jMenu.add(itemCriarReuniao);

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
            .addComponent(TelaComum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaComum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemCriarReuniaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCriarReuniaoActionPerformed
        TelaComum.removeAll();
        TelaComum.add(reuniao.getContentPane());
        TelaComum.repaint();
    }//GEN-LAST:event_itemCriarReuniaoActionPerformed

    private void itemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemSairActionPerformed

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
            java.util.logging.Logger.getLogger(Comum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TelaComum;
    private javax.swing.JMenuItem itemCriarReuniao;
    private javax.swing.JMenuItem itemSair;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
