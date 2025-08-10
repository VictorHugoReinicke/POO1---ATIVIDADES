import java.util.Scanner;
public class Atividade8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nota1");
		float nota1 = input.nextFloat();
		System.out.println("Nota2");
		float nota2 = input.nextFloat();
		String passou = "reprovado";
		float media = (nota1+nota2)/2;
		
		if(media >=7)
			passou = "aprovado";
		
		input.close();
		System.out.println("O aluno está "+ passou);
	}

}
