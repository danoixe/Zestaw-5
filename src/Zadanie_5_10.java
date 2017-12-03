
public class Zadanie_5_10 {

	public static void main(String[] args) {
		String x = "ab abcd  abab";
		String y = "ab";
		System.out.println(strFindAndCount(x, y));

	}
	
	public static int strFindAndCount(String gdzie, String co) {
		int k=0, i=0;
		while (i<gdzie.length()) {
			if ( gdzie.indexOf(co, i)>-1) {
				k++;
				i = gdzie.indexOf(co, i)+1; 
			}
			else {
				i++;
			}
			
		}
		return k;
		
		
		
	}

}
