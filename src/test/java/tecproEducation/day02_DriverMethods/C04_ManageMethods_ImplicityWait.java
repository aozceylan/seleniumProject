package tecproEducation.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplicityWait {
    public static void main(String[] args) {   /*
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

         ****Bu 3 adim her zaman unutmadan yapmamiz gereken adimlar
    */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

         /*
           implicitlyWait(Duration.ofSeconds(20)) Sayfadaki webElementleri görünür olana kadar(sayfada oluşana kadar)
         maximum 20 saniye bekler. Eğer webelementler 2 saniyede oluşursa 2 saniye bekler ve alt satıra geçer. Fakat
         belirttiğimiz max. süre boyunca internetten yada sayfadan kaynaklı olarak webelementler oluşmazsa testtimiz
         fail verir.
           Thread.sleep() java kodlarını bizim belirttiğimiz süre kadar bekler. 30 saniye beklemesini belirtirsem
         30 saniye bekler ve alt satıra geçer.
         */

        //techproed sayfasina gidelim
        driver.get("https://techproeducation.com");

        //amazona gidelim
        String amazonUrl="https://amazon.com";
        driver.get(amazonUrl);

        //techproedu geri
        driver.navigate().back();

        //sayfa basliginin Techpro icerdigini test et
        String expected="Techpro";
        String actualTitle=driver.getTitle();
        if(actualTitle.contains(expected)){
            System.out.println("test Passed");
        }else{
            System.out.println("test fail");
        }
        //tekrar amazon sayfasina gidelim
        driver.get(amazonUrl);
        //sayfa basliginin amazon icerdigini test edelim
        String actualTitle1=driver.getTitle();
        String expectedTitle1="Amazon";

         if(actualTitle1.contains(expectedTitle1)){
             System.out.println("passed");

         } else{
             System.out.println("failed--->"+actualTitle1);
         }
        driver.close();
         driver.quit();
    }
}
