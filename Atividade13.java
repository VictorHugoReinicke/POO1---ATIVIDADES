import java.util.Scanner;
public class Atividade13 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor de peso");
		float peso = input.nextFloat();
		float excesso = 0;
		float multa =0;
		
		if(peso > 50) {
			excesso = peso - 50;
			multa = excesso * 4;		
		}
		input.close();
		System.out.println("Excesso de peso de peixes com " + excesso + "kg, será cobrado : "+ multa);
			
	

	}

}
