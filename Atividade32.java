import java.util.Scanner;

public class Atividade32 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int codigoMaiorIndice = 0;
        double maiorIndice = -1;
        int codigoMenorIndice = 0;
        double menorIndice = -1;

        int totalVeiculos = 0;
        int totalAcidentesCidadesMenos2k = 0;
        int contadorCidadesMenos2k = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("\n--- Cidade " + i + " ---");
            System.out.print("Código: ");
            int codigoCidade = input.nextInt();

            System.out.print("Veículos: ");
            int numVeiculos = input.nextInt();

            System.out.print("Acidentes: ");
            int numAcidentes = input.nextInt();
          
            double indiceAcidentes = (double) numAcidentes / numVeiculos;
           
            if (i == 1) {
                maiorIndice = indiceAcidentes;
                codigoMaiorIndice = codigoCidade;
                menorIndice = indiceAcidentes;
                codigoMenorIndice = codigoCidade;
            } else {
                if (indiceAcidentes > maiorIndice) {
                    maiorIndice = indiceAcidentes;
                    codigoMaiorIndice = codigoCidade;
                }
                if (indiceAcidentes < menorIndice) {
                    menorIndice = indiceAcidentes;
                    codigoMenorIndice = codigoCidade;
                }
            }
         
            totalVeiculos += numVeiculos;

            if (numVeiculos < 2000) {
                totalAcidentesCidadesMenos2k += numAcidentes;
                contadorCidadesMenos2k++;
            }
        }
    
        double mediaVeiculos = (double) totalVeiculos / 5;

        double mediaAcidentesCidadesMenos2k = 0;
        if (contadorCidadesMenos2k > 0) {
            mediaAcidentesCidadesMenos2k = (double) totalAcidentesCidadesMenos2k / contadorCidadesMenos2k;
        }
       
        System.out.println("\n--- Relatório ---");

        System.out.println("\nMaior índice: " + maiorIndice + " (Cidade " + codigoMaiorIndice + ")");
        System.out.println("Menor índice: " + menorIndice + " (Cidade " + codigoMenorIndice + ")");

        System.out.println("\nMédia de veículos: " + mediaVeiculos);

        if (contadorCidadesMenos2k > 0) {
            System.out.println("\nMédia de acidentes em cidades com menos de 2000 veículos: " + mediaAcidentesCidadesMenos2k);
        } else {
            System.out.println("\nNenhuma cidade com menos de 2000 veículos.");
        }
        
        input.close();
    }
}