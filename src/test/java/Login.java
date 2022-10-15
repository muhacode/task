import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver = new  ChromeDriver();
        String url = "https://www.livejournal.com/";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        WebElement logIn = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/nav[2]/ul/li[2]/a"));
        logIn.click();

        Thread.sleep(2000);
        WebElement user = driver.findElement(By.xpath("//input[@id='user']"));
        user.sendKeys("MUHAMMADMAXMUR");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//input[@id='lj_loginwidget_password']"));
        password.sendKeys("Hello_World");
        Thread.sleep(2000);
        WebElement saveBtn = driver.findElement(By.xpath("//button[@class='b-loginform-btn b-loginform-btn--login b-loginform-btn--auth b-loginform-btn--center']"));
        saveBtn.click();
        Thread.sleep(4000);

        driver.quit();

    }
}
