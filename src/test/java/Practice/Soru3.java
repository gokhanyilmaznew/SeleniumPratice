package Practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru3 {
    public static void main(String[] args) throws InterruptedException {
/*      ODEV 2:
        Yeni bir class olusturalim (Homework)
        ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i
        yazdirin.
        https://www.walmart.com/ sayfasina gidin.
        Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        Tekrar "facebook" sayfasina donun
        Sayfayi yenileyin
        Sayfayi tam sayfa (maximize) yapin
        Browser'i kapatin
*/
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
        // oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        String actualFacebookTitle = driver.getTitle();
        String expectedFacebookTitle = "Facebook - Giriş Yap veya Kaydol";
        if (actualFacebookTitle.equals(expectedFacebookTitle)) {
            System.out.println("TEST PASSED ");
        } else System.out.println("TEST FAILED Actual Title ==> " + actualFacebookTitle);

        //Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i yazdirin.
        String currentFacebookURL = driver.getCurrentUrl();
        String expectedFacebookUrlText = "facebook";
        if (currentFacebookURL.contains(expectedFacebookUrlText)) {
            System.out.println("TEST PASSED ");
        } else System.out.println("TEST FAILED Actual URL ==> " + currentFacebookURL);

        //https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");

        // Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        String currentWallmartTitle = driver.getTitle();
        String expectedWallmartTitle = "Walmart.com";
        if (currentWallmartTitle.contains(expectedWallmartTitle)) {
            System.out.println("TEST PASSED ");
        } else System.out.println("TEST FAILED Actual Title ==> " + currentWallmartTitle);

        // Tekrar "facebook" sayfasina donun
        driver.navigate().back();

        // Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(2000);

        // Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();

        // Browser'i kapatin
        driver.quit();
    }
}