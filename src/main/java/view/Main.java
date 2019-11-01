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
        Admin adm = new Admin("admin", "00000000000", "admin123".toCharArray());
        db.addUsuario(adm);
        // chama a tela Princiapal, que por sua vez, chama a tela de login inicialmente.
        // A tela principal apenas contém o menu que pega o conteúdo de login ou cadastro.
        Principal p = new Principal();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }
    
}
