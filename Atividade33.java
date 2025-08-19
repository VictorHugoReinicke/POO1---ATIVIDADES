import java.util.Scanner;

public class Atividade33 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Valor da dívida:");
        double valorDividaInicial = input.nextDouble();

        System.out.println("Tabela de Pagamento");
        System.out.println("----------------------------------------------------------");
        System.out.println("Valor da Dívida   Juros   Parcelas   Valor da Parcela");
        System.out.println("----------------------------------------------------------");

        int[] parcelas = {1, 3, 6, 9, 12};
        double[] juros = {0.0, 0.10, 0.15, 0.20, 0.25};

        for (int i = 0; i < parcelas.length; i++) {
            double valorJuros = valorDividaInicial * juros[i];
            double valorTotalComJuros = valorDividaInicial + valorJuros;
            double valorParcela = valorTotalComJuros / parcelas[i];

            System.out.println(valorTotalComJuros + "   " + valorJuros + "   " + parcelas[i] + "   " + valorParcela);
        }

        input.close();
    }
}