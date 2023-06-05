package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru11 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//    C01_TekrarTesti isimli bir class  olusturun
//    https://www.google.com/  adresine gidin
//    cookies uyarisini  kabul ederek kapatin
//    Sayfa	basliginin	"Google"	ifadesi	icerdigini	test  edin
//    Arama cubuguna "Nutella" yazip aratin
//    Bulunan sonuc sayisini yazdirin
//    sonuc sayisinin 10 milyon'dan fazla oldugunu test  edin
//    Sayfayi kapatin

    }
}