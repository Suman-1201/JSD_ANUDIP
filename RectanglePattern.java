package JSD.related.examples;

public class RectanglePattern {
	void Pattern() {
		int rows = 8;
		int cols = 6;
		{
			for (int i = 1; i <= rows; i++) {
				for (int j = 1; j <= cols; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}

	public static void main(String args[]) {

		RectanglePattern p = new RectanglePattern();
		p.Pattern();
	}
}