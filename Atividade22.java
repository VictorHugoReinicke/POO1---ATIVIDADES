import java.util.Scanner;
public class Atividade22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número menor que 1000");
		int num = input.nextInt();
		int unidade = 0;
		int dezena = 0;
		int centena = 0;
		
		input.close();
		
		if(num >=1000) 
			System.out.println("Não é válido");
		else
		{
			centena = num / 100;
            dezena = (num % 100) / 10;
            unidade = num % 10;
			
		}
			System.out.println("Centena: " + centena);
			System.out.println("Dezena: " + dezena);
			System.out.println("Unidade: " + unidade);
	}

}
