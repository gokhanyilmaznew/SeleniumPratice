package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru11 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//    https://www.google.com/  adresine gidin
        driver.get("https://www.google.com/");

//    cookies uyarisini  kabul ederek kapatin

//    Sayfa	basliginin	"Google"	ifadesi	icerdigini	test  edin
        String actualTitle=driver.getTitle();
        String expectedTitle = "Google";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("iceriyor");
        }else System.out.println("icermiyor");


//    Arama cubuguna "Nutella" yazip aratin
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Nutella", Keys.ENTER);

//    Bulunan sonuc sayisini yazdirin
        WebElement sonuc =driver.findElement(By.xpath("//div [@id='result-stats']"));
        String sayi=sonuc.getText().split(" ")[1].replace(".","");
        System.out.println(sayi);
//    sonuc sayisinin 10 milyon'dan fazla oldugunu test  edin
        int sayiyaDonusturme= Integer.valueOf(sayi);
        int sayi2 = 1000000;

        if (sayiyaDonusturme >sayi2){
            System.out.println("passed");
        }else System.out.println("fail");


//    Sayfayi kapatin
        driver.close();

    }
}