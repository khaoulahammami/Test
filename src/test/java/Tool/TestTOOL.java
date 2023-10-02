package Tool;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;






public class TestTOOL  {
 
	
	public static void tackepicture(WebDriver driver,String filepath ) throws IOException 
	{
		TakesScreenshot snapshot=((TakesScreenshot)driver);
		File scrFile = snapshot.getScreenshotAs(OutputType.FILE);
		
	    FileHandler.copy(scrFile, new File(filepath));
	}
	

	
    
}


