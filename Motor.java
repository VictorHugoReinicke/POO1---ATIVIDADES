
public class Motor {

	private String marca;
	private float potencia;
	private int cilindros;
	private String combustivel;

	public Motor(String marca, float potencia, int cilindros, String combustivel) {
		super();
		this.marca = marca;
		this.potencia = potencia;
		this.cilindros = cilindros;
		this.combustivel = combustivel;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca.length() > 3)
			this.marca = marca;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		if (potencia > 0)
			this.potencia = potencia;
	}

	public int getCilindros() {
		return cilindros;
	}

	public void setCilindros(int cilindros) {
		if (cilindros > 1)
			this.cilindros = cilindros;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		if (combustivel.length() > 3)
			this.combustivel = combustivel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Motor [marca=");
		builder.append(marca);
		builder.append(", potencia=");
		builder.append(potencia);
		builder.append(", cilindros=");
		builder.append(cilindros);
		builder.append(", combustivel=");
		builder.append(combustivel);
		builder.append("]");
		return builder.toString();
	}

}
