package Behavioral.CommandPattern;

/**
 * COMMAND PATTERN: The Client / Main Test
 * 
 * This is where we tie everything together.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        // 1. The Invoker (The Remote)
        SimpleRemoteControl remote = new SimpleRemoteControl();

        // 2. The Receiver (The Light)
        Light light = new Light();

        // 3. The Command (Light On)
        LightOnCommand lightOn = new LightOnCommand(light);

        // 4. Pass the Command to the Invoker
        remote.setCommand(lightOn);

        // 5. Press the button!
        remote.pressButton();

        LightOffCommand lightOff = new LightOffCommand(light);
        remote.setCommand(lightOff);
        remote.pressButton();

    }
}
