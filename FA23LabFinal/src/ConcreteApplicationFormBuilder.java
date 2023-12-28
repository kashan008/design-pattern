/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
class ConcreteApplicationFormBuilder extends ApplicationFormBuilder {
    @Override
    public void buildPersonalDetails(String details) {
        form.setPersonalDetails(details);
    }

    @Override
    public void buildEducationalBackground(String background) {
        form.setEducationalBackground(background);
    }

    @Override
    public void buildPreferredDepartment(String department) {
        form.setPreferredDepartment(department);
    }

    @Override
    public void buildMarks(int marks) {
        form.setMarks(marks);
    }

    @Override
    public ApplicationForm getForm() {
        ApplicationForm completedForm = this.form;
        this.reset();
        return completedForm;
    }

    // Resets the builder to a starting state
    private void reset() {
        this.form = new ApplicationForm();
    }
}
