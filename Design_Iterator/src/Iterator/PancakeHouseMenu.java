package Iterator;
import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu implements Menu{

	private List<MenuItem> items = new ArrayList <> ();
	
	public Iterator createIterator () {
		return new PancakeMenuIterator(this.items);
	}

	private void addItem(String nome, String descricao, boolean vegetariano, double preco) {
		MenuItem item = new MenuItem(nome, descricao, vegetariano, preco);
		items.add(item);
		
	}

	public PancakeHouseMenu() {
		addItem("K&B", "Pancakes 01", true, 2.99);
		addItem("Regular", "Pancakes 02", false, 2.99);
		addItem("Blueberry", "Pancakes 03", true, 3.49);
		addItem("Waffles", "Pancakes 04", true, 3.59);
	}
	
	/*
	public List<MenuItem> getItems() {
		return items;
	}
	*/
}
