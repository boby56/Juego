package proyecto;

import java.util.ArrayList;

public class Store {

	private ArrayList<Juego>juegos;
	private ArrayList<Cliente>clientes;
	private ArrayList<Compra> compras;
	
	
	public Store() {
		juegos=new ArrayList<>();
		clientes=new ArrayList<>();
		compras=new ArrayList<>();
	}
	
	public void AñadirJuego(Juego juego) {
		for (Juego g: juegos) {
			if(juego.getId()==juego.getId()) {
				System.out.println("El juego ya exite");
			}
		}
		juegos.add(juego);
		
	}
	public  void ElimarJuego(int id) {
		for (Juego g: juegos) {
			if(g.getId()==g.id) {
				
			}
		}
	}
	
	public void BuscarPorId(int id) {
		for (Juego j: juegos) {
			if(j.getId()==id) {
				System.out.println(j.getId());
			}
		}
	}
	
	public void buscarPornombre(String title) {
		for(Juego j:juegos) {
			if(j.getTitle().equalsIgnoreCase(title)) {
				System.out.println(j.getTitle());
			}
		}
	}
	public void mostrarVideoJuego() {
		for (Juego j: juegos) {
			System.out.println(j);
		}
	}
	
	public void EliminarJuego(int id) {
		for(Juego j:juegos) {
			if(j.getId()==id) {
				juegos.remove(id);
			}
		}
	}
	// agragarCliente
	 public void AgregarCliente (Cliente cliente) {
		for(Cliente c: clientes) {
			if(c.getId()==c.getId()) {
				System.out.println("El cliente ya existe");
			}
		} 
		clientes.add(cliente);
	 }
	 public void eliminarCliente( int id) {
		for( Cliente c: clientes) {
			if(c.getId()==c.getId()) {
				clientes.remove(id);
			}
		} 
	 	}
	 public void mostraCliente() {
		 for(Cliente c: clientes) {
			 System.out.println(c);
		 }
	 }
	}

	
	// La clase Store será responsable de las principales operaciones.
	
		/* Deberá existir un método que permita añadir un juego al catálogo. 
		 * No deberá ser posible añadir dos videojuegos con el mismo identificador.
		 */
		
		/* Deberá existir un método que permita obtener un videojuego a partir de su identificador.
		 * Si no existe, deberá indicarse adecuadamente mediante una excepción.
		 */
		
		/* Deberá ser posible obtener todos los videojuegos pertenecientes a un género determinado.
		 * */
		
		/* El programa deberá permitir buscar videojuegos cuyo título contenga un determinado texto.
		 * La búsqueda no deberá distinguir entre mayúsculas y minúsculas. */
		
		/* La clase Store deberá permitir un método para realizar una compra. Las condiciones son:
		 * . Que el cliente exista.
		 * . Que el videojuego exista.
		 * . Que la cantidad solicitada sea válida.
		 * . Que exista stock suficiente.
		 * . Que el cliente tenga saldo suficiente.
		 * */
		
		/* Si todas las condiciones se cumplen:
		 * . Se reduce el stock.
		 * . Se reduce el saldo.
		 * . Se crea una Purchase (Compra).
		 * . Se almacena la compra en la lista correspondiente.
		 * */