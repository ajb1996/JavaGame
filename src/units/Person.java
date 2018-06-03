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

	public Person(String n, Date d) {
		name = n;
		dob = d;
		mm = new MoraleManager();
	}

	public Person(String n, String d) {
		name = n;
		try {
			dob = new SimpleDateFormat("dd/MM/YYYY").parse(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mm = new MoraleManager();
	}
	
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
