/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxy;

/**
 *
 * @author hp
 */
public class RealImage implements Image {
   private String fileName;
   private String code; // Code for image verification

   public RealImage(String fileName, String code) {
      this.fileName = fileName;
      this.code = code;
      loadFromDisk(fileName);
   }

   public void display(String displayCode) {
      if(this.code.equals(displayCode)) {
         System.out.println("Displaying " + fileName);
      } else {
         System.out.println("Failed to display " + fileName + " due to code mismatch.");
      }
   }

   private void loadFromDisk(String fileName) {
      System.out.println("Loading " + fileName);
   }
}
