
public class avion {

	
private String modelo;
private String patente;
private int capacidad;

avion(String modelo, String patente, int capacidad){
	this.modelo = modelo;
	this.patente= patente;
	this.capacidad= capacidad;
}
public String getModeloAvion(){
	return this.modelo;
}
public void setModeloAvion(String modelo) {
	this.modelo=modelo;
}
public String getPateneAvion() {
	return this.patente;
}
public void setPatenteAvion(String patente) {
	this.patente=patente;
}
public int getCapacidadAvion() {
	return this.capacidad;
}
public void setCapacidadAvion(int capacidad) {
	this.capacidad=capacidad;
} 
}