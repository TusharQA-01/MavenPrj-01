package First_Script_;

import org.testng.annotations.Test;

public class Registration_Page_Mvn_ 
{
  @Test
  public void ValidName() 
  {
	System.out.println("The name should be in alphabet :");  
  }
  
  @Test
  public void ValidEmailId()
  {
	  System.out.println("The email should be correct and should match with DOB");
  }
  
  @Test
  public void ValidMobileNo()
  {
	  System.out.println("The Mobile No should be correct and should include country code");

  }
  
  
}
