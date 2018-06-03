package morale;

import java.util.ArrayList;

public class MoraleManager {

	private ArrayList<Modifier> modifiers;
	
	
	/*
	 * creates a new empty list of modifiers
	 */
	public MoraleManager()
	{
		modifiers = new ArrayList<Modifier>();
	}
	
	/*
	 *creates a new list of modifiers using the parsed list 
	 *@param m a list of modifiers
	 */
	public MoraleManager(ArrayList<Modifier> m)
	{
		modifiers = m;
	}
	

	/*
	 * adds a modifier to the list
	 * @param m a modifier
	 */
	public void addModifier(Modifier m) {
		modifiers.add(m);
	}

	/*
	 * creates and adds a modifier to the list
	 * @param n the name of the modifier
	 * @param m the modifier value
	 * @param d the description of the modifier
	 */
	public void addModifier(String n, double m, String d) {
		modifiers.add(new Modifier(n, m, d));
	}

	
	/*
	 * remove a modifier by it's name
	 * @param n the name of the modifier 
	 */
	public void removeByName(String n) {
		for (Modifier m : modifiers) {
			if (m.getName().equals(n)) {
				modifiers.remove(m);
			}
		}

	}
}
