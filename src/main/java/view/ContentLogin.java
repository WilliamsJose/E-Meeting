package view;

import javax.swing.JOptionPane;
import model.Usuario;
import db.DB;
import java.util.Arrays;

/**
 *
 * @author Williams
 */
public class ContentLogin extends javax.swing.JFrame {
    DB db = new DB();
    Principal p;
    
    public ContentLogin() {
        initComponents();
    }
    
    public ContentLogin(Principal p){
        initComponents();
        this.p = p;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaLogin = new javax.swing.JPanel();
        lbNomeApp = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        TelaLogin.setAlignmentX(0.0F);
        TelaLogin.setAlignmentY(0.0F);

        lbNomeApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNomeApp.setText("E-Meeting");

        lbNome.setText("Usuario:");

        lbSenha.setText("Senha:");

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaLoginLayout = new javax.swing.GroupLayout(TelaLogin);
        TelaLogin.setLayout(TelaLoginLayout);
        TelaLoginLayout.setHorizontalGroup(
            TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaLoginLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbSenha)
                    .addComponent(lbNome))
                .addGap(18, 18, 18)
                .addGroup(TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 228, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbNomeApp, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(282, 282, 282))
        );
        TelaLoginLayout.setVerticalGroup(
            TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaLoginLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(lbNomeApp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNome))
                .addGap(18, 18, 18)
                .addGroup(TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEntrar)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Método Entrar">
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        
        // Tratamento de exceção array vazia / não instanciada.
        try {
            
            // obtem os valores dos inputs
            String nome = txtNome.getText();
            char[] senha = txtSenha.getPassword();
            
            // Se algum dos campos forem vazios...
            if(nome.isBlank() || senha.length == 0) {
                JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!");
            } else {
                
                // Varrendo array usuarios
                for(Usuario user : db.getUsuarios()) {

                    // Verifica se nome e senha são iguais aos do banco
                    if(nome.equals(user.getNome()) && Arrays.equals(senha, user.getSenha())) {
                        JOptionPane.showMessageDialog(rootPane, "Bem vindo, " + user.getNome() + "!");
                        db.setUsuarioLogado(user);
                        break;
                    } else {
                        db.setUsuarioLogado(null);
                    } 
                    
                }
                // Caso a cominação não esteja correta, informa ao usuário.
                if(db.getUsuarioLogado() == null) {
                   JOptionPane.showMessageDialog(rootPane, "Usuário ou Senha incorreta!");
                   return;
                }

                // Mostra a tela referente ao tipo do usuário.                
                switch (db.getUsuarioLogado().getPermission()) {
                    case "Coordenador":
                        Coordenador co = new Coordenador();
                        p.disposeAll();
                        co.setVisible(true);
                        co.setLocationRelativeTo(null);
                        break;
                    case "GestorDeRecursos":
                        Gestor g = new Gestor();
                        p.disposeAll();
                        g.setVisible(true);
                        g.setLocationRelativeTo(null);
                        break;
                    case "Admin":
                        Admin a = new Admin();
                        p.disposeAll();
                        a.setVisible(true);
                        a.setLocationRelativeTo(null);
                        break;
                    default:
                        Comum c = new Comum();
                        p.disposeAll();
                        c.setVisible(true);
                        c.setLocationRelativeTo(null);
                        break;
                }
            }
        } catch(NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, "Erro: " + e.getMessage() + "\nBanco de dados: " + db.getUsuarios());
        }
    }//GEN-LAST:event_btnEntrarActionPerformed
    //</editor-fold>
    
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
            java.util.logging.Logger.getLogger(ContentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContentLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TelaLogin;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNomeApp;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
