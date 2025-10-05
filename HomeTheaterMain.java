
public class HomeTheaterMain {

	public static void main(String[] args) {
		
		SistemaDeSom som = new SistemaDeSom(110.0f, 350.5f, "marca", "modelo", 820.0f);
		SistemaDeVideo video = new SistemaDeVideo(220.0f, 180.0f, "marca", "modelo", "tipo", "resolução");
		HomeTheater homeTheater = new HomeTheater(som, video);
		System.out.println(homeTheater);

	}

}
