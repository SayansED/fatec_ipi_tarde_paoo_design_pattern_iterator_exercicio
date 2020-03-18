package Iterator;

import java.util.ArrayList;
import java.util.List;

public class VegetarianMenu implements Menu{

private List<MenuItem> items = new ArrayList <> ();
	
	public Iterator createIterator () {
		return new VegetarianMenuIterator(this.items);
	}

	private void addItem(String nome, String descricao, boolean vegetariano, double preco) {
		MenuItem item = new MenuItem(nome, descricao, vegetariano, preco);
		items.add(item);
	}

	public VegetarianMenu() {
		addItem("Bread with butter", "BreakFast 01", true, 2.99);
		addItem("Coffe", "BreakFast 02", true, 1.50);
		addItem("Hot mixed", "BreakFast 03", true, 3.49);
		addItem("Coffe with milk", "BreakFast 04", true, 2.59);
		addItem("X-Salad", "Snacks 03", true, 3.49);
		addItem ("Vegetariano", "Bacon", true, 2.99);
		addItem ("HotDog", "Bacon", true, 3.05);
		addItem("K&B", "Pancakes 01", true, 2.99);
		addItem("Blueberry", "Pancakes 03", true, 3.49);
		addItem("Waffles", "Pancakes 04", true, 3.59);
	}
}
