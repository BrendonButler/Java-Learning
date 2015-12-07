import java.io.Console;

public class Test {

    private static Console console = System.console();

    public static void main(String[] args) {
        console.printf("Hey look, it works!");

		System.exit(0);
    }
}