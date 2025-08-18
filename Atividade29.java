import java.util.Scanner;
public class Atividade29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Escolha uma tabuada");
		int tab = input.nextInt();
		
		System.out.println("Escolha um número inicial");
		int n1 = input.nextInt();
		
		System.out.println("Escolha um número final");
		int n2 = input.nextInt();
		int recebe =0;
		
		input.close();
		
		
		if(n1 > n2) {
			System.out.println("Número inicial maior que o segundo, invertendo valores");
			recebe = n1;
			n1 = n2;
			n2 = recebe;
		}
		for(int x = n1; x <=n2;x++) {
			System.out.println("Tabuada de "+ tab + " Iniciando em " + x +" Finalizando em "+ n2 + " = "+ x*tab);
		}

	}

}
