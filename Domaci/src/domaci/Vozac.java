package domaci;

public class Vozac {

	private String ime;
	private String prezime;
	private double jmbg;
	private boolean vozackadozvola;
	
	public Vozac() {

	}

	public Vozac(String ime, String prezime, double jmbg, boolean vozackadozvola) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.vozackadozvola = vozackadozvola;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public double getJmbg() {
		return jmbg;
	}

	public void setJmbg(int jmbg) {
		this.jmbg = jmbg;
	}

	public boolean isVozackadozvola() {
		return vozackadozvola;
	}

	public void setVozackadozvola(boolean vozackadozvola) {
		this.vozackadozvola = vozackadozvola;
	}
	
	@Override
	public String toString()
	{
		return "Ime: " + this.ime + " Prezime: " + this.prezime + "Jmbg: " + this.jmbg;
	}

}
