package tecproEducation.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Submit {
    public static void main(String[] args) {
        // https://www.amazon.com sayfasına gidiniz
// aramakutusunu locate ediniz ve Nutella aratınız
// sayfayı kapatınız
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.amazon.com");
        WebElement aramaMotoru=driver.findElement(By.id("twotabsearchtextbox"));
        aramaMotoru.sendKeys("nutella");
         aramaMotoru.submit();
         driver.close();
    }
}
