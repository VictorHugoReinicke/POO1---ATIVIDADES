import java.util.Scanner;
public class Atividade7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Num1");
		double num1= input.nextFloat();
		
		System.out.println("Num2");
		double num2= input.nextFloat();
		
		System.out.println("Num3");
		double num3= input.nextFloat();
		
		 if (num1 < num2) {
	            double temp = num1;
	            num1 = num2;
	            num2 = temp;
	        }
	        if (num2 < num3) {
	            double temp = num2;
	            num2 = num3;
	            num3 = temp;
	        }
	        if (num1 < num2) {
	            double temp = num1;
	            num1 = num2;
	            num2 = temp;
	        }
			
		input.close();
		System.out.println("Ordem decrescente: ");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}

}
