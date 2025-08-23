
public class Atividade4 {

	public static void main(String[] args) {
		
		final int TAM = 10;
		String[] letra= new String[TAM];
		int consoantes = 0;
		
		for(int i =0; i<TAM; i ++)
		{
			if((i%2)==0) {
				letra[i] = "a";
			}
			else
				letra[i] = "b";

		}
		
		for(int i =0; i < TAM; i ++) {
			
			if(letra[i] != "a" && letra[i] != "e"  && letra[i] != "i" && letra[i]  != "o" && letra[i] != "u") {
				
				consoantes++;
				System.out.println(letra[i]);
				
			}
			
		}
		System.out.println(consoantes);
		
	}

}
