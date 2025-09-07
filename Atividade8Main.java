import java.util.Scanner;

public class Atividade8Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Atividade8 atv = new Atividade8();

		System.out.println("Para começar, crie sua conta:");
		System.out.print("Digite o número da conta: ");
		atv.setNumeroConta(scanner.nextInt());
		scanner.nextLine();

		System.out.print("Digite o seu nome: ");
		atv.setNome(scanner.nextLine());

		System.out.print("Digite o saldo inicial: ");
		atv.setSaldo(scanner.nextDouble());

		System.out.println("Conta criada com sucesso!");

		int opcao;
		do {
			System.out.println("\n--- Menu de Opções ---");
			System.out.println("1. Depositar");
			System.out.println("2. Sacar");
			System.out.println("3. Alterar Nome");
			System.out.println("4. Exibir Saldo");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite o valor para depósito: R$ ");
				atv.depositar(scanner.nextDouble());
				break;
			case 2:
				System.out.print("Digite o valor para saque: R$ ");
				atv.sacar(scanner.nextDouble());
				break;
			case 3:
				scanner.nextLine();
				System.out.print("Digite o novo nome: ");
				atv.alterarNome(scanner.nextLine());
				break;
			case 4:
				atv.exibirSaldo();
				break;
			case 0:
				System.out.println("Obrigado por usar nosso sistema bancário. Até mais!");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao != 0);

		scanner.close();
	}
}