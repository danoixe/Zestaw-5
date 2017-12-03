
public class Zadanie_5_13 {

	public static void main(String[] args) {
		String tekst = "Egzamin";
		int [] kol = { 0, 1, 4, 3, 2, 6, 5 };
		System.out.println(poprzestawiaj(tekst, kol));
	}
	
	public static String poprzestawiaj(String tekst, int [] kolejnosc) {
		char[] tab = new char[tekst.length()];
		for (int i=0; i<tab.length; i++) {
			tab[i] = tekst.charAt(kolejnosc[i]);
		}
		String wynik = new String(tab);
		return wynik;
		
	}

}
