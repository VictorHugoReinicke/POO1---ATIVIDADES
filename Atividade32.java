import java.util.Scanner;

public class Atividade32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tipos de carne:");
        System.out.println("1 - Filé Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        System.out.print("Escolha o tipo de carne (1, 2 ou 3): ");
        int tipo = input.nextInt();

        System.out.print("Quantidade em Kg: ");
        double quantidade = input.nextDouble();

        System.out.println("Tipo de pagamento:");
        System.out.println("1 - Cartão Tabajara (5% de desconto)");
        System.out.println("2 - Outro");
        System.out.print("Escolha o tipo de pagamento (1 ou 2): ");
        int pagamento = input.nextInt();

        double precoPorKg = 0;
        String nomeCarne = "";

        if (tipo == 1) {
            nomeCarne = "Filé Duplo";
            if (quantidade <= 5) {
                precoPorKg = 4.90;
            } else {
                precoPorKg = 5.80;
            }
        } else if (tipo == 2) {
            nomeCarne = "Alcatra";
            if (quantidade <= 5) {
                precoPorKg = 5.90;
            } else {
                precoPorKg = 6.80;
            }
        } else if (tipo == 3) {
            nomeCarne = "Picanha";
            if (quantidade <= 5) {
                precoPorKg = 6.90;
            } else {
                precoPorKg = 7.80;
            }
        } else {
            System.out.println("Tipo de carne inválido!");
            input.close();
            return;
        }

        double precoTotal = precoPorKg * quantidade;
        double desconto = 0;

        if (pagamento == 1) {
            desconto = precoTotal * 0.05;
        } else if (pagamento != 2) {
            System.out.println("Tipo de pagamento inválido!");
            input.close();
            return;
        }

        double valorPagar = precoTotal - desconto;

        System.out.println("\n----- CUPOM FISCAL -----");
        System.out.println("Tipo de carne: " + nomeCarne);
        System.out.printf("Quantidade: %.2f Kg%n", quantidade);
        System.out.printf("Preço total: R$ %.2f%n", precoTotal);
        System.out.println("Tipo de pagamento: " + (pagamento == 1 ? "Cartão Tabajara" : "Outro"));
        System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor a pagar: R$ %.2f%n", valorPagar);

        input.close();
    }
}
