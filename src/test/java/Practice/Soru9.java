package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Soru9 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // "https://www.amazon.com/" adresine gidiniz.
        // "https://www.n11.com/" adresine gidiniz.
        // amazon adresine geri donunuz
        // n11 adresine ilerleyiniz
        // sayfayi yenileyiniz
        // pencereyi kapat
        // Konsola "HER ŞEY YOLUNDA" yazdir

    }
}
