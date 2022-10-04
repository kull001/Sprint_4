import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectPackage.ImportantQuestions;

public class ImportantQuestiondTests {
    private WebDriver driver;
    @Before
    public void beginning(){
        // драйвер для браузера Chrome
        driver = new ChromeDriver();
        // переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");

    }

    @Test
    public void checkText1(){
        //создаем объект страницы Вопросы о важном
        ImportantQuestions importantQuestions = new ImportantQuestions(driver);
        //кликаем на первый вопрос
        importantQuestions.clickQuestion1();
        Assert.assertEquals(importantQuestions.getTextQuestion1(), "Сутки — 400 рублей. Оплата курьеру — наличными или картой.");
    }
    @Test
    public void checkText2(){
        //создаем объект страницы Вопросы о важном
        ImportantQuestions importantQuestions = new ImportantQuestions(driver);
        //кликаем на второй вопрос
        importantQuestions.clickQuestion2();
        Assert.assertEquals(importantQuestions.getTextQuestion2(), "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.");
    }
    @Test
    public void checkText3(){
        //создаем объект страницы Вопросы о важном
        ImportantQuestions importantQuestions = new ImportantQuestions(driver);
        //кликаем на третий вопрос
        importantQuestions.clickQuestion3();
        Assert.assertEquals(importantQuestions.getTextQuestion3(), "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.");
    }
    @Test
    public void checkText4(){
        //создаем объект страницы Вопросы о важном
        ImportantQuestions importantQuestions = new ImportantQuestions(driver);
        //кликаем на четвертый вопрос
        importantQuestions.clickQuestion4();
        Assert.assertEquals(importantQuestions.getTextQuestion4(), "Только начиная с завтрашнего дня. Но скоро станем расторопнее.");
    }
    @Test
    public void checkText5(){
        //создаем объект страницы Вопросы о важном
        ImportantQuestions importantQuestions = new ImportantQuestions(driver);
        //кликаем на пятый вопрос
        importantQuestions.clickQuestion5();
        Assert.assertEquals(importantQuestions.getTextQuestion5(), "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.");
    }
    @Test
    public void checkText6(){
        //создаем объект страницы Вопросы о важном
        ImportantQuestions importantQuestions = new ImportantQuestions(driver);
        //кликаем на шестой вопрос
        importantQuestions.clickQuestion6();
        Assert.assertEquals(importantQuestions.getTextQuestion6(), "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.");
    }
    @Test
    public void checkText7(){
        //создаем объект страницы Вопросы о важном
        ImportantQuestions importantQuestions = new ImportantQuestions(driver);
        //кликаем на седьмой вопрос
        importantQuestions.clickQuestion7();
        Assert.assertEquals(importantQuestions.getTextQuestion7(), "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.");
    }
    @Test
    public void checkText8(){
        //создаем объект страницы Вопросы о важном
        ImportantQuestions importantQuestions = new ImportantQuestions(driver);
        //кликаем на восьмой вопрос
        importantQuestions.clickQuestion8();
        Assert.assertEquals(importantQuestions.getTextQuestion8(), "Да, обязательно. Всем самокатов! И Москве, и Московской области.");
    }
    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }

}
