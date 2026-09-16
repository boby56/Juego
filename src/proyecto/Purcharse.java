package proyecto;

public class Purcharse {

	// respentalas compraas quie hacen atraves e nuestra tienda(cliente. juego, copias compra, cuianto se debajop)

	Cuestoner cuestoner;
	Game game;
	int quantiy;
	double totalPrice;
	
	public Purcharse(Cuestoner cuestoner, Game game, int quantiy, double totalCompra) {
		super();
		this.cuestoner = cuestoner;
		this.game = game;
		this.quantiy = quantiy;
		this.totalPrice = totalPrice*this.game.getPrice();
	}

	public Cuestoner getCuestoner() {
		return cuestoner;
	}

	public void setCuestoner(Cuestoner cuestoner) {
		this.cuestoner = cuestoner;
	}

	public Game getGeme() {
		return game;
	}

	public void setGeme(Game geme) {
		this.game = game;
	}

	public int getQuantiy() {
		return quantiy;
	}

	public void setQuantiy(int quantiy) {
		this.quantiy = quantiy;
	}

	public double getTotalCompra() {
		return totalCompra;
	}

	public void setTotalCompra(double totalCompra) {
		this.totalCompra = totalCompra;
	}

	@Override
	public String toString() {
		return "Purcharse [cuestoner=" + cuestoner + ", geme=" + geme + ", quantiy=" + quantiy + ", totalCompra="
				+ totalCompra + "]";
	}
	
	//la compra debera permitir conocer 
	//	el cliente  que realizo
	//el video jugo comoprado
	//el numero de unidades
	//el aprecio toltañ de la compra
	// el precio total debera calcularse  apariti del precio delo videojuego y loa canridad comprada por
	//ejemplo si un videoJuegoi cueta 20.00 se comorab 32 unidades
		
	
}
