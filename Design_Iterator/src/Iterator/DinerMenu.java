package Iterator;

public class DinerMenu implements Menu{
	
	private MenuItem [] items = new MenuItem [6];
	private int quantidade = 0;
	
	public void addItem (String nome, String descricao, boolean vegetariano, double preco) {
		MenuItem item = new MenuItem (nome, descricao, vegetariano, preco);
		items[quantidade++] = item;
	}
	
	public Iterator createIterator () {
		return new DinerMenuIterator(this.items);
	}
	
	public DinerMenu() {
		addItem ("Vegetariano", "Bacon", true, 2.99);
		addItem ("Bacon", "Tomato", false, 2.99);
		addItem ("Soap", "Soap", false, 3.29);
		addItem ("HotDog", "Bacon", true, 3.05);
	}
	
	/*
	public MenuItem[] getItems() {
		return items;
	}
	*/
	
}
