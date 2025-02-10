package aulas;

import java.util.Scanner;

public class aula1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x, y, divisao;
		System.out.print("Digite o primeiro número");
		x = sc.nextDouble();
		System.out.print("Digite o segundo número");
		y = sc.nextDouble();
		divisao = (x/y);
		System.out.println("O resutltado da divisão é" + divisao);
		sc.close();

	}

}
