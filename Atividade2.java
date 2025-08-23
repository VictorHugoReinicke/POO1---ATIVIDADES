
public class Atividade2 {

	public static void main(String[] args) {
		final int TAM = 10;

		
		double[] num = new double[TAM];
		
		for(int i = 0; i < TAM; i++ ) {
			if(i ==0 )
				num[i] =0.8;
			else
			num[i] = num[i-1] + 3.14;
			System.out.println(num[i]);
		}
		System.out.println("REVERSO");
		
		for(int i = TAM; i > 0; i--) {
			System.out.println(num[i-1]);
		}
		
	}

}
