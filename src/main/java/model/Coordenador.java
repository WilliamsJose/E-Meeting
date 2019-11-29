package model;

import java.util.UUID;

/**
 *
 * @author Williams
 */
public class Coordenador extends Usuario {
    // atributos
    private final String id = UUID.randomUUID().toString();
    private String curso;
    private final String permission = "Coordenador";
    
    // construtores
    public Coordenador(String nome, String usuario, String cpf, int matricula, int telefone, char[] senha, String curso) {
        super(nome, usuario, cpf, matricula, telefone, senha);
        this.curso = curso;
    }

    // getters e setters
    public String getId() {
        return id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String getPermission() {
        return permission;
    }
    
}
