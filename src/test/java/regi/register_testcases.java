package regi;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pages.register_page;
import pages.verif_page;
import pages.verification_login_page;

public class register_testcases extends Base_Test {
	register_page RP;
	verif_page VP;
	verification_login_page VL;
	
	
	


	@Test(dataProvider="test_data",priority = 2)
	  public void registerTestCases(String prenom ,String mail,String Password,String ville) throws InterruptedException 
	  {
		
		RP= new register_page(base_test_driver);
		RP.click_on_register();
		RP.remplir_prenom(prenom);
		RP.remplir_mail(mail);
		RP.remplir_motDePasse(Password);
		RP.remplir_ville(ville);
		RP.cocher_case_a_cocher();
		RP.valider_formulaire();
		VP= new verif_page(base_test_driver);
		String msg=VP.verifier_msg();
		Assert.assertEquals(msg, "Resend email");
		VP.retourner_register();
		
       }
	
	
	
	@Test (dataProvider="test_data_login",priority = 1)
	public void loginTestCases(String mail,String motsepasse)
	{
	RP= new register_page(base_test_driver);
	RP.click_on_login();
	RP.remplir_mail_login(mail);
	RP.remplir_pasword_login(motsepasse);
	RP.valider_login();
	VL= new verification_login_page(base_test_driver);
	String msg=VL.verifier_msg();
	Assert.assertEquals(msg, "English Language");
	} 
	
	
	
	
	 @DataProvider 
	  public Object [][]test_data()
	  {
		  return new Object[][] 
			    	{

			            { "khawla", "khawla258@gmail.com","hammami","tunis" },
			            { "zeineb", "zeineb258@gmail.com","hammami","france" },
			            { "malek", "malek258@gmail.com","hammami","belgique" }

			        };
	  }
			        
	 @DataProvider	        
        public Object [][]test_data_login()
			  	  {
		 return new Object[][] 
			  		{

			  			  { "khawlahammami76@gmail.com","hammami22!"}
			  			        
			  		};
			  	  }
}