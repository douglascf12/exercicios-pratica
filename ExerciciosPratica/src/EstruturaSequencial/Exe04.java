package EstruturaSequencial;
import java.util.Scanner;

public class Exe04 {
	
	// 04. Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nota1, nota2, nota3, nota4;
		
		System.out.print("Digite a nota 1: ");
		nota1 = input.nextInt();
		System.out.print("Digite a nota 2: ");
		nota2 = input.nextInt();
		System.out.print("Digite a nota 3: ");
		nota3 = input.nextInt();
		System.out.print("Digite a nota 4: ");
		nota4 = input.nextInt();
		
		System.out.println("\nA m�dia foi: " + ((nota1 + nota2 + nota3 + nota4)/4));
		input.close();
	}
}