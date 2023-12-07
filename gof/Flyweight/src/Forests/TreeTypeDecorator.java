/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forests;

import java.awt.Graphics;

/**
 *
 * @author hp
 */
public abstract class TreeTypeDecorator extends TreeType {
    protected TreeType decoratedTreeType;

    public TreeTypeDecorator(TreeType decoratedTreeType) {
        super(decoratedTreeType.name, decoratedTreeType.color, decoratedTreeType.otherTreeData);
        this.decoratedTreeType = decoratedTreeType;
    }

    @Override
    public void draw(Graphics g, int x, int y) {
        decoratedTreeType.draw(g, x, y);
    }
}
