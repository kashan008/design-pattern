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

public class University {
    private List<IEmployee> employees = new ArrayList<>();

    public void addObserver(IEmployee employee) {
        employees.add(employee);
    }

    public void removeObserver(IEmployee employee) {
        employees.remove(employee);
    }

    public void notifyAllObservers(String message) {
        for (IEmployee employee : employees) {
            employee.notifyChange(message);
        }
    }
}
