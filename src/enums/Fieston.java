package enums;

public class Fieston {
	private String lugar;
	private FinDe dia;
	
	
	
	//voy a crear un constructor para fieston
	//antes tenia que preocuparme si Finde era String, etc, ahora con los enumerados no
	public Fieston(String lugar, FinDe dia) {
		super();
		this.lugar = lugar;
		this.dia = dia;
	}
	
	@Override
	public String toString() {
		return "Fieston [lugar=" + lugar + ", dia=" + dia + "]";
	}
	
	public static void main(String[] args) {
		Fieston fieston = new Fieston ("Core", FinDe.SA);
		System.out.println(fieston);
		for (FinDe f : FinDe.values()) {
			System.out.println(f.getNombreEs());
			System.out.println(f.presentación());
		}
		//.values() devuelve un array de las `pelotas
		
	}



}
