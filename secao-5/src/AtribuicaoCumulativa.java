import java.util.Locale;
import java.util.Scanner;

public class AtribuicaoCumulativa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutes = sc.nextInt();
		
		double account = 50.0;
		if (minutes > 100) {
			// Atribuir cumulativamente com "+=", "-=", etc.
			account += (minutes - 100) * 2.0;
		}
		System.out.printf("Valor da conta: R$ %.2f.%n", account);
		sc.close();
	}

}
