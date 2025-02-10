package aulas;

import java.util.Scanner;

public class problemaalturamedia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Diga o nome da Pessoa 1: ");
		String nome = scanner.nextLine();
		
		System.out.print("Diga a altura da Pessoa 1: ");
		double altura = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.print("Diga o nome da Pessoa 2: ");
		String nome2 = scanner.nextLine();
		
		System.out.print("Diga a altura de" + nome2);
		double altura2 = scanner.nextDouble();
		
		double alturamedia  = (altura + altura2 /2);
		
		System.out.printf("A altura média entre %s e %s é: %.1f metros%n", nome, nome2, alturamedia);
	}

}
