package units;

import morale.Modifier;
import morale.MoraleManager;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Person {

	private String name;
	private Date dob;
	public MoraleManager mm;

	
	/*
	 * Creates a new person with name n and date of birth d
	 * creates empty morale manager
	 * 
	 * @param n the name of the person
	 * @param d the person's date of birth
	 * @return nothing
	 */
	
	public Person(String n, Date d) {
		name = n;
		dob = d;
		mm = new MoraleManager();
	}

	/*
	 * Creates a new person with name n and date of birth d
	 * creates empty morale manager
	 * uses parsed string to create the date object
	 * 
	 * @param n the name of the person
	 * @param d the person's date of birth
	 * @return nothing
	 */
	public Person(String n, String d) {
		name = n;
		try {
			dob = new SimpleDateFormat("dd/MM/YYYY").parse(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mm = new MoraleManager();
	}
	
	/*
	 * Creates a new person with name n and date of birth d
	 *uses parsed list of modifiers to create morale manager
	 * 
	 * @param n the name of the person
	 * @param d the person's date of birth
	 * @param m a list of modifiers
	 * @return nothing
	 */
	public Person(String n, Date d, ArrayList<Modifier> m)
	{
		name = n;
		dob = d;
		mm = new MoraleManager(m);
	}
	public String getName() {
		return name;
	}

	public Date getDOB() {
		return dob;
	}
}
