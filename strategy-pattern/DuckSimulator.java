public class DuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();

		System.out.println("Me: Who are you?");
		mallard.display();

		System.out.println("Me: Do quack");
		mallard.performQuack();

		System.out.println("Me: Fly");
		mallard.performFly();

		System.out.println("Me: Wait i'm chaning behaviour..");
		mallard.setFlyBehaviour(new FlyNoWay());

		System.out.println("Me: Fly");
		mallard.performFly();
	}
}
