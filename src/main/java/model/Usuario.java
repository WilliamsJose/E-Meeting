/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.UUID;
/**
 *
 * @author Williams
 */
public class Usuario {
    private final UUID ID;
    private String nome;
    private double matricula;
    private String cargo;
    private char[] senha;

    @Override
    public String toString() {
        return "Usuario: " + 
                "ID=" + this.ID +
                ", nome=" + this.nome + 
                ", matricula=" + this.matricula + 
                ", cargo=" + this.cargo + 
                ", senha=" + this.senha;
    }

    public Usuario(String nome, double matricula, String cargo, char[] senha) {
        this.ID = UUID.randomUUID();
        this.nome = nome;
        this.matricula = matricula;
        this.cargo = cargo;
        this.senha = senha;
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
