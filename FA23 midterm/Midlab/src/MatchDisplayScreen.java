/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class MatchDisplayScreen implements Observer {
    private String matchStatus;

    @Override
    public void update(String matchStatus) {
        this.matchStatus = matchStatus;
        // Update the display with the latest match status
        System.out.println("Ball-by-ball Coverage: " + matchStatus);
    }
}
