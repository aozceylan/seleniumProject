package tecproEducation.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_absolute_xpath {
    public static void main(String[] args) {

       /* Absolute xpath:

        Bizim nereden baslayacagimiz tamamen inceledigimiz HTML koduna bagli olup, ilgili webelement icin en tepesindeki parent tagi neyse onunla baslariz. bastaki tag oncesinde // koyariz ve sonrasinda her tag arasina
        bir slash / isareti koyariz.
        Absolute xpath yazmak icin en basa // sonraki her adimda / yazarak hedef web element'e kadar tum
        tag'lar yazilir.
        Eger ayni path'e sahip birden fazla element varsa index kullanilabilir. [2] gibi
        Eger bir parent'in grand child'lari icinde unique bir tag varsa parent // grand child yazilabilir
// div/ table/ tbody  Bizim ulasmak istedigimiz tbody ise div ile basliyoruz, sonra gelen table ve tbody'e
        geldik inceledigimiz HTML kodunda
// tbody / tr / td[3] // span //HTML kodunda 3 tane sirasiyla td tagi vardi bu nedenle td[3] yazildi
        td tagi altinda bir a tagi vardi onu atlamak isteyince onu yazmadan // yaziyoruz
// tbody / tr / td[3] / a / span
    tring sonucSayisi[]=sonucYazisi.getText().split(" ");
//getText() ile sonucu String'e cevirdik
String'e cevrilen yazimizin bosluklarini split methodu ile kaldirdik. split bize bir array return ettiginden bu sonucu String bir array'e assign ettik. Burada alacagimiz sonuc sayisi 14 olup ilk index'e karsilik gelecek. Bu nedenle array'in ilk indexini [0] ile aliriz
System.out.println(sonucSayisi[0]);

kodu calistirinca ilk urun olarak Saris Bike Racks, Bones Car Hitch Bicycle Rack Carrier, Mounts 3 Bikes, Black ekranda goruldu

// ilk ürününe tıklayın
ilk urunun yazisi uzerinde inspect yaptik
class attribute'nun degerini aldik, 20 tane oldugunu unique olmadigini anladik. Bunu unique hale su sekilde getirdik: (//span[@class='a-size-medium a-color-base a-text-normal'])[1] yazinca 1 of 1 yazildi ve unique oldu
[1] yazinca bu ilk urunun unique olan degerini almamiza neden oldu. xpath ile unique yapmak icin farkli olarak xpath parantezi icine alacagimiz kismi tamamen bir parantez icine aliriz. index 0'dan baslar ancak biz burada
locate aliyoruz, locate alma isleminde 1'den baslariz. Bir list ile ilgili islem yapsaydik index 0 olurdu


    */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");
        // arama kutusuna "city bike"  yazıp aratın
        WebElement aramaKutusu=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("city bikes"+ Keys.ENTER);
        // Hybrid Bikes bölümüne tıklayın
       driver.findElement(By.xpath("//span[text()='Elektrofahrräder']") ).click();
        // sonuc sayısını yazdırın

        // sonuc sayısını yazdırın

        WebElement sonucYazisi = driver.findElement(By.xpath("//span[text()='14 results for']"));
        System.out.println(sonucYazisi.getText());

        String sonucSayisi[] = sonucYazisi.getText().split(" ");
        System.out.println(sonucSayisi[0]);


        // ilk ürününe tıklayın
        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();





        //Sayfayı kapatınız
        driver.close();








    }
}
