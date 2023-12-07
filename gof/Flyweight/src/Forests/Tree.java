package Forests;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.awt.*;

import java.awt.*;

import java.awt.*;

public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        
        double scale = getScaleForY(y);
        g2d.translate(x, y);
        g2d.scale(scale, scale);
        type.draw(g2d, 0, 0);

        g2d.dispose();
    }

    private double getScaleForY(int y) {
        // Assuming CANVAS_SIZE is the maximum Y value
        if (y < Demo.CANVAS_SIZE / 3) return 0.5; // North - small
        else if (y < 2 * Demo.CANVAS_SIZE / 3) return 1.0; // Middle - medium
        else return 1.5; // South - large
    }
}
