public class DinnerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;

	public DinnerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

		addItem("Vegetairan BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 2.99);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!!");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}

	public Iterator createIterator() {
		return new DinnerMenuIterator(menuItems);
	}
}
