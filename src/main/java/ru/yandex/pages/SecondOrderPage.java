package ru.yandex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SecondOrderPage {
    public static final By DATE_OF_DELIVERY = By.xpath(".//*[contains(@placeholder,'Когда привезти самокат')]");
    public static final By TIME_OF_RENT = By.className("Dropdown-placeholder");
    public static final By COLOUR_BLACK = By.id("black");
    public static final By COLOUR_GREY = By.id("grey");
    public static final By COMMENT = By.xpath(".//input[contains(@placeholder,'Комментарий для курьера')]");
    public static final By RENT_ONE_DAY = By.xpath(".//div[@class='Dropdown-option' and text()='сутки']");
    public static final By RENT_TWO_DAYS = By.xpath(".//div[@class='Dropdown-option' and text()='двое суток']");
    public static final By RENT_THREE_DAYS = By.xpath(".//div[@class='Dropdown-option' and text()='трое суток']");
    public static final By RENT_FOUR_DAYS = By.xpath(".//div[@class='Dropdown-option' and text()='четверо суток']");
    public static final By RENT_FIVE_DAYS = By.xpath(".//div[@class='Dropdown-option' and text()='пятеро суток']");
    public static final By RENT_SIX_DAYS = By.xpath(".//div[@class='Dropdown-option' and text()='шестеро суток']");
    public static final By RENT_SEVEN_DAYS = By.xpath(".//div[@class='Dropdown-option' and text()='семеро суток']");
    public static final By ORDER_BUTTON = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");
    public static final By YES_BUTTON = By.xpath(".//button[text()='Да']");
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


