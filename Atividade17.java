import java.util.Scanner;
public class Atividade17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
	        double n1 = input.nextDouble();

	        System.out.print("Digite a segunda nota: ");
	        double n2 = input.nextDouble();
	       
	        double media = (n1 + n2) / 2;

	        char conceito;
	        String situacao;

	        if (media >= 9.0 && media <= 10.0) {
	            conceito = 'A';
	            situacao = "APROVADO";
	        } else if (media >= 7.5 && media < 9.0) {
	            conceito = 'B';
	            situacao = "APROVADO";
	        } else if (media >= 6.0 && media < 7.5) {
	            conceito = 'C';
	            situacao = "APROVADO";
	        } else if (media >= 4.0 && media < 6.0) {
	            conceito = 'D';
	            situacao = "REPROVADO";
	        } else {
	            conceito = 'E';
	            situacao = "REPROVADO";
	        }

	        input.close();
	        
	        System.out.println("Nota 1: " + n1);
	        System.out.println("Nota 2: "+ n2);
	        System.out.println("Média: "+ media);
	        System.out.println("Conceito: " + conceito);
	        System.out.println("Situação: " + situacao);

	}

}
