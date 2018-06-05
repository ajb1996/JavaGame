package testing;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import morale.Modifier;
import units.Person;

public class CodeTests
{

    @Test
    public void moraleChecker()
    {
	Person p = new Person("test", "01/01/2017");
	p.mm.addModifier("test", 1, "a test of adding");
	assertEquals(1, p.mm.getModifiers().size());
	p.mm.removeByName("test", false);
	assertEquals(0, p.mm.getModifiers().size());
	ArrayList<Modifier> m = new ArrayList<Modifier>();
	int count = 0;
	while (count < 100)
	{
	    m.add(new Modifier("test", 1, "testy"));
	    count++;
	}
	p = new Person("test", "01/01/2017", m);
	assertEquals(100, p.mm.getModifiers().size());
	p.mm.removeByName("test", true);
	assertEquals(99, p.mm.getModifiers().size());
    }
}
