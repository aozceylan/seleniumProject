package techproed.day01_ilkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ders01 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe") ;
        //Java uygulamalarinda system ozelliklerini ayarlamak icin setProperties() methodu ile kullaniriz
        //once chromeDriver yaziyoruz sonra da yolu  ekliyoruz
        System.out.println(System.getProperty("chromeDriver"));
        //getProperty ile "Key" degerini girerek "value" ya ulasabilirim
        WebDriver driver=new ChromeDriver();
        //WebDriver interfacennde chromeDriver turunde bir obje olusturduk
        driver.get("https://techproeducation.com");
        //get()methoduile string olarak girilen url gideriz
    }
}
