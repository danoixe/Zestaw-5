
public class Zadanie_5_05 {

	public static void main(String[] args) {
		String x = "taka";
		String y = "tak";
		System.out.println(startsWith(x,y));

	}
	
	public static boolean startsWith(String str1, String str2) {
		int t=0;
		boolean wynik=false;
		for (int i=0; i<str2.length(); ++i) {
			if (str2.charAt(i)==str1.charAt(i)) {
				 t=1;
			}
			else {
				t=0;
				break;
			}
		}
		if (t==1) {
			wynik = true;
		}
		else {
			wynik = false;
		}
			
		return wynik;
	}

}
