package model;
import java.util.UUID;
/**
 *
 * @author Williams
 */
public class Usuario {
    private final UUID ID;
    private String nome;
    private String cpf;
    private double matricula;
    private String cargo;
    private char[] senha;

    @Override
    public String toString() {
        return "Usuario{ " + 
                "\n ID=" + this.ID +
                "\n nome=" + this.nome + 
                "\n CPF=" + this.cpf + 
                "\n matricula=" + this.matricula + 
                "\n cargo=" + this.cargo + 
                "\n senha=" + this.senha + "\n}";
    }

    public Usuario(String nome, String cpf, double matricula, String cargo, char[] senha) {
        this.ID = UUID.randomUUID();
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.cargo = cargo;
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public UUID getID() {
        return ID;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public char[] getSenha() {
        return senha;
    }

    public void setSenha(char[] senha) {
        this.senha = senha;
    }
    
    
}
