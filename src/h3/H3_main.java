package h3;

public class H3_main {

	public static void main(String[] args) {
		
		
		int max = 77;
		int fix = 50;
		int wartend = 25;
		
		while (fix < max && wartend > 0) {
			fix++; wartend-- ;
		}
		
		boolean istVoll = (fix == max);
		
		
		System.out.println("fix:" + fix);
		System.out.println("wartend:" + wartend);
		System.out.println("istVoll:" + istVoll);
		
		
	}
}
