public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();

		Light light = new Light("living room light");
		LightOnCommand lightOn = new LightOnCommand(light);

		remote.setCommand(lightOn);
		remote.buttonWasPressed();
	}
}
