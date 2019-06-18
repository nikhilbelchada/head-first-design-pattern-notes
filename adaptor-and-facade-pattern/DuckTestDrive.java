public class DuckTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();

		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();

		System.out.println("Duck says..");
		duck.quack();
		duck.fly();

		System.out.println("Turkey Adapter Says..");
		turkeyAdapter.quack();
		turkeyAdapter.fly();

	}
}
