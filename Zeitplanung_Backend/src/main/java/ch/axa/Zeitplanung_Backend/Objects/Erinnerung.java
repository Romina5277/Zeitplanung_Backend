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
    private Termin termin;

    public Erinnerung() {
    }

    public Erinnerung(String wann, Termin termin) {
        this.wann = wann;
        this.termin = termin;
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

    public Termin getTermin() {
        return termin;
    }

    public void setTermin(Termin termin) {
        this.termin = termin;
    }
}
