package org.itlink.selenium.selenium_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.firefox.marionette","C:\\Selenium\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://newtours.demoaut.com/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();
        driver.findElement(By.linkText("REGISTER")).click();
        driver.findElement(By.name("firstName")).sendKeys("TestUserFirst");
        driver.findElement(By.name("lastName")).sendKeys("TestUserLast");
        driver.findElement(By.name("phone")).sendKeys("1233214444");
        driver.findElement(By.name("userName")).sendKeys("srini4code@gmail.com");
        driver.findElement(By.name("address1")).sendKeys("9310 Sandy Spring Cir");
        driver.findElement(By.name("city")).sendKeys("Richmond");
        driver.findElement(By.name("state")).sendKeys("VA");
        driver.findElement(By.name("postalCode")).sendKeys("23294");
        Select select = new Select(driver.findElement(By.name("country")));
        select.selectByVisibleText("UNITED STATES");
        driver.findElement(By.name("email")).sendKeys("srini4code@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Password1234");
        driver.findElement(By.name("confirmPassword")).sendKeys("Password1234");
        driver.findElement(By.name("register")).click();
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        */
        //close Fire fox
        
     driver.close();
     driver.quit();
       
	}

}
