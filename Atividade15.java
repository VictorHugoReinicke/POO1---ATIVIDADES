import java.util.Scanner;
public class Atividade15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("m²");
		double m = input.nextDouble();
		
		double cobPLata = 18 * 3;
		int latasNece = (int)Math.ceil(m/cobPLata);
		
		input.close();
		System.out.println("Quantidade de latas: "+ latasNece);
		System.out.println("Preço total:" + (80 * latasNece));
		
		
	}

}
