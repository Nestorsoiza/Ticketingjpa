package es.mde.soiza.Ticketing.comun;

public class Butaca {

	private boolean disponible;
	private int numeroButaca;
	private Fila fila;

	public Butaca() {
		super();
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public int getNumeroButaca() {
		return numeroButaca;
	}

	public void setNumeroButaca(int numeroButaca) {
		this.numeroButaca = numeroButaca;
	}

	public Fila getFila() {
		return fila;
	}

	public void setFila(Fila fila) {
		this.fila = fila;
	}

}
