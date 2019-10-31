package view;

/**
 *
 * @author Williams
 */
public class Principal extends javax.swing.JFrame {
    
    public Principal() {
        initComponents();
        Login l = new Login();
        TelaPrincipal.add(l.getContentPane());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaPrincipal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        botaoMenu = new javax.swing.JMenu();
        itemEntrar = new javax.swing.JMenuItem();
        itemCadastrar = new javax.swing.JMenuItem();
        itemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout TelaPrincipalLayout = new javax.swing.GroupLayout(TelaPrincipal);
        TelaPrincipal.setLayout(TelaPrincipalLayout);
        TelaPrincipalLayout.setHorizontalGroup(
            TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        TelaPrincipalLayout.setVerticalGroup(
            TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        botaoMenu.setText("Menu");

        itemEntrar.setText("Entrar");
        itemEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEntrarActionPerformed(evt);
            }
        });
        botaoMenu.add(itemEntrar);

        itemCadastrar.setText("Cadastrar");
        itemCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastrarActionPerformed(evt);
            }
        });
        botaoMenu.add(itemCadastrar);

        itemSair.setText("Sair");
        itemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSairActionPerformed(evt);
            }
        });
        botaoMenu.add(itemSair);

        jMenuBar1.add(botaoMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEntrarActionPerformed
        Login l = new Login();
        TelaPrincipal.removeAll();
        TelaPrincipal.add(l.getContentPane());
        TelaPrincipal.repaint();
    }//GEN-LAST:event_itemEntrarActionPerformed

    private void itemCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastrarActionPerformed
        CadastroComum cad = new CadastroComum();
        TelaPrincipal.removeAll();
        TelaPrincipal.add(cad.getContentPane());
        TelaPrincipal.repaint();
    }//GEN-LAST:event_itemCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TelaPrincipal;
    private javax.swing.JMenu botaoMenu;
    private javax.swing.JMenuItem itemCadastrar;
    private javax.swing.JMenuItem itemEntrar;
    private javax.swing.JMenuItem itemSair;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
