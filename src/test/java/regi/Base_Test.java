package regi;

import java.io.IOException;
import java.lang.reflect.Method;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import Tool.TestTOOL;
import Tool.webLisener;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("deprecation")
public class Base_Test {
	
	
	WebDriver base_test_driver;
	public static ExtentReports report;
	public static ExtentTest test;
	public static ATUTestRecorder recorder;
	public static EventFiringWebDriver edriver;
	public static webLisener webLisener;
	
	
	
	@BeforeMethod 
	  @Parameters({"browser"})

	  public void openSite(@Optional("firefox")String browser, Method methode) throws ATUTestRecorderException


	  { 
		recorder = new ATUTestRecorder("C:\\Users\\khaou\\git\\repository\\regi\\TestReport", "TestVideo-" + methode.getName(), false);
		recorder.start();
		  test = report.startTest(methode.getName());
		  if (browser.equals("firefox"))
				  {
		          WebDriverManager.firefoxdriver().setup();
		          base_test_driver = new FirefoxDriver();
		          edriver=new EventFiringWebDriver(base_test_driver);
		          webLisener = new webLisener();
		          edriver.register(webLisener);
		          base_test_driver=edriver;
		          base_test_driver.manage().window().maximize(); 
		          String url="https://qacart.com/";
		  		  base_test_driver.get(url);
	              }
		  if (browser.equals("chrome"))
				  {
	          WebDriverManager.chromedriver().setup();
	          base_test_driver = new ChromeDriver();
	          edriver=new EventFiringWebDriver(base_test_driver);
	          webLisener = new webLisener();
	          edriver.register(webLisener);
	          base_test_driver=edriver;
	          base_test_driver.manage().window().maximize(); 
	          String url="https://qacart.com/";
	  		 base_test_driver.get(url);
	          }
	  }
	  
	  
	  @AfterMethod
	  public void fermetSite(ITestResult result,Method methode ) throws IOException, ATUTestRecorderException
	  {
		
		  if (result.getStatus() == ITestResult.SUCCESS)
		  {     test.log(LogStatus.PASS,"Test Pass");
		        TestTOOL.tackepicture(base_test_driver, "C:\\Users\\khaou\\git\\repository\\regi\\TestReport\\"+methode.getName()+".png");
		        
		        
		        
			    test.log(LogStatus.PASS,"<a href='" + result.getName() + ".mov" + "'><span class='label_info'>Download video</span></a>");
			    test.log(LogStatus.PASS,"<a href='" + result.getName() + ".png" + "'><span class='label_info'>Download capture</span></a>");
		  }else if (result.getStatus() == ITestResult.FAILURE)
		  {
			  test.log(LogStatus.FAIL, result.getThrowable()); 
			  test.log(LogStatus.FAIL,"<a href='" + result.getName() + ".png" + "'><span class='label_info'>Download capture</span></a>");
			  test.log(LogStatus.FAIL,"<a href='" + result.getName() + ".mov" + "'><span class='label_info'>Download viseo</span></a>");
		  }else 
		  {
			  test.log(LogStatus.SKIP, "Test SKIP");
		  }
			  


		  base_test_driver.quit(); 

		  recorder.stop();
	  }
	  @BeforeSuite
	  public void start() 
	  {

		  report = new ExtentReports("C:\\Users\\khaou\\git\\repository\\regi\\TestReport\\rapportdetest.htm", true);  
		  report.addSystemInfo("Projet Test regiter", "premier projet");
		  report.addSystemInfo("Testeur","khawla");
	  }
	  @AfterSuite
	  public void end() 
	  {
		  report.flush();
	  }
	  
	  
	 
}
