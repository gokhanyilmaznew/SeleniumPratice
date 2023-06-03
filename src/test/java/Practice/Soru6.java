package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru6 {
    public static void main(String[] args) throws InterruptedException {
            System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


            //https://id.heroku.com/login sayfasina gidin
            driver.get("https://id.heroku.com/login");

            //Bir mail adersi giriniz
            WebElement mailKontrol= driver.findElement(By.xpath("//*[@name='email']"));
            mailKontrol.sendKeys("gokhan@gmail.com", Keys.TAB);
            Thread.sleep(3000);

            //Bir password giriniz
            WebElement passwordKontrol= driver.findElement(By.xpath("//*[@name='password']"));
            passwordKontrol.sendKeys("sifre123");

            //Login butonuna tiklayiniz
            driver.findElement(By.xpath("//*[@name='commit']")).click();

            //"There was a problem with your login." texti gorunur ise
            //"kayit yapilamadi" yazdiriniz
            WebElement textGorunurlugu =driver.findElement(By.xpath("//*[text()='There was a problem with your login.']"));
            if (textGorunurlugu.isDisplayed()){
                System.out.println("Kayit yapilamadi");
            }

            //eger yazi gorunur degilse "kayit yapildi" yazdiriniz
            //sayfayı kapatiniz
              else System.out.println("kayit yapildi");
            driver.close();
        }
    }