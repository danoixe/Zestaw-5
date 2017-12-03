
public class Zadanie_5_08 {

	public static void main(String[] args) {
		String x = "  jk l  ff nnnn    ff";
		System.out.println(wordCount(x));

	}
	
	public static int wordCount(String text) {
		
		int k=0, i=0;
		boolean czy = true;
		while (i<text.length()) {
			
			while (i<text.length() && Character.isWhitespace(text.charAt(i))==true){
				i++;			
			}
			if (i<text.length() && Character.isWhitespace(text.charAt(i))==false) {
			while (i<text.length() && Character.isWhitespace(text.charAt(i))==false){
				i++;			
			}
			k++;
			}
			
		}

		
		return k;
		
	}

}
