package db;

import java.util.ArrayList;
import model.Usuario;
import model.Sala;

/**
 *
 * @author Williams
 */
public class DB {
    private static ArrayList<Usuario> usuarios = new ArrayList();
    private static ArrayList<Sala> salas = new ArrayList();
    private Usuario usuarioLogado;

    public DB(){}

    // Referentes aos Usuários
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public void addUsuario(Usuario user) {
        DB.usuarios.add(user);
    }
    
    public Usuario getUsuarioLogado() {
        return this.usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
    
    // Referentes as Salas
    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void addSala(Sala sala) {
        DB.salas.add(sala);
    }
    
    public void removeSala(String sala) {
        try{
            for(Sala item : salas) {
                if(item.getSala().equals(sala)) {
                    salas.remove(item);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
