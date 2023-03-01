package domaci;

public class Kamion extends Vozilo {
	
	public int CenaGorivaNa100km(int CenaGorivaPoLitri) {
		return CenaGorivaPoLitri * 16;
	}
	
	public Kamion() {
		
	}

	public Kamion(String registracija, String tipvozila, Vozac vozac) {
		super(registracija, tipvozila, vozac);
	}

}
