/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class CricketMatchApp {
    public static void main(String[] args) {
        LiveCricketMatch liveMatch = new LiveCricketMatch();

        MatchDisplayScreen screen1 = new MatchDisplayScreen();
        MatchDisplayScreen screen2 = new MatchDisplayScreen();

        liveMatch.attach(screen1);
        liveMatch.attach(screen2);

        // Simulating match updates
        liveMatch.notifyObservers("1st Over: 4 runs");

        // User clicks on another match
        liveMatch.detach(screen1);

        // Simulating more match updates
        liveMatch.notifyObservers("2nd Over: Wicket!");
    }
}
