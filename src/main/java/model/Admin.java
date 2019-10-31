package model;
/**
 *
 * @author Williams
 */
public class Admin extends Usuario {
    private final String nome = "admin";
    private final char[] senha = "admin123".toCharArray();
    private final String permission = "Admin";

    public Admin() {
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
