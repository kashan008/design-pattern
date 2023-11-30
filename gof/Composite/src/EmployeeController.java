
import java.util.Iterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.util.Iterator;

public class EmployeeController {
    public void generateOrganogram(IEmployee employee) {
        generateOrganogramHelper(employee, 0);
    }

    private void generateOrganogramHelper(IEmployee employee, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }

        if (employee instanceof BaseEmployee) {
            System.out.println(((BaseEmployee) employee).name);
        }

        if (employee instanceof HOD) {
            Iterator<IEmployee> iterator = ((HOD) employee).getSubordinatesIterator();
            while (iterator.hasNext()) {
                generateOrganogramHelper(iterator.next(), level + 1);
            }
        } else if (employee instanceof Director) {
            Iterator<IEmployee> iterator = ((Director) employee).getSubordinatesIterator();
            while (iterator.hasNext()) {
                generateOrganogramHelper(iterator.next(), level + 1);
            }
        }
    }

    public void activateBonus(IEmployee employee, int percentageOfBonus) {
        employee.giveBonus(percentageOfBonus);

        if (employee instanceof HOD) {
            Iterator<IEmployee> iterator = ((HOD) employee).getSubordinatesIterator();
            while (iterator.hasNext()) {
                activateBonus(iterator.next(), percentageOfBonus);
            }
        } else if (employee instanceof Director) {
            Iterator<IEmployee> iterator = ((Director) employee).getSubordinatesIterator();
            while (iterator.hasNext()) {
                activateBonus(iterator.next(), percentageOfBonus);
            }
        }
    }
}
