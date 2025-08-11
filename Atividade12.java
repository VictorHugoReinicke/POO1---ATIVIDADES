import java.util.Scanner;
public class Atividade12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual o salário?");
		double salario = input.nextDouble();
		double reajuste = 0;
		double porc = 0;
		double novo = 0;
		
		if(salario <=280) 
			porc = 0.20;
		else if (salario > 280 && salario < 700) 
			porc = 0.15;
		else if (salario >=700 && salario < 1500) 
			porc = 0.10;
		else if (salario >=1500) 
			porc = 0.05;
		reajuste = salario * (1 + porc);
		novo = salario * porc;
		
		input.close();
		System.out.println("Salário " + salario );
		System.out.println("Porcentagem " + porc);
		System.out.println("Aumento de " + novo);
		System.out.println("Novo salário " + reajuste);
		
	}

}
