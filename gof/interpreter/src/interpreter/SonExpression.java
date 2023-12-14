/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interpreter;

/**
 *
 * @author hp
 */
public class SonExpression implements Expression {
    
    private Expression parent = null;
    private Expression child = null;

    public SonExpression(Expression parent, Expression child) {
        this.parent = parent;
        this.child = child;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(child.interpret(context) + " is a son of " + parent.interpret(context));
    }
}