package Third_Script;

import org.testng.annotations.Test;

public class Home_Page_Mvn_ 
{
  @Test
  public void SuccessfulHomepageAccess() 
  {
	  System.out.println("User should get the display message of logging in successfully");
  }
  
  @Test
  public void NavigationLinks() 
  {
	  System.out.println("User should be able to click on given navigation links successfully");
  }
  
  @Test
  public void ContentsDisplay() 
  {
	  System.out.println("After successfull login Content on the page should be displayed correctly");
  }
  
  
  
  
}
