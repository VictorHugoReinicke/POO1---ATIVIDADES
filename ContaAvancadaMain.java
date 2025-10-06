public class ContaAvancadaMain {

	public static void main(String[] args) {

		Pessoa corretista = new Pessoa("Maria Fernanda", "Rua das Laranjeiras, 50");
		Banco bancoPrincipal = new Banco(500, "Banco Poupador S.A.", 300);
		CartaoDeCredito cartaoPlatinum = new CartaoDeCredito(5456, "Visa", 15000.00, "Platinum");

		ContaEspecial contaDaMaria = new ContaEspecial(bancoPrincipal, 1025, 987654, 3500.80, corretista, 10, 5000.00,
				cartaoPlatinum);

		System.out.println(contaDaMaria);

	}
}