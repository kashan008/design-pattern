/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task1;

/**
 *
 * @author hp
 */
public class LightReplaceCommand implements Command {
    private Light light;

    public LightReplaceCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.switchOff();
        light.displayStatus(); 
        System.out.println("Replacing the light...");

        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Interrupted while replacing the light");
        }

        light.switchOn();
        light.displayStatus();
    }
}
