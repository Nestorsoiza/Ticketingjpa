package es.mde.soiza.Ticketing.comun;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReservaImpl implements Reserva{
	private Sesion sesion;
	private List<Butaca> butacas = new ArrayList<>();
	
	
	public ReservaImpl() {
		super();
	}
	public Sesion getSesion() {
		return sesion;
	}
	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}
	
	public List<Butaca> getButacas() {
		return butacas;
	}
	public void setButacas(List<Butaca> butacas) {
		this.butacas = butacas;
	}
	@Override
	public LocalDateTime getFechaHoraInicio() {
		return this.sesion.getFechaHoraInicio();
	}
	@Override
	public LocalDateTime getFechaHoraFin() {
		return this.sesion.getFechaHoraFin();
	}
	
	
	
}
