package xyz.camiloarguello.fecha;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	// I can create 2 constructor for this class. In case of one might not have arguments. This is called "Sobrecarga" 
	public Fecha(String s) {
		
		// Get position from characters
		// i.e. for 18/07/2013 the pos1 variable is equal to 2. It needs counting from left to right
		int pos1 = s.indexOf('/');
		int pos2 = s.lastIndexOf('/');
		
		// As a result I have a string. Just clean the data from backslash and parse the String into a Numbers.
		String sDia = s.substring(0, pos1);
		dia = Integer.parseInt(sDia);
		
		String sMes = s.substring(pos1 + 1, pos2);
		mes = Integer.parseInt(sMes);
		
		String sAnio = s.substring(pos2 + 1);
		anio = Integer.parseInt(sAnio);
	}
	public Fecha(int d, int m, int a) {
		super();
		this.dia = d;
		this.mes = m;
		this.anio = a;
	}
	public Fecha() {}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	private int fechaToDias() {
		return anio * 360 + mes * 30 + dia;
	}
	private void diasToFecha(int i) {
		anio = (int) i / 360;
		
		int restante = i % 360;
		
		mes = (int) restante / 30;
		
		dia = (int) restante % 30;
		
		if(dia == 0) {
			dia = 30;
			mes--;
		}
		if(mes == 0) {
			mes = 12;
			anio--;
		}
		
	}
	public void addDias(int dias) {
		int diasTotales = fechaToDias() + dias;
		diasToFecha(diasTotales);
	}

	// Override toString method
	public String toString() {
		return dia + "/" + mes + "/" + anio;
	}
		
	// Override equals method
	public boolean equals(Object obj) {
		Fecha otra = (Fecha) obj;
		return (dia == otra.dia) && (mes == otra.mes) && (anio == otra.anio);
	}
	
}
