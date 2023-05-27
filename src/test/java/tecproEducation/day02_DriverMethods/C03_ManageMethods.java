package tecproEducation.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Browser konumunu yazdir
        System.out.println("sayfaa konumu:"  +driver.manage().window().getPosition());

        //Browser Boyutlsrini yazdirin
        System.out.println("Sayfanin Boyutlari"+driver.manage().window().getSize());

        //Browser maximize yapalim
        driver.manage().window().maximize();//Bu adim tester icin onemli yapmayi unutmayalim

        //Techproeducation sayfasina gidelim
        driver.get("https://techproeducation.com");

        //yeniten boyutlarini ve konumunu yazdiralim
        System.out.println("Sayfa Boyutlari: "+driver.manage().window().getPosition());
        System.out.println("sayfa boyutu"+driver.manage().window().getSize());
        //sayfa minimaze yapali
        driver.manage().window().minimize();
        //full screen
        driver.manage().window().fullscreen();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.manage().window().setPosition(new Point(50,50));//istediğimiz konuma getirir
        driver.manage().window().setSize(new Dimension(600,600));//istediğimiz size'a getirir

        //sayfayı kapatınız
        driver.close();


    }
}
