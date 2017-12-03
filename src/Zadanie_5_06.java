
public class Zadanie_5_06 {

	public static void main(String[] args) {
		String x = "-12e-2";
		System.out.println(strToInt(x));

	}
	
	public static int strToInt(String str) {
		
		int a=0, b=0, i=0, c=10;
		if (str.charAt(0)==45 || str.charAt(0)==43) {
			i++;
		}
		
		while (i<str.length() && str.charAt(i)>47 && str.charAt(i)<58){
			a*=10;
			a+=str.charAt(i)-'0';
			i++;
		}
		
		if (str.charAt(0)==45) {
			a=-a;			
		}
		
		// e
			if (i< str.length() && str.charAt(i)==101 && str.charAt(i+1)!='-') {
				i++;
				while (i< str.length() && str.charAt(i)>47 && str.charAt(i)<58){
					b*=10;
					b+=str.charAt(i)-'0';
					i++;
				}
			for (int j=1; j<b; j++) {
				c*=10;
			}
			a = a*c;
			}

		return a;
		
	}

}
