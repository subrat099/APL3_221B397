public class Eager {
    public static void main(String[] args) {
        int x = expensiveComputation();
        System.out.println(x);
    }

    private static int expensiveComputation() {
       
        return 42;
    }
}
