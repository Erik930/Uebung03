package p1;

public class P1_main {

	public static void main(String[] args) {
		
		int wuerfel = 1;
		
		if(wuerfel == 1 || wuerfel == 4) {
			System.out.println("Gewonen!");
		} else if(wuerfel == 2) {
			System.out.println("Verloren!");
		} else if(wuerfel == 5) {
			System.out.println("Unenetschieden!");
		} else if(wuerfel == 3 || wuerfel ==6) {
			System.out.println("Es konnte keine Aussage getroffen werden");
		} else if(wuerfel > 6 || wuerfel < 1) {
			System.out.println("Bitte definiere int wuerfel als Zahl zwischen 1 und 6");
		}
		
		
	}
	
}
