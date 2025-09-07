import java.util.Scanner;

public class Atividade5Main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		double totalGeral = 0;

		do {
			System.out.println("Digite o código do item (ou 0 para encerrar): ");
			int codigoItem = inp.nextInt();

			if (codigoItem == 0) {
				break;
			}

			if (codigoItem < 100 || codigoItem > 105) {
				System.out.println("Código de item inválido. Por favor, digite um código válido do cardápio.");
				continue;
			}

			System.out.print("Digite a quantidade desejada: ");
			int quantidade = inp.nextInt();

			Atividade5 atv = new Atividade5();
			atv.setItem(codigoItem);
			atv.setQnt(quantidade);

			atv.apresentacao();

			totalGeral += atv.valor();

		} while (true);

		System.out.println("\n--- Resumo do Pedido ---");
		System.out.printf("Total a ser pago: R$ %.2f\n", totalGeral);
		System.out.println("Obrigado(a) por sua preferência!");

		inp.close();
	}

}