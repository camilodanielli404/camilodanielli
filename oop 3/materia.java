package oop;

public class materia {
	String nombre;
	docente educador;

	public materia(String nombre, docente educador) {
		this.nombre = nombre;
		this.educador = educador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public docente getEducador() {
		return educador;
	}

	public void setEducador(docente educador) {
		this.educador = educador;
	}

}
