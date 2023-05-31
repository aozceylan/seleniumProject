package tecproEducation.day04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElementLocaters {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");
        // arama kutusuna "city bike" yazıp aratın
       WebElement aramaKUtuus= driver.findElement(By.id("twotabsearchtextbox"));
       aramaKUtuus.sendKeys("city bike");
       aramaKUtuus.submit();
        // sonuc yazısını yazdırın
           List<WebElement> sonuclar=driver.findElements(By.className("sg-col-inner")) ;
            WebElement sonuc=sonuclar.get(0);
        System.out.println(sonuc.getText());
        // sonuc sayısını yazdırın
        String sonucSayisi[]=sonuc.getText().split(" ");
        System.out.println(sonucSayisi[2]);
        // ilk ürünün locatini alın
        List<WebElement> sonuclar1=driver.findElements(By.className("s-image"));
        WebElement ilkUtrun=sonuclar1.get(0);

        // ilk ürünün, görünür olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUtrun.isDisplayed());
        // ilk ürünün, erisilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUtrun.isEnabled());
        // ilk ürünün, secilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUtrun.isSelected());
        // ilk urune tıklayın
        ilkUtrun.click();
        // sayfayı kapatın
        driver.close();
    }
}
