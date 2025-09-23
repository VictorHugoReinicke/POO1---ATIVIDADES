
public class ItemMain {

	public static void main(String[] args) {
		
		Item i = new Item(1, "Teste");
		System.out.println(i);

		Livro l = new Livro(2,"OtoTeste");
		l.setAutor("Rodrigo Goes");
		System.out.println(l);
		
		Midia m = new Midia(3, "OtoOtoTeste", "Cd", 122.30f);
		System.out.println(m);
		
		Vhs v = new Vhs(3, "OtoOtoTeste", "Cd", 122.30f, "Filme");
		System.out.println(v);
		
		Cd c = new Cd(3, "OtoOtoTeste", "Cd", 122.30f, "Filme",3,"teste","teste");
		System.out.println(c);
	}

}
