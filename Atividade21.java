import java.util.Scanner;
public class Atividade21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o número de pessoas");
		int num = input.nextInt();
		int medidade = 0;
		int cont =0;
		
		for(int i =0; i<num;i++) {
			System.out.println("Digite a idade");
			int idade = input.nextInt();
			cont += idade;
		}
		input.close();
		medidade = cont/num;
		if(medidade >=0 && medidade <=25)
			System.out.println("Jovem");
		else if(medidade >=26 && medidade <=60)
			System.out.println("Adulta");
		else if(medidade >60)
			System.out.println("Idosa");	
	}

}
