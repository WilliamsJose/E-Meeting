package db;

import java.util.ArrayList;
import model.Usuario;
import model.Sala;
import model.Reuniao;

/**
 *
 * @author Williams
 */
public class DB {
    private static ArrayList<Usuario> usuarios = new ArrayList();
    private static ArrayList<Sala> salas = new ArrayList();
    private static ArrayList<Reuniao> reunioes = new ArrayList();
    private static Usuario usuarioLogado;

    public DB(){}

    // Referente aos Usuários
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public void addUsuario(Usuario user) {
        DB.usuarios.add(user);
    }
    
    // usuario logado no sistema
    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        DB.usuarioLogado = usuarioLogado;
    }
    
    // Referente as Salas
    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void addSala(Sala sala) {
        DB.salas.add(sala);
    }
    
    public void removeSala(String id) {
        try{
            for(Sala s : salas) {
                if(s.getId().equals(id)) {
                    salas.remove(s);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    // Referente a reunioes
    public ArrayList<Reuniao> getReunioes() {
        return reunioes;
    }
    
    public void addReuniao(Reuniao reuniao) {
        DB.reunioes.add(reuniao);
    }

    public Reuniao getReuniao(String id) {
        try{
            for(Reuniao r : reunioes) {
                if(r.getId().equals(id)) {
                    return r;
                }
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
}
