package EstruturaSequencial;

import java.util.Scanner;

public class Exe02 {
	
	//02. Fa�a um programa que pe�a um n�mero e ent�o mostre a mensagem "O n�mero informado foi [n�mero]".

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("Digite um n�mero: ");
		num = input.nextInt();
		
		System.out.println("\nO n�mero informado foi " + num);
		input.close();
	}

}