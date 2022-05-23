package Datos;

public class Producto {

	private int id_producto;
	private String nombre;
	private int precio;
	private String categoria;
	private int cantidad;

	
	
	
	
	
	
	
	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "\nID: " + id_producto + "\nNombre: " + nombre + "\nPrecio: " + precio + "\nCategoria:" + categoria + "\n";
	}
	
	
}
