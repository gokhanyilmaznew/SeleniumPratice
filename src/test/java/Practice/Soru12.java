package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru12 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//    "https://www.saucedemo.com" Adresine gidin
//    Username kutusuna "standard_user" yazdirin
//    Password kutusuna "secret_sauce" yazdirin
//    Login tusuna basin
//    Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
//    Add to Cart butonuna basin
//    Alisveris sepetine tiklayin
//    Sectiginiz urunun basarili olarak sepete eklendigini control  edin
//    Sayfayi kapatin
    }
}