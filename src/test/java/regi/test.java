package regi;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	
	

	
	
@Test
public void f() throws InterruptedException 
{
	 
	      WebDriver driver;
	      WebDriverManager.firefoxdriver().setup();
          driver= new FirefoxDriver();
          driver.manage().window().maximize(); 
		  driver.get("https://www.spicejet.com");
		  
		  Actions a = new Actions(driver);
		  WebElement one_way_checkbox = driver.findElement(By.xpath("(//div[@data-testid='one-way-radio-button']//div[contains(@class,'css-1dbjc4n')])[1]"));
		  @SuppressWarnings("deprecation")
		  WebDriverWait wait = new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@data-testid='one-way-radio-button']//div[contains(@class,'css-1dbjc4n')])[1]")));
		  if(!one_way_checkbox.isSelected())
		  {
		  System.out.println("The element is not selected.");
		  a.moveToElement(one_way_checkbox).click().build().perform();
		   } 
		  else 
		   {
              System.out.println("The element is selected.");
		   }
		  
		  WebElement input_from = driver.findElement(By.xpath("(//div[@data-testid='to-testID-origin']/div/div)[2]"));
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@data-testid='to-testID-origin']/div/div)[2]")));
		  a.moveToElement(input_from).build().perform();
		  Thread.sleep(3000);
		  a.click().sendKeys("agr").perform();
		  
		  Thread.sleep(3000);
		  //a.sendKeys(Keys.TAB).build().perform();
		  a.sendKeys("de").perform();
		  
		  WebElement depart_date = driver.findElement(By.cssSelector(".css-76zvg2"));
		  a.moveToElement(depart_date).contextClick().build().perform();
		  
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-testid='home-page-flight-cta']")));
		  WebElement search_button= driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']"));
		  a.moveToElement(search_button).click().build().perform();
		  
		  
		  
		  Thread.sleep(3000);
		  String currentUrl = driver.getCurrentUrl();
		  driver.navigate().to(currentUrl);
		  
		  
		  WebElement modify_search = driver.findElement(By.xpath("(//div[contains(@class,'css-1dbjc4n')][contains(@class,'r-obd0qt')]//div[contains(@class,'css-1dbjc4n')][contains(@class,'r-1awozwy')])[1]"));
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(@class,'css-1dbjc4n')][contains(@class,'r-obd0qt')]//div[contains(@class,'css-1dbjc4n')][contains(@class,'r-1awozwy')])[1]")));
		  boolean mofifier_la_recherche=modify_search.isDisplayed();
		  Assert.assertTrue(mofifier_la_recherche);
		  System.out.println("L'assertion a réussi : le msg modifier la recherche s'affiche");
                 
}}
	
	
	
	/* @Test
  public void TestListeNonSelect() {
		  
	       WebDriver driver;
	       WebDriverManager.firefoxdriver().setup();
           driver= new FirefoxDriver();
           driver.manage().window().maximize(); 
		   driver.get("https://www.google.fr/");
		   
		   WebElement b = driver.findElement(By.id("APjFqb"));
		   b.sendKeys("ibrid");
		   
		   @SuppressWarnings("deprecation")
		   WebDriverWait wait = new WebDriverWait(driver, 10);
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@jsname='bw4e9b']")));
		   WebElement list = driver.findElement(By.xpath("//ul[@jsname='bw4e9b']"));
		   List <WebElement > lists =list.findElements(By.tagName("span"));
		   lists.get(0).click();
		   
		   String msg = driver.findElement(By.xpath("//h3[contains(text(),'iBridge: Home')]")).getText();
		   Assert.assertEquals(msg, "iBridge: Home", "hi");
		   
		   
		   //lists.size();
		 //for (int i=0;i<lists.size();i++)
		  //{
		  //if (lists.get(i).getText().contains("x"))
		  //{
			 // lists.get(i).click();
		      //break;
		  //} 
		  //}
		 
  }}*/
	
	
	

  /* @Test
  public void TestElementSousMenu() {
	   
  
	      WebDriver driver;
	      WebDriverManager.firefoxdriver().setup();
          driver= new FirefoxDriver();
          driver.manage().window().maximize(); 
		  driver.get("https://freecrm.com/");
		  
		  @SuppressWarnings("deprecation")
		  WebDriverWait wait = new WebDriverWait(driver, 10);
	      wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader")));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='rd-navbar-nav']")));
		  WebElement list = driver.findElement(By.xpath("//ul[@class='rd-navbar-nav']"));
		  List <WebElement > lists =list.findElements(By.tagName("a"));
		  lists.get(0).click();
		  
		  
		  WebElement mail = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		  mail.sendKeys("khawlahammami76@gmail.com");
		  
		  WebElement mot_de_passe = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		  mot_de_passe.sendKeys("Hammami22!");
		  
		  WebElement validerButton = driver.findElement(By.xpath("//div[contains(text(),'Login')]"));
		  validerButton.click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#main-nav")));
		  WebElement deal = driver.findElement(By.xpath("//div[@id='ui']//div//div//div[5]//button"));
		  deal.click();
		  
		  WebElement create_new_deal= driver.findElement(By.xpath("//span[contains(@class,'selectable')]"));
		  boolean msgtrue=create_new_deal.isDisplayed();
		  
		  SoftAssert softAssert = new SoftAssert();
		  softAssert.assertEquals(msgtrue, false, "le message ne s'affiche pas");
		  
		  WebElement input_button_name = driver.findElement(By.xpath("//input[@name='title']"));
		  input_button_name.sendKeys("khawla");
		  
		  
		  driver.quit();
		  
   }}*/
	
	
	

		 /* @Test
		  public void TestElementSousMenu() throws InterruptedException {
			  
		  
			     WebDriver driver;
			     WebDriverManager.firefoxdriver().setup();
		         driver= new FirefoxDriver();
		         driver.manage().window().maximize();
				 driver.get("https://www.skyscanner.fr/");
				 
				 @SuppressWarnings("deprecation")
				 WebDriverWait wait = new WebDriverWait(driver, 10);
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("originInput-input")));
				 
				 
				 WebElement n = driver.findElement(By.id("originInput-input"));
				 
				 Actions a = new Actions(driver);
				 a.moveToElement(n).click().perform();
				 
				 Thread.sleep(3000);
				 a.moveToElement(n).sendKeys("a").build().perform();
				 
				 Thread.sleep(3000);
				 a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
				 
				 String ville_souhaite=n.getAttribute("value");
				 Assert.assertEquals(ville_souhaite, "Athens International (ATH)", "la bonne ville_souhaite");
				 
				 driver.quit();
		  }}*/
	
	
	
		  
				 /* @Test
				  public void defilerPageToClickElement() {
					  
				 
					  WebDriver driver;
					  WebDriverManager.firefoxdriver().setup();
				      driver= new FirefoxDriver();
				      driver.manage().window().maximize(); 
					  driver.get("https://demo.guru99.com/seo/page-1.html");
					  
					  WebElement buttonJemeter = driver.findElement(By.linkText("Jmeter"));
					  JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
					  jsExecutor.executeScript("arguments[0].click();",buttonJemeter);
					  
					  driver.quit();
					}}*/
	
	
	
	
	/*@SuppressWarnings("deprecation")
	@Test
	  public void defilerPageToClickElementframe() {
		
	
		  WebDriver driver;
		  WebDriverManager.firefoxdriver().setup();
	      driver= new FirefoxDriver();
	      driver.manage().window().maximize(); 
	      driver.get("https://demo.guru99.com/test/guru99home/");
	      
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
	      WebElement frameElement =driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
	      driver.switchTo().frame(frameElement);
	      
	      
	      WebElement buttonJemeter = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	      JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		  jsExecutor.executeScript("arguments[0].click();",buttonJemeter);
		  
		  
	      driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
	} 
}*/
	
	
	
	
/*@Test
	  public void calendrierDatedetypeInput() throws InterruptedException {
		
	
		  WebDriver driver;
		  WebDriverManager.firefoxdriver().setup();
	      driver= new FirefoxDriver();
	      driver.manage().window().maximize(); 
	      driver.get("https://www.promohotel.tn/");
	      
	      WebElement elementVille =driver.findElement(By.cssSelector(".bs-placeholder"));
	      elementVille.click();
	      
	      WebElement elementInput =driver.findElement(By.className("form-control"));
	      elementInput.sendKeys("tunis");
	      
	      WebElement dropdown = driver.findElement(By.cssSelector(".dropdown-menu"));
	      WebElement optionToSelect = dropdown.findElement(By.xpath("//span[@class='font-size-16']"));
	      optionToSelect.click();
	      
	      

	      WebElement date =driver.findElement(By.xpath("//input[@id='check_in' and @name='dateDebut']"));
	      JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	      jsExecutor.executeScript("arguments[0].setAttribute('value', '11/10/2023');", date);
	      jsExecutor.executeScript("var event = new Event('change'); arguments[0].dispatchEvent(event);", date);
	      
	     
	      
	      WebElement date2 =driver.findElement(By.xpath("//*[@id='check_out']"));
	      jsExecutor.executeScript("arguments[0].setAttribute('value','15/10/2023');",date2);
	      jsExecutor.executeScript("var event = new Event('change'); arguments[0].dispatchEvent(event);", date2);
	      
	     
	      
	      WebElement nbreNuite = driver.findElement(By.xpath("//input[@id='nuitees']"));
	      nbreNuite.clear();
	      nbreNuite.sendKeys("2");
	      
	      WebElement dernierDiv = driver.findElement(By.xpath("//form[@class='js-validate']//div//div[5]//button"));
	      dernierDiv.click();
	      
	      WebElement resultat_affiche = driver.findElement(By.xpath("//h3[contains(@class,'font-size-21')]"));
	      String nombre_hotel = resultat_affiche.getText();
	      
	      WebElement nbre = driver.findElement(By.xpath("//span[@id='nbresult']"));
	      String nbrehotel = nbre.getText();
	      
	      Assert.assertEquals(nombre_hotel, nbrehotel +" Hôtel(s) trouvé(s)", "Le nombre d'hôtels trouvé ne correspond pas");
	      
}
}*/
	
	
	
	/*@Test
	public void verifCheckBox() throws InterruptedException {
		
		  WebDriver driver;
		  WebDriverManager.firefoxdriver().setup();
	      driver= new FirefoxDriver();
	      driver.manage().window().maximize(); 
	      driver.get("https://www.spicejet.com/");
	      
	      Actions a = new Actions(driver);
	      WebElement villeButton = driver.findElement(By.xpath("//div[contains(text(),'From')]"));
	      a.moveToElement(villeButton).click().sendKeys("Agart").build().perform();
	      
	      
	      WebElement ville2Button = driver.findElement(By.cssSelector(".r-1862ga2.r-1enofrn.r-u8s1d"));
	      a.moveToElement(ville2Button).sendKeys("Delhi").build().perform();
	      
	      WebElement calendrierDepart = driver.findElement(By.xpath("(//div[contains(@class, 'css-1dbjc4n') and contains(@class, 'r-1awozwy')]//div[contains(@class, 'css-76zvg2') and contains(@class, 'css-bfa6kz')])[1]"));
	      calendrierDepart.click();
	      
	      
	      WebElement checkButton = driver.findElement(By.xpath("//div[contains(text(),'Students')]"));
	      checkButton.click();
	      
	      WebElement rechercheButton = driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']"));
	      rechercheButton.click();
	      
	      Thread.sleep(3000);
	      
	      String url=driver.getCurrentUrl();
	      driver.get(url);
	      
	      WebElement studentVerif = driver.findElement(By.cssSelector(".css-1dbjc4n.r-13awgt0.r-18u37iz.r-1wtj0ep.r-tv6buo"));
	      @SuppressWarnings("deprecation")
		  WebDriverWait wait = new WebDriverWait(driver, 10);
	      wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".css-1dbjc4n.r-13awgt0.r-18u37iz.r-1wtj0ep.r-tv6buo")));
	      String msg= studentVerif.getText();
	      
	      Assert.assertEquals(msg, "Student Discount Bookings", "Hello");
	       
	      driver.quit();
}
}*/
	
	
	
	
/*	@Test
	public void tabulation() throws InterruptedException {
		  WebDriver driver;
		  WebDriverManager.firefoxdriver().setup();
	      driver= new FirefoxDriver();
	      driver.manage().window().maximize(); 
	      driver.get("https://www.skyscanner.fr/?previousCultureSource=GEO_LOCATION&redirectedFrom=www.skyscanner.com");
	   
	      Thread.sleep(3000);
	      WebElement buttonFrom = driver.findElement(By.xpath("//input[@id='originInput-input' and @enterkeyhint='Search']"));
	      buttonFrom.sendKeys("tunis");
	      
	      Thread.sleep(1000); 
	      buttonFrom.sendKeys(Keys.TAB);
	      
	      Thread.sleep(1000);
	      Actions a = new Actions(driver);
	      a.sendKeys(Keys.TAB).build().perform();
	      
	      Thread.sleep(1000);
	      a.sendKeys("paris").click().perform();
	      
	      Thread.sleep(1000);
	      a.sendKeys(Keys.ARROW_DOWN).build().perform();
	      
	      for (int i=0;i<5;i++)
	      {
	      a.sendKeys(Keys.TAB).build().perform();
	      Thread.sleep(1000);
	      }
	      a.sendKeys(Keys.ENTER).build().perform();
	      
	
	}
}*/
	
	
	
	
	
	/*@Test
	public void listeavectab() throws InterruptedException {
		
	
		  WebDriver driver;
		  WebDriverManager.firefoxdriver().setup();
	      driver= new FirefoxDriver();
	      driver.manage().window().maximize(); 
	      driver.get("https://www.google.com/");
	      
	      WebElement RechercherButton = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	      RechercherButton.sendKeys("selenium");
	      
	      Thread.sleep(3000);
	      List<WebElement> listeElement =driver.findElements(By.xpath("//ul[@class='G43f7e' and @jsname='bw4e9b']/li"));
	      
	        for(WebElement webelement :listeElement )
	         {
		       if(webelement.getText().trim().equalsIgnoreCase("selenium"))
		        {
	             webelement.click();
			     break;
		         }
		        Thread.sleep(3000);
		        driver.quit();
		  
              }
	        driver.quit();
	        }
}*/
	
	
	
	
	
	
 /*   @Test
	public void airbnExempleXpath() throws InterruptedException 
          {
    	
	
		  WebDriver driver;
		  WebDriverManager.firefoxdriver().setup();
	      driver= new FirefoxDriver();
	      driver.manage().window().maximize(); 
	      driver.get("https://www.airbnb.fr/");
	      
	      @SuppressWarnings("deprecation")
		  WebDriverWait waitt = new WebDriverWait(driver, 10);
	      waitt.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='https://a0.muscache.com/im/pictures/miso/Hosting-47025046/original/4d713a1e-ab4c-4d70-905f-d24b4042189f.jpeg?im_w=720']")));
	      WebElement abutton = driver.findElement(By.xpath("//img[@src='https://a0.muscache.com/im/pictures/miso/Hosting-47025046/original/4d713a1e-ab4c-4d70-905f-d24b4042189f.jpeg?im_w=720']")); 
	      abutton.click();
	      
	      
	      Thread.sleep(3000);
	      Set<String> wind = driver.getWindowHandles();
	      System.out.println(wind.size());
	      if (wind.size()>1)
	      {
	    	  List<String> windowHandles = new ArrayList<>(wind);
	    	  driver.switchTo().window(windowHandles.get(1));
	    	  System.out.println(wind.iterator());
	    	  @SuppressWarnings("deprecation")
	    	  WebDriverWait wait = new WebDriverWait(driver, 10);
	    	  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".l1ovpqvx.c1h5tsj6.dir.dir-ltr")));
	    	  WebElement cliqueImage = driver.findElement(By.cssSelector(".l1ovpqvx.c1h5tsj6.dir.dir-ltr"));
	    	  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cliqueImage);
	    	  cliqueImage.click();
	    	  
	    	  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".l1ovpqvx.b1luh1ah.c1j7xk73.fnxe19d.dir.dir-ltr")));
	    	  WebElement buttonReserver = driver.findElement(By.cssSelector(".l1ovpqvx.b1luh1ah.c1j7xk73.fnxe19d.dir.dir-ltr"));
	    	  buttonReserver.click();
	    	  
	    	  
	    	  driver.switchTo().window(windowHandles.get(0));
	    	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid='category-bar-filter-button']")));
	    	  WebElement filtreButton = driver.findElement(By.xpath("//button[@data-testid='category-bar-filter-button']"));
	    	  filtreButton.click();
	    	  
	    	 
	    	  //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(@class,'c1dz1hqo')])[1]")));
	    	  //WebElement logementbutton = driver.findElement(By.xpath("(//span[contains(@class,'c1dz1hqo')])[1]"));
	    	  //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", logementbutton);
	    	  //logementbutton.click();
	    	  
	    	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(@class,'atm_dz_1rd30do__oggzyc')]/div/div/div/button)[2]")));
	    	  WebElement appartementButton = driver.findElement(By.xpath("(//div[contains(@class,'atm_dz_1rd30do__oggzyc')]/div/div/div/button)[2]"));
	    	  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", appartementButton);
	    	  
	    	  
	    	  WebElement wifitButton = driver.findElement(By.xpath("//div[@data-testid='filter-item-amenities-4']/div/label/div/div/span"));
	    	  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", wifitButton);
	    	  
	    	  
	    	  WebElement cuisineButton = driver.findElement(By.xpath("(//div[contains(@class,'f16mr5nx')]/span)[5]"));
	    	  cuisineButton.click();
	    	  
	    	  
	    	  WebElement afficherButton = driver.findElement(By.cssSelector(".f17xk0zk a"));
	    	  afficherButton.click();
	    	  
	    	  
	    	  Thread.sleep(3000);
	    	  List<WebElement> imgs = driver.findElements(By.cssSelector(".itu7ddv.i1mla2as.i1cqnm0r"));
	    	  
	    	  if (imgs.size() > 0)
	    	  {
	             
	              WebElement premiereImage = imgs.get(0);
	              System.out.println(premiereImage.getAttribute("src"));
	              premiereImage.click();
	              
	              
	              Set<String> windr = driver.getWindowHandles();
	    	      System.out.println(wind.size());
	    	      if (wind.size()>1)
	    	      {
	    	    	  List<String> windowHandless = new ArrayList<>(windr);
	    	    	  driver.switchTo().window(windowHandless.get(1));
	    	    	  System.out.println(wind.iterator());
	    	    	 
	    	    	  //Thread.sleep(3000);
	    	    	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Réserver'])[2]")));
	                  WebElement reserver2button = driver.findElement(By.xpath("(//span[text()='Réserver'])[2]"));
	                  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", reserver2button);
	                  
	                  
	                  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h2[@elementtiming='LCP-target'])[3]")));
	                  String detailPrix = driver.findElement(By.xpath("(//h2[@elementtiming='LCP-target'])[3]")).getText();
	                  Assert.assertEquals(detailPrix, "Détails du prix");
	             
                   } 
	    	      
	    	      else 
	    	       {
	                   System.out.println("Aucune image n'a été trouvée.");
	               }
	    	      
	    	      driver.quit();
	         } 
	    	  
	    }
	 }
}*/
	      
	      
	
	

	
	

