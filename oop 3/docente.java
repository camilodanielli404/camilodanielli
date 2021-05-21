package oop;

import java.time.LocalDate;

public class docente extends usuario {
	LocalDate ingreso;
	materia materia;

	public docente(materia materia, LocalDate ingreso, String nombre, int ci) {
		super(nombre, ci);
		this.ingreso = ingreso;
	}

	public LocalDate getIngreso() {
		return ingreso;
	}

	public void setIngreso(LocalDate ingreso) {
		this.ingreso = ingreso;
	}

	public materia getMateria() {
		return materia;
	}

	public void setMateria(materia materia) {
		this.materia = materia;
	}

}
