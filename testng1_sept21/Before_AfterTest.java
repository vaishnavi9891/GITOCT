package testng1_sept21;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Before_AfterTest {
  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
	  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
	  }

}
