package domaci;

public class Vozilo {

	private String registracija;
	private String tipvozila;
	private Vozac vozac;
	
	public int CenaGorivaNa100km(int CenaGorivaPoLitri)
	{
		return CenaGorivaPoLitri * 8;
	}
	
	public Vozilo() {
	
	}

	public Vozilo(String registracija, String tipvozila, Vozac vozac) {
		super();
		this.registracija = registracija;
		this.tipvozila = tipvozila;
		this.vozac = vozac;
	}

	public String getRegistracija() {
		return registracija;
	}

	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}

	public String getTipvozila() {
		return tipvozila;
	}

	public void setTipvozila(String tipvozila) {
		this.tipvozila = tipvozila;
	}

	public Vozac getVozac() {
		return vozac;
	}

	public void setVozac(Vozac vozac) {
		this.vozac = vozac;
	}
	
	@Override
	public String toString()
	{
		return "Registracija: " + this.registracija + " Tip Vozila: " + this.tipvozila + " " + this.vozac.toString();
	}
	
}
