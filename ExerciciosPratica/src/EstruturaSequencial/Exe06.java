package EstruturaSequencial;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe06 {
	
	//06. Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int raio;
		double area;
		
		System.out.print("Digite o valor do raio: ");
		raio = input.nextInt();
		
		area = 3.14 * (raio*2);
		
		System.out.println("A �rea do c�rculo �: " + df.format(area));
		input.close();
	}
}