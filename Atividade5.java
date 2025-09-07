
public class Atividade5 {
 
	int item=0;
	int qnt =0;
	
	
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	
	public double valor() {
		double valor = 0;
		switch(item) {
		case 100:
			valor =1.20;
			break;
		case 101:
			valor = 1.30;
			break;
		case 102:
			valor = 1.50;
			break;
		case 103:
			valor = 1.20;
			break;
		case 104:
			valor = 1.30;
			break;
		case 105:
			valor = 1.00;
			break;
		}
		return (valor * qnt);
	}
	
	public void apresentacao() {
		
		System.out.println("PRODUTO DE CÓDIGO :" + item);
		System.out.println("QUANTIA:" + qnt);
		System.out.println("VALOR TOTAL:" + valor());
		
	}
	
	
}
