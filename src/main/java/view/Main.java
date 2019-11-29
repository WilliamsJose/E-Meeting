package view;

import java.util.UUID;

import db.DB;
import model.Coordenador;
import model.GestorDeRecursos;
import model.Sala;
/**
 *
 * @author Williams
 */
public class Main {
    
    public static void main(String[] args) {
        DB db = new DB();
        
        // Adiciona um gestor e um coordenador ao sistema
        Coordenador c = new Coordenador("João", "coord", "115.385.772-32", 846516546, 846464648, "321".toCharArray(), "SI");
        GestorDeRecursos g = new GestorDeRecursos("Administrativo", "Carlos", "gest", "115.513.845-55", "321".toCharArray());
        db.addUsuario(c);
        db.addUsuario(g);
        
        // Adiciona algumas salas de inicio
        Sala s = new Sala(UUID.randomUUID().toString(), "A 003", "Disponível" );
        Sala s2 = new Sala(UUID.randomUUID().toString(), "A 004", "Disponível" );
        db.addSala(s);
        db.addSala(s2);
        
        // chama a tela Princiapal, que por sua vez, chama a tela de login inicialmente.
        // A tela principal apenas contém o menu que pega o conteúdo de login ou cadastro.
        Principal p = new Principal();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }
    
}
