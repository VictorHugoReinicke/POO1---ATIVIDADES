import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {
       
            System.out.println("Digite a população inicial do País A:");
            double paisA = input.nextDouble();
            if (paisA <= 0) {
                System.out.println("População A inválida. Por favor, digite um valor maior que zero.");
                continue; 
            }

            System.out.println("Digite a população inicial do País B:");
            double paisB = input.nextDouble();
            if (paisB <= 0) {
                System.out.println("População B inválida. Por favor, digite um valor maior que zero.");
                continue; 
            }
            
    
            input.nextLine(); 

           
            System.out.println("Digite a taxa de crescimento anual do País A (%):");
            double taA = input.nextDouble();
            if (taA < 0) {
                System.out.println("Taxa de crescimento do País A inválida. Por favor, digite um valor positivo.");
                continue; 
            }

            System.out.println("Digite a taxa de crescimento anual do País B (%):");
            double taB = input.nextDouble();
            if (taB < 0) {
                System.out.println("Taxa de crescimento do País B inválida. Por favor, digite um valor positivo.");
                continue; 
            }

          
            input.nextLine(); 

            
            if (taA <= taB && paisA < paisB) {
                System.out.println("A população do País A nunca irá ultrapassar a do País B com essas taxas de crescimento.");
            } else {
                int anos = 0;
                while (paisA < paisB) {
                    paisA += (paisA * taA) / 100;
                    paisB += (paisB * taB) / 100;
                    anos++;
                }
                System.out.println("Serão necessários " + anos + " anos para a população do País A ultrapassar a do País B.");
                System.out.printf("População do País A: %.0f\n", paisA);
                System.out.printf("População do País B: %.0f\n", paisB);
            }

            System.out.println("Gostaria de realizar outro cálculo? (S/N)");
            continuar = input.nextLine();
        }

        input.close();
        System.out.println("Programa encerrado.");
    }
}