package xyz.camiloarguello.fecha;

public class Main {

	public static void main(String[] args) {
		Fecha fecha = new Fecha("1/4/1993");
		fecha.addDias(1);
		
		System.out.println(fecha);

	}

}
