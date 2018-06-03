package morale;

public class Modifier {

	private String name;
	private double modifier;
	private String description;

	public Modifier(String n, double m, String d) {
		name = n;
		modifier = m;
		description = d;
	}

	public String getName() {
		return name;
	}

	public double getModifier() {
		return modifier;
	}

	public String getDesc() {
		return description;
	}
}
