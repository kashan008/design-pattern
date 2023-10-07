package ObserverPattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();

        Observer hexaObserver = new HexaObserver(subject);
        Observer octalObserver = new OctalObserver(subject);
        Observer binaryObserver = new BinaryObserver(subject);

        System.out.println("First state change: 25 with all 3 observers");
        subject.setState(25);
        System.out.println("Second state change: 30 with all 3 observers");
        subject.setState(30);
        subject.detach(hexaObserver);
        System.out.println("Second state change: 40 with all 2 observers");
        subject.setState(40);
    }
}