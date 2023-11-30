
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class HOD extends BaseEmployee {
    private List<IEmployee> subordinates = new ArrayList<>();
    private String departmentName;

    public HOD(String name, double salary, String departmentName) {
        super(name, salary);
        this.departmentName = departmentName;
    }

    public void addSubordinate(IEmployee employee) {
        subordinates.add(employee);
    }

    public void removeSubordinate(IEmployee employee) {
        subordinates.remove(employee);
    }

    public Iterator<IEmployee> getSubordinatesIterator() {
        return subordinates.iterator();
    }
}
