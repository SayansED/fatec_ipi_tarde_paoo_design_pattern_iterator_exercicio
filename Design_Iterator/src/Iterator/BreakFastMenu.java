package Iterator;
import java.util.ArrayList;
import java.util.List;

public class BreakFastMenu implements Menu{

private List<MenuItem> items = new ArrayList <> ();
	
	public Iterator createIterator () {
		return new BreakFastMenuIterator(this.items);
	}

	private void addItem(String nome, String descricao, boolean vegetariano, double preco) {
		MenuItem item = new MenuItem(nome, descricao, vegetariano, preco);
		items.add(item);
	}

	public BreakFastMenu() {
		addItem("Bread with butter", "BreakFast 01", true, 2.99);
		addItem("Coffe", "BreakFast 02", true, 1.50);
		addItem("Hot mixed", "BreakFast 03", true, 3.49);
		addItem("Coffe with milk", "BreakFast 04", true, 2.59);
	}

}
