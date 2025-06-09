package aulas;

	import java.util.Scanner;

	public class problemapiso {
	    public static void main(String[] args) {
	       
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Diga a largura do cômodo: ");
	        double larg = sc.nextDouble();
	        System.out.print("Diga o comprimento do cômodo: ");
	        double comp = sc.nextDouble();
	        System.out.print("Diga o valor do metro quadrado do piso (em R$): ");
	        double valor = sc.nextDouble();

	        double area = largura * comprimento;
	        double custo = areaTotal * valorMetroQuadrado;
		    
	        System.out.printf("Área total do cômodo: %.2f m²%n", areaTotal);
	        System.out.printf("Custo total para cobrir o piso: R$ %.2f%n", custoTotal);

	           sc.close();
	    }
	}

