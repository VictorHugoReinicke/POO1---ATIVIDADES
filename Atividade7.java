
public class Atividade7 {

	
	
	public static void main(String[] args) {
		final int TAM =5;
		int[] num = new int[TAM];
		int soma =0;
		double mult = 1;
		
		for(int i =0; i < TAM; i ++) {
			
			num[i] = 2;
			
		}
		
		for(int i=0; i< TAM; i++) {
			soma += num[i];
			mult *= num[i];
		}
		
		System.out.println(soma);
		System.out.println(mult);
		
		

	}

}
