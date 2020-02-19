package EstruturaSequencial;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe05 {
	
	// 05. Faça um Programa que converta metros para centímetros.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double metros, cms;
		
		System.out.print("Digite o valor de metros: ");
		metros = input.nextDouble();
		
		cms = metros * 100;
		
		System.out.println(df.format(metros) + " metros é igual a " + df.format(cms) + " centímetros.");
		input.close();
	}
}