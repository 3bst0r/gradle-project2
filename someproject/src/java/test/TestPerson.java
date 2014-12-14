package test.java;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestPerson {

	private Person p1, p2;
	
	@Before
	public void setUp() {
		p1 = new Person("Johannes","Ebster","0a1231431j42",new Date(),70);
		p2 = new Person("Johannes","Ebster","0a1231431j42",new Date(),70);
	}
	
	@Test
	public void testHashCode() {
		assertEquals(p1.hashCode(), p2.hashCode());
	}

}
