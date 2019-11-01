package testngDemo;


import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class NewTest {
	
  @Parameters({"browser","login"})
  @Test
  public void f1(String browser,String login) {
	  System.out.println(browser+":"+login);
	  assertEquals(true, true);
  }
  
  
  @Parameters({"browser","logout"})
  @Test
  public void f2(String browser,String logout) {
	  System.out.println(browser+":"+logout);
	  assertEquals(true, true);
  }
  
  
  @Parameters({"browser","o2o"})
  @Test
  public void f(String browser,String o2o) {
	  System.out.println(browser+":"+o2o);
	  assertEquals(false, true);
  }
  
  
}
