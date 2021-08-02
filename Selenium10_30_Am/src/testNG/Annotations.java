package testNG;

import org.testng.annotations.Test;

public class Annotations {
  @Test
  public void f() {
	  System.out.println("Print f method");
  }
  @Test(priority=4)
  public void a() {
	  System.out.println("Print a method");
  }
  @Test(priority=1)
  public void z() {
	  System.out.println("Print z method");
  }
  @Test(priority=2)
  public void k() {
	  System.out.println("Print k method");
  }
}
