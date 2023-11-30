/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task1;

/**
 *
 * @author hp
 */
public class Demo {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light light = new Light();

        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);
        Command lightReplace = new LightReplaceCommand(light);

        // Switch on
        control.setCommand(lightsOn);
        control.pressButton();

        // Replace light
        control.setCommand(lightReplace);
        control.pressButton();

        // Switch off
        control.setCommand(lightsOff);
        control.pressButton();
    }
}
