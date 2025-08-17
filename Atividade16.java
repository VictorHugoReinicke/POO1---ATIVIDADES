import java.util.Scanner;
public class Atividade16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Quantos números");
		int qnt = input.nextInt();
		int cont = 0;
		int menor =0;
		int maior =0;
		
		for(int i =0; i < qnt; i++) {
			
			System.out.println("Digite número");
			int num = input.nextInt();
						
			
			if(i ==0) {
				menor =num;
				maior =num;
			}
			
			if(num > maior)
				maior = num;
			
			if(num < menor)
				menor = num;
			
			cont += num;
			
		}		
	
		System.out.println(cont);
		System.out.println("Menor " + menor);
		System.out.println("Maior " + maior);
		
		input.close();
		
		
		
		
	}

}
