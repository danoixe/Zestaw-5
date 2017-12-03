import java.util.Scanner;
public class Zadanie_5_02 {

	public static void main(String[] args) {
		Scanner czyt = new Scanner(System.in);
		int x= czyt.nextInt();
		System.out.println("Iteracyjnie: "+ciagi(x));
		System.out.println("Rekurencyjnie: "+ciagr(x));
		
	}
	
	public static int ciagi(int n) {
		int n1=1, n2=1, m=1;
		
		if (n<=2) {
			return 1;
		}
		
		while(n>2) {
			m=n1+n2;
			n1=n2;
			n2=m;
			n--;
		}
		return m;
	}
	
	public static int ciagr(int k) {
		int l;
		if (k<=2) {
			return 1;
		}
		l = ciagr(k-1) + ciagr(k-2);
		
		return l;
	}

}
