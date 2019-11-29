package model;

import java.util.ArrayList;

/**
 *
 * @author Williams
 */
public class Reuniao {
    // atributos
    private final String id;
    private final String criadorNome;
    private final String criadorID;
    private String tema;
    private String data;
    private String sala;
    private ArrayList<Participante> participantes;
    private boolean privado;
    private String ata;

    // construtores
    public Reuniao(String id, String criadorNome, String criadorID, String tema, String data, String sala, ArrayList<Participante> participantes, boolean privado, String ata) {
        this.id = id;
        this.criadorNome = criadorNome;
        this.criadorID = criadorID;
        this.tema = tema;
        this.data = data;
        this.sala = sala;
        this.participantes = participantes;
        this.privado = privado;
        this.ata = ata;
    }

    public Reuniao(String id, String criadorNome, String criadorID, String tema, String data, String sala, boolean privado, String ata) {
        this.id = id;
        this.criadorNome = criadorNome;
        this.criadorID = criadorID;
        this.tema = tema;
        this.data = data;
        this.sala = sala;
        this.privado = privado;
        this.ata = ata;
    }
    
    // getters e setters

    public String getCriadorNome() {
        return criadorNome;
    }

    public String getCriadorID() {
        return criadorID;
    }
    
    public String getId() {
        return id;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList participantes) {
        this.participantes = participantes;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public String getAta() {
        return ata;
    }

    public void setAta(String ata) {
        this.ata = ata;
    }
    
}
