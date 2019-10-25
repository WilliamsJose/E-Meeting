/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.ArrayList;
import model.Usuario;

/**
 *
 * @author Williams
 */
public class DB {
    public static ArrayList<Usuario> usuarios = new ArrayList();
    private Usuario usuarioLogado;

    public DB(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public Usuario getUsuarioLogado() {
        return this.usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
    
}
