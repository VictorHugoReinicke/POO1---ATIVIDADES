public class Piramide {
	private double ab;
	private double h;
	private int tipo;


	private static final double RENDIMENTO = 4.76;
	private static final double LITROS_LATA = 18;

	private static final double PRECO_TIPO1 = 127.90;
	private static final double PRECO_TIPO2 = 258.98;
	private static final double PRECO_TIPO3 = 344.34;

	public Piramide() {
	}

	public Piramide(double ab, double h, int tipo) {
		setAb(ab);
		setH(h);
		setTipo(tipo);
	}

	public double getAb() {
		return ab;
	}

	public void setAb(double ab) {
		if (ab > 0)
			this.ab = ab;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		if (h > 0)
			this.h = h;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		if (tipo >= 1 && tipo <= 3)
			this.tipo = tipo;
	}

	
	public double a1() {
		return Math.sqrt((h * h) + (ab * ab));
	}

	public double areaTriangulo() {
		return (ab * a1()) / 2.0;
	}

	public double areaBase() {
		return ab * ab;
	}

	public double areaTotal() {
		return (4 * areaTriangulo()) + areaBase();
	}

	public double volume() {
		return (areaBase() * h) / 3.0;
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
			return PRECO_TIPO1;
		case 2:
			return PRECO_TIPO2;
		case 3:
			return PRECO_TIPO3;
		default:
			return PRECO_TIPO1;
		}
	}

	public double precoTotal() {
		return latas() * precoLata();
	}

	@Override
	public String toString() {
		return "Piramide" + "\nab: " + ab + "\nh: " + h + "\na1: " + a1() + "\nÁrea Triângulo: " + areaTriangulo()
				+ "\nÁrea Base: " + areaBase() + "\nÁrea Total: " + areaTotal() + "\nTipo de Tinta: " + tipo
				+ "\nLitros: " + litros() + "\nLatas: " + latas() + "\nPreço: " + precoTotal() + "\nVolume: "
				+ volume();
	}
}
