import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		// Variáveis
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println(y);
		System.out.println(x);
		
		// Delimitando duas casas decimais
		// "%.2f" indica 2 casas decimais e "%n" indica quebra de linha
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println("Bom dia!");
		
		//Configurando a localização padrão do computador
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		//Concatenação
		System.out.println("Resultado = " + x + " metros");
		
		//Interpolação
		System.out.printf("Resultado = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda);
		
	}

}
