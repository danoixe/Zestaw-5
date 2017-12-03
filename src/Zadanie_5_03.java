
public class Zadanie_5_03 {

	public static void main(String[] args) {
		String x = "test";
		char k = 'e';
		System.out.println(strpos(x,k));
	}
	
	public static int strpos(String text, char z) {
		int pozycja=-1;
		for (int i=0; i<text.length(); ++i) {
			if (text.charAt(i)==z) {
				pozycja=i;
				break;
			}
		}
		return pozycja;
	}

}
