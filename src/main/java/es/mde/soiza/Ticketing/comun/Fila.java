package es.mde.soiza.Ticketing.comun;

import java.util.ArrayList;
import java.util.List;

public class Fila {

	private List<Butaca> butacas = new ArrayList<>();
	private Sala sala;

	public Fila() {
		super();
	}

	public List<Butaca> getButacas() {
		return butacas;
	}

	public void setButacas(List<Butaca> butacas) {
		this.butacas = butacas;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

}
