package ch.axa.Zeitplanung_Backend;

import ch.axa.Zeitplanung_Backend.DAO.DAO;
import ch.axa.Zeitplanung_Backend.Objects.Termin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ZeitplanungBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZeitplanungBackendApplication.class, args);

		DAO dao = new DAO();
		List<Termin> termine = dao.getTermine();

		termine.forEach((termin -> {
			System.out.println("--------------   Termin   ------------");
			System.out.println("Name: " + termin.getName());
			System.out.println("Kurzfassung: " + termin.getKurzfassung());
			System.out.println("Von: " + termin.getVon());
			System.out.println("Bis: " + termin.getBis());
			System.out.println("Wo: " + termin.getWo());
			System.out.println("Wer: " + termin.getWer());

			if(termin.isGanztaegig()){
				System.out.println("Ganztägig: ja");
			} else {
				System.out.println("Ganztägig: nein");
			}

			System.out.println("--------------------------------------");
		}));
	}

}
