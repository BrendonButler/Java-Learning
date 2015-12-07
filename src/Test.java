import java.io.Console;

public class Test {

    private static Console console = System.console();

    public static void main(String[] args) {
        console.printf("Hey look, it works!\n\n");

		boolean emptyName = true, readyToExit = false;

		String name, answer;

		do {
			name = console.readLine("What is your name?\n> ");

			if (name != null) emptyName = false;
		} while (emptyName);

		do {
			answer = console.readLine("Are you ready to exit, %s?\n> ", name);

			if (answer.equalsIgnoreCase("yes")) readyToExit = true;
		} while (!readyToExit);

		console.printf("\nGoodbye!\n");

		System.exit(0);
    }
}