package testng1_sept21;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Before_AfterMethods {
  @Test
  public void method1() {
	  System.out.println("ex 1");
  }
  @Test
  public void method2() {
	  System.out.println("ex 2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

}
