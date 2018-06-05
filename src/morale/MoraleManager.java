package morale;

import java.util.ArrayList;
import java.util.Iterator;

public class MoraleManager
{

    private ArrayList<Modifier> modifiers;

    /**
     * creates a new empty list of modifiers
     */
    public MoraleManager()
    {
	modifiers = new ArrayList<Modifier>();
    }

    /**
     * creates a new list of modifiers using the parsed list
     * 
     * @param m a list of modifiers
     */
    public MoraleManager(ArrayList<Modifier> m)
    {
	modifiers = m;
    }

    /**
     * adds a modifier to the list
     * 
     * @param m a modifier
     */
    public void addModifier(Modifier m)
    {
	modifiers.add(m);
    }

    /**
     * creates and adds a modifier to the list
     * 
     * @param n the name of the modifier
     * 
     * @param m the modifier value
     * 
     * @param d the description of the modifier
     */
    public void addModifier(String n, double m, String d)
    {
	modifiers.add(new Modifier(n, m, d));
    }

    /**
     * remove a modifier by it's name
     * 
     * @param n the name of the modifier
     * @param firstOnly should only the first occurrence be deleted
     */
    public void removeByName(String n, boolean firstOnly)
    {
	Iterator<Modifier> i = modifiers.iterator();

	while (i.hasNext())
	{
	    Modifier m = i.next();
	    if (m.getName().equals(n))
	    {
		i.remove();
		if(firstOnly == true)
		{
		    break;
		}
	    }
	}
    }

    
    /**
     * returns the list of modifiers
     *
     *
     *@return a list of modifiers
     */
    public ArrayList<Modifier> getModifiers()
    {
	return modifiers;
    }
    
    public double getMorale()
    {
	double t = 0.0;
	for(Modifier m : modifiers)
	{
	   t+= m.getModifier();
	}
	
	return t;
    }
}
