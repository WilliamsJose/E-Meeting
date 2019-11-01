package model;
/**
 *
 * @author Williams
 */
public class Usuario {
    private String nome;
    private String cpf;
    private int matricula;
    private int telefone;
    private char[] senha;
    private final String permission = "Comum";
    
    public String toString() {
        return "Usuario{ " + 
                "\n nome=" + this.nome + 
                "\n CPF=" + this.cpf + 
                "\n matricula=" + this.matricula +
                "\n senha=" + this.senha + "\n}";
    }

    public Usuario(String nome, String cpf, int matricula, int telefone, char[] senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.telefone = telefone;
        this.senha = senha;
    }

    public Usuario(String nome, String cpf, char[] senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }
    
    public Usuario(){}

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public String getPermission() {
        return permission;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public char[] getSenha() {
        return senha;
    }

    public void setSenha(char[] senha) {
        this.senha = senha;
    }    
    //</editor-fold>
}
