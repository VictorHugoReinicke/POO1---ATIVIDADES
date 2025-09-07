import java.util.Scanner;

public class Atividade4Main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		Atividade4 atv = new Atividade4();

		System.out.println("Digite o valor inicial");
		atv.setSalario(inp.nextInt());

		System.out.println("Digite o valor final");
		atv.setHoras(inp.nextInt());

		atv.apresentacao();

		inp.close();
	}

}
