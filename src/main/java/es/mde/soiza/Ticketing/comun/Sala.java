package es.mde.soiza.Ticketing.comun;

import java.util.ArrayList;
import java.util.List;

public class Sala {

	private List<Fila> filas = new ArrayList<>();
	private List<Sesion> sesiones = new ArrayList<>();

	public Sala() {
		super();
	}

	public List<Fila> getFilas() {
		return filas;
	}

	public void setFilas(List<Fila> filas) {
		this.filas = filas;
	}

	public List<Sesion> getSesiones() {
		return sesiones;
	}

	public void setSesiones(List<Sesion> sesiones) {
		this.sesiones = sesiones;
	}

}
