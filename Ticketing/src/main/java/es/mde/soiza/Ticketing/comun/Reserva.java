package es.mde.soiza.Ticketing.comun;

import java.time.LocalDateTime;
import java.util.List;

public interface Reserva {
	Sesion getSesion();
	List<Butaca> getButacas();
	LocalDateTime getFechaHoraInicio();
	LocalDateTime getFechaHoraFin();
	
	
}
