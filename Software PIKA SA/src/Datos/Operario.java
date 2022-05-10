package Datos;

public class Operario extends Persona{

	private int nro;

	public Operario(String nombre, String apellido, int dni, int nro) {
		super(nombre, apellido, dni);
		this.nro = nro;
	}

	public int getNro() {
		return nro;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}
	
}
