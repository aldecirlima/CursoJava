
public class While2 {

	public static void main(String[] args) {
		int x = 0;
		int y = 4;
		
		System.out.println("Para y = y + 2, x = x + 1");
		while (x < 5) {
			y += 2;
			x += 1;
			System.out.printf("x = %d, y = %d%n", x, y);
		}

	}

}
