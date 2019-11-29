package model;

/**
 *
 * @author Williams
 */
public class Participante extends Usuario {
    private final String id;
    private String nome;
    private int telefone;
    private String usuario;

    public Participante(String id, String nome, int telefone, String usuario) {
        super(nome, telefone, usuario);
        this.id = id;
    }
}
