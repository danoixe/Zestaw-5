
public class Zadanie_5_12 {

	public static void main(String[] args) {
		String[] zadania = {"mam7la", " mama ", "+12", "0001", "991-234-3", "-12e5", "-12e-5", "+zonmakm", "ax2", "amakotma"};
		String fraza = "ma";
		int a=0, c=0, d=0; String b="";
		for (int i=0; i<zadania.length; i++) {
			a = a + strToInt(zadania[i]);		
			b = b.concat(strToStr(zadania[i]));
			c = c + strFindAndCount(zadania[i], fraza);
		}
	d = strFindAndCount(b, fraza);
	System.out.println(a);	
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println((float) c/d);
		
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
	
	public static String strToStr(String str) {
		int i=0, i2=0, i1=0;
		String t = "";
		if (str.charAt(0)=='-') {
			i++;
		}
		while (i<str.length()) {
			i1=i;
			while (i<str.length() && (str.charAt(i)<48 || str.charAt(i)>57)) {
				if ((str.charAt(i)=='-' || str.charAt(i)=='+' || str.charAt(i)==101) && (str.charAt(i+1)>47 && str.charAt(i+1)<58)) {
					i++;
				}
				else {
					i++;
					i2=i;
				}
				
			}
			if(i2>=i1) {
				t = t.concat(str.substring(i1, i2));
				}
			while (i<str.length() && str.charAt(i)>47 && str.charAt(i)<58) {
				i++;
			}
	}
		return t;
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
