
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */

public class LiveCricketMatch implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String matchStatus;

    
    public void attach(Observer observer) {
        observers.add(observer);
    }

    
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    
    public void notifyObservers(String matchStatus) {
        this.matchStatus = matchStatus;
        for (Observer observer : observers) {
            observer.update(matchStatus);
        }
    }

}