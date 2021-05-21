package pack;

public class Program {

	public static void main(String[] args) {
		Counter counter = new Counter(0);
		
		counter.valor = 0;
		
		counter.valor = counter.Increase(counter.valor);
		
		System.out.println("Increassed: " + counter.valor);
		
		counter.valor = counter.Increase(counter.valor);
		
		System.out.println("Increassed: " + counter.valor);
		
		counter.valor = counter.Decrease(counter.valor);
		
		System.out.println("Decreassed: " + counter.valor);

		counter.valor = counter.Decrease(counter.valor);
		
		System.out.println("Decreassed: " + counter.valor);
		
	}

}
