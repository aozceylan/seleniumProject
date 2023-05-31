package tecproEducation.day06_relativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_relativeLocators {
    public static void main(String[] args) throws InterruptedException {
             /*
        Benzer özelliklere sahip webelementler için relative locator kullanabiliriz
        SYNTAX;
        driver.findElement(with(By.tagname).below().above().to_left_of().to_right_of().near()) gibi
        methotlar ile benzer özelliklere sahip webelementleri locatini almadan o web elemente ulaşabiliriz
         */
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //amazona gidelim
        driver.get("https://amazon.com");

        //city bike aratalım
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@type='text']"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);

        //relative locator kullanarak hybrid bikes altındaki elemente tıklayalım
        //Webelementleri yazisini konsola yazdirin
        WebElement hybridBikes= driver.findElement(By.xpath("//span[text()='Elektrofahrräder']"));
        System.out.println(hybridBikes.getText());
        WebElement cruiser=driver.findElement(with(By.tagName("a")).below(hybridBikes));
        System.out.println(cruiser.getText());
         /*
         Xpath kullaniminda bir sayfadaki webelementlere mudahale etmek istedigimizde xpath ile locate aldigimizda 1 den fazla sonuc vereblir
          */
        List<WebElement> tumLocate=driver.findElements(By.xpath("(//*[@class='a-size-base a-color-base'])[position()>=6 and position()<=12]"));
      //LAMDA ile
        tumLocate.forEach(t-> System.out.println(t.getText()));
        //for each yolu ile
        for(WebElement w:tumLocate){
            System.out.println(w.getText());
        }
        //Bu linklerin hepsini tiklayalim ve sayfa basliklarini alalim
        for (int i = 0; i < tumLocate.size(); i++) {
            tumLocate =driver.findElements(By.xpath("(//*[@class='a-size-base a-color-base'])[position()>=6 and position()<=12]"));
            System.out.println(tumLocate.get(i).getText());
            tumLocate.get(i).click();
            Thread.sleep(1000);

            driver.navigate().back();
            Thread.sleep(1000);
        }
       

         driver.close();
            }
}
