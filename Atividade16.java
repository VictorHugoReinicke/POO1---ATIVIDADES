import java.util.Scanner;
public class Atividade16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nota1");
		float nota1 = input.nextFloat();
		System.out.println("Nota2");
		float nota2 = input.nextFloat();
		String situacao = "valores inválidos";
		float media = (nota1+nota2)/2;
		
		if(media >=0 && media<3)
			situacao = "reprovado";
		else if (media >=3 && media <=6.9)
			situacao = "Em exame";
		else if (media >=7 && media <= 10)
			situacao = "aprovado";
		
		input.close();
		System.out.println("O aluno está "+ situacao);
	}

}
