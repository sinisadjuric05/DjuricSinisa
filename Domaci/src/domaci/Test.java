package domaci;

public class Test {

	public static void main(String[] args) {
		
		Vozac vozac1 = new Vozac("Sinisa","Djuric",3, false);
		System.out.println(vozac1.toString());
		
		Vozilo vozilo = new Vozilo("019jk", "Automobil", vozac1);
		System.out.println(vozilo.toString());
		System.out.print("Cena goriva na 100km: ");
		System.out.println(vozilo.CenaGorivaNa100km(225)+".din");
		
		Vozilo kamion = new Kamion("412lv", "Kamion", vozac1);
		System.out.println(kamion.toString());
		System.out.print("Cena goriva na 100km: ");
		System.out.println(kamion.CenaGorivaNa100km(225)+".din");
		

	}

}
