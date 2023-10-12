/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iterator;

/**
 *
 * @author hp
 */


public interface Iterator {
    boolean hasNext();

    Object next();

    boolean hasPrevious();

    Object previous();

    Object moveTofirst();

    Object moveTolast();
}
