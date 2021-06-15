package es.mde.soiza.Ticketing.comun;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reserva {

	private String nombreAtraccion;
	private Sesion sesion;
	private LocalDateTime horaReserva;

	public Reserva() {
		super();
	}

	public String getNombreAtraccion() {
		return nombreAtraccion;
	}

	public void setNombreAtraccion(String nombreAtraccion) {
		this.nombreAtraccion = nombreAtraccion;
	}

	public Sesion getSesion() {
		return sesion;
	}

	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}

	public LocalDateTime getHoraReserva() {
		return horaReserva;
	}

	public void setHoraReserva(LocalDateTime horaReserva) {
		this.horaReserva = horaReserva;
	}

}
