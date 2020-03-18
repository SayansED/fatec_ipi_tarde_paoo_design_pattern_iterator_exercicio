package Iterator;

public class Teste {

	public static void main(String[] args) {
		
		PancakeHouseMenu phm = new PancakeHouseMenu();
		DinerMenu dm = new DinerMenu();
		AfternoonSnacksMenu afs = new AfternoonSnacksMenu(); 
		BreakFastMenu bfm = new BreakFastMenu();
		VegetarianMenu vm = new VegetarianMenu();
		
		Attendant attendant = new Attendant (phm, dm, afs, bfm, vm);
		attendant.pedido();
	}
}
