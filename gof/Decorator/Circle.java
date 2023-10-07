package Decorator;

public class Circle implements Shape {
    int circlePrice= 20;
    @Override
    public void draw() {
        System.out.println("Shape of the  Circle");
        System.out.println("Price " + circlePrice);
    }

    @Override
    public int getPrice() {
        return circlePrice;
    }
}
