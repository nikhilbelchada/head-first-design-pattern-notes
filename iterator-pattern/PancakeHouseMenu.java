import java.util.*;

public class PancakeHouseMenu {
	ArrayList menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList();

		addItem("K&B's Pancake Breakfast", "Pancakes with scarmbled eggs, and toast", true, 2.99);
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
		addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
		addItem("Waffles", "Waggles, with your choice of blueberries or strawberries", true, 3.59);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

	public ArrayList getMenuItems() {
		return menuItems;
	}

	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}
}
