
public class Exemplos {

	public static void main(String[] args) {
		
		// EXEMPLO 3
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		
		// Fim exemplo 3
		
		
		// EXEMPLO 4
		int a4, b4;
		double resultado4;
		
		a4 = 5;
		b4 = 2;
		
		// Erro 2.5 vira 2.0 se divisão for de inteiros
		// resultado4 = a4 / b4;
		
		// Para corrigir...
		resultado4 = (double) a4 / b4; // Resultado 2.5, correto.
		System.out.println(resultado4);
		
		// Fim exemplo 4
		
		
		// EXEMPLO 5	
		double a5;
		int b5;
		
		a5 = 5.0;
		b5 = (int) a5;
		
		System.out.println(b5);
		
		// Fim exemplo 5
	}

}
