import java.util.Scanner;

public class Atividade7Main {

	public static void main(String[] args) {

		Atividade7 pessoa = new Atividade7();
		Scanner inp = new Scanner(System.in);

		System.out.println("Digite o nome");
		pessoa.setNome(inp.nextLine());
		
		System.out.println("Digite a idade");
		pessoa.setIdade(inp.nextInt());
		
		System.out.println("Digite seu peso");
		pessoa.setPeso(inp.nextFloat());
		
		System.out.println("Digite a altura");
		pessoa.setAltura(inp.nextFloat());

		System.out.println("--- Dados Iniciais ---");
		pessoa.apresentacao();

		System.out.println("Envelhecendo 3anos");
		pessoa.envelhecer();
		pessoa.envelhecer();
		pessoa.envelhecer();

		System.out.println("Engordando 2 kg");
		pessoa.engordar(2.0);

		System.out.println("Emagrecendo 1 kg");
		pessoa.emagrecer(1.0);

		System.out.println("--- Dados Finais ---");
		pessoa.apresentacao();
		
		inp.close();
	}
}