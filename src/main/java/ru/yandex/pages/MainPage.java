package ru.yandex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    //локатор первого вопроса на главной странице
    public static final By QUESTION0 = By.id("accordion__heading-0");

    //локатор второго вопроса на главной странице
    public static final By QUESTION1 = By.id("accordion__heading-1");

    //локатор третьего вопроса на главной странице
    public static final By QUESTION2 = By.id("accordion__heading-2");

    //локатор четвертого вопроса на главной странице
    public static final By QUESTION3 = By.id("accordion__heading-3");

    //локатор пятого вопроса на главной странице
    public static final By QUESTION4 = By.id("accordion__heading-4");

    //локатор шестого вопроса на главной странице
    public static final By QUESTION5 = By.id("accordion__heading-5");

    //локатор седьмого вопроса на главной странице
    public static final By QUESTION6 = By.id("accordion__heading-6");

    //локатор восьмого вопроса на главной странице
    public static final By QUESTION7 = By.id("accordion__heading-7");

    //локатор первого ответа на главной странице
    public static final By ANSWER0 = By.id("accordion__panel-0");

    //локатор второго ответа на главной странице
    public static final By ANSWER1 = By.id("accordion__panel-1");

    //локатор третьего ответа на главной странице
    public static final By ANSWER2 = By.id("accordion__panel-2");

    //локатор четвертого ответа на главной странице
    public static final By ANSWER3 = By.id("accordion__panel-3");

    //локатор пятого ответа на главной странице
    public static final By ANSWER4 = By.id("accordion__panel-4");

    //локатор шестого ответа на главной странице
    public static final By ANSWER5 = By.id("accordion__panel-5");

    //локатор седьмого ответа на главной странице
    public static final By ANSWER6 = By.id("accordion__panel-6");

    //локатор восьмого ответа на главной странице
    public static final By ANSWER7 = By.id("accordion__panel-7");

    //текст первого ответа на главной странице
    public static final String ANSWER_0_TEXT = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";

    //текст второго ответа на главной странице
    public static final String ANSWER_1_TEXT = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";

    //текст третьего ответа на главной странице
    public static final String ANSWER_2_TEXT = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";

    //текст четвертого ответа на главной странице
    public static final String ANSWER_3_TEXT = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";

    //текст пятого ответа на главной странице
    public static final String ANSWER_4_TEXT = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";

    //текст шестого ответа на главной странице
    public static final String ANSWER_5_TEXT = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";

    //текст седьмого ответа на главной странице
    public static final String ANSWER_6_TEXT = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";

    //текст восьмого ответа на главной странице
    public static final String ANSWER_7_TEXT = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    //локатор кнопки заказа вверху страницы
    public static final By ORDER_BUTTON_HEADER = By.xpath(".//button[@class='Button_Button__ra12g' and text()='Заказать']");

    //локатор кнопки заказа внизу страницы
    public static final By ORDER_BUTTON_BOTTOM = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']");

    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnElement(By element) {
        driver.findElement(element).click();
    }

    public void scrollTillQuestions() {
        WebElement element = driver.findElement(By.className("accordion"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void scrollTillBottomButton() {
        WebElement element = driver.findElement(ORDER_BUTTON_BOTTOM);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickOnOrderButton(By button) {
        if (ORDER_BUTTON_BOTTOM.equals(button)) {
            scrollTillBottomButton();
        }
        driver.findElement(button).click();
    }
}
