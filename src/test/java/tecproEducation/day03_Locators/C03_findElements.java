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
        /*
             ---Enver hoca notlari----

         //Amazon sayfasına gidelim
         */
        //driver.get("https://amazon.com");
        //Sayfadaki linklerin sayısını ve linkleri yazdıralım
        /*
        findelement ile bir webelemente ulaşabilirken, birden fazla webelement için findelements() methodunu
        kullanırız.Bu webelementlerin sayısına ulaşmak için yada bu webelementlerin yazısını konsola yazdırabilmek için
        List<Webelemet> linklerListesi = driver.findElements(By.locator("locator değeri")) olarak kullanırız.
        Oluşturmuş olduğumuz list'i loop ile konsola yazdırabiliriz
         */
       // List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        //System.out.println("Linklerin Sayısı = " + linklerListesi.size());
        /*
                for (WebElement w:linklerListesi) {
                    if (!w.getText().isEmpty()){
                        System.out.println(w.getText());
                    }
        //Lambda ile yazdıralım
        linklerListesi.forEach(link -> {if (!link.getText().isEmpty())
        {System.out.println(link.getText());}}
        //Shop deals in Electronics webElementinin yazısını yazdıralım
        System.out.println("**********************************************************");
        System.out.println(driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText());
        WebElement webElementYazisi = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        System.out.println(webElementYazisi.getText());
        driver.close();*/



    }
}
