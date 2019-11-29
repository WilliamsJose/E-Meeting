package model;

/**
 *
 * @author Williams
 */
public class Sala {
    private final String id;
    private String sala;
    private String status;

    public Sala(String id, String sala, String status) {
        this.id = id;
        this.sala = sala;
        this.status = status;
    }

    public String getId() {
        return id;
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
