/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chat;

/**
 *
 * @author hp
 */
public class MediatorPatternDemo {

    private static Teacher Teacher;

    public static void main(String[] args) {
        Userinterface robert = new User("Robert");
        Userinterface john = new User("John");

        Userinterface teacher1 = new Teacher("Robert");
        Userinterface teacher2 = new Teacher("John");

        robert.sendMessage(john, "kashan");
        john.sendMessage(robert, "njb");
         teacher1.sendMessage(john, "you are pass");
          teacher2.sendMessage(robert, "you are fail");
    }
}