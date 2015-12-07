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

		String size = console.readLine("How large of a drink would you like?\n>");

		Beverage drink = new Beverage(size);

		if (drink.getFillLevel() == 0) {
			System.out.println("Your cup is currently empty!\nFilling...");

			drink.fill();

			System.out.printf("Your cup is now filled to, %s precent!\n", drink.getFillLevel());
		}

		System.out.printf("%s, we have made you a %s drink!\n", name, drink.getSize());

		console.printf("\nGoodbye!\n");

		System.exit(0);
	}
}