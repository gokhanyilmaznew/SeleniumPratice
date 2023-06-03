package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class soru07 {
    public static void main(String[] args)  {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        // Add Element butonuna 100 defa basınız
        int counter=0;
        WebElement addButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        for (int i = 0; i < 100; i++) {
            addButton.click();
            counter++;
        }

        // 100 defa basıldığını test ediniz
        if (counter==100){
              System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        // 90 defa delete butonuna basınız
        int counterDelete=0;
        for (int i = 0; i <90 ; i++) {
        WebElement delete = driver.findElement(By.xpath("//button[@class='added-manually']"));
            delete.click();
            counterDelete++;
        }

        // 90 defa basıldığını doğrulayınız
        if (counterDelete==90){
              System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        // Sayfayı kapatınız
         driver.close();

        }
    }
