/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Williams
 */
public class Usuario {
    private String nome;
    private double matricula;
    private String cargo;
    private char[] senha;

    @Override
    public String toString() {
        return "Usuario: " + 
                "nome=" + nome + 
                ", matricula=" + matricula + 
                ", cargo=" + cargo + 
                ", senha=" + senha;
    }

    public Usuario(String nome, double matricula, String cargo, char[] senha) {
        this.nome = nome;
        this.matricula = matricula;
        this.cargo = cargo;
        this.senha = senha;
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
