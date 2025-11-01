package h1;

public class H1_main {

	public static void main(String[] args) {

		
		double guthaben = 100;
		double monEingang = 180;
		int rating = 3;
		boolean negativ = (guthaben < 0);
		double betragvonguthaben = Math.abs(guthaben);
		
		 if (guthaben > 0) {
			rating += 3;
		} else if (guthaben == 0) {
			rating += 2;
		} else if (guthaben < 0 && monEingang >= guthaben) {
			rating += 1;
		} else if (guthaben < 0 && monEingang < guthaben) {
			rating -= 1;
		}
		boolean warnhinweis = (guthaben < 0 && monEingang < betragvonguthaben && rating < 0);
		
		
		System.out.println("rating: " + rating);
		System.out.println("warnhinweis: " + warnhinweis);
		System.out.println("negativ: " + negativ);
		
	}
}
