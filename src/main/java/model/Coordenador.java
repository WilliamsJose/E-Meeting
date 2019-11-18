package model;

/**
 *
 * @author Williams
 */
public class Coordenador extends Usuario {
    private String curso;
    private final String permission = "Coordenador";
    
    public Coordenador(String nome, String cpf, int matricula, int telefone, char[] senha, String curso) {
        super(nome, cpf, matricula, telefone, senha);
        this.curso = curso;
    }
    
    public Coordenador(){}

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
