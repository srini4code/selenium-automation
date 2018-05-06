package org.itlink.selenium.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class LoginTest {
	@Test(description="Sign-up User",testName="registration",suiteName="Login")
	public void testRegister() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	WebDriverWait wait = new WebDriverWait(driver, 30);
        String baseUrl = "http://newtours.demoaut.com/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        
        // get the actual value of the title
        actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
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
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    //    driver.findElement(By.name("register")).click();
        WebElement submitbutton;
        submitbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("register")));
        submitbutton.click();
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
