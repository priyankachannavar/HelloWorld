import static org.junit.Assert.*;

import org.junit.Test;

public class TestHelloWorld {
	
//	@Test
//	public void testMain() {
//		Hello hello = new Hello();
//		String actualString = hello.sayHello();
//		String expectedString = "Hello World";
//		
//		assertSame("Strings matching. TEST PASSED", expectedString, actualString);
//	}
	
	public static void main(String[] args) 
	{
		System.out.println("Junit START - TestHelloWorld");
		Hello hello = new Hello();
		String actualString = hello.sayHello();
		String expectedString = "Hello World";
		
		assertSame("Strings matching. TEST PASSED", expectedString, actualString);
		System.out.println("Junit END - TestHelloWorld");

	}

}
