/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task1;

/**
 *
 * @author hp
 */
public class Light {
    private boolean isOn;

    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
    }

    public void displayStatus() {
        System.out.println("Light is currently " + (isOn ? "ON" : "OFF"));
    }
}
