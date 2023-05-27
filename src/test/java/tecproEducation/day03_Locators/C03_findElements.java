package tecproEducation.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_findElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com ");
// Amazon sayfasında kac tane link olduğunu konsolda yazdırın

        List<WebElement> linlklerListe=driver.findElements(By.tagName("a"));//linkler a taginda yazildii icin
        System.out.println("Linklerin sayisi: "+linlklerListe.size());
// Linkleri konsolda yazdırın
        for(WebElement each:linlklerListe){
            System.out.println(each.getText());//webElement degil string olsun istedigim icin get.Text() methodu kullandim
        }
// sayfayı kapatın
        driver.close();
    }
}
