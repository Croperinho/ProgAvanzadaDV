package Datos;

public class Container {
	public int nroContainer;
	public String nombre;
	
	

	public String getNombre() {
		
		 return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setnroContainer(int nroContainer) {
		this.nroContainer = nroContainer;
	}
	
	
	public int getnroContainer() {
		return nroContainer ;
	}

	@Override
	public String toString() {
		return "Container [nroContainer=" + nroContainer + ", nombre=" + nombre + "]";
	}

}
