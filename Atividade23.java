import java.util.Scanner;
public class Atividade23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a primeira idade");
		int i1 = input.nextInt();
		System.out.println("Digite a primeira idade");
		int i2 = input.nextInt();
		System.out.println("Digite a primeira idade");
		int i3 = input.nextInt();
		input.close();
		int media = (i1+i2+i3)/3;
		String mensagem = "";
		
		if(media < 25)
			mensagem = "Turma jovem";
		else if(media >=25 && media <= 40)
			mensagem = "Turma adulta";
		else
			mensagem = "Turma idosa";
		
		System.out.println(mensagem);
		
		
	}

}
