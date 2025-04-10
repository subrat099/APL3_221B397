// WoodenDuck class that only implements swimming behavior
public class WoodenDuck extends Duck implements Swimmable {
    @Override
    public void swim() {
        super.swim();
        System.out.println("Wooden Duck is swimming, and it's mute.");
    }
}
