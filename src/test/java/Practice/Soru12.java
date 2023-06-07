package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        driver.get("https://www.saucedemo.com");

//    Username kutusuna "standard_user" yazdirin
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

//    Password kutusuna "secret_sauce" yazdirin
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

//    Login tusuna basin
        driver.findElement(By.xpath("//input[@id='login-button']")).sendKeys(Keys.ENTER);

//    Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin

//    Add to Cart butonuna basin
//    Alisveris sepetine tiklayin
//    Sectiginiz urunun basarili olarak sepete eklendigini control  edin
//    Sayfayi kapatin
    }
}