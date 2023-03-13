package com.browserstack;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BStackDemoTest extends SeleniumTest {
   
    public void addProductToCart() throws Exception {
       
    	DesiredCapabilities caps = new DesiredCapabilities();
    	
    	// Set your access credentials
		caps.setCapability("browserstack.user", "jagadeesh_fKpl7b");
		caps.setCapability("browserstack.key", "JybmMjv9aYXwps7TMbpC");

       // Set URL of the application under test
		caps.setCapability("app", "bs://e1e0b3b2426ca7d44371c959b979ee1f2015e43f");
    	

       // Specify device and os_version for testing
		caps.setCapability("device", "Google Pixel 3");
    	caps.setCapability("os_version", "9.0");

       // Set other BrowserStack capabilities
		caps.setCapability("project", "First Java Project");
		caps.setCapability("build", "browserstack-build-1");
		caps.setCapability("name", "first_test");
		caps.setCapability("autoGrantPermissions", true);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);
		
		Thread.sleep(15000);
		
		 driver.findElement(By.id("btn1")).click();
	      Thread.sleep(5000);
	      driver.findElement(By.id("btn2")).click();
	      Thread.sleep(5000);
	      driver.findElement(By.id("btn3")).click();
	      Thread.sleep(5000);
	      driver.findElement(By.id("btn4")).click();
    }
}
