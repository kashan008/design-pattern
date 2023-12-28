
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
class AdmissionFacade {
    private AdmissionStatus admissionStatus;
    private AdmissionStrategy admissionStrategy;
    private ApplicationFormBuilder formBuilder;

    public AdmissionFacade(AdmissionStatus status, AdmissionStrategy strategy, ApplicationFormBuilder builder) {
        this.admissionStatus = status;
        this.admissionStrategy = strategy;
        this.formBuilder = builder;
    }

    public void applyApplication(String details, String background, String department, int marks) {
        formBuilder.buildPersonalDetails(details);
        formBuilder.buildEducationalBackground(background);
        formBuilder.buildPreferredDepartment(department);
        formBuilder.buildMarks(marks);
        ApplicationForm application = formBuilder.getForm();

        boolean isAdmitted = admissionStrategy.evaluate(application);

        if (isAdmitted) {
            admissionStatus.setStatus("Admitted: " + application);
        } else {
            admissionStatus.setStatus("Not Admitted: " + application);
        }
    }

    public String checkEligibility(ApplicationForm application) {
       
        return "Eligibility Checked"; // Placeholder for actual implementation
    }

    public void submitFee(String paymentDetails) {
        
        System.out.println("Processing fee submission: " + paymentDetails);
    }

    public void decideAdmission(List<ApplicationForm> applications) {
        for (ApplicationForm app : applications) {
            boolean isAdmitted = admissionStrategy.evaluate(app);
            if (isAdmitted) {
                admissionStatus.setStatus("Admitted: " + app);
            } else {
                admissionStatus.setStatus("Not Admitted: " + app);
            }
        }
    }
}
