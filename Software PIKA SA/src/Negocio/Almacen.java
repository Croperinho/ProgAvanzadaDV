package Negocio;

import java.util.LinkedList;

import Datos.Producto;
import IU.Interfaz;

public class Almacen {
	
	LinkedList<Producto> Container = new LinkedList<Producto>();
	
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
			if(precio < 50 || precio > 500000) 
			{
				return 3;
			} 
			else {
				double peso = producto.getPeso();
				if(peso < 0.1 || peso > 100000) 
				{
					return 4;
				} else {
				int id_producto = producto.getId_producto();
					if(id_producto < 1 || id_producto > 99999999) 
					{	
						return 5;
					} else  {
						Container.add(producto);
							}
					return 6;
						}
				  }
		
				}
	
			    }
	}
}