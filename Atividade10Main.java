import java.util.Scanner;
public class Atividade10Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
        Atividade10 bomba = new Atividade10();

        System.out.println("--- Configurar Bomba de Combustível ---");
        System.out.print("Tipo do combustível: ");
        bomba.setTipoCombustivel(inp.nextLine());

        System.out.print("Valor do litro: ");
        bomba.setValorLitro(inp.nextDouble());

        System.out.print("Quantidade inicial de combustível na bomba: ");
        bomba.setQuantidadeCombustivel(inp.nextDouble());

        System.out.println("\nBomba configurada. Estado inicial:");
        System.out.println("Tipo: " + bomba.getTipoCombustivel());
        System.out.printf("Valor: R$ %.2f\n", bomba.getValorLitro());
        System.out.printf("Quantidade: %.2f litros\n", bomba.getQuantidadeCombustivel());

        int opcao;
        do {
            System.out.println("\n--- Menu da Bomba ---");
            System.out.println("1. Abastecer por Valor");
            System.out.println("2. Abastecer por Litro");
            System.out.println("3. Alterar Valor do Litro");
            System.out.println("4. Alterar Tipo do Combustível");
            System.out.println("5. Alterar Quantidade na Bomba");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = inp.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor a ser abastecido: R$ ");
                    double valor = inp.nextDouble();
                    bomba.abastecerPorValor(valor);
                    break;
                case 2:
                    System.out.print("Quantidade em litros: ");
                    double litros = inp.nextDouble();
                    bomba.abastecerPorLitro(litros);
                    break;
                case 3:
                    System.out.print("Novo valor do litro: R$ ");
                    double novoValor = inp.nextDouble();
                    bomba.alterarValor(novoValor);
                    break;
                case 4:
                    inp.nextLine();
                    System.out.print("Novo tipo de combustível: ");
                    String novoTipo = inp.nextLine();
                    bomba.alterarCombustivel(novoTipo);
                    break;
                case 5:
                    System.out.print("Nova quantidade de combustível: ");
                    double novaQuantidade = inp.nextDouble();
                    bomba.alterarQuantidadeCombustivel(novaQuantidade);
                    break;
                case 0:
                    System.out.println("Encerrando o sistema.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        inp.close();
    }
}