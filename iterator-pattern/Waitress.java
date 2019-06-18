public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinnerMenu dinnerMenu;
	CafeMenu cafeMenu;

	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu, CafeMenu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinnerMenu = dinnerMenu;
		this.cafeMenu = cafeMenu;
	}

	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinnerIterator = dinnerMenu.createIterator();
		Iterator cafeIterator = cafeMenu.createIterator();

		System.out.println("Menu\n---\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinnerIterator);
		System.out.println("\nCAFE");
		printMenu(cafeIterator);
	}

	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());

		}
	}
}
