package EstruturaSequencial;

import java.util.Scanner;

public class Exe02 {
	
	//02. Faça um programa que peça um número e então mostre a mensagem "O número informado foi [número]".

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("Digite um número: ");
		num = input.nextInt();
		
		System.out.println("\nO número informado foi " + num);
		input.close();
	}

}