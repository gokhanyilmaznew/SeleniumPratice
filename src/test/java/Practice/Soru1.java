package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru1 {
    public static void main(String[] args) {

    /*      ODEV 1:
            Yeni bir Class olusturalim.C07_ManageWindowSet
            Amazon soyfasina gidelim. https://www.amazon.com/
            Sayfanin konumunu ve boyutlarini yazdirin
            Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
            Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
            Sayfayi kapatin
    */
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//        Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

//        Sayfanin konumunu ve boyutlarini yazdirin
        Point actualPosition= driver.manage().window().getPosition();
        System.out.println("actualPosition = " + actualPosition);
        Dimension actualSize= driver.manage().window().getSize();
        System.out.println("actualSize = " + actualSize);

//        Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        Point newPosition = new Point(100,100);
        driver.manage().window().setPosition(newPosition);

        Dimension newSize= new Dimension(800,600);
        driver.manage().window().setSize(newSize);



//        Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
       /* 1.Yol */
        if (driver.manage().window().getPosition().equals(newPosition)){
            System.out.println("Sayfa istenen konuma geldi");
        }else System.out.println("Sayfa istenen konumda DEGIL");

        if (driver.manage().window().getSize().equals(newSize)){
            System.out.println("Sayfa istenen konuma geldi");
        }else System.out.println("Sayfa istenen konumda DEGIL");

        /* 2.Yol */
        Point currentPosition = driver.manage().window().getPosition();
        Dimension currentSize= driver.manage().window().getSize();
        if (currentPosition.equals(newPosition) && currentSize.equals(newSize)){
            System.out.println("Sayfa istenen konuma ve boyuta geldi");
        }else System.out.println("Sayfa istenen konuma ve boyutta DEGIL");

//        Sayfayi kapatin
        driver.close();







    }
}
