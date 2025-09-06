import java.util.Scanner;

public class Atividade2Main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		Atividade2 atv = new Atividade2();

		System.out.println("Digite o valor inicial");
		atv.setValor_inicio(inp.nextInt());

		System.out.println("Digite o valor final");
		atv.setValor_final(inp.nextInt());

		atv.apresentacao(atv.getValor_inicio(), atv.getValor_final());

		inp.close();
	}

}
