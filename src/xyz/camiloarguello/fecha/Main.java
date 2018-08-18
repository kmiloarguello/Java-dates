package xyz.camiloarguello.fecha;

public class Main {

	public static void main(String[] args) {
		Fecha f = new Fecha(18,7,1994);
		Fecha f2 = new Fecha("18/07/1994");
		
		if(f.equals(f2)) { // When method equals are true
			System.out.println("Dates match!");
		}
		
	}

}
