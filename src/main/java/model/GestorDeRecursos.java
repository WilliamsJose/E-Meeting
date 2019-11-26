package model;

/**
 *
 * @author Williams
 */
public class GestorDeRecursos extends Usuario {
    private String setor;
    private final String permission = "GestorDeRecursos";
  
    public GestorDeRecursos(String setor, String nome, String usuario, String cpf, char[] senha) {
        super(nome, usuario, cpf, senha);
        this.setor = setor;
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
