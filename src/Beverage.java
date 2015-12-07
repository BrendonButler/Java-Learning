public class Beverage {

	private int fillAmount;
	private String size = "medium";

	public static final int MAX_FILL_PERCENT = 100;

	public Beverage(String size) {
		this.size = size;
		this.fillAmount = 0;
	}

	public int getFillLevel() {
		return this.fillAmount;
	}

	public String getSize() {
		return this.size;
	}

	public void fill() {
		this.fillAmount = MAX_FILL_PERCENT;
	}
}