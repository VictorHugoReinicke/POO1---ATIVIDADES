
public class Cone {
	private double raio;
	private double altura; // Latas são vendidads com 18 lt
	private int tipo; // Tipo 1 é 238,90 , o 2 é 467,98 e o 3 758.34

	final double PI = 3.14;
	final double RENDIMENTO = 3.45;
	final double LITROS_LATA = 18;

	final int NUM_LADOS = 6;
	final int RAIZ = 3;
	final double RENDLATA = 18;

	public Cone() {
	}

	public Cone(double raio, double altura) {
		setRaio(raio);
		setAltura(altura);
	}

	public Cone(int tipo) {
		setTipo(tipo);
	}

	public Cone(double raio, double altura, int tipo) {
		setRaio(raio);
		setAltura(altura);
		setTipo(tipo);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		if (raio > 0)
			this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura > 0)
			this.altura = altura;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		if (tipo >= 1 && tipo <= 3)
			this.tipo = tipo;
	}

	public double geratriz() {
		return Math.sqrt((raio * raio) + (altura * altura));
	}

	public double areaFundo() {
		return PI * raio * raio;
	}

	public double areaLateral() {
		return PI * raio * geratriz();
	}

	public double areaTotal() {
		return areaFundo() + areaLateral();
	}

	public double litros() {
		return areaTotal() / RENDIMENTO;
	}

	public int latas() {
		return (int) Math.ceil(litros() / LITROS_LATA);
	}

	public double precoLata() {
		switch (tipo) {
		case 1:
			return 238.90;
		case 2:
			return 467.98;
		case 3:
			return 758.34;
		default:
			return 238.90;
		}
	}

	public double precoTotal() {
		return latas() * precoLata();
	}

	@Override
	public String toString() {
		return "- Cone" + "\nRaio: " + raio + "\nAltura: " + altura + "\nNível: " + tipo + "\n\nGeratriz: " + geratriz()
				+ "\n\nÁrea do Fundo: " + areaFundo() + "\nÁrea Lateral Cone: " + areaLateral() + "\nÁrea Total: "
				+ areaTotal() + "\n\nLitros: " + litros() + "\nLatas: " + latas() + "\n\nPreço Total: " + precoTotal();
	}
}
