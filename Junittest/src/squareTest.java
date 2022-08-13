import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import static java.lang.System.*;
class squareTest {
	@BeforeClass
	public void m1()
	{
		out.print("this will execute befor all test");
	}
	@Before
	void m2()
	{
		out.print("this will execute befor each test");
	}

	@Ignore
	void test() {
		String str4="hello";
		String str5="hello";
		assertSame(str4,str5);
		
		JunitTesting test=new JunitTesting();
	int output=test.square(5);
	assertEquals(24,output);
	
	}
	@Test
	void test1() {
		JunitTesting test=new JunitTesting();
	int count1=test.countA("apple orange")	;
	assertEquals(count1,2);
	}
	

}
