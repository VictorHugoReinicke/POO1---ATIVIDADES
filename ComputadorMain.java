public class ComputadorMain {

	public static void main(String[] args) {

		Processador cpu = new Processador("AMD", "Ryzen 7 7700", 5.3f, 32.0f);
		Memoria ram = new Memoria("Corsair", "Vengeance", 32.0f, 6000.0f);
		HD ssd = new HD("Samsung", "980 Pro", 2000.0f, 0);

		Teclado teclado = new Teclado("HyperX", "Alloy FPS");
		Mouse mouse = new Mouse("Logitech", "G Pro Superlight");
		Monitor monitor = new Monitor("LG", "OLED", "4K Ultra HD");

		PlacaMae placaMae = new PlacaMae("ASUS", "ROG Strix X670", cpu, ssd, ram);

		Gabinete gabinete = new Gabinete("Cooler Master H500", "Mid Tower", 4, placaMae);

		Computador meuComputador = new Computador(110.0f, 350.0f, "Dell", "XPS Desktop", gabinete, teclado, mouse,monitor);

		System.out.println(meuComputador);

	}

}