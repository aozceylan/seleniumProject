package tecproEducation.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebElementLocators {
    public static void main(String[] args) {
        // https://www.amazon.com sayfasına gidiniz
// aramakutusunu locate ediniz ve Nutella aratınız
// sayfayı kapatınız
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.amazon.com");
        // <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="Suche Amazon"
        // class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Suche Amazon" spellcheck="false">
        //Arama kutusu locate icin arama uzerinde sag klik incele  sonra tekrar yaptigimiz da ilgili html kodlari mavi oluyor
        WebElement aramaMotoru=driver.findElement(By.id("twotabsearchtextbox"));
        aramaMotoru.sendKeys("nutella"+ Keys.ENTER); //locate coklu kez kullanilacaksa assignn edilebilir.
       // driver .findElement(By.id("twotabsearchtextbox")).sendKeys("nutella"+ Keys.ENTER); bu sekilde de yapabilirim
        driver.close();

    }
}