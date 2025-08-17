import java.util.Scanner;
public class Atividade20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantas notas");
		int num = input.nextInt();	
		float soma = 0;
		
		for(int i =0; i < num; i++) {
			System.out.println("nota "+i);
			float nota = input.nextInt();
			soma +=nota;
		}
		input.close();
		System.out.println(soma/num);
	}

}
