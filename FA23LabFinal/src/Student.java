/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
class Student implements Observer {
    private String name; // Additional attribute to identify the student

    // Constructor to set student name
    public Student(String name) {
        this.name = name;
    }

    public void update(String notification) {
        // Implementation for how student receives updates
        System.out.println("Notification for Student " + name + ": " + notification);
        // More complex notification logic can be implemented here
    }
}
