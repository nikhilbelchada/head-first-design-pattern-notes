public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		Stereo stereo = new Stereo("Living Room");

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);

		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, stereoOnWithCD, new NoCommand());

		System.out.println(remoteControl);

		remoteControl.onButtonWasPressed(0);
		remoteControl.offButtonWasPressed(0);
		remoteControl.undoButtonWasPressed();

		remoteControl.onButtonWasPressed(1);
		remoteControl.offButtonWasPressed(1);
		remoteControl.undoButtonWasPressed();

		remoteControl.onButtonWasPressed(2);
		remoteControl.undoButtonWasPressed();
	}
}
