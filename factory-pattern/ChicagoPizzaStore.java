public class ChicagoPizzaStore extends PizzaStore {
	public Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (type.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else {
			return null;
		}
	}
}
