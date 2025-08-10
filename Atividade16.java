import java.util.Scanner;
public class Atividade16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("m²");
        double area = input.nextDouble();
		
        double coberturaPorLata = 18 * 6;
        double coberturaPorGalao = 3.6 * 6;
     
        int latasNecessarias = (int) Math.ceil(area / coberturaPorLata);
        double precoLatas = latasNecessarias * 80;
        
        int galoesNecessarios = (int) Math.ceil(area / coberturaPorGalao);
        double precoGaloes = galoesNecessarios * 25;
     
        input.close();
        System.out.println("Latas de 18L " + latasNecessarias +"  "+ precoLatas);
        System.out.println("Galões de 3,6L " + galoesNecessarios +"  "+ precoGaloes);
        
	}

}
