
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
class DepartmentIterator implements Iterator {
    private List<Department> departments;
    private int position = 0;

    public DepartmentIterator(List<Department> departments) {
        this.departments = departments;
    }

    public boolean hasNext() {
        return position < departments.size();
    }

    public Object next() {
        if (this.hasNext()) {
            return departments.get(position++);
        }
        return null;
    }
}
