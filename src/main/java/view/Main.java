package view;
import model.Admin;
import db.DB;
/**
 *
 * @author Williams
 */
public class Main {
    
    public static void main(String[] args) {
        // adiciona ao banco de dados fake o usuario admin
        DB db = new DB();
        Admin adm = new Admin();
        db.addUsuario(adm);
        // chama a tela Princiapal, que por sua vez, chama a tela de login inicialmente.
        // A tela principal apenas contém o menu que redireciona para login ou cadastro.
        Login l = new Login();
        l.setLocationRelativeTo(null);
        l.setVisible(true);
    }
    
}
