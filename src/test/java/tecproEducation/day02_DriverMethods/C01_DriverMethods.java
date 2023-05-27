package tecproEducation.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods {
    public static void main(String[] args) {
        System.getProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe")   ;
        WebDriver driver=new ChromeDriver();

        //Amazon sayfasina git
        driver.get("https://amazon.com") ;

        //Sayfa basliginin amazon icerdigini test et
        String  actualTitle=driver.getTitle();
        String expectedTitle="Amazon";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");

        }else{
            System.out.println("test failed");
        }

        //url in http://www.amazon.com oldugunu test edelim
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="http://www.amazon.com/";
        if(actualUrl.equals(expectedUrl)){
            System.out.println("Test Passed");
        }  else{
            System.out.println("test Failed--->>"+actualUrl);
        }
        //Sayfayi kapatma
        driver.close();//Browser i kapatir
        //driver.quit;-> Birden fazla browser varsa hepsini kapatir

    }
}
