/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
abstract class ApplicationFormBuilder {
    protected ApplicationForm form;

    public ApplicationFormBuilder() {
        form = new ApplicationForm();
    }

    public abstract void buildPersonalDetails(String details);
    public abstract void buildEducationalBackground(String background);
    public abstract void buildPreferredDepartment(String department);
    public abstract void buildMarks(int marks);
    public abstract ApplicationForm getForm();
}
