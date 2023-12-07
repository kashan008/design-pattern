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
import java.util.HashMap;
import java.util.Map;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData, boolean isFruitTree, int countOfFruits) {
        String key = name + (isFruitTree ? "_fruit" : "");
        TreeType result = treeTypes.get(key);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            if (isFruitTree) {
                result = new FruitTreeDecorator(result, countOfFruits);
            }
            treeTypes.put(key, result);
        }
        return result;
    }
}
