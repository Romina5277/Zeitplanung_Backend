package ch.axa.Zeitplanung_Backend.Objects;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "termin")
public class Termin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "termin_id")
    private int id;

    private String name;
    private String kurzfassung;
    private String von;
    private String bis;
    private String wo;
    private String wer;
    private boolean ganztaegig;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "termine")
    private List<Label> labels;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "termine")
    private List<ToDo> todos;

    public Termin() {
    }

    public Termin(String name, String kurzfassung, String von, String bis, String wo, String wer, boolean ganztaegig, List<Label> labels, List<ToDo> todos) {
        this.name = name;
        this.kurzfassung = kurzfassung;
        this.von = von;
        this.bis = bis;
        this.wo = wo;
        this.wer = wer;
        this.ganztaegig = ganztaegig;
        this.labels = labels;
        this.todos = todos;
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

    public String getKurzfassung() {
        return kurzfassung;
    }

    public void setKurzfassung(String kurzfassung) {
        this.kurzfassung = kurzfassung;
    }

    public String getVon() {
        return von;
    }

    public void setVon(String von) {
        this.von = von;
    }

    public String getBis() {
        return bis;
    }

    public void setBis(String bis) {
        this.bis = bis;
    }

    public String getWo() {
        return wo;
    }

    public void setWo(String wo) {
        this.wo = wo;
    }

    public String getWer() {
        return wer;
    }

    public void setWer(String wer) {
        this.wer = wer;
    }

    public boolean isGanztaegig() {
        return ganztaegig;
    }

    public void setGanztaegig(boolean ganztaegig) {
        this.ganztaegig = ganztaegig;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public List<ToDo> getTodos() {
        return todos;
    }

    public void setTodos(List<ToDo> todos) {
        this.todos = todos;
    }
}
