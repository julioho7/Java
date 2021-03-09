package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu antepenúltimo salário: ");
		String valor1 = entrada.next().replace(",", ".");
		
		System.out.print("Digite o seu penúltimo salário: ");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.print("Digite o seu último salário: ");
		String valor3 = entrada.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.printf("A média do seu salário é: %.2f", media);
		
		entrada.close();
		
	}
}
