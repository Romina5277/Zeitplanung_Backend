package ch.axa.Zeitplanung_Backend.Objects;

import javax.persistence.*;

@Entity
@Table(name = "notiz")
public class Notiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notiz_id")
    private int id;

    private String name;
    private String beschreibung;

    @ManyToOne()
    @JoinColumn(name = "termin_idfs",
            referencedColumnName = "termin_id")
    private Termin termin;

    public Notiz() {
    }

    public Notiz(String name, String beschreibung, Termin termin) {
        this.name = name;
        this.beschreibung = beschreibung;
        this.termin = termin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public Termin getTermin() {
        return termin;
    }

    public void setTermin(Termin termin) {
        this.termin = termin;
    }
}
