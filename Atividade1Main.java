import java.util.Scanner;

public class Atividade1Main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		Atividade1 atv = new Atividade1();

		System.out.println("Digite seu nome");
		atv.setNome(inp.nextLine());

		inp.nextLine();
		System.out.println("Digite seu sobrenome");
		atv.setSobrenome(inp.nextLine());

		atv.apresentacao(atv.getNome(), atv.getSobrenome());
		
		inp.close();
	}

}
