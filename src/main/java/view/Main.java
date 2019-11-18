package view;

import db.DB;
import model.Coordenador;
import model.GestorDeRecursos;
/**
 *
 * @author Williams
 */
public class Main {
    
    public static void main(String[] args) {
        DB db = new DB();
        
        // Adiciona um gestor e um coordenador ao sistema
        Coordenador c = new Coordenador("João", "115.385.772-32", 846516546, 846464648, "321".toCharArray(), "SI");
        GestorDeRecursos g = new GestorDeRecursos("Administrativo", "Carlos", "115.513.845-55", "321".toCharArray());
        db.addUsuario(c);
        db.addUsuario(g);
        
        // chama a tela Princiapal, que por sua vez, chama a tela de login inicialmente.
        // A tela principal apenas contém o menu que pega o conteúdo de login ou cadastro.
        Principal p = new Principal();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }
    
}
