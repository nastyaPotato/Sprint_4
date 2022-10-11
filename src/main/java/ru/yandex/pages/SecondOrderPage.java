package ru.yandex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SecondOrderPage {
    //локатор поля выбора даты доставки
    public static final By DATE_OF_DELIVERY = By.xpath(".//*[contains(@placeholder,'Когда привезти самокат')]");

    //локатор поля выбора времени аренды
    public static final By TIME_OF_RENT = By.className("Dropdown-placeholder");

    //локатор чекбокса выбора черного цвета
    public static final By COLOUR_BLACK = By.id("black");

    //локатор чекбокса выбора серого цвета
    public static final By COLOUR_GREY = By.id("grey");

    //локатор поля ввода 'Комментарий для курьера'
    public static final By COMMENT = By.xpath(".//input[contains(@placeholder,'Комментарий для курьера')]");

    //локатор варианта 'сутки' из выпадающего списка выбора времени аренды
    public static final By RENT_ONE_DAY = By.xpath(".//div[@class='Dropdown-option' and text()='сутки']");

    //локатор варианта 'двое суток' из выпадающего списка выбора времени аренды
    public static final By RENT_TWO_DAYS = By.xpath(".//div[@class='Dropdown-option' and text()='двое суток']");

    //локатор варианта 'трое суток' из выпадающего списка выбора времени аренды
    public static final By RENT_THREE_DAYS = By.xpath(".//div[@class='Dropdown-option' and text()='трое суток']");

    //локатор варианта 'четверо суток' из выпадающего списка выбора времени аренды
    public static final By RENT_FOUR_DAYS = By.xpath(".//div[@class='Dropdown-option' and text()='четверо суток']");

    //локатор варианта 'пятеро суток' из выпадающего списка выбора времени аренды
    public static final By RENT_FIVE_DAYS = By.xpath(".//div[@class='Dropdown-option' and text()='пятеро суток']");

    //локатор варианта 'шестеро суток' из выпадающего списка выбора времени аренды
    public static final By RENT_SIX_DAYS = By.xpath(".//div[@class='Dropdown-option' and text()='шестеро суток']");

    //локатор варианта 'семеро суток' из выпадающего списка выбора времени аренды
    public static final By RENT_SEVEN_DAYS = By.xpath(".//div[@class='Dropdown-option' and text()='семеро суток']");

    //локатор кнопки заказа
    public static final By ORDER_BUTTON = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");

    //локатор кнопки 'Да' для подтверждения заказа
    public static final By YES_BUTTON = By.xpath(".//button[text()='Да']");

    //локатор текста подтверждения заказа
    public final static By ORDER_CONFIRMATION = By.xpath(".//div[@class = 'Order_ModalHeader__3FDaJ' and (text()='Заказ оформлен')]");
    private final WebDriver driver;

    public SecondOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnSecondPageElement(By element) {
        driver.findElement(element).click();
    }

    public void fillInputFieldOnSecondPage(By inputField, String input) {
        driver.findElement(inputField).sendKeys(input);
    }

    public void selectDate(String date) {
        driver.findElement(DATE_OF_DELIVERY).sendKeys(date);
        driver.findElement(DATE_OF_DELIVERY).sendKeys(Keys.ENTER);
    }

    public void selectColour(String colour) {
        if ("black".equals(colour)) {
            driver.findElement(COLOUR_BLACK).click();
        } else {
            driver.findElement(COLOUR_GREY).click();
        }
    }

    public void selectOderTime(String days) {
        driver.findElement(TIME_OF_RENT).click();

        if ("one".equals(days)) {
            driver.findElement(RENT_ONE_DAY).click();
        }
        if ("two".equals(days)) {
            driver.findElement(RENT_TWO_DAYS).click();
        }
        if ("three".equals(days)) {
            driver.findElement(RENT_THREE_DAYS).click();
        }
        if ("four".equals(days)) {
            driver.findElement(RENT_FOUR_DAYS).click();
        }
        if ("five".equals(days)) {
            driver.findElement(RENT_FIVE_DAYS).click();
        }
        if ("six".equals(days)) {
            driver.findElement(RENT_SIX_DAYS).click();
        }
        if ("seven".equals(days)) {
            driver.findElement(RENT_SEVEN_DAYS).click();
        }
    }
}


