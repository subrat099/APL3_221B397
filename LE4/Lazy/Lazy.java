import java.util.Optional;

public class Lazy {
    public static void main(String[] args) {
        Optional<Integer> result = Optional.ofNullable(null);

        System.out.println("Lazy Evaluation Result: " + result.orElseGet(() -> expensiveComputation()));
    }

    private static int expensiveComputation() {
        System.out.println("Performing expensive computation...");
        return 42;
    }
}