
public class Cd extends Midia{

	private int faixas;
	private String artista;
	private String album;

	public Cd(int codigo, String descricao,String gravadora, float duracao, int faixas, String artista, String album) {
		super(codigo,descricao,gravadora,duracao);
		setFaixas(faixas);
		setArtista(artista);
		setAlbum(album);
	}



	public int getFaixas() {
		return faixas;
	}



	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}



	public String getArtista() {
		return artista;
	}



	public void setArtista(String artista) {
		this.artista = artista;
	}



	public String getAlbum() {
		return album;
	}



	public void setAlbum(String album) {
		this.album = album;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cd [faixas=");
		builder.append(faixas);
		builder.append(", artista=");
		builder.append(artista);
		builder.append(", album=");
		builder.append(album);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}



	
}
