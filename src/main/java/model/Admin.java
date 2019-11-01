package model;
/**
 *
 * @author Williams
 */
public class Admin extends Usuario {
    private final String nome;
    private final char[] senha;
    private final String permission = "Admin";

    public Admin(String nome, String cpf, char[] senha) {
        super(nome, cpf, senha);
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public char[] getSenha() {
        return senha;
    }

    @Override
    public String getPermission() {
        return permission;
    }
    
    
}
