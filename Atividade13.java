import java.util.Scanner;
public class Atividade13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor da sua hora: R$ ");
		double valorHora = input.nextDouble();
		System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
		int horasTrabalhadas = input.nextInt();
		double salarioBruto = valorHora * horasTrabalhadas;
		

		
		input.close();
		double descontoIR;
        if (salarioBruto <= 900) {
            descontoIR = 0;
        } else if (salarioBruto <= 1500) {
            descontoIR = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            descontoIR = salarioBruto * 0.10;
        } else {
            descontoIR = salarioBruto * 0.20;
        }
        
        double descontoSindicato = salarioBruto * 0.03;
        double fgts = salarioBruto * 0.11;
        double totalDescontos = descontoIR + descontoSindicato;
        double salarioLiquido = salarioBruto - totalDescontos;
        
        System.out.printf("Salário Bruto: (%.2f * %d) : R$ %.2f%n", valorHora, horasTrabalhadas, salarioBruto);
        System.out.printf("(-) IR (%.0f%%) : R$ %.2f%n", (descontoIR == 0 ? 0 : (descontoIR / salarioBruto) * 100), descontoIR);
        System.out.printf("(-) Sindicato (3%%) : R$ %.2f%n", descontoSindicato);
        System.out.printf("FGTS (11%%) : R$ %.2f%n", fgts);
        System.out.printf("Total de descontos : R$ %.2f%n", totalDescontos);
        System.out.printf("Salário Líquido : R$ %.2f%n", salarioLiquido);
		
	}

}
