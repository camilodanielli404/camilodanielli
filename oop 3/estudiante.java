package oop;

public class estudiante extends usuario {
	String dir;
	curso cursoActual;

	public estudiante(String nombre, int ci, String dir, curso cursoActual) {
		super(nombre, ci);

	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public curso getCursoActual() {
		return cursoActual;
	}

	public void setCursoActual(curso cursoActual) {
		this.cursoActual = cursoActual;
	}

}
