package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu antepen�ltimo sal�rio: ");
		String valor1 = entrada.next().replace(",", ".");
		
		System.out.print("Digite o seu pen�ltimo sal�rio: ");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.print("Digite o seu �ltimo sal�rio: ");
		String valor3 = entrada.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.printf("A m�dia do seu sal�rio �: %.2f", media);
		
		entrada.close();
		
	}
}
