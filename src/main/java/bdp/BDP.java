/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdp;

import java.util.ArrayList;
import model.Usuario;

/**
 *
 * @author Williams
 */
public class BDP {
    public static ArrayList<Usuario> usuarios = new ArrayList();
    private Usuario usuarioLogado;

    public BDP(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public Usuario getUsuarioLogado() {
        return this.usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
    
}
