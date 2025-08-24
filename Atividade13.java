
public class Atividade13 {

	public static void main(String[] args) {
		
		
		int[] vet1 = {1,3,5,7,9,11,13,15,17,19};
		int[] vet2 = {2,4,6,8,10,12,14,16,18,20};

		int[] vet3 = new int[20];
		for(int i =0; i <10; i++) {
			
			vet3[2*i] = vet1[i];
			vet3[2*i+1] = vet2[i];
			
		}
		for(int i =0; i < 20; i++)
		System.out.println(vet3[i]);
		
	}

}
