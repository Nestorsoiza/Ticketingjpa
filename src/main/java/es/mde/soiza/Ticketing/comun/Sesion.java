package es.mde.soiza.Ticketing.comun;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Sesion {

	private Sala sala;
	private LocalDateTime FechaHoraInicio;
	private List<Reserva> reservas = new ArrayList<>();

	public Sesion() {
		super();
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public LocalDateTime getFechaHoraInicio() {
		return FechaHoraInicio;
	}

	public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
		FechaHoraInicio = fechaHoraInicio;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

}
