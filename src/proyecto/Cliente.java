package proyecto;

public class Cliente {
	private int contador=1;
	private int id;
	private String name;
	private double balance;
	public Cliente(int id, String name, double balance) {
		
		this.id = id;
		this.name = name;
		this.balance = balance;
		id=contador++;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalane(double balance) {
		this.balance = balance;
	}
	
	
	public int ObtenerIdentificador() {
		return id;
	}
	public String ObtnerNombre() {
		return name;	
	}
	public void ConsultarSaldo() {
		return;
	}
	public double AnadirSaldo(double cantidad) {
		if (cantidad>0) {
			System.out.println("Debe se mayor a 0 en ingreso");
		}
	return	balance+=cantidad;
		
	}
	public double RetirarSaldo(double cantidad) {
		double resultado = 0;
		if(cantidad<0) {
			resultado= balance -= cantidad;
		        
		}
		return resultado;
	}
	public boolean ComprobarCantinda(double cantidad) {
		 return balance >= cantidad;
	}
	 public String ObtenerUnaRepresentacionTextualCliente() {
	        return "Cliente [id=" + id + ", name=" + name + ", balane=" + balance + "]";
	    }
	
	}
/*el saldo  nunca debera quedxar por debajo de cero, si se intenta realizar una
  que deje el saldo en una situacion no validd debera producirse una Exception*/
