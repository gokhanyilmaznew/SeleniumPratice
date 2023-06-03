package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Soru4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Amazon sayfasına gidiniz
        driver.get("https://amazon.com");

        //iphone aratınız
        WebElement aramaKutusu=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("iphone", Keys.ENTER);

        //çıkan sonuç yazısını konsola yazdırınız
        WebElement sonuc =driver.findElement(By.xpath("//h1//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(sonuc.getText());

        //çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız
        for (int i = 0; i < 5 ; i++) {
            List<WebElement> urunler = driver.findElements(By.xpath("//*[@class='a-section aok-relative s-image-fixed-height']"));
            Thread.sleep(2000);
            urunler.get(i).click();
            Thread.sleep(2000);
            System.out.println((i + 1) + ". Urun basligi : " + driver.getTitle());
            driver.navigate().back();
            Thread.sleep(2000);

        }
    }
}
