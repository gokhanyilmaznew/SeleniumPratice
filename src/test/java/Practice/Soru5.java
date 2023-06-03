package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru5 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Techproeducation sayfasına gidelim
        driver.get("https://www.techproeducation.com");

        //Çıkan reklamı locate edip kapatalım
        driver.findElement(By.xpath("//*[@class='eicon-close']")).click();

        //Arama bölümünde qa aratalım
        driver.findElement(By.xpath("//*[@id='elementor-search-form-9f26725']")).sendKeys("qa", Keys.ENTER);

        //Sayfa başlığının qa içerdiğini doğrulayalım
        String actualTitle=driver.getTitle();
        String expectedTitle="qa";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAIL>>"+actualTitle);
        }

        //Carrer Opportunities In QA linkinin görünür ve erişilebilir olduğunu doğrulayalım
        WebElement qaGorunurluk =driver.findElement(By.xpath("(//*[@href='https://techproeducation.com/software-career-opportunities-qa/'])[2]"));
        if (qaGorunurluk.isDisplayed()){
            System.out.println("test PASSED dsplay");
        }else System.out.println("test fail");
        if (qaGorunurluk.isEnabled()){
            System.out.println("test PASSED enable");
        }else System.out.println("test fail");
        //Carrer Opportunities In QA linkine tıklayalım
        qaGorunurluk.click();

        //Başlığın Opportunities içerdiğini test edelim
        String actualTitle1=driver.getTitle();
        String expectedTitle2= "Opportunities";
        if (actualTitle1.contains(expectedTitle2)){
            System.out.println("Test Passed");
        }else System.out.println("test fail");
        //Tekrar anasayfaya dönelim ve url'in https://techproeducation.com/ olduğunu doğrulayalım
        driver.navigate().back();
        driver.navigate().back();
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://techproeducation.com/";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Test Passed"+actualUrl);
        }else System.out.println("test fail=>>"+actualUrl);



    }
}
