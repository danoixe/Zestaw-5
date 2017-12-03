
public class Zadanie_5_07 {

	public static void main(String[] args) {
		String x1 = "abcdefghijk";
		String x2 = "bcde";
		System.out.println(strfind(x1, x2));		

	}
	
	public static int strfind(String gdzie, String co) {
		
		int p = gdzie.indexOf(co);
		return p;
		
	}

}
