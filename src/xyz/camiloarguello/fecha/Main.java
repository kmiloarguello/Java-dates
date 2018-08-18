package xyz.camiloarguello.fecha;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese una fecha (dd/mm/aaaa) ");
		String sFecha = sc.next();
		
		Fecha fecha = new Fecha(sFecha);
		System.out.println("La fecha ingresada es: " + fecha);
		
		System.out.print("Ingrese los días a sumar: ");
		int diasSum = sc.nextInt();
		
		fecha.addDias(diasSum);
		System.out.print("Sumando " + diasSum + " días, la nueva fecha es " + fecha);
	}

}
