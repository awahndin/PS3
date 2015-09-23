import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;



public class PS3Test {
	
	Account c;
	@Before
	public void setUp() throws Exception {
		c = new Account(1122, 20000);
	}
	
	@Test 
	public void testWithdraw() {
		c.deposit(3000);
		//assertEquals("");
		fail("Not yet implemented");
		
	}

	@After
	public void tearDown() throws Exception {
		c = null;
	}
}
