package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Tests.AbstractBaseTests.ConnectAppium;


public class OutSystemsNavegation extends ConnectAppium {
    @Test
    public void testNavegation() throws InterruptedException {
        
    		Thread.sleep(5000);
			driver.get("https://entel-dev.outsystemsenterprise.com/CL_Web_Cautivo_SIM_Prepago_CW/WelcomeActivation.aspx?");
	    	Thread.sleep(4000);
	    	driver.findElement(By.xpath("//div[@class='bnt-active-chip']//div[contains(text(),'Activa tu chip con Prepago')]")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.xpath("//div[@class='input-component']//div//input[@placeholder='12.345.678-9']")).sendKeys("19.765.783-9");
	    	Thread.sleep(1000);
	    	driver.findElement(By.xpath("//div[@class='btn first']//input[@value='Continuar']")).click();
	    	Thread.sleep(5000);
	    	driver.findElement(By.cssSelector("div.number-favorite div:nth-child(5) div div.checkbox")).click();
	    	driver.findElement(By.xpath("//div[@class='number-favorite']//div//input[@type='text']")).sendKeys("987654321");
	    	driver.findElement(By.xpath("//div[@class='number-favorite']//div//input[@value='Continuar']")).click();
	    	Thread.sleep(5000);
        
    }
}
