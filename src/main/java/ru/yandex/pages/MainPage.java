package ru.yandex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    public static final By QUESTION0 = By.id("accordion__heading-0");
    public static final By QUESTION1 = By.id("accordion__heading-1");
    public static final By QUESTION2 = By.id("accordion__heading-2");
    public static final By QUESTION3 = By.id("accordion__heading-3");
    public static final By QUESTION4 = By.id("accordion__heading-4");
    public static final By QUESTION5 = By.id("accordion__heading-5");
    public static final By QUESTION6 = By.id("accordion__heading-6");
    public static final By QUESTION7 = By.id("accordion__heading-7");
    public static final By ANSWER0 = By.id("accordion__panel-0");
    public static final By ANSWER1 = By.id("accordion__panel-1");
    public static final By ANSWER2 = By.id("accordion__panel-2");
    public static final By ANSWER3 = By.id("accordion__panel-3");
    public static final By ANSWER4 = By.id("accordion__panel-4");
    public static final By ANSWER5 = By.id("accordion__panel-5");
    public static final By ANSWER6 = By.id("accordion__panel-6");
    public static final By ANSWER7 = By.id("accordion__panel-7");
    public static final String ANSWER_0_TEXT = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public static final String ANSWER_1_TEXT = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public static final String ANSWER_2_TEXT = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public static final String ANSWER_3_TEXT = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public static final String ANSWER_4_TEXT = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public static final String ANSWER_5_TEXT = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public static final String ANSWER_6_TEXT = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public static final String ANSWER_7_TEXT = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
    public static final By ORDER_BUTTON_HEADER = By.xpath(".//button[@class='Button_Button__ra12g' and text()='Заказать']");

    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnQuestion(By question) {
        driver.findElement(question).click();
    }

    public void scrollTillQuestions() {
        WebElement element = driver.findElement(By.className("accordion"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

}
