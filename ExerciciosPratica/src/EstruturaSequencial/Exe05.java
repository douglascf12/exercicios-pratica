package EstruturaSequencial;
import java.util.Scanner;

public class Exe05 {
	
	// 05. Fa�a um Programa que converta metros para cent�metros.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double metros, cms;
		
		System.out.print("Digite o valor de metros: ");
		metros = input.nextDouble();
		
		cms = metros * 100;
		
		System.out.println(metros + " metros � igual a " + cms + " cent�metros.");
		input.close();
	}
}