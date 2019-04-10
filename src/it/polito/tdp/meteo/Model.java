package it.polito.tdp.meteo;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.meteo.bean.SimpleCity;
import it.polito.tdp.meteo.db.MeteoDAO;

public class Model {

	private final static int COST = 100;
	private final static int NUMERO_GIORNI_CITTA_CONSECUTIVI_MIN = 3;
	private final static int NUMERO_GIORNI_CITTA_MAX = 6;
	private final static int NUMERO_GIORNI_TOTALI = 15;

	public Model() {

	}

	public String getUmiditaMedia(Month mese) {
		MeteoDAO dao = new MeteoDAO();
		String listaUmidita = "";
		double umidita;
		
		List<String> listaLocalita = new ArrayList<String>();
		listaLocalita = dao.getAllLocalita();
		
		for(String localita : listaLocalita) {
			umidita = dao.getAvgRilevamentiLocalitaMese(mese, localita);
			listaUmidita += localita+" "+umidita+"\n";
		}
		
		return listaUmidita;
	}

	public String trovaSequenza(int mese) {

		return "TODO!";
	}

	private Double punteggioSoluzione(List<SimpleCity> soluzioneCandidata) {

		double score = 0.0;
		return score;
	}

	private boolean controllaParziale(List<SimpleCity> parziale) {

		return true;
	}

}
