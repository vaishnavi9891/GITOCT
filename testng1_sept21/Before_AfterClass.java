package testng1_sept21;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Before_AfterClass {
	  @Test
	  public void method1() {
		  System.out.println("ex 1");
	  }
	  @Test
	  public void method2() {
		  System.out.println("ex 2");
	  }
	  
	  @BeforeClass
  public void beforeClass() {
		  System.out.println("Before Class");}

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");}

}
