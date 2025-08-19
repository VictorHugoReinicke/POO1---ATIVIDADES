import java.util.Scanner;

public class Atividade34 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count1 = 0; // [0-25]
        int count2 = 0; // [26-50]
        int count3 = 0; // [51-75]
        int count4 = 0; // [76-100]

        System.out.println("Digite números positivos (um número negativo encerra):");

        int numero;
        do {
            System.out.print("Número: ");
            numero = input.nextInt();

            if (numero >= 0) {
                if (numero >= 0 && numero <= 25) {
                    count1++;
                } else if (numero >= 26 && numero <= 50) {
                    count2++;
                } else if (numero >= 51 && numero <= 75) {
                    count3++;
                } else if (numero >= 76 && numero <= 100) {
                    count4++;
                }
            }
        } while (numero >= 0);

        System.out.println("----------------------------------------");
        System.out.println("Contagem por intervalo:");
        System.out.println("[0-25]: " + count1);
        System.out.println("[26-50]: " + count2);
        System.out.println("[51-75]: " + count3);
        System.out.println("[76-100]: " + count4);

        input.close();
    }
}