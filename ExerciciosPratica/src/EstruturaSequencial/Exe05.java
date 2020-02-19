package EstruturaSequencial;
import java.util.Scanner;

public class Exe05 {
	
	// 05. Faça um Programa que converta metros para centímetros.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double metros, cms;
		
		System.out.print("Digite o valor de metros: ");
		metros = input.nextDouble();
		
		cms = metros * 100;
		
		System.out.println(metros + " metros é igual a " + cms + " centímetros.");
		input.close();
	}
}