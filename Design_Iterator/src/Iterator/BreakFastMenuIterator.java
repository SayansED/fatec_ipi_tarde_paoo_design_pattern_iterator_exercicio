package Iterator;

import java.util.List;

public class BreakFastMenuIterator implements Iterator{

	private List<MenuItem> items;
	private int contador = 0;
	
	public BreakFastMenuIterator (List <MenuItem> items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		return contador < items.size() && items.get(contador) != null;
	}

	@Override
	public Object next() {
		return items.get(contador++);
	}
}
