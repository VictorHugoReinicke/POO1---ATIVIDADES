import java.util.Scanner;

public class Atividade3Main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		Atividade3 atv = new Atividade3();

		System.out.println("Digite o valor inicial");
		atv.setValor1(inp.nextInt());

		System.out.println("Digite o valor final");
		atv.setValor2(inp.nextInt());

		atv.apresentacao(atv.getValor1(), atv.getValor2());

		inp.close();
	}

}
