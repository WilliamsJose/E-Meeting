package model;

import java.util.UUID;

/**
 *
 * @author Williams
 */
public class GestorDeRecursos extends Usuario {
    // attr
    private String setor;
    private final String permission = "GestorDeRecursos";
    private final String id = UUID.randomUUID().toString();
  
    // construtores
    public GestorDeRecursos(String setor, String nome, String usuario, String cpf, char[] senha) {
        super(nome, usuario, cpf, senha);
        this.setor = setor;
    }

    //get e set
    public String getId() {
        return id;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String getPermission() {
        return permission;
    }
    
}
