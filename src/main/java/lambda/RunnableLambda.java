package lambda;

public class RunnableLambda {
    public static void main(String[] args) {

        // Anonymous inner class implementation of Runnable

            new Thread(new Runnable() {
                @Override public void run() {
                    System.out.println( "inside runnable using an anonymous inner class"); } })
                    .start();

        // Using a lambda expression in a Thread constructor
        new Thread(() -> System.out.println( "inside Thread constructor using lambda"))
                .start();

        // Assigning a lambda expression to a variable
        Runnable r = () -> System.out.println("lambda expression implementing the run method using Runnable as a variable");
        new Thread(r).start();

    }
}
