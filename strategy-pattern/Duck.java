public abstract class Duck {
	  QuackBehaviour quackBehaviour;
	  FlyBehaviour flyBehaviour;

		public Duck() {}

		public abstract void display();

		public void performQuack() {
			quackBehaviour.quack();
		}

		public void performFly() {
			flyBehaviour.fly();
		}

		public void swim() {
			System.out.println("I am swimming!!");
		}

		public void setFlyBehaviour(FlyBehaviour fb) {
			flyBehaviour = fb;
		}

		public void setQuackBehaviour(QuackBehaviour qb) {
			quackBehaviour = qb;
		}
}
