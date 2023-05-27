package tecproEducation.day01_ilkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com");
        //getTitle() Methodu Sayfa Basligini veriri

        System.out.println("amazon Sayfa basligi: "+driver.getTitle());
        System.out.println("Amzon Actual Url: "+ driver.getCurrentUrl());
         String amazonahandle= driver.getWindowHandle();
        System.out.println("Amazon handle"+driver.getWindowHandle());
        

        driver.get("https://techproeducation.com");
        System.out.println("Techproeducation SayA bASLIGI:" + driver.getTitle());

        //  getCurrentUrl() methodu Gidilen sayfanin url sini verir
        System.out.println("techproeducatiion Actual Url"+driver.getCurrentUrl());

        //getPages() methodu acilan sayfanin kaynak kodlarini verir .Dev lerein daha cok kullandigi bir method
        //System.out.println(driver.getPageSource());

        //getWindowHandle() Gidilen   sayfanin handle degerini verir Bu handle degeri ile sayfalar arasi geciste kullanicaz
        // String handle=driver.getWindowHandle();
        //Set handles = getWindowHandles();
        System.out.println(driver.getWindowHandle());
    }
}
