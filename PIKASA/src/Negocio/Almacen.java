package Negocio;

import java.util.LinkedList;
import Datos.*;
import IU.Interfaz;

public class Almacen {
	
	
	LinkedList<Producto> productosCreados = new LinkedList<Producto>();
	
	LinkedList<Container> containers = new LinkedList<Container>();
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Interfaz i1 = new Interfaz();
		i1.Login();
		
	}
	
	
	public void addProductos(Producto producto) 
	{
		
		productosCreados.add(producto);
							
	
			    
			
	}

	
	public int contarProductos() {
		return productosCreados.size();
	}

	@Override
	public String toString() {
		return "Lista productos:\n" + productosCreados;
	}
	

	
	public Container buscadorContainer (String nombreContainer) {
		Container conts=new Container();
		int total=containers.size();
		
		while (total!=-2) 
		{
			if(containers.get(total).getNombre() != nombreContainer) {
				total--;
				
			}else {
				
				conts=containers.get(total);
				total=-2;
			}
			if(total == -1) {
				System.out.print("producto no encontrado ");
			 total= -2;
			 }
		
		}
		
		return conts;
		
	}
	
	public Producto buscadorProducto (String nombreProducto) {
		Producto product=new Producto();
		int total=containers.size();
		
		while (total!=2) 
		{
			if(productosCreados.get(total).getNombre() != nombreProducto) {
				total--;
				
			}else {
				
				product=productosCreados.get(total);
				total=-2;
			}
			if(total == -1) {
				System.out.print("producto no encontrado ");
			 total= -2;
			 }
			}
		
		return product;
		
	}
	
	
	public void deletProducto(String productoborrad) {
		Producto product=new Producto();
		int total=containers.size();
		while (total != -2) 
		{
			if(productosCreados.get(total).getNombre() != productoborrad) {
				total--;
				
			}else {
				productosCreados.remove(total);
				System.out.print("producto Eliminado ");
				total= -2;
			}
			if(total == -1) {
				System.out.print("producto no encontrado ");
			 total= -2;
			 }
			
			}
		
		
		
	}
} 