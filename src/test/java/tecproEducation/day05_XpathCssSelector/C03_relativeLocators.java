package tecproEducation.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.with;

public class C03_relativeLocators {
    public static void main(String[] args) {
        /*
        Relative Locators
        Bir webElementi direk locate edemedigimiz durumlarda o webelementi etrafindaki
        webElementlerin referansi ile tarif etmemizi saglar
        Bir web sayfasinda benzer özellliklere sahip webeementlerin oldugu durumlarda kullanilabilir
        above:belirtilen elementin ustunde olan elementi secer
        below:belirtilen elementin altindaki elementi secer
        to_left_of: belirtilen elementin solunda olan elementi secre
        to_right_of:belirtilen elementin saginda olan elementi secer
        near:belirtilen elemntin yaninda ya da yakininda olan elementi secer
        
         */
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //amazon sayfasına gidelim
        driver.get("https://amazon.com");
        //city bike aratalım
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("city bike"+Keys.ENTER);
        //Relative Locator kullanarak Hybrid Bikes üstündeki Road Bikes'a tıklayalım
        WebElement hybridBikes= driver.findElement(By.xpath("//span[text()='Elektrofahrräder']"));

        
        // sayfayı kapatın
    }
}
