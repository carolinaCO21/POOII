package enums;

public enum Mes {

	E(1,"Enero","January"),F(2,"Febrero","February"),M(3,"Marzo","March"),A(4,"Abril","April"),My(5,"Mayo","May"),
	Jn(6,"Junio","June"),Jl(7,"Julio","July"),Ag(8,"Agosto","August"),S(9,"Septiembre", "September"),
	O(10,"Octubre","October"), N(11,"Noviembre","November"), D(12,"Diciembre","December");
	
	private int numMes;
	private String mesEs;
	private String mesEn;
	
	private Mes(int numMes, String mesEs, String mesEn) {
		this.numMes = numMes;
		this.mesEs = mesEs;
		this.mesEn = mesEn;
	}

	public int getNumMes() {
		return numMes;
	}

	public String getMesEs() {
		return mesEs;
	}

	public String getMesEn() {
		return mesEn;
	}
	
	public String presentación() {
		return String.format("El mes %d es %s (%s)",  numMes ,mesEs, mesEn);	
	}
	
	
	// 4 puntos  6 defensa
	
	
}
