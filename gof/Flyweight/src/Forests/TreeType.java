package Forests;


import java.awt.Color;
import java.awt.Graphics;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.awt.*;

public class TreeType {
    String name;
    Color color;
    String otherTreeData;

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(Graphics g, int x, int y) {
        // Tree drawing logic
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5); // Tree trunk
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10); // Tree crown
    }
}
