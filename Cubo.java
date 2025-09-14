
public class Cubo {

	private double lado;
	private double rendimento; // Latas são vendidads com 18 lt
	private int tipo; // Tipo 1 é 101,90 , o 2 é 212,45 e o 3 345,56

	final int NUM_LADOS = 6;
	final int RAIZ = 3;
	final double RENDLATA = 18;

	public Cubo() {

	}

	public Cubo(double lado, double rendimento, int tipo) {
		setLado(lado);
		setRendimento(rendimento);
		setTipo(tipo);
	}

	public Cubo(double lado, double rendimento) {
		setLado(lado);
		setRendimento(rendimento);
	}

	public Cubo(int tipo) {
		setTipo(tipo);
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		if (lado > 0)
			this.lado = lado;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		if (rendimento > 0)
			this.rendimento = rendimento;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		if (tipo >= 1 && tipo <= 3)
			this.tipo = tipo;
	}

	public double area() {
		return lado * lado;
	}

	public double volume() {
		return lado * lado * lado;
	}

	public double diagonal() {
		return lado * Math.sqrt(RAIZ);
	}

	public double areaT() {
		return area() * NUM_LADOS;
	}

	public double litros() {
		return areaT() / rendimento;
	}

	public double Nlatas() {
		return (int) Math.ceil(litros() / RENDLATA);
	}

	public double valor() {
		double val;
		switch (tipo) {
		case 1:
			val = 101.90;
			break;
		case 2:
			val = 212.45;
			break;
		case 3:
			val = 345.56;
			break;
		default:
			val = 101.90;
			break;
		}
		return val;
	}

	public double valorT() {
		return Nlatas() * valor();
	}

	@Override
	public String toString() {
		return "Área da Base : " + area() + "\nÁrea Total : " + areaT() + "\nVolume : " + volume()
				+ "\nDiagonal do Cubo : " + diagonal() + "\nLitros de Tinta : " + litros() + "\nLatas de Tinta : "
				+ Nlatas() + "\nValor Total : " + valorT();
	}

}
