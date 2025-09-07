import java.util.Scanner;

public class Atividade6Main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		Atividade6 atv = new Atividade6();
		
		System.out.println("Digite o valor");
		atv.setLado(inp.nextInt());
		
		System.out.println(atv.getLado());
		
		System.out.println(atv.area());
		
		System.out.println("Digite o valor de troca");
		atv.setLado(inp.nextInt());
		
		System.out.println(atv.getLado());
		System.out.println(atv.area());
		inp.close();
		
	}

}
