import java.util.Scanner;
public class Atividade14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quanto ganha por hora?");
		float sal = input.nextFloat();
		System.out.println("Quantas horas trabalha?");
		float hora = input.nextFloat();
		
		input.close();
		
		float salBruto = sal* hora;
		double ir = (salBruto *  0.11);
		double inss = (salBruto * 0.08);
		double sindicato = (salBruto * 0.05);
		double salarioLiquido = (((salBruto - ir) - inss)-sindicato);
		
		System.out.println("Salário Bruto: "+ salBruto);
		System.out.println("INSS: "+ inss);
		System.out.println("Sindicato: "+ sindicato);
		System.out.println("Salário descontando imposto de renda: "+ salarioLiquido);
	}

}
