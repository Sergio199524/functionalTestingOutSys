package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Tests.AbstractBaseTests.ConnectAppium;


public class OutSystemsNavegation extends ConnectAppium {
    @Test
    public void testNavegation() throws InterruptedException {
    	Thread.sleep(5000);
    	driver.get("http://entel-dev.outsystemsenterprise.com/CL_Web_Empresas_DeviceCatalog/");
    	Thread.sleep(5000);
    	driver.findElement(By.id("CL_Web_Empresas_Publico_Layout_wt9_block_wtMainContent_CL_Web_Empresas_DeviceCatalog_CW_wt12_block_wtDeviceList_ctl00_wt5_CL_Web_Empresas_Publico_Patterns_wt28_block_wtButton_wtIWantBuyButton")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='$3.333'])[1]/following::span[1]")).click();
    	Thread.sleep(1000);
    	driver.switchTo().frame(0);
    	driver.findElement(By.id("Nombre")).click();
        driver.findElement(By.id("Nombre")).clear();
        driver.findElement(By.id("Nombre")).sendKeys("Sergio");
        driver.findElement(By.id("Rut")).clear();
        driver.findElement(By.id("Rut")).sendKeys("sergio.vasquez.pincheira@gmail.com");
        driver.findElement(By.id("Movil")).clear();
        driver.findElement(By.id("Movil")).sendKeys("972006179");
        driver.findElement(By.id("empresas_c2c_movil_tellamamos")).click();
        driver.switchTo().parentFrame();
        Thread.sleep(5000);
        
    }
}
