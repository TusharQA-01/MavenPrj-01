package Second_Script;

import org.testng.annotations.Test;

public class Login_Page_Mvn_ 
{
  @Test
  public void ValidCredentials() 
  {
	  System.out.println("The credentials should be correct and valid");
  }
  
  @Test
  public void RememberMeOptions()
  {
	  System.out.println("check whether there is remember me options");
  }
  
  @Test
  public void InvalidCredentials()
  {
	  System.out.println("user should not be able to login with invalid credentials");
  }
  
  @Test
  public void EmptyFields()
  {
	  System.out.println("user should get a proper message if he leaves the input fields empty");
  }
  
 
}
