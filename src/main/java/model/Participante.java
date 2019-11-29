package model;

/**
 *
 * @author Williams
 */
public class Participante {
    private final String id;
    private String nome;
    private int telefone;
    private String usuario;

    public Participante(String id, String nome, int telefone, String usuario) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.usuario = usuario;
    }

    public String getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public int getTelefone() {
        return telefone;
    }
    public String getUsuario() {
        return usuario;
    }
}
