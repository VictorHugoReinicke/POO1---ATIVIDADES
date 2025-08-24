import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        final int N = 3;
        int[] valores = new int[N];
        Scanner inp = new Scanner(System.in);

        
        for (int i = 0; i < N; i++) {
            int valor;
            do {
                System.out.print("Informe o valor " + (i + 1) + " (entre 0 e 20): ");
                valor = inp.nextInt();
                if (valor < 0 || valor > 20) {
                    System.out.println("Errado");
                }
            } while (valor < 0 || valor > 20);
            valores[i] = valor;
        }

        
        System.out.println("Gráfico:");
        for (int i = 0; i < N; i++) {
            System.out.print(valores[i] + ": ");
            for (int j = 0; j < valores[i]; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        inp.close();
    }
}
