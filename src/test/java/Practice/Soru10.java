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
        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        // "https://medunna.com/" adresine gidiniz
        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        // teknosa adresine geri donunuz
        // Sayfayı yenileyiniz
        // medunna adresine ilerleyiniz
        // Sayfayı yenileyiniz
        // pencereyi kapat

    }
}
