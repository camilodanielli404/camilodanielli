
public class pasajero {

	private String nombre;
	private int documento;

	pasajero(String nombre, int documento) {

		this.nombre = nombre;
		this.documento = documento;
	}

	public String getNombrePasajero() {
		return this.nombre;
	}

	public void setNombrePasajero(String nombre) {
		this.nombre = nombre;
	}

	public int getDocpasajero() {
		return this.documento;
	}

	public void setDocPasajero(int documento) {
		this.documento = documento;
	}

}
