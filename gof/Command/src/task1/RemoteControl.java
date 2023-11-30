/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task1;

/**
 *
 * @author hp
 */
public class RemoteControl {
private Command command;
public void setCommand(Command command) {
this.command = command;
}
public void pressButton() { command.execute(); }
}