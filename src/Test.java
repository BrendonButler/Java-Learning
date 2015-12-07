import java.io.Console;

public class Test {

    private static Console console = System.console();

    public static void main(String[] args) {
        console.printf("Hey look, it works!\n\n");

		boolean emptyName = true;

		String name;

		do {
			name = console.readLine("What is your name?\n> ");

			if (name != null) emptyName = false;
		} while (emptyName);

		console.printf("Are you ready to exit, %s?", name);

		System.exit(0);
    }
}