package db;

import java.util.ArrayList;
import model.Usuario;

/**
 *
 * @author Williams
 */
public class DB {
    private static ArrayList<Usuario> usuarios = new ArrayList();
    private Usuario usuarioLogado;

    public DB(){}

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
}
