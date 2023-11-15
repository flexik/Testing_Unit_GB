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

public class AddressBookIntegrationTest {
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
    public void testAddContactThroughUI() {
        driver.get("http://localhost:8080/addressbook"); // Предполагается, что адресная книга запущена на локальном сервере

        // Находим элементы формы для ввода данных
        WebElement nameInput = driver.findElement(By.id("name"));
        WebElement emailInput = driver.findElement(By.id("email"));
        WebElement phoneInput = driver.findElement(By.id("phone"));
        WebElement addButton = driver.findElement(By.id("add-button"));

        // Вводим данные контакта
        nameInput.sendKeys("John Doe");
        emailInput.sendKeys("john@example.com");
        phoneInput.sendKeys("1234567890");

        // Нажимаем кнопку добавления контакта
        addButton.click();

        // Проверяем, что контакт отображается в списке контактов
        List<WebElement> contactList = driver.findElements(By.className("contact"));
        Assertions.assertEquals(1, contactList.size());

        // Проверяем, что отображаемые данные контакта соответствуют введенным данным
        WebElement contact = contactList.get(0);
        Assertions.assertTrue(contact.getText().contains("John Doe"));
        Assertions.assertTrue(contact.getText().contains("john@example.com"));
        Assertions.assertTrue(contact.getText().contains("1234567890"));
    }

    @Test
    public void testEditContactThroughUI() {
        driver.get("http://localhost:8080/addressbook");

        // Находим элементы формы для ввода данных
        WebElement nameInput = driver.findElement(By.id("name"));
        WebElement emailInput = driver.findElement(By.id("email"));
        WebElement phoneInput = driver.findElement(By.id("phone"));
        WebElement addButton = driver.findElement(By.id("add-button"));

        // Вводим данные контакта
        nameInput.sendKeys("John Doe");
        emailInput.sendKeys("john@example.com");
        phoneInput.sendKeys("1234567890");

        // Нажимаем кнопку добавления контакта
        addButton.click();

        // Находим кнопку редактирования контакта
        WebElement editButton = driver.findElement(By.cssSelector(".contact .edit-button"));
        editButton.click();

        // Находим элементы формы для редактирования контакта
        WebElement updatedNameInput = driver.findElement(By.id("name"));
        WebElement updatedEmailInput = driver.findElement(By.id("email"));
        WebElement updatedPhoneInput = driver.findElement(By.id("phone"));
        WebElement updateButton = driver.findElement(By.id("update-button"));

        // Редактируем данные контакта
        updatedNameInput.clear();
        updatedNameInput.sendKeys("John Smith");
        updatedEmailInput.clear();
        updatedEmailInput.sendKeys("john@example.com");
        updatedPhoneInput.clear();
        updatedPhoneInput.sendKeys("9876543210");

        // Нажимаем кнопку обновления контакта
        updateButton.click();

        // Проверяем, что контакт успешно обновляется в адресной книге
        List<WebElement> contactList = driver.findElements(By.className("contact"));
        Assertions.assertEquals(1, contactList.size());

        WebElement contact = contactList.get(0);
        Assertions.assertTrue(contact.getText().contains("John Smith"));
        Assertions.assertTrue(contact.getText().contains("john@example.com"));
        Assertions.assertTrue(contact.getText().contains("9876543210"));
    }
}

