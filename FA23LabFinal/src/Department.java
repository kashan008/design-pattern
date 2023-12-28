/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.util.ArrayList;
import java.util.List;

class Department {
    private String name;
    private String criteria;
    private List<String> coursesOffered; // List to hold courses

    // Constructor
    public Department(String name, String criteria) {
        this.name = name;
        this.criteria = criteria;
        this.coursesOffered = new ArrayList<>();
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for criteria
    public String getCriteria() {
        return criteria;
    }

    // Setter for criteria
    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    // Method to add a course to the department
    public void addCourse(String course) {
        coursesOffered.add(course);
    }

    // Method to remove a course from the department
    public boolean removeCourse(String course) {
        return coursesOffered.remove(course);
    }

    // Method to display department details
    public void displayDepartmentDetails() {
        System.out.println("Department Name: " + name);
        System.out.println("Admission Criteria: " + criteria);
        System.out.print("Courses Offered: ");
        if (coursesOffered.isEmpty()) {
            System.out.println("No courses offered yet.");
        } else {
            System.out.println(String.join(", ", coursesOffered));
        }
    }

    // Other department-specific methods can be added here...
}
