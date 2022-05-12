package Datos;

public class Producto {

	private int id_producto;
	private String nombre;
	private int precio;
	private float peso;
	private String categoria;
	
	public Producto(int id_producto, String nombre, int precio, float peso, String categoria) {
		this.id_producto = id_producto;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.categoria = categoria;
	}
	
	public Producto() {
		
	}
	

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "\nID: " + id_producto + "\nNombre: " + nombre + "\nPrecio: " + precio + "\nPeso: " + peso
				+ "\nCategoria:" + categoria + "\n";
	}
	
	
}
