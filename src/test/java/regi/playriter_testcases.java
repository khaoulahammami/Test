package regi;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Playriter_page;
import pages.english_page;
import pages.verification_login_page;

public class playriter_testcases extends Base_Test{
	
	english_page EP;
	Playriter_page PP;
	verification_login_page VLP;
	
	
  @Test
  public void verifier_course_playriter()
  {
	 VLP =new  verification_login_page(base_test_driver);
	 VLP.click_on_english_button();
	 EP= new english_page(base_test_driver);
	 EP.click_on_Bootcamp();
	 EP.click_on_Playriter();
	 PP= new Playriter_page(base_test_driver);
	 String titrepage= PP.verifier_msg();
	 Assert.assertEquals(titrepage, "Mastering Playwright: Building a Robust Production Framework");
}
  }
