package EstruturaSequencial;
import java.util.Scanner;

public class Exe03 {
	
	// 03. Fa�a um programa que pe�a dois n�meros e imprima a soma.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("Digite o primeiro n�mero: ");
		n1 = input.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		n2 = input.nextInt();
		
		System.out.println("\nA soma dos n�meros �: " + (n1 + n2));
	}
}