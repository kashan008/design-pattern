/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
class Parent implements Observer {
    private String name; // Additional attribute to identify the parent

    // Constructor to set parent name
    public Parent(String name) {
        this.name = name;
    }

    public void update(String notification) {
        // Implementation for how parent receives updates
        System.out.println("Notification for Parent of " + name + ": " + notification);
        // More complex notification logic can be implemented here
    }
}
