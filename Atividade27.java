import java.util.Scanner;
public class Atividade27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int fim=1;
		int i =1;
		float total =0;
		
		while(fim != 0) {
		System.out.println("Produto "+i+" : ");
		float preco = input.nextFloat();
		total += preco;
		i++;
		if(preco == 0) {
			System.out.println("Total " + total);
			fim =0;
		}
	}
		System.out.println("Valor a pagar");
		float valor = input.nextFloat();
		
		if(( valor - total) != 0) {
		
		System.out.println("Valor do troco " + (valor - total));
		}
		
		
		input.close();
	}

}
