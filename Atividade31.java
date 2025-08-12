import java.util.Scanner;

public class Atividade31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double precoMorango, precoMaca, totalKg, totalPreco;

        System.out.print("Quantidade de morangos (Kg): ");
        double kgMorango = input.nextDouble();

        System.out.print("Quantidade de maçãs (Kg): ");
        double kgMaca = input.nextDouble();
        input.close();
        if (kgMorango <= 5) {
            precoMorango = 2.50;
        } else {
            precoMorango = 2.20;
        }

        if (kgMaca <= 5) {
            precoMaca = 1.80;
        } else {
            precoMaca = 1.50;
        }

        double valorMorango = kgMorango * precoMorango;
        double valorMaca = kgMaca * precoMaca;

        totalKg = kgMorango + kgMaca;
        totalPreco = valorMorango + valorMaca;

        if (totalKg > 8 || totalPreco > 25.00) {
            totalPreco = totalPreco - (totalPreco * 0.10);
        }

        System.out.printf("Valor a pagar: R$ %.2f\n", totalPreco);
        
        
    }
}
