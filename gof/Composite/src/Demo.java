/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Demo {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Alice", 50000, "PhD", "Active");
        Teacher teacher2 = new Teacher("Bob", 48000, "Masters", "Active");
        DOO doo = new DOO("Charlie", 75000, "Senior");

        HOD hodMath = new HOD("Dave", 80000, "Mathematics Department");
        Director director = new Director("Eve", 100000);

        hodMath.addSubordinate(teacher1);
        hodMath.addSubordinate(teacher2);
        director.addSubordinate(hodMath);
        director.addSubordinate(doo);

        University university = new University();
        university.addObserver(teacher1);
        university.addObserver(teacher2);
        university.addObserver(doo);
        university.addObserver(hodMath);
        university.addObserver(director);

        EmployeeController controller = new EmployeeController();

        System.out.println("University Employee Organogram:\n");
        
        controller.generateOrganogram(director);

        
        System.out.println("\nActivating Bonus:");

        
        controller.activateBonus(director, 10);

        
        System.out.println("\nNotifying Observers:");

        
        university.notifyAllObservers("University has updated its policies.");
    }
}
