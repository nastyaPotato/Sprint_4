import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.pages.MainPage;

import static org.junit.Assert.assertEquals;
import static ru.yandex.pages.MainPage.*;

@RunWith(Parameterized.class)
public class TestQuestionsOnMainPage {
    private WebDriver driver;
    private final By question;
    private final By answer;
    private final String answerText;

    public TestQuestionsOnMainPage(By question, By answer, String answerText) {
        this.question = question;
        this.answer = answer;
        this.answerText = answerText;
    }

    @Parameterized.Parameters
    public static Object[][] getFAQ() {
        return new Object[][]{
                {QUESTION0, ANSWER0, ANSWER_0_TEXT},
                {QUESTION1, ANSWER1, ANSWER_1_TEXT},
                {QUESTION2, ANSWER2, ANSWER_2_TEXT},
                {QUESTION3, ANSWER3, ANSWER_3_TEXT},
                {QUESTION4, ANSWER4, ANSWER_4_TEXT},
                {QUESTION5, ANSWER5, ANSWER_5_TEXT},
                {QUESTION6, ANSWER6, ANSWER_6_TEXT},
                {QUESTION7, ANSWER7, ANSWER_7_TEXT},
        };

    }

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void checkListOfQuestions() {
        MainPage mainPage = new MainPage(driver);
        mainPage.scrollTillQuestions();
        mainPage.clickOnQuestion(question);
        assertEquals(answerText, driver.findElement(answer).getText());
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
