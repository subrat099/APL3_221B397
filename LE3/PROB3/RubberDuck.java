// RubberDuck class that only implements swimming behavior
public class RubberDuck extends Duck implements Swimmable {
    @Override
    public void swim() {
        super.swim();
        System.out.println("Rubber Duck is swimming, squeaking!");
    }
}
