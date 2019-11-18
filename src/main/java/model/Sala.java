package model;

/**
 *
 * @author Williams
 */
public class Sala {
    String sala;
    String status;

    public Sala(String sala, String status) {
        this.sala = sala;
        this.status = status;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
