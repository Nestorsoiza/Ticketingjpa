package es.mde.soiza.Ticketing.comun;

import java.time.LocalDateTime;
import java.util.List;

public class Sesion {
	private Sala sala;
	private LocalDateTime FechaHoraInicio;
	private LocalDateTime FechaHoraFin;
	private List<Butaca> butacas;
	
	
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
	public LocalDateTime getFechaHoraFin() {
		return FechaHoraFin;
	}
	public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
		FechaHoraFin = fechaHoraFin;
	}
	public List<Butaca> getButacas() {
		return butacas;
	}
	public void setButacas(List<Butaca> butacas) {
		this.butacas = butacas;
	}

	
}
