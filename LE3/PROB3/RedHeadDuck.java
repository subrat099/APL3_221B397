// RedHeadDuck class that implements flying and quacking behaviors
public class RedHeadDuck extends Duck implements Flyable, Quackable {
    @Override
    public void fly() {
        System.out.println("RedHead Duck is flying");
    }

    @Override
    public void quack() {
        System.out.println("RedHead Duck is quacking");
    }
}
