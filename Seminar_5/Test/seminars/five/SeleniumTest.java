package seminars.five;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\flex!k\\Desktop\\Тестирование\\5\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("Geek Brains");
        searchField.submit();
    }

}
