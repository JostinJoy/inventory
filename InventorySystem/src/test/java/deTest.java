import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class deTest {

	private de obj;
	@Before
	public void setUp() throws Exception {
		obj=new de();
	}

	@After
	public void tearDown() throws Exception {
		
		obj=null;
	}

	@Test
	public void testAddInv() {

		long ans=5+3+2;
		//assertEquals(ans, obj.Add(5,3,2));
	}

}
