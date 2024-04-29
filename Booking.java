package ObjectOriented;

//import javax.jws.WebService;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking 
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Aditi\\eclipse-workspace\\CarRental\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Booking obj = new Booking();
        obj.GoToWebsite(driver);
        
    }
    
    public void GoToWebsite(WebDriver driver)
    {
        driver.get("https://www.ca.kayak.com/");
    }
    public WebElement searchHotels(WebDriver driver)
    {
        WebElement menuoption = driver.findElement(By.xpath("//div[@class = 'dJtn-menu-item-title' and text() = 'Stays']"));
        menuoption.click();
        return menuoption;
    }
    
}

