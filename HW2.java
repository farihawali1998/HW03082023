package HW03082023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement text= driver.findElement(By.xpath("//*[contains(text(),'Your content goes here.')]"));
        text.clear();
        text.sendKeys("Hello World!");
        driver.switchTo().parentFrame();

    }
}
