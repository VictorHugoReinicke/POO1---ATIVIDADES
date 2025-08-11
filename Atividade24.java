import java.util.Scanner;
public class Atividade24 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		float n1 = input.nextFloat();
		System.out.println("Digite a segunda nota");
		float n2 = input.nextFloat();
		System.out.println("Digite a terceira nota");
		float n3 = input.nextFloat();
		
		String mensagem = "";
		float media = (n1+n2+n3)/3;
				
		input.close();
		
		if(media == 10)
			mensagem = "Aprovado com distinção";
		else if(media >= 7)
			mensagem = "Aprovado";
		else
			mensagem = "Reprovado";
		
		System.out.println(mensagem);
		
	}

}
