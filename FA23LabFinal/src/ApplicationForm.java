/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
class ApplicationForm {
    private String personalDetails;
    private String educationalBackground;
    private String preferredDepartment;
    private int marks;

    // Setters for each field
    public void setPersonalDetails(String personalDetails) {
        this.personalDetails = personalDetails;
    }

    public void setEducationalBackground(String educationalBackground) {
        this.educationalBackground = educationalBackground;
    }

    public void setPreferredDepartment(String preferredDepartment) {
        this.preferredDepartment = preferredDepartment;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
public int getMarks() {
        return this.marks;
    }
    public void display() {
        System.out.println("Application Form Details:");
        System.out.println("Personal Details: " + personalDetails);
        System.out.println("Educational Background: " + educationalBackground);
        System.out.println("Preferred Department: " + preferredDepartment);
        System.out.println("Marks: " + marks);
    }
}

