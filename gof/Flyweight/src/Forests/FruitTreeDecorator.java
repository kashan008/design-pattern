/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forests;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author hp
 */
public class FruitTreeDecorator extends TreeTypeDecorator {
    private int countOfFruits;

    public FruitTreeDecorator(TreeType decoratedTreeType, int countOfFruits) {
        super(decoratedTreeType);
        this.countOfFruits = countOfFruits;
    }

    @Override
    public void draw(Graphics g, int x, int y) {
        super.draw(g, x, y);
        drawFruits(g, x, y);
    }

    private void drawFruits(Graphics g, int x, int y) {
        g.setColor(Color.RED);
        for (int i = 0; i < countOfFruits; i++) {
            g.fillOval(x - 4 + i * 2, y - 9 + i * 2, 3, 3);
        }
    }
}
