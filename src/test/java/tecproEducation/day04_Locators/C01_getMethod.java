package tecproEducation.day04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_getMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //https://www,amazon.com gidiniz
        driver.get("https://www.amazon.com");
        //arama kutusu locate ediniz
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));

        //tagName = "input" oldugunu test edin
        String actualTagName=aramaKutusu.getTagName();
        String expectedTagName="input";
        if(actualTagName.equals(expectedTagName)){
            System.out.println("passed");

        }   else{
            System.out.println("Failed--->"+actualTagName);
        }
        //arama kutusu name attribitu "field-keywords oldugunu test edin
       String actualAttribute= aramaKutusu.getAttribute("name");
       String expectedAttribute="field-keywords" ;
       if(actualAttribute.equals(expectedAttribute)){
           System.out.println("Passed");
       }else{
           System.out.println("Failed-->"+actualAttribute);
       }
        //sayfayi kapatin
          driver.close();



    }
}
