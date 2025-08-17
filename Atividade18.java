import java.util.Scanner;
public class Atividade18 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número");
		int num = input.nextInt();
		
		int unNum =0;
		String div = "";
		
		for(int i =1; i <= num; i++)
			if((num%i) ==0) {
				unNum++;
				div += i + " ";
			}		
		input.close();
		if(unNum ==2)
			System.out.println("Primo");
		else {
			System.out.println("Divisivel por :" + div);
		}

	}

}
