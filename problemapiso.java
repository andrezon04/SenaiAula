package aulas;

	import java.util.Scanner;

	public class problemapiso {
	    public static void main(String[] args) {
	        // Criando o objeto Scanner para ler os dados do usuário
	        Scanner scanner = new Scanner(System.in);

	        // Solicita as dimensões do cômodo
	        System.out.print("Informe a largura do cômodo (em metros): ");
	        double largura = scanner.nextDouble();

	        System.out.print("Informe o comprimento do cômodo (em metros): ");
	        double comprimento = scanner.nextDouble();

	        // Solicita o valor do metro quadrado do piso
	        System.out.print("Informe o valor do metro quadrado do piso (em R$): ");
	        double valorMetroQuadrado = scanner.nextDouble();

	        // Calculando a área total do cômodo
	        double areaTotal = largura * comprimento;

	        // Calculando o custo total para cobrir o piso
	        double custoTotal = areaTotal * valorMetroQuadrado;

	        // Exibindo os resultados com 2 casas decimais
	        System.out.printf("Área total do cômodo: %.2f m²%n", areaTotal);
	        System.out.printf("Custo total para cobrir o piso: R$ %.2f%n", custoTotal);

	        // Fechar o scanner
	        scanner.close();
	    }
	}

