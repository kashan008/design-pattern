/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chat;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author fa20-bse-008
 */
import java.util.Date;

public class ChatRoom {
   public static void showMessage(Userinterface user, String message){
      System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
   }
}