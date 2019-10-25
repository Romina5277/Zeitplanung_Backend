package ch.axa.Zeitplanung_Backend.Objects;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "todo")
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "todo_id")
    private int id;

    private String bezeichnung;
    private boolean done;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "todo_liste",
            joinColumns = {@JoinColumn(name = "todo_idfs",
                    referencedColumnName = "todo_id")},
            inverseJoinColumns = {@JoinColumn(name = "termin_idfs",
                    referencedColumnName = "termin_id")})
    private List<Termin> termine;

    public ToDo() {
    }

    public ToDo(String bezeichnung, boolean done, List<Termin> termine) {
        this.bezeichnung = bezeichnung;
        this.done = done;
        this.termine = termine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public List<Termin> getTermine() {
        return termine;
    }

    public void setTermine(List<Termin> termine) {
        this.termine = termine;
    }
}
