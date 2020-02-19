package EstruturaSequencial;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe06 {
	
	//06. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int raio;
		double area;
		
		System.out.print("Digite o valor do raio: ");
		raio = input.nextInt();
		
		area = 3.14 * (raio*2);
		
		System.out.println("A área do círculo é: " + df.format(area));
		input.close();
	}
}