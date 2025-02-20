// LakeDuck class that implements flying and quacking behaviors
public class LakeDuck extends Duck implements Flyable, Quackable {
    @Override
    public void fly() {
        System.out.println("Lake Duck is flying");
    }

    @Override
    public void quack() {
        System.out.println("Lake Duck is quacking");
    }
}
