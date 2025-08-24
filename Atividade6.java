import java.util.*;
public class Atividade6 {

	public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);
	       final int TAM = 10;
	       int alunoB =0;
	       double[] medias = new double[TAM];
	       
	       
	       for(int i=0;i < TAM; i++) {
	    	   double media = 0;
	    	   for(int j =0; j< 4; j++) {
	    		   System.out.println("Nota");
	    		   double nt = input.nextDouble();
	    		   
	    		   media += nt;
	    		   
	    		   
	    	   }
	    	   medias[i] = (media)/4;
	    	   
	       }
	       
	       input.close();
	       
	       for(int i =0; i < TAM; i ++) {
	    	   if(medias[i] >= 7.0)
	    		   alunoB++;
	    	   System.out.println(medias[i]);
	    	   
	       }
	       
	       System.out.println(alunoB);
		

	}

}
