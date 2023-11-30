/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public abstract class BaseEmployee implements IEmployee {
    protected String name;
    protected double salary;

    public BaseEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void giveBonus(int bonusPercentage) {
        this.salary += this.salary * bonusPercentage / 100.0;
        System.out.println(name + " new salary after " + bonusPercentage + "% bonus: " + this.salary);
    }

    @Override
    public void notifyChange(String message) {
        System.out.println(name + " notified: " + message);
    }
}
