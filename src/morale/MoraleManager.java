package morale;

import java.util.ArrayList;

public class MoraleManager {

	private ArrayList<Modifier> modifiers;
	
	
	public MoraleManager()
	{
		modifiers = new ArrayList<Modifier>();
	}
	
	public MoraleManager(ArrayList<Modifier> m)
	{
		modifiers = m;
	}

	public void addModifier(Modifier m) {
		modifiers.add(m);
	}

	public void addModifier(String n, double m, String d) {
		modifiers.add(new Modifier(n, m, d));
	}

	public void removeByName(String n) {
		for (Modifier m : modifiers) {
			if (m.getName().equals(n)) {
				modifiers.remove(m);
			}
		}

	}
}
