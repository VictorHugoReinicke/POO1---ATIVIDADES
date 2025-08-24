import java.util.*;
import java.io.*;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Quantas cartelas deseja preencher: ");
        int qtdCartelas = inp.nextInt();

        int[][] cartelas = new int[qtdCartelas][6];
        int[] sorteio = new int[6];
        Set<Integer> numerosSorteio = new HashSet<>();

        while (numerosSorteio.size() < 6) {
            numerosSorteio.add(rand.nextInt(60) + 1);
        }

        int i = 0;
        for (int num : numerosSorteio) {
            sorteio[i++] = num;
        }

        for (int c = 0; c < qtdCartelas; c++) {
            Set<Integer> numerosCartela = new HashSet<>();
            while (numerosCartela.size() < 6) {
                numerosCartela.add(rand.nextInt(60) + 1);
            }
            int j = 0;
            for (int num : numerosCartela) {
                cartelas[c][j++] = num;
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("loteria.txt"))) {
            writer.write("Cartela Sorteada: ");
            Arrays.sort(sorteio);
            for (int num : sorteio) {
                writer.write(num + " ");
            }
            writer.newLine();

            for (int c = 0; c < qtdCartelas; c++) {
                Arrays.sort(cartelas[c]);
                int acertos = 0;
                for (int j = 0; j < 6; j++) {
                    for (int k = 0; k < 6; k++) {
                        if (cartelas[c][j] == sorteio[k]) {
                            acertos++;
                        }
                    }
                }
                writer.write("Cartela " + (c + 1) + ": ");
                for (int j = 0; j < 6; j++) {
                    writer.write(cartelas[c][j] + " ");
                }
                writer.write("- Acertos: " + acertos);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.print("Erro ao gravar o arquivo: ");
            System.out.println(e.getMessage());
        }

        System.out.print("Cartela Sorteada: ");
        for (int num : sorteio) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int c = 0; c < qtdCartelas; c++) {
            Arrays.sort(cartelas[c]);
            int acertos = 0;
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    if (cartelas[c][j] == sorteio[k]) {
                        acertos++;
                    }
                }
            }
            System.out.print("Cartela " + (c + 1) + ": ");
            for (int j = 0; j < 6; j++) {
                System.out.print(cartelas[c][j] + " ");
            }
            System.out.print("- Acertos: ");
            System.out.println(acertos);
        }

        System.out.println("Dados gravados no arquivo:");
        try (BufferedReader reader = new BufferedReader(new FileReader("loteria.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.print("Erro ao ler o arquivo: ");
            System.out.println(e.getMessage());
        }

        inp.close();
    }
}
