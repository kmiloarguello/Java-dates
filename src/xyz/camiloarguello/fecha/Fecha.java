package xyz.camiloarguello.fecha;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	// I can create 2 constructos for this class. In case of one might not have arguments. This is called "Sobrecarga" 
	public Fecha(String s) {
		int pos1 = s.indexOf('/');
		int pos2 = s.lastIndexOf('/');
		
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
