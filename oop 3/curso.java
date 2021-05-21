package oop;

public class curso {
	String nombre;
	materia[] materias;

	public curso(String nombre, materia[] materias) {
		this.nombre = nombre;
		this.materias = materias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public materia[] getMaterias() {
		return materias;
	}

	public void setMaterias(materia[] materias) {
		this.materias = materias;
	}

}
