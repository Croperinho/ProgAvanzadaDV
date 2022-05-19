package Negocio;

import java.util.LinkedList;

import Datos.Producto;
import IU.Interfaz;

public class Almacen {
	
	
	LinkedList<Producto> Container = new LinkedList<Producto>();
	
	LinkedList[] Containers = {Container};
	
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
						Container.add(producto);
								}
							return 7;
							}
				  }
		
				}
	
			    }
			
	}

	
	public int contarProductos() {
		return Container.size();
	}

	@Override
	public String toString() {
		return "Lista productos:\n" + Container;
	}
	
	
	
	
}