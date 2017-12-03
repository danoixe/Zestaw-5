
public class Zadanie_5_15 {

	public static void main(String[] args) {
		for (int i=0; i<3; i++) {
		System.out.print( HTMLColor2RGB("#FF0050")[i]+" ");
		}
		
	}
	
	public static int [] HTMLColor2RGB(String color) {
	    
	           int x = Integer.valueOf( color.substring( 1, 3 ), 16 );
	           int y = Integer.valueOf( color.substring( 3, 5 ), 16 );
	           int z = Integer.valueOf( color.substring( 5, 7 ), 16 );
	           int[] tab = {x, y, z};       
	           
	           return tab;
	            
	}

}
