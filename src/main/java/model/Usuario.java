package model;

import java.util.UUID;

/**
 *
 * @author Williams
 */
public class Usuario {
    // attr
    private final String id = UUID.randomUUID().toString();
    private String nome;
    private String usuario;
    private String cpf;
    private int matricula;
    private int telefone;
    private char[] senha;
    private final String permission = "Comum";
    
    // metodos
    public String toString() {
        return "Usuario{ "
                +"\n id=" + this.id
                +"\n nome=" + this.nome
                +"\n usuário=" + this.usuario
                +"\n CPF=" + this.cpf
                +"\n matrícula=" + this.matricula 
                +"\n senha=" + this.senha + "\n}";
    }

    // construtores
    public Usuario(String nome, String usuario, String cpf, int matricula, int telefone, char[] senha) {
        this.nome = nome;
        this.usuario = usuario;
        this.cpf = cpf;
        this.matricula = matricula;
        this.telefone = telefone;
        this.senha = senha;
    }

    public Usuario(String nome, String usuario, String cpf, char[] senha) {
        this.nome = nome;
        this.usuario = usuario;
        this.cpf = cpf;
        this.senha = senha;
    }
    
    public Usuario(){}

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public String getId() {
        return id;
    }
    
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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
