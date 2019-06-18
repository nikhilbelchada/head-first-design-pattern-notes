public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	public Cheese createCheese() {
		return new RaggianoCheese();
	}

	public Veggies[] createVeggies() {
		Veggies[] veggies = {new Onion()};

		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
