package ru.yandex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    public static final By INPUT_NAME = By.xpath(".//input[contains(@placeholder,'Имя')]");
    public static final By INPUT_LAST_NAME = By.xpath(".//input[contains(@placeholder,'Фамилия')]");
    public static final By INPUT_ADDRESS = By.xpath(".//input[contains(@placeholder,'Адрес')]");
    public static final By INPUT_METRO = By.className("select-search__input");
    public static final By INPUT_PHONE_NUMBER = By.xpath(".//input[contains(@placeholder,'Телефон')]");
    public static final By NEXT_BUTTON = By.xpath(".//button[text()='Далее']");
    private final WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnElement(By element) {
        driver.findElement(element).click();
    }

    public void fillInputField(By inputField, String input) {
        driver.findElement(inputField).sendKeys(input);
    }

}
