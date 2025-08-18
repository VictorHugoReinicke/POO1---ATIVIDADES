import java.util.Scanner;
public class Atividade28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int parada = 1;
		double maior = 0;
		double menor =0;
		double media =0;
		int i = 0;
		
		while(parada != 0) {
			
			System.out.println("Digite a temperatura");
			double temp = input.nextDouble();
			media += temp;
			
			if(i == 0) {
				menor = temp;
				maior = temp;
				
			}
			if(temp > maior)
				maior = temp;
			if(temp < menor)
				menor = temp;
			i++;
			System.out.println("Quer continuar?");
			parada = input.nextInt();			
			
		}
		input.close();
		System.out.println("Menor "+ menor );
		System.out.println("Maior "+ maior);
		System.out.println("Média "+ (media/i));
		
	}

}
