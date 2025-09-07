
public class Atividade9 {

	private int canal =1;
	private int volume =10;
	
	
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if(canal > 0)
		this.canal = canal;
		else
			System.out.println("Erro");
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		
		if(volume >= 0 && volume <= 100)
			this.volume = volume;
		else
			System.out.println("Erro");
		
	}	
	
}
