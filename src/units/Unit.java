package units;

import java.util.ArrayList;

import core.GameObject;

public class Unit extends GameObject
{
    public ArrayList<Person> members;

    public Unit(double x, double y)
    {
	super(x, y);
	members = new ArrayList<Person>();
    }

    public Unit(double x, double y, ArrayList<Person> p)
    {
	super(x, y);
	members = p;
    }

    /**
     * gets the morale for the unit as a whole
     * 
     * @param avg whether to return an average or total
     */
    public double getUnitMorale(boolean avg)
    {
	double m = 0.0;
	for (Person p : members)
	{
	    m += p.mm.getMorale();
	}

	if (avg)
	{
	    m = m / members.size();
	}

	return m;
    }

}
