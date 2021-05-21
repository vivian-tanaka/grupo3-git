package pack;

public class Counter {
	
	public int valor;

	public Counter() {
	}
	
	public Counter(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}

	public int Increase(int valor) {
		valor++;
		return valor;
	}
	
	public int Decrease(int valor) {
		valor--;
		return valor;
	}

}
