
public class Zadanie_5_04 {

	public static void main(String[] args) {
		String slowo = "ALA ma kOta";
		System.out.println(flipCase(slowo));
		
	}
	
	public static String flipCase(String text) {
		
		char[] tab = new char[text.length()];
		
		for (int i=0; i<text.length(); i++) {
			tab[i]=text.charAt(i);
		}
		
		for (int i=0; i<text.length(); i++) {
			
			if (text.charAt(i)>64 && text.charAt(i)<91) {
			tab[i]=(char) (tab[i]+32);
			}
			
			else if (text.charAt(i)>96 && text.charAt(i)<123) {
			tab[i]=(char) (tab[i]-32);	
			}
			
		}
		String duze = new String(tab);
		return duze;
	}

}
