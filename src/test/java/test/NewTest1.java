package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 {
@Test
	public void sub() {
	int a=10;
	int b=20;
	Assert.assertEquals(10,b-a);
	System.out.println("hello1");
}
}
