package seminars.five;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AddressBookEndToEndTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        // Установка пути к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\flex!k\\Desktop\\Тестирование\\5\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testContactLifecycle() {
        driver.get("http://localhost:8080/addressbook"); // Предполагается, что адресная книга запущена на локальном сервере

        // Создание контакта
        WebElement nameInput = driver.findElement(By.id("name"));
        WebElement emailInput = driver.findElement(By.id("email"));
        WebElement phoneInput = driver.findElement(By.id("phone"));
        WebElement addButton = driver.findElement(By.id("add-button"));

        nameInput.sendKeys("John Doe");
        emailInput.sendKeys("john@example.com");
        phoneInput.sendKeys("1234567890");

        addButton.click();

        // Проверка, что контакт отображается в списке контактов
        List<WebElement> contactList = driver.findElements(By.className("contact"));
        Assertions.assertEquals(1, contactList.size());

        // Редактирование контакта
        WebElement editButton = driver.findElement(By.cssSelector(".contact .edit-button"));
        editButton.click();

        WebElement updatedNameInput = driver.findElement(By.id("name"));
        WebElement updatedEmailInput = driver.findElement(By.id("email"));
        WebElement updatedPhoneInput = driver.findElement(By.id("phone"));
        WebElement updateButton = driver.findElement(By.id("update-button"));

        updatedNameInput.clear();
        updatedNameInput.sendKeys("John Smith");
        updatedEmailInput.clear();
        updatedEmailInput.sendKeys("john@example.com");
        updatedPhoneInput.clear();
        updatedPhoneInput.sendKeys("9876543210");

        updateButton.click();

        // Проверка, что контакт успешно обновляется в адресной книге
        List<WebElement> updatedContactList = driver.findElements(By.className("contact"));
        Assertions.assertEquals(1, updatedContactList.size());

        WebElement updatedContact = updatedContactList.get(0);
        Assertions.assertTrue(updatedContact.getText().contains("John Smith"));
        Assertions.assertTrue(updatedContact.getText().contains("john@example.com"));
        Assertions.assertTrue(updatedContact.getText().contains("9876543210"));

        // Удаление контакта
        WebElement deleteButton = driver.findElement(By.cssSelector(".contact .delete-button"));
        deleteButton.click();

        // Проверка, что контакт успешно удаляется из адресной книги
        List<WebElement> deletedContactList = driver.findElements(By.className("contact"));
        Assertions.assertEquals(0, deletedContactList.size());
    }
}