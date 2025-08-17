import java.util.Scanner;
public class Atividade14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de números");
		int num = input.nextInt();
		input.close();
		int ec =0;
		int eb =1;
		
		for(int i =1; i <=num;i++) {
			ec++;
			System.out.println(ec+" / "+eb);
			eb+=2;
			
			
			
		}

	}

}
