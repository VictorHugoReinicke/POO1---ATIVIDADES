import java.util.Scanner;
public class Atividade9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Altura");
		float altura = input.nextFloat();
		System.out.println("Peso");
		float peso = input.nextFloat();
		input.nextLine();
		System.out.println("Sexo");
		String sexo = input.nextLine();
		double pesoIdeal=0;
		String situacao = "peso ideal";
		
		if(sexo.toUpperCase().equals("F"))
			pesoIdeal = (62.1* altura) - 44.7;
		else if(sexo.toUpperCase().equals("M"))
			pesoIdeal = (72.7* altura) - 58;
		
		if(peso> pesoIdeal)
			situacao = "sobrepeso";
		else if (peso < pesoIdeal)
			situacao = "abaixo do ideal";
			
		
		input.close();
		System.out.println("Usuário com os dados de : " + altura + " " + peso + " " + sexo + " tem como peso ideal : " + pesoIdeal + " e sua situação é de "+ situacao );
	}

}
