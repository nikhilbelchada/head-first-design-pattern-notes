import java.util.Iterator;

public class MenuTestDrive {
	public static void main(String args[]) {
		MenuComponent pancakeHouseMenu = new Menu("PANCASKE HOUSE MENU", "Breakfast");
		MenuComponent dinnerMenu = new Menu("DINNER MENU", "Dinner");
		MenuComponent dessertMenu = new Menu("Desert MENU", "Desert");

		MenuComponent allMenus = new Menu("ALL MENUS", "All Menus Combined");

		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinnerMenu);

		dinnerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sause", true, 3.89));
		dinnerMenu.add(dessertMenu);
		dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust", true, 1.59));

		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
	}
}
