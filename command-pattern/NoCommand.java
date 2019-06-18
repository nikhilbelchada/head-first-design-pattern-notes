public class NoCommand implements Command {
	public void execute() {
		System.out.println("No Command Set");
	}

	public void undo() {}
}
