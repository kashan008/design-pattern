import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Department csDepartment = new Department("Computer Science", "Minimum GPA of 3.0");
        csDepartment.addCourse("Introduction to Computer Science");
        csDepartment.addCourse("Data Structures");
        csDepartment.addCourse("Algorithms\n");

        Department eeDepartment = new Department("Electrical Engineering", "Minimum GPA of 2.5");
        eeDepartment.addCourse("Circuit Analysis");
        eeDepartment.addCourse("Electromagnetics");
        eeDepartment.addCourse("Control Systems\n");

        List<Department> departments = new ArrayList<>();
        departments.add(csDepartment);
        departments.add(eeDepartment);
        DepartmentAggregate departmentAggregate = new DepartmentAggregate(departments);

        Iterator departmentIterator = departmentAggregate.createIterator();
        while (departmentIterator.hasNext()) {
            Department department = (Department) departmentIterator.next();
            department.displayDepartmentDetails();
        }

        ConcreteApplicationFormBuilder builder = new ConcreteApplicationFormBuilder();
        builder.buildPersonalDetails("John Doe");
        builder.buildEducationalBackground("High School");
        builder.buildPreferredDepartment("Computer Science");
        builder.buildMarks(95); // Assume the student scored 95
        ApplicationForm application = builder.getForm();

        AdmissionStrategy strategy = new HighestMarksAdmissionStrategy(90);

        AdmissionStatus admissionStatus = new AdmissionStatus();
        Student student = new Student("John Doe");
        Parent parent = new Parent("Jane Doe");
        admissionStatus.attach(student);
        admissionStatus.attach(parent);

        AdmissionFacade admissionFacade = new AdmissionFacade(admissionStatus, strategy, builder);
        admissionFacade.applyApplication("John Doe", "High School", "Computer Science", 95);

        application.display();

        String eligibility = admissionFacade.checkEligibility(application);
        System.out.println("\nEligibility Status: " + eligibility);

        admissionFacade.submitFee("Payment Details for John Doe");

        List<ApplicationForm> applications = new ArrayList<>();
        applications.add(application); // Assuming only one application for simplicity
        admissionFacade.decideAdmission(applications);
    }
}
