package testng1_sept21;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NoMethod {
  @Test
  public void testA() {
	  System.out.println("sample test");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
	  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
	  }

}
