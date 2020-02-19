package EstruturaSequencial;
import java.util.Scanner;

public class Exe03 {
	
	// 03. Faça um programa que peça dois números e imprima a soma.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("Digite o primeiro número: ");
		n1 = input.nextInt();
		
		System.out.print("Digite o segundo número: ");
		n2 = input.nextInt();
		
		System.out.println("\nA soma dos números é: " + (n1 + n2));
	}
}