package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import contents.GestorCadNovoEspaco;
import contents.GestorConfirmarReunioes;

/**
 *
 * @author Williams
 */
public class Gestor extends javax.swing.JFrame {
    GestorCadNovoEspaco gcne = new GestorCadNovoEspaco();
    GestorConfirmarReunioes gcr = new GestorConfirmarReunioes();
    
    public Gestor() {
        initComponents();
        TelaGestor.add(gcne.getContentPane());
        jMenu.remove(itemCadNovoEspaco);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaGestor = new javax.swing.JPanel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        itemConfirmarReunioes = new javax.swing.JMenuItem();
        itemCadNovoEspaco = new javax.swing.JMenuItem();
        itemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor");
        setResizable(false);

        javax.swing.GroupLayout TelaGestorLayout = new javax.swing.GroupLayout(TelaGestor);
        TelaGestor.setLayout(TelaGestorLayout);
        TelaGestorLayout.setHorizontalGroup(
            TelaGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        TelaGestorLayout.setVerticalGroup(
            TelaGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        jMenu.setText("Menu");

        itemConfirmarReunioes.setText("Confirmar Reuniões");
        itemConfirmarReunioes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConfirmarReunioesActionPerformed(evt);
            }
        });
        jMenu.add(itemConfirmarReunioes);

        itemCadNovoEspaco.setText("Cadastrar novo espaço");
        itemCadNovoEspaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadNovoEspacoActionPerformed(evt);
            }
        });
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

    private void itemConfirmarReunioesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConfirmarReunioesActionPerformed
        jMenu.remove(itemConfirmarReunioes);
        jMenu.add(itemCadNovoEspaco, 0);
        TelaGestor.removeAll();
        TelaGestor.add(gcr.getContentPane());
        TelaGestor.repaint();
    }//GEN-LAST:event_itemConfirmarReunioesActionPerformed

    private void itemCadNovoEspacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadNovoEspacoActionPerformed
        jMenu.remove(itemCadNovoEspaco);
        jMenu.add(itemConfirmarReunioes, 0);
        TelaGestor.removeAll();
        TelaGestor.add(gcne.getContentPane());
        TelaGestor.repaint();
    }//GEN-LAST:event_itemCadNovoEspacoActionPerformed

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
    private javax.swing.JMenuItem itemCadNovoEspaco;
    private javax.swing.JMenuItem itemConfirmarReunioes;
    private javax.swing.JMenuItem itemSair;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
