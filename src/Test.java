import java.io.Console;

public class Test {

	private static Console console = System.console();

	public static void main(String[] args) {
		console.printf("Hey look, it works!\n\n");

		boolean emptyName = true, readyToContinue = false;

		String name, answer;

		do {
			name = console.readLine("What is your name?\n> ");

			if (name != null) emptyName = false;
		} while (emptyName);

		do {
			answer = console.readLine("Are you ready to continue, %s?\n> ", name);

			if (answer.equalsIgnoreCase("yes")) readyToContinue = true;
		} while (!readyToContinue);

		Beverage drink = new Beverage();

		System.out.printf("%s, we have made you a %s drink!\n", name, drink.size);

		console.printf("\nGoodbye!\n");

		System.exit(0);
	}
}