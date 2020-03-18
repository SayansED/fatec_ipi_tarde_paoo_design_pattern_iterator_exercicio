package Iterator;
import java.util.ArrayList;
import java.util.List;

public class AfternoonSnacksMenu implements Menu{
	
	private List<MenuItem> items = new ArrayList <> ();
	
	public Iterator createIterator () {
		return new SnacksMenuIterator(this.items);
	}

	private void addItem(String nome, String descricao, boolean vegetariano, double preco) {
		MenuItem item = new MenuItem(nome, descricao, vegetariano, preco);
		items.add(item);
	}

	public AfternoonSnacksMenu() {
		addItem("X-Tudo", "Snacks 01", false, 5.99);
		addItem("X-Burguer", "Snacks 02", false, 2.99);
		addItem("X-Salad", "Snacks 03", true, 3.49);
		addItem("X-Bacon", "Snacks 04", false, 4.59);
	}

}
