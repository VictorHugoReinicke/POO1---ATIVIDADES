import java.util.Scanner;
public class Atividade17 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número");
		int num = input.nextInt();
		
		int unNum =0;
		
		for(int i =1; i <= num; i++)
			if((num%i) ==0)
				unNum++;
		
		input.close();
		if(unNum ==2)
			System.out.println("Primo");
		

	}

}
