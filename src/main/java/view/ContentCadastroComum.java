package view;

import java.util.Arrays;
import javax.swing.JOptionPane;
import model.Usuario;
import db.DB;

/**
 *
 * @author Williams
 */
public class ContentCadastroComum extends javax.swing.JFrame {
    int jaExiste = 0;
    DB db = new DB();
    
    public ContentCadastroComum() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaCadastro = new javax.swing.JPanel();
        lbNomeApp = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbMatricula = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        lbConfirmaSenha = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtConfirmaSenha = new javax.swing.JPasswordField();
        btnCadastrar = new javax.swing.JButton();
        lbCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        TelaCadastro.setAlignmentX(0.0F);
        TelaCadastro.setAlignmentY(0.0F);
        TelaCadastro.setPreferredSize(new java.awt.Dimension(720, 460));

        lbNomeApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNomeApp.setText("E-Meeting");

        lbNome.setText("Nome:");

        lbMatricula.setText("Matrícula:");

        lbTelefone.setText("Telefone:");

        lbSenha.setText("Senha:");

        lbConfirmaSenha.setText("Confirme a Senha:");

        txtMatricula.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lbCpf.setText("CPF:");

        javax.swing.GroupLayout TelaCadastroLayout = new javax.swing.GroupLayout(TelaCadastro);
        TelaCadastro.setLayout(TelaCadastroLayout);
        TelaCadastroLayout.setHorizontalGroup(
            TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastroLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbSenha)
                    .addComponent(lbCpf)
                    .addComponent(lbConfirmaSenha)
                    .addComponent(lbTelefone)
                    .addComponent(lbMatricula)
                    .addComponent(lbNome))
                .addGap(18, 18, 18)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMatricula)
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSenha)
                    .addComponent(txtConfirmaSenha)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaCadastroLayout.createSequentialGroup()
                .addContainerGap(296, Short.MAX_VALUE)
                .addComponent(lbNomeApp, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289))
        );
        TelaCadastroLayout.setVerticalGroup(
            TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastroLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lbNomeApp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMatricula)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbConfirmaSenha)
                    .addComponent(txtConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //<editor-fold defaultstate="collapsed" desc="Limpar Campos dos Inputs">
    private void limpaCampos() {
        txtNome.setText(null);
        txtCpf.setText(null);
        txtMatricula.setText(null);
        txtTelefone.setText(null);
        txtSenha.setText(null);
        txtConfirmaSenha.setText(null);
    }// </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Método Cadastrar">
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        String nome = txtNome.getText(), cpf = txtCpf.getText(), matricula = txtMatricula.getText();
        String tel = txtTelefone.getText();
        char[] senha = txtSenha.getPassword(), confirmaSenha = txtConfirmaSenha.getPassword();
        
        // Verificação para cadastro
        if(!nome.isBlank() && !cpf.isBlank() && !matricula.isBlank() && !tel.isBlank() && senha.length != 0 && confirmaSenha.length != 0) {
            int dMatricula = Integer.parseInt(matricula), telefone = Integer.parseInt(tel);
            
            if(Arrays.equals(senha, confirmaSenha)) {
                
                for(Usuario user : db.getUsuarios()) {
                    if(cpf.equals(user.getCpf()) || nome.equals(user.getNome())) {
                        jaExiste = 1;
                        break;
                    }
                }
                
                if(jaExiste != 0) {
                    JOptionPane.showMessageDialog(rootPane, "Já existe um usuário com esse Nome ou CPF");
                    jaExiste = 0;
                } else {
                    Usuario usuario = new Usuario(nome, cpf, dMatricula, telefone, confirmaSenha);
                    db.addUsuario(usuario);
                    limpaCampos();
                    JOptionPane.showMessageDialog(rootPane,"Cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "As Senhas devem ser iguais!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Você deve preencher todos os campos!");
        }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed
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
            java.util.logging.Logger.getLogger(ContentCadastroComum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContentCadastroComum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContentCadastroComum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContentCadastroComum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContentCadastroComum().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TelaCadastro;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel lbConfirmaSenha;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbMatricula;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNomeApp;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JPasswordField txtConfirmaSenha;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
