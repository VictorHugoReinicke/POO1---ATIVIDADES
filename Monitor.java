
public class Monitor {

	private String marca;
	private String tipo;
	private String Resolucao;

	public Monitor(String marca, String tipo, String resolucao) {
		this.marca = marca;
		this.tipo = tipo;
		Resolucao = resolucao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getResolucao() {
		return Resolucao;
	}

	public void setResolucao(String resolucao) {
		Resolucao = resolucao;
	}
	
	

}
