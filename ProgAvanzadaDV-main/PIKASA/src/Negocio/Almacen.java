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
	

	
	
	
	
	

		
		
		
	
	
	public void  cargarConteiner(String nombreProducto) 
	{   Container contenedor= new Container();
		Producto product=new Producto();
		int total=containers.size(), stock=0;
		
		while (total!=-1) 
		{
			if(productosCreados.get(total).getNombre() != nombreProducto) 
			{  if(total == 0) 
			   {
				System.out.print("producto no encontrado ");
				 
			   }
				total--;
				
			}else 
			{   
				product=productosCreados.get(total);/*trae la posicion del objeto */
				contenedor.addProducto(product);/*lo guarda adentro del array de la clase conteiners  */
				stock=product.getCantidad();/*me trae la cantidad  */
				stock= stock-1;
				
				total=-1;
			}
			
		}
	}
	
	
} 