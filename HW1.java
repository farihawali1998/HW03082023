package HW03082023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement button =driver.findElement(By.xpath("//button"));
        button.click();
        WebElement finishButton=driver.findElement(By.xpath("//div[@id='finish']"));
        finishButton.click();
        WebElement text = driver.findElement(By.xpath("//*[contains(text(),'Hello World!')]"));
        System.out.println(text.getText());
        driver.quit();


    }
}
