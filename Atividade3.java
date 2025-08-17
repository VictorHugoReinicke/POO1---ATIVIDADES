import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome = "";
        int idade = 0;
        double salario = 0;
        char sexo = ' ';
        char estadoCivil = ' ';

        boolean dadosValidos = false;

        while (!dadosValidos) {
            
            
            System.out.println("Digite seu nome (deve ter mais de 3 caracteres):");
            nome = input.nextLine();
            if (nome.length() <= 3) {
                System.out.println("Nome inválido. Tente novamente.");
                continue;
            }

            
            System.out.println("Digite sua idade (entre 0 e 150):");
            idade = input.nextInt();
            if (idade < 0 || idade > 150) {
                System.out.println("Idade inválida. Tente novamente.");
                input.nextLine();
                continue;
            }

            
            System.out.println("Digite seu salário (deve ser maior que zero):");
            salario = input.nextDouble();
            if (salario <= 0) {
                System.out.println("Salário inválido. Tente novamente.");
                input.nextLine(); 
                continue; 
            }

            
            input.nextLine(); 
            
           
            System.out.println("Digite seu sexo ('f' ou 'm'):");
            sexo = input.nextLine().toLowerCase().charAt(0);
            if (sexo != 'f' && sexo != 'm') {
                System.out.println("Sexo inválido. Tente novamente.");
                continue;
            }
            
       
            System.out.println("Digite seu estado civil ('s', 'c', 'v', 'd'):");
            estadoCivil = input.nextLine().toLowerCase().charAt(0);
            if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
                System.out.println("Estado civil inválido. Tente novamente.");
                continue; 
            }
            
            dadosValidos = true;
        }

        System.out.println("Dados validados com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        input.close();
    }
}