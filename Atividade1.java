
public class Atividade1 {

	private String nome ="Nome vazio";
	private String sobrenome ="Sobrenome vazio";
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public void apresentacao(String nome,String sobrenome ) {
		
		System.out.println("Seu nome completo é: " + nome + " " + sobrenome);
		
	}
	
}
