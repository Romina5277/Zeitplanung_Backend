package ch.axa.Zeitplanung_Backend.DAO;

import ch.axa.Zeitplanung_Backend.Objects.*;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Singleton
public class DAO {

    @PersistenceContext
    private EntityManager em;

    public List<Termin> getTermine() {
        TypedQuery<Termin> tq = em.createQuery(getSelectAllQuery("t", "Termin"), Termin.class);
        List<Termin> termine = tq.getResultList();

        return termine;
    }

    public List<Erinnerung> getErinnerungen() {
        TypedQuery<Erinnerung> tq = em.createQuery(getSelectAllQuery("e", "Erinnerung"), Erinnerung.class);
        List<Erinnerung> erinnerungen = tq.getResultList();

        return erinnerungen;
    }

    public List<Label> getLabel() {
        TypedQuery<Label> tq = em.createQuery(getSelectAllQuery("l", "Label"), Label.class);
        List<Label> labels = tq.getResultList();

        return labels;
    }

    public List<Notiz> getNotiz() {
        TypedQuery<Notiz> tq = em.createQuery(getSelectAllQuery("n", "Notiz"), Notiz.class);
        List<Notiz> notiz = tq.getResultList();

        return notiz;
    }

    public List<ToDo> getToDo() {
        TypedQuery<ToDo> tq = em.createQuery(getSelectAllQuery("t", "ToDo"), ToDo.class);
        List<ToDo> todos = tq.getResultList();

        return todos;
    }


    private String getSelectAllQuery(String kuerzel, String object) {
        return "SELECT " + kuerzel + " FROM " + object + kuerzel;
    }

    private String getSelectSpezificQuery(String kuerzel, String object, int id) {
        return "SELECT " + kuerzel + " FROM " + object + kuerzel + " WHERE `todo_id` = " + id;
    }

}
