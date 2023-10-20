/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chat;


public class User implements Userinterface{
   private String name;

   
   public String getName() {
      return name;
   }

   public User(String name){
      this.name  = name;
   }

    
    public void sendMessage(Userinterface user, String message) {
    ChatRoom.showMessage(this, message);
    }

   
 
   
}