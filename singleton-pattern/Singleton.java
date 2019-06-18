public class Singleton {
	// Volatile keyword ensures that nultiple threads handle the uniqueInstance variable correctly when it is being
	// initialized to the Singleton instance
	private volatile static Singleton uniqueInstance;

	private Singleton() {}

	// Check for an instance and if there isn't one, enter a synchronized block
	pubilc static Singleton getInstance() {
		// We synchronize the first time through
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					// Once in the block, check again and if still null, create an instance
					uniqueInstance = new Singleton();
				}
			}
		}

		return uniqueInstance;
	}
}
