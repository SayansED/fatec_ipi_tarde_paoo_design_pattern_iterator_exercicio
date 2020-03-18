package Iterator;

import java.util.Scanner;

public class Attendant {

	private Menu pancakeHouseMenu;
	private Menu dinerMenu;
	private Menu snacksMenu;
	private Menu breakFastMenu;
	private Menu vegetarianMenu;

	public Attendant(Menu pancakeHouseMenu, Menu dinerMenu, Menu snacksMenu, Menu breakFastMenu, Menu vegetarianMenu) {
		super();
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.snacksMenu = snacksMenu;
		this.breakFastMenu = breakFastMenu;
		this.vegetarianMenu = vegetarianMenu;
	}

	/*
	 * private PancakeHouseMenu pancakeHouseMenu; private DinerMenu dinerMenu;
	 * 
	 * public Garconete(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
	 * super(); this.pancakeHouseMenu = pancakeHouseMenu; this.dinerMenu =
	 * dinerMenu; }
	 */

	// Versão nova
	public void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public void printMenuGeral() {
		System.out.println("\nPancake House");
		printMenu(pancakeHouseMenu.createIterator());
		System.out.println("\nDiner");
		printMenu(dinerMenu.createIterator());
		System.out.println("\nAfternoon Snacks");
		printMenu(snacksMenu.createIterator());
		System.out.println("\nBreakFast");
		printMenu(breakFastMenu.createIterator());
	}

	public void printMenuBreakFast() {
		printMenu(breakFastMenu.createIterator());
	}

	public void printMenuDiner() {
		printMenu(dinerMenu.createIterator());
	}
	
	public void printMenuVegetarian() {
		printMenu(vegetarianMenu.createIterator());
	}

	/*
	public void printMenuVegetariano(Iterator iterator) {
		MenuItem menuItem = null;
		while (iterator.hasNext()) {
			if (menuItem.isVegetariano() == true) {
				System.out.println(iterator.next());
			}
		}
	}

	public void printMenuVegetariano() {
		printMenuVegetariano(pancakeHouseMenu.createIterator());
		printMenuVegetariano(dinerMenu.createIterator());
		printMenuVegetariano(snacksMenu.createIterator());
		printMenuVegetariano(breakFastMenu.createIterator());
	}
	*/

	public void pedido() {
		Scanner ler = new Scanner(System.in);
		int escolha=1;
		while (escolha != 0) {
			System.out.println( 
					"\nFaça seu pedido" 
							+ "\n" 
							+ "1-Ver Menu Geral" 
							+ "\n" 
							+ "2-Ver Menu de Café da manhã" 
							+ "\n"
							+ "3-Ver Menu de Jantar" 
							+ "\n" 
							+ "4-Ver Menu Vegetariano" 
							+ "\n" 
							+ "0-Sair" 
							+ "\n");
			
			escolha = ler.nextInt();

			switch (escolha) {
			case 0:
				System.out.println("Pedido encerrado");
				escolha = 0;
				break;
			case 1:
				System.out.println("=============Menu Geral=============\n");
				printMenuGeral();
				break;
			case 2:
				System.out.println("=============Menu BreakFast=============\n");
				printMenuBreakFast();
				break;
			case 3:
				System.out.println("=============Menu Diner=============\n");
				printMenuDiner();
				break;
			case 4:
				System.out.println("=============Menu Vegetariano=============\n");
				printMenuVegetarian();
				break;
			default:
				break;
			}
		}
	}

	/*
	 * // Versão antiga public void exibirMenuGeral() {
	 * System.out.println("=============Menu Completo================="); for (int i
	 * = 0; i < pancakeHouseMenu.getItems().size(); i++) {
	 * System.out.println(pancakeHouseMenu.getItems().get(i)); } for (int i = 0; i <
	 * dinerMenu.getItems().length && dinerMenu.getItems()[i] != null; i++) {
	 * 
	 * System.out.println(dinerMenu.getItems()[i]); } }
	 * 
	 * public void exibirMenuVegetariano() {
	 * System.out.println("==============Menu Vegetariano================"); for
	 * (int i = 0; i < pancakeHouseMenu.getItems().size(); i++) { if
	 * (pancakeHouseMenu.getItems().get(i).isVegetariano())
	 * System.out.println(pancakeHouseMenu.getItems().get(i)); } for (int i = 0; i <
	 * dinerMenu.getItems().length && dinerMenu.getItems()[i] != null; i++) { if
	 * (dinerMenu.getItems()[i].isVegetariano())
	 * System.out.println(dinerMenu.getItems()[i]); } }
	 */
}
