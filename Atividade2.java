import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Valor");
		float num1 = input.nextFloat();
		String polaridade = "";
		
		if(num1 > 0)
			polaridade = "positivo";
		else if(num1 < 0 )
			polaridade = "negativo";
		else
			polaridade = "zero";
		
		
		input.close();
		System.out.println("O número é "+ polaridade);
	}

}
