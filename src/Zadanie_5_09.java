
public class Zadanie_5_09 {

	public static void main(String[] args) {
		String x = "i     kk       ";
		for (int i=0; i<podzielNaSlowa(x).length; i++) {
		System.out.print(podzielNaSlowa(x)[i]+" ");
		}
	}
	
	public static String[] podzielNaSlowa(String tekst) {
		
		int k=0, i=0;
		while (i<tekst.length()) {
			
			while (i<tekst.length() && Character.isWhitespace(tekst.charAt(i))==true){
				i++;			
			}
			if (i<tekst.length() && Character.isWhitespace(tekst.charAt(i))==false) {
			while (i<tekst.length() && Character.isWhitespace(tekst.charAt(i))==false){
				i++;
			}
			k++;
			}
			
		}

		String[] tab = new String[k];
		i=0;
		int j=0;
		while (i<tekst.length()) {
			k=0;
			while (i<tekst.length() && Character.isWhitespace(tekst.charAt(i))==true){
				i++;			
			}
			if (i<tekst.length() && Character.isWhitespace(tekst.charAt(i))==false) {
				int i1=i;
			while (i<tekst.length() && Character.isWhitespace(tekst.charAt(i))==false){
			
				i++;
				k++;			
			}
				int i2=i;
				tab[j] = tekst.substring(i1, i2);
				j++;
			
			}
			
		}
		
		return tab;
		
	}

}
