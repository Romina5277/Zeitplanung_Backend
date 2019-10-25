package ch.axa.Zeitplanung_Backend.Objects;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "label")
public class Label {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "label_id")
    private int id;

    private String name;
    private String farbe;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "label_liste",
                joinColumns = {@JoinColumn(name = "label_idfs",
                                            referencedColumnName = "label_id")},
                inverseJoinColumns = {@JoinColumn(name = "termin_idfs",
                                                    referencedColumnName = "termin_id")})
    private List<Termin> termine;

    public Label() {
    }

    public Label(String name, String farbe, List<Termin> termine) {
        this.name = name;
        this.farbe = farbe;
        this.termine = termine;
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

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public List<Termin> getTermine() {
        return termine;
    }

    public void setTermine(List<Termin> termine) {
        this.termine = termine;
    }
}
