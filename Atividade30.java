import java.util.Scanner;

public class Atividade30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double precoAlcool = 1.90;
        double precoGasolina = 2.50;

        System.out.print("Digite o tipo de combustível (A - Álcool, G - Gasolina): ");
        String tipo = input.next().toUpperCase();

        System.out.print("Digite a quantidade de litros: ");
        double litros = input.nextDouble();

        input.close();
        
        double precoLitro = 0;
        double desconto = 0;

        if (tipo.equals("A")) {
            precoLitro = precoAlcool;
            if (litros <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
        } else if (tipo.equals("G")) {
            precoLitro = precoGasolina;
            if (litros <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
        } else {
            System.out.println("Tipo de combustível inválido!");
            return;
        }

        double valorBruto = litros * precoLitro;
        double valorDesconto = valorBruto * desconto;
        double valorFinal = valorBruto - valorDesconto;

        System.out.println("Valor a pagar: R$"+ valorFinal);
    }
}
