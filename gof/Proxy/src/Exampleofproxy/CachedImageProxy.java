/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exampleofproxy;

import java.io.File;
import proxy.Image;
import proxy.RealImage;

/**
 *
 * @author hp
 */
public class CachedImageProxy implements Image {
   private Image realImage;
   private String fileName;
   private String cacheDirectory = "/cache/";

   public CachedImageProxy(String fileName) {
      this.fileName = fileName;
   }

   
   public void display(String displayCode) {
      if (!isCached(fileName)) {
         realImage = new RealImage(fileName, displayCode);
      }
      System.out.println("Displaying cached " + fileName);
   }

   private boolean isCached(String fileName) {
      // Check if the file exists in the cache directory
      File file = new File(cacheDirectory + fileName);
      return file.exists();
   }
}
