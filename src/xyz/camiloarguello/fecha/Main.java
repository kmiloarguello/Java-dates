package xyz.camiloarguello.fecha;

public class Main {

	public static void main(String[] args) {
		Fecha f = new Fecha(18,7,1994);
		
		Fecha f2 = new Fecha();
		f2.setDia(10);
		f2.setMes(10);
		f2.setAnio(50);
		
		Fecha f3 = new Fecha("18/04/2018");
		System.out.println(f3.getDia());
	}

}
