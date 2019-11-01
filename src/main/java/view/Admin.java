package view;

/**
 *
 * @author Williams
 */
public class Admin extends javax.swing.JFrame {

    public Admin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaAdmin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        itemCadCoordenador = new javax.swing.JMenuItem();
        itemCadGestorDeRecursos = new javax.swing.JMenuItem();
        itemCadUsuarioComum = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Admin");
        jLabel1.setEnabled(false);

        javax.swing.GroupLayout TelaAdminLayout = new javax.swing.GroupLayout(TelaAdmin);
        TelaAdmin.setLayout(TelaAdminLayout);
        TelaAdminLayout.setHorizontalGroup(
            TelaAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(757, Short.MAX_VALUE))
        );
        TelaAdminLayout.setVerticalGroup(
            TelaAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaAdminLayout.createSequentialGroup()
                .addContainerGap(455, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jMenu.setText("Menu");

        itemCadCoordenador.setText("Cadastrar Coordenador");
        itemCadCoordenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadCoordenadorActionPerformed(evt);
            }
        });
        jMenu.add(itemCadCoordenador);

        itemCadGestorDeRecursos.setText("Cadastrar Gestor de Recursos");
        jMenu.add(itemCadGestorDeRecursos);

        itemCadUsuarioComum.setText("Cadastrar Usuário Comum");
        itemCadUsuarioComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadUsuarioComumActionPerformed(evt);
            }
        });
        jMenu.add(itemCadUsuarioComum);

        jMenuBar.add(jMenu);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemCadCoordenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadCoordenadorActionPerformed
        ContentCadastroCoordenador co = new ContentCadastroCoordenador();
        TelaAdmin.removeAll();
        TelaAdmin.add(co.getContentPane());
        TelaAdmin.repaint();
    }//GEN-LAST:event_itemCadCoordenadorActionPerformed

    private void itemCadUsuarioComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadUsuarioComumActionPerformed
        ContentCadastroComum cc = new ContentCadastroComum();
        TelaAdmin.removeAll();
        TelaAdmin.add(cc.getContentPane());
        TelaAdmin.repaint();
    }//GEN-LAST:event_itemCadUsuarioComumActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TelaAdmin;
    private javax.swing.JMenuItem itemCadCoordenador;
    private javax.swing.JMenuItem itemCadGestorDeRecursos;
    private javax.swing.JMenuItem itemCadUsuarioComum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
