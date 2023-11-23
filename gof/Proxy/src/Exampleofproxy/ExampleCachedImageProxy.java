/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exampleofproxy;

import proxy.Image;

/**
 *
 * @author hp
 */
public class ExampleCachedImageProxy {

    public static void main(String[] args) {
        // Create an instance of CachedImageProxy with a filename
        Image image = new CachedImageProxy("test_image.jpg");

        // Attempt to display the image. This will load and display it if not cached.
        image.display("1234"); // Assuming "1234" is the correct code for the image

        System.out.println("\nAttempting to display the image again:");
        // Try to display the image again. This time it should be loaded from cache.
        image.display("1234");
    }
}