package ch.axa.Zeitplanung_Backend.Objects;

import javax.persistence.*;

@Entity
@Table(name = "erinnerung")
public class Erinnerung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "erinnerung_id")
    private int id;

    private String wann;

    @ManyToOne()
    @JoinColumn(name = "termin_idfs",
                referencedColumnName = "termin_id")
    private int termin_idfs;

    public Erinnerung() {
    }

    public Erinnerung(String wann, int termin_idfs) {
        this.wann = wann;
        this.termin_idfs = termin_idfs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWann() {
        return wann;
    }

    public void setWann(String wann) {
        this.wann = wann;
    }

    public int getTermin_idfs() {
        return termin_idfs;
    }

    public void setTermin_idfs(int termin_idfs) {
        this.termin_idfs = termin_idfs;
    }
}
