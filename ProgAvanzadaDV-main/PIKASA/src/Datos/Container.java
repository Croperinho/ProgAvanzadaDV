package Datos;
import java.util.*;

public class Container {
	public int nroContainer;
	public String nombre;
	LinkedList<Producto> productos = new LinkedList<Producto>();
	
	

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
	
	public void addProducto(Producto nombre) {
		
		productos.add(nombre);
		
		
		
	}

}
