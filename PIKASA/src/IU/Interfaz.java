package IU;
import java.awt.Container;
import java.util.LinkedList;
import java.util.Scanner;
import Datos.Operario;
import Datos.Producto;
import Negocio.Almacen;

public class Interfaz {

	static Scanner entrada = new Scanner(System.in);
	
	static Almacen almacen = new Almacen();
	
	public void Login() 
	{
		sobreCarga();
		System.out.println("Bienvenido");
		imprimirMenu();
	}
	
	public void sobreCarga() {
		 Producto producto = new Producto();
		 producto.setNombre("Coca-Cola");
		 producto.setCategoria("Bebida");
		 producto.setPrecio(50);
		 producto.setId_producto(1);
		 producto.setCantidad(50);
		 almacen.add(producto);
	}
	
	private void imprimirMenu() 
	{
		System.out.println("Por favor escoja una de las siguientes opciones");
		System.out.println("Para acceder a la opcion escriba el numero que corresponda");
		System.out.println("1.Ingresar producto");
		System.out.println("2.Ver productos");
		System.out.println("3.Buscar productos");
		System.out.println("4.Salir");
		
		String opcion = entrada.next();
		
		
		switch (opcion) 
		{
		case "1": Ingresar();
			break;
		case "2": verProductos();
			break;
		case "3": buscarProductos();
			break;
		case "4": Salir();
		break;
			
		default: System.out.println("Se eligio una opcion incorrecta volver a intentar");
		imprimirMenu();
				
		break;
		}
		
	}
	
	private void Ingresar() 
	{
		Producto producto = new Producto();
		
		System.out.println("Ingrese el nombre de producto.");		
		System.out.println("Debe ser un nombre de minimo 3 letras y maximo 60.");
		producto.setNombre(entrada.next());
		
		char [] letras = producto.getNombre().toCharArray();
		if(letras.length < 3 || letras.length > 60 ) 
		{
			System.out.println("No se pudo agregar el producto, hubo un error con el nombre.");
			System.out.println("Si deseas agregar nuevamente un producto, selecciona la opcion 1.");
			imprimirMenu();
			
		} else {
			System.out.println("Ingrese la categoria.");
			System.out.println("Debe ser una categoria de minimo 3 letras y maximo 60");
			producto.setCategoria(entrada.next());
			
			letras = producto.getCategoria().toCharArray();
			if(letras.length < 3 || letras.length > 30 ) 
			{
				System.out.println("No se pudo agregar el producto, hubo un error con la categoria.");
				System.out.println("Si deseas agregar nuevamente un producto, selecciona la opcion 1.");
				imprimirMenu();
			} else {
				System.out.println("Ingrese el precio.");
				producto.setPrecio(entrada.nextInt());
				
				int precio = producto.getPrecio();
				if(precio < 50 || precio > 500000) 
				{
						System.out.println("No se pudo agregar el producto, hubo un error con el precio.");
						System.out.println("Si deseas agregar nuevamente un producto, selecciona la opcion 1.");
						imprimirMenu();
					} else  {
								System.out.println("Ingrese el ID de producto.");
								producto.setId_producto(entrada.nextInt());
								
								int id_producto = producto.getId_producto();
								if(id_producto < 1 || id_producto > 99999999) 
								{	
										System.out.println("No se pudo agregar el producto, hubo un error con el ID de producto.");
										System.out.println("Si deseas agregar nuevamente un producto, selecciona la opcion 1.");
										imprimirMenu();
									} else  {
										System.out.println("Ingrese la cantidad del producto.");
										producto.setCantidad(entrada.nextInt());
										
										int cantidad = producto.getCantidad();
										if(cantidad < 1 || cantidad > 99999999) 
										{	
												System.out.println("No se pudo agregar el producto, hubo un error con la cantidad de producto.");
												System.out.println("Si deseas agregar nuevamente un producto, selecciona la opcion 1.");
												imprimirMenu();
											} else  {
										almacen.add(producto);
											System.out.println("Se agrego correctamente el producto");
											imprimirMenu();
													}
					
											}
							}
		
				}
			}
	
				
}
	
	
	private void buscarProductos(Producto producto) 
	{	
		imprimirMenu();
	}
	
	private void verProductos() 
	{
		System.out.println(almacen);
		imprimirMenu();
	}
	
	private void Salir() 
	{
		System.out.println("El programa finalizo.");
		System.exit(0);
	}
	
	
}
	