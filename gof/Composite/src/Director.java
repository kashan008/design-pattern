
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Director extends BaseEmployee {
    private List<IEmployee> subordinates = new ArrayList<>();

    public Director(String name, double salary) {
        super(name, salary);
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
