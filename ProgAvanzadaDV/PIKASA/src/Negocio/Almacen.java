package Negocio;

import java.util.LinkedList;

import Datos.Producto;
import IU.Interfaz;

public class Almacen {
	
	Producto[] Almacen = new Producto[500];
	
	LinkedList<Producto> Container1 = new LinkedList<Producto>();
	LinkedList<Producto> Container2 = new LinkedList<Producto>();
	LinkedList<Producto> Container3 = new LinkedList<Producto>();
	LinkedList<Producto> Container4 = new LinkedList<Producto>();
	LinkedList<Producto> Container5 = new LinkedList<Producto>();
	LinkedList<Producto> Container6 = new LinkedList<Producto>();
	
	LinkedList[] Containers = {Container1, Container2, Container3, Container4, Container5, Container6};
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Interfaz i1 = new Interfaz();
		i1.Login();
		
	}
	

	
	public int add(Producto producto) 
	{
		char [] letras = producto.getNombre().toCharArray();
		if(letras.length < 3 || letras.length > 60 ) 
		{
			return 1;
		} else {
	
		letras = producto.getCategoria().toCharArray();
		if(letras.length < 3 || letras.length > 30 ) 
		{
			return 2;
		} else {
			int precio = producto.getPrecio();
			if(precio < 1 || precio > 500000) 
			{
				return 3;
			} 
			else {
				int id_producto = producto.getId_producto();
					if(id_producto < 1 || id_producto > 99999999) 
					{	
						return 5;
					} else  {
						int cantidad = producto.getCantidad();
						if(cantidad < 1 || cantidad > 99999999) 
						{	
							return 6;
						} else  {
						Container1.add(producto);
								}
							return 7;
							}
				  }
		
				}
	
			    }
			
	}
	

	public Producto buscadorProducto (String nombreProducto) {
		Producto product=new Producto();
		int total=containers.size();
		
		while (total!= -1) 
		{
			if(!productosCreados.get(total).getNombre().equalsIgnoreCase(nombreProducto)) {
				if(total == 0) {
					System.out.print("Producto no encontrado.");
				 
				 }
				total--;
				
			}else {
				
				product=productosCreados.get(total);
				total=-1;
			}
			
			}
		System.out.print(product);
		return product;
		
	}
	
	public int contarProductos() {
		return Container1.size();
	}

	@Override
	public String toString() {
		return "Lista productos:\n" + Container1;
	}
	
	
	
	
}