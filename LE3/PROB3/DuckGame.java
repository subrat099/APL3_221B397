// Main class to test the behaviors of different ducks
public class DuckGame {
    public static void main(String[] args) {
        // Create instances of each type of duck
        Duck rubberDuck = new RubberDuck();
        rubberDuck.swim();

        Duck woodenDuck = new WoodenDuck();
        woodenDuck.swim();

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.swim();
        ((RedHeadDuck) redHeadDuck).fly();
        ((RedHeadDuck) redHeadDuck).quack();

        Duck lakeDuck = new LakeDuck();
        lakeDuck.swim();
        ((LakeDuck) lakeDuck).fly();
        ((LakeDuck) lakeDuck).quack();
    }
}
