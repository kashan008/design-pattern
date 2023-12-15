/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento;

/**
 *
 * @author hp
 */

import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                // Single Circle
                new Circle(10, 10, 10, Color.BLUE),

                // Single Oval
                new Oval(200, 200, 80, 60, Color.ORANGE), // Added Oval

                // Compound Shape including a Circle and a Dot
                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                // Compound Shape including Rectangle and multiple Dots
                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                ),

                // Compound Shape including Oval, Circle, and Dot
                new CompoundShape(
                        new Oval(300, 300, 70, 40, Color.YELLOW),
                        new Circle(330, 330, 20, Color.BLACK),
                        new Dot(310, 310, Color.BLACK)
                )
        );
    }
}
