
public class Zadanie_5_14 {

	public static void main(String[] args) {
		System.out.println(czyAnagram("kolej", "olejk"));
		System.out.println(czyAnagram("kolej", "kole"));
		System.out.println(czyAnagram("kolej", "K O L E J"));
		System.out.println(czyAnagram("Gregory House", "Huge ego, sorry"));

	}
	
	public static boolean czyAnagram(String t1, String t2) {
		int x1=0, x2=0;
		t1 = t1.toLowerCase();
		t2 = t2.toLowerCase();
		boolean czy = false;
		for (int i=0; i<t1.length(); i++) {
			if ((t1.charAt(i)>=65 && t1.charAt(i)<=90) || (t1.charAt(i)>=97 && t1.charAt(i)<=122)) {
				x1++;
				for(int j=0; j<t2.length(); j++) {
					if (t1.charAt(i)==t2.charAt(j)) {
						czy = true;
						break;
					}
				}
				if (czy == false) {
					break;
				}
			}
		}
		
		for (int i=0; i<t2.length(); i++) {
			if ((t2.charAt(i)>=65 && t2.charAt(i)<=90) || (t2.charAt(i)>=97 && t2.charAt(i)<=122)) {
				x2++;
			}
		}
		
		if (x1!=x2) {
			czy = false;
		}
		
		return czy;
		
	}

}
