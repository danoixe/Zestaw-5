
public class Zadanie_5_11 {

	public static void main(String[] args) {
		String x = "Ala ma kota";
		int y1 = 4, y2 = 3;
		System.out.println(strcut(x, y1, y2));

	}
	
	public static String strcut(String str, int start, int ile) {
		String nowy1 =  str.substring(0, start);
		String nowy2 = str.substring(start+ile, str.length());
		String nowy = nowy1.concat(nowy2);
		return nowy;
	}

}
