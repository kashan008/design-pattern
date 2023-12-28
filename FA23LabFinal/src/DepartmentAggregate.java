
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
class DepartmentAggregate implements Aggregate {
    private List<Department> departments;

    public DepartmentAggregate(List<Department> departments) {
        this.departments = departments;
    }

    public Iterator createIterator() {
        return new DepartmentIterator(departments);
    }
}
