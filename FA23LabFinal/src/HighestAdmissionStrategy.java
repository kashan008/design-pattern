/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
class HighestMarksAdmissionStrategy implements AdmissionStrategy {
    private final int thresholdMarks;

    public HighestMarksAdmissionStrategy(int threshold) {
        this.thresholdMarks = threshold;
    }

    public boolean evaluate(ApplicationForm application) {
        return application.getMarks() >= thresholdMarks;
    }
}
