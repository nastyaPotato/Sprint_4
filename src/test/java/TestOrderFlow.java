import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.pages.MainPage;
import ru.yandex.pages.OrderPage;
import ru.yandex.pages.SecondOrderPage;

import static org.junit.Assert.assertTrue;
import static ru.yandex.pages.MainPage.*;
import static ru.yandex.pages.OrderPage.*;
import static ru.yandex.pages.SecondOrderPage.*;

@RunWith(Parameterized.class)
public class TestOrderFlow {
    private final String name;
    private final String lastName;
    private final String address;
    private final String metro;
    private final String phoneNumber;
    private final String date;
    private final String colour;
    private final String day;
    private final String comment;
    private final String result;
    private final By orderButton;
    private WebDriver driver;

    public TestOrderFlow(By orderButton, String name, String lastName, String address, String metro, String phoneNumber, String date, String colour, String day, String comment, String result) {
        this.orderButton = orderButton;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.metro = metro;
        this.date = date;
        this.colour = colour;
        this.day = day;
        this.comment = comment;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getInputs() {
        return new Object[][]{
                {ORDER_BUTTON_BOTTOM, "Анастасия", "Яковенко", " ул. Минина", "Маяковская", "89101087765", "10.10.2022", "black", "one", "", "Заказ оформлен"},
                {ORDER_BUTTON_HEADER, "Илья", "Михайлов", " ул. Ижорская", "Черкизовская", "89101089965", "11.10.2022", "grey", "two", "Тест", "Заказ оформлен"},
        };

    }

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void fillOrderForm() {
        MainPage mainPage = new MainPage(driver);

        mainPage.clickOnOrderButton(orderButton);

        OrderPage orderPage = new OrderPage(driver);
        orderPage.clickOnElement(INPUT_NAME);
        orderPage.fillInputField(INPUT_NAME, name);
        orderPage.clickOnElement(INPUT_LAST_NAME);
        orderPage.fillInputField(INPUT_LAST_NAME, lastName);
        orderPage.clickOnElement(INPUT_ADDRESS);
        orderPage.fillInputField(INPUT_ADDRESS, address);
        orderPage.clickOnElement(INPUT_METRO);
        orderPage.fillInputField(INPUT_METRO, metro);
        driver.findElement(INPUT_METRO).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(INPUT_METRO).sendKeys(Keys.ENTER);
        orderPage.clickOnElement(INPUT_PHONE_NUMBER);
        orderPage.fillInputField(INPUT_PHONE_NUMBER, phoneNumber);
        orderPage.clickOnElement(NEXT_BUTTON);

        SecondOrderPage secondOrderPage = new SecondOrderPage(driver);
        secondOrderPage.clickOnSecondPageElement(DATE_OF_DELIVERY);
        secondOrderPage.selectDate(date);
        secondOrderPage.selectOderTime(day);
        secondOrderPage.selectColour(colour);
        secondOrderPage.fillInputFieldOnSecondPage(COMMENT, comment);
        secondOrderPage.clickOnSecondPageElement(ORDER_BUTTON);
        secondOrderPage.clickOnSecondPageElement(YES_BUTTON);
        assertTrue(result, driver.findElement(ORDER_CONFIRMATION).isDisplayed());
    }


    @After
    public void teardown() {
        driver.quit();
    }
}
