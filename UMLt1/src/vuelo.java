import java.time.LocalDate;
import java.time.LocalTime;

public class vuelo {

	
private LocalDate fecha;
private LocalTime hora;
private avion avion;
private aeropuertos origen;
private aeropuertos destino;
private pasajero pasajero;


vuelo (LocalDate fecha,LocalTime hora,aeropuertos origen,aeropuertos destino,pasajero pasajero,avion avion){
	this.fecha=fecha;
	this.hora=hora;
	this.origen=origen;
	this.destino=destino;
	this.avion=avion;
}
void setFecha(LocalDate fecha) {
	this.fecha=fecha;
}
LocalDate getFecha() {
	return this.fecha;
}
void setHora(LocalTime hora) {
	this.hora=hora;
}
LocalTime setHora() {
	return this.hora;
}
void setAvion(String modelo, String patente, int capacidad) {
	avion.setModeloAvion(modelo);
	avion.setPatenteAvion(patente);
	avion.setCapacidadAvion(capacidad);
}

avion getAvion() {
	return this.avion;
	}
aeropuertos getOrigen() {
	return this.origen;
}
void setOrigen(int id,String nombre) {
	aeropuertos.setId(id);
	aeropuertos.setNombre(nombre);
	
}
aeropuertos getDestino() {
	return this.destino;
}
void getDestino(String nombre, int id) {
	aeropuertos.setId(id);
	aeropuertos.setNombre(nombre);
}

pasajero getPasajero() {
	return this.pasajero;
}
void setPasajero(String nombre, int CI) {
	pasajero.setDocPasajero(CI);
	pasajero.setNombrePasajero(nombre);
}
}
