package tecproEducation.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
  //cssselector de text kullanilmiyor
public class C02_CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //Add Element butonuna basin
        driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();

        //Delete butonu'nun gorunur oldugunu test edin
        System.out.println(driver.findElement(By.cssSelector("button[onclick='deleteElement()']")).isDisplayed());
        //Delete butonuna basin
        driver.findElement(By.cssSelector("button[onclick='deleteElement()']")).click();
        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        WebElement addRemoveElements =driver.findElement(By.cssSelector("h3"));
        if(addRemoveElements.isDisplayed()){
            System.out.println("Passed");
        }else {
            System.out.println("failed");
        }
        //Sayfayı kapatın
        driver.close();
          /*

        Xpath ve cssSelector arasındaki farklar:

        - Xpath text ile calısır.
        - cssSelector text ile calısmaz
        - Xpath index'e göre arama yapabilir.Daha fazla kombinasyona sahiptir.
        - cssSelector index'e göre arama yapamaz. Daha hızlı calısır

         */
    }
}
