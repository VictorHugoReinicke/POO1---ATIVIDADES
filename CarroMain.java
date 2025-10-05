
public class CarroMain {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("nome","endereco");
		Motor motor = new Motor("marca", 118f, 10, "combustível");
		Carro carro = new Carro("fabricante","modelo","cor",11, pessoa, motor);
		
		System.out.println(carro);

	}

}
