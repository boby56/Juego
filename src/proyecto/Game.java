package proyecto;

public class Game {
	
	 private int id;
	 private String title;
	 Genre genre;
	 private double price;
	 private int stock;
	 
	 public Game(int id, String title, Genre genre, double price, int stock) {
	
		  this.title=title;
		  this.genre=genre;
		  this.price=price;
		  this.stock=stock;
		 
		 
	 } 
	 public int getId() {
		return id;
	}

	 public void setId(int id) {
		 this.id = id;
	 }

	 public String getTitle() {
		 return title;
	 }

	 public void setTitle(String title) {
		 this.title = title;
	 }

	 public Genre getGenre() {
		 return genre;
	 }

	 public void setGenre(Genre genre) {
		 this.genre = genre;
	 }

	 public double getPrice() {
		 return price;
	 }

	 public void setPrice(double price) {
		 this.price = price;
	 }

	 public int getStock() {
		 return stock;
	 }

	 public void setStock(int stock) {
		 this.stock = stock;
	 }

	

	 @Override
	 public String toString() {
		return "Game [id=" + id + ", title=" + title + ", genre=" + genre + ", price=" + price + ", stock=" + stock
				+ "]";
	 }
	 
	 public int Indetificador( ) {
		 return id;
	 }
	 public String ObtenerTitulo() {
		 return title;
	 }
	 public  Game() {
		 return genre;
	 }
	  public int  ObtenerStock() {
		  return stock;
	  }
	  public void ModificarStock(){
		  this.stock=stock;
	  }
	  public void AumerteStock(int cantidad) {
		  if (cantidad>0) {
			  stock+=cantidad;
		  }
	  }
	  public void ReducirStock(int cantidad) {
		  if (cantidad > 0 && cantidad <= stock) {
	            stock -= cantidad;
	        }
	  }
	  public boolean ComproSiHayUnidad() {
	        return stock > 0;
	    }
	  public void ObtenerUnaRepesentacionTextualDelVideojuego() {
		  
	  }
}	

