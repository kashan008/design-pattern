/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class AviPlayer implements AdvancedMediaPlayer {
   @Override
   public void playVlc(String fileName) {
      // Do nothing
   }

   @Override
   public void playMp4(String fileName) {
      // Do nothing
   }

   @Override
   public void playAvi(String fileName) {
      System.out.println("Playing avi file. Name: " + fileName);
   }
}
