import java.util.Scanner;
public class Zadanie_5_01 {

	public static void main(String[] args) {
		Scanner czyt = new Scanner(System.in);
		int x= czyt.nextInt();
		System.out.println("Iteracyjnie: "+silniai(x));
		System.out.println("Rekurencyjnie: "+silniar(x));
	}
	
	public static int silniai(int n) {
		if (n<=1) {
			return 1;
		}
		int m=1;
		while (n>0) {
			m*=n;
			n--;
		}
		return m;
	}
	
	public static int silniar(int k) {
		int l;
		if (k<=1) {
			return 1;
		}
		 
		l=k*silniar(k-1);
		return l;
	}

}
