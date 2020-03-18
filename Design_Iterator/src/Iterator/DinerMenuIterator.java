package Iterator;

public class DinerMenuIterator implements Iterator{
	
	private MenuItem [] items;
	private int contador = 0;
	
	
	
	public DinerMenuIterator(MenuItem[] items) {
		super();
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		return contador < this.items.length && this.items[contador] != null;
	}

	@Override
	public Object next() {
		return this.items[this.contador++];
	}

}
