// Animal.java (Base class for polymorphism)
abstract class Animal {
    // Abstract method makeVoice to be overridden by each animal
    public abstract void makeVoice();
}

class Cow extends Animal {
    @Override
    public void makeVoice() {
        System.out.println("Moo");
    }
}

class Dog extends Animal {
    @Override
    public void makeVoice() {
        System.out.println("Bark");
    }
}

class Pig extends Animal {
    @Override
    public void makeVoice() {
        System.out.println("Oink");
    }
}

class Goat extends Animal {
    @Override
    public void makeVoice() {
        System.out.println("Bleat");
    }
}

class Lion extends Animal {
    @Override
    public void makeVoice() {
        System.out.println("Roar");
    }
}

// Voice2.java (Template method pattern applied)
class Voice2 {
    private Animal[] animals = new Animal[5];

    // Template method to enforce the correct sequence
    public void templateMethod() {
        prepareVoice();
        hear();
    }

    // Prepare the voices
    private void prepareVoice() {
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    // Hear the voices
    private void hear() {
        for (Animal animal : animals) {
            animal.makeVoice(); // Polymorphism in action
        }
    }
}

// Test2.java (Testing class)
public class Test2 {
    public static void main(String[] args) {
        Voice2 voice = new Voice2();
        voice.templateMethod(); // This ensures that the methods are called in the correct order
    }
}
