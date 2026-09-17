package proyecto;

public class Compra {

	// respesenta las compras que se hacen atraves e nuestra tienda(cliente. juego, copias compra, cuianto se debajop)

	 private Compra compra;
	    private Juego juego;
	    private int quantity;
	    private double totalPrice;

	    public Compra(Compra compra, Juego game, int quantity) {
	        this.compra = compra;
	        this.juego = juego;
	        this.quantity = quantity;
	        this.totalPrice = quantity * game.getPrice();
	    }

	 

	    public Compra getCompra() {
			return compra;
		}



		public void setCompra(Compra compra) {
			this.compra = compra;
		}



		public Juego getJuego() {
	        return juego;
	    }

	    public void setJuego(Juego juego) {
	        this.juego = juego;
	        calcularPrecioTotal();
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	        calcularPrecioTotal();
	    }

	    public double getTotalPrice() {
	        return totalPrice;
	    }

	    private void calcularPrecioTotal() {
	        if (juego != null) {
	            totalPrice = quantity * juego.getPrice();
	        }
	    }

		@Override
		public String toString() {
			return "Compra [compra=" + compra + ", game=" + juego + ", quantity=" + quantity + ", totalPrice="
					+ totalPrice + "]";
		}

	   
	}
	//la compra debera permitir conocer 
	//	el cliente  que realizo
	//el video jugo comoprado
	//el numero de unidades
	//el aprecio total de la compra
	// el precio total debera calcularse  apartir del precio delo videojuego y loa canridad comprada por
	//ejemplo si un videoJuegoi cueta 20.00 se comorab 32 unidades
		
	

