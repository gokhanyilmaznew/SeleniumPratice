package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Soru10 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);

        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        String expectedTitle = "Teknoloji";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Baslik iceriyor");
        }else System.out.println("Baslik icermiyor");

        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        String expectedUrl = "teknosa";
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Baslik iceriyor");
        }else System.out.println("Baslik icermiyor");

        // "https://medunna.com/" adresine gidiniz
        driver.get("https://medunna.com/");

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String actualTitle1 = driver.getTitle();
        System.out.println(actualTitle1);
        String actualUrl1 = driver.getCurrentUrl();
        System.out.println(actualUrl1);

        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        String expectedTitle1 = "MEDUNNA";
        if (actualTitle1.contains(expectedTitle1)){
            System.out.println("Baslik iceriyor");
        }else System.out.println("Baslik icermiyor");

        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        String expectedUrl1 = "medunna";
        if (actualUrl1.contains(expectedUrl1)){
            System.out.println("Baslik iceriyor");
        }else System.out.println("Baslik icermiyor");

        // teknosa adresine geri donunuz
        driver.navigate().to("https://teknosa.com/");

        // Sayfayı yenileyiniz
        driver.navigate().refresh();

        // medunna adresine ilerleyiniz
        driver.navigate().to("https://medunna.com/");


        // Sayfayı yenileyiniz
        driver.navigate().refresh();

        // pencereyi kapat
        driver.close();

    }
}
