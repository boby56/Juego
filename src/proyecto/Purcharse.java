package proyecto;

public class Purcharse {

	// respentalas compraas quie hacen atraves e nuestra tienda(cliente. juego, copias compra, cuianto se debajop)

	 private Customer customer;
	    private Game game;
	    private int quantity;
	    private double totalPrice;

	    public Purcharse(Customer customer, Game game, int quantity) {
	        this.customer = customer;
	        this.game = game;
	        this.quantity = quantity;
	        this.totalPrice = quantity * game.getPrice();
	    }

	    public Customer getCustomer() {
	        return customer;
	    }

	    public void setCustomer(Customer customer) {
	        this.customer = customer;
	    }

	    public Game getGame() {
	        return game;
	    }

	    public void setGame(Game game) {
	        this.game = game;
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
	        if (game != null) {
	            totalPrice = quantity * game.getPrice();
	        }
	    }

	    @Override
	    public String toString() {
	        return "Purcharse [customer=" + customer
	                + ", game=" + game
	                + ", quantity=" + quantity
	                + ", totalPrice=" + totalPrice + "]";
	    }
	}
	//la compra debera permitir conocer 
	//	el cliente  que realizo
	//el video jugo comoprado
	//el numero de unidades
	//el aprecio toltañ de la compra
	// el precio total debera calcularse  apariti del precio delo videojuego y loa canridad comprada por
	//ejemplo si un videoJuegoi cueta 20.00 se comorab 32 unidades
		
	

