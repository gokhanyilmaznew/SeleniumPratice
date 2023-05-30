package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru2 {
    public static void main(String[] args) {

/*      ODEV 3:
        Yeni bir class olusturun (TekrarTesti)
        Youtube web sayfasına gidin ve sayfa başlığının "youtube" olup olmadığını doğrulayın  (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        Sayfa URL'sinin "youtube" içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        Youtube sayfasina geri donun
        Sayfayi yenileyin
        Amazon sayfasina donun
        Sayfayi tamsayfa yapin
        Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
        Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        URL'yi yazdırın
        Sayfayi kapatin
*/
           System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
           WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//           Youtube web sayfasına gidin ve sayfa başlığının "youtube" olup olmadığını doğrulayın  (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
           String youtubeUrl= "https://www.youtube.com";
           driver.get(youtubeUrl);
           String actualTitle = driver.getTitle();
           String expectedTitle= "Youtube";
           if (actualTitle.contains(expectedTitle)){
               System.out.println("Title contains "+"'"+expectedTitle+"'"+" Test PASSED");
           }else
               System.out.println("Title not contains "+"'"+expectedTitle+"'"+" Test FAILED "+"Actual Title => "+"'"+actualTitle+"'");

//           Sayfa URL'sinin "youtube" içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
           String expectedUrlText = "youtube";
           if (youtubeUrl.contains(expectedUrlText)) {
               System.out.println("URL contains " + "'" + expectedUrlText + "'" + " Test PASSED");
           } else
            System.out.println("URL not contains =>" + "'" + expectedUrlText + "'. " + " Test FAILED " + "Actual URL =>" + "'" + youtubeUrl + "' .");

//        Daha sonra Amazon sayfasina gidin https://www.amazon.com/
            driver.get(" https://www.amazon.com/");

//        Youtube sayfasina geri donun
            driver.navigate().back();

//        Sayfayi yenileyin
            driver.navigate().refresh();

//        Amazon sayfasina donun
            driver.navigate().forward();

//        Sayfayi tamsayfa yapin
            driver.manage().window().maximize();

//        Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.

            String amazonTitle = driver.getTitle();
            String amazonTitleText= "Amazon";
            if (amazonTitle.contains(amazonTitleText)){
                System.out.println("Title contains " + "'" + amazonTitleText + "'" + " Test PASSED");
            } else
                System.out.println("Title not contains =>" + "'" + amazonTitleText + "'. " + " Test FAILED " + "Actual Title =>" + "'" + amazonTitle + "' .");

//        Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        String actualAmazonUrl = driver.getCurrentUrl();
        String expectedAmazonUrl = "https://www.amazon.com/";
        if (actualAmazonUrl.equals(expectedAmazonUrl)) {
            System.out.println("URL equals " + "'" + expectedAmazonUrl + "'" + " Test PASSED");
        } else
            System.out.println("URL not equals =>" + "'" + expectedAmazonUrl + "'. " + " Test FAILED " + "Actual URL =>" + "'" + actualAmazonUrl + "' .");

//        Sayfayi kapatin
        driver.close();


















    }
}
