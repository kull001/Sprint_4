import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectPackage.CheckOrder;

public class OrderTest {
    private WebDriver driver;
    @Before
    public void beginning(){
        // драйвер для браузера Chrome
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        // переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");

    }
    @Test
    public void OrderCheckUp(){
        //CheckOrder checkOrder = new CheckOrder(driver);
        CheckOrder checkOrder = new CheckOrder(driver);
        checkOrder.clickCookie();
        checkOrder.clickOrderUp();
        checkOrder.setFieldName("Сергей");
        checkOrder.setFieldSurName("Сергеев");
        checkOrder.setFieldAddress("Саратов ул. Московская д. 55 кв. 21");
        checkOrder.clickStation();
        checkOrder.setFieldTelephone("89191234567");
        checkOrder.pushNext();
        checkOrder.setFieldDate("10.10.2022");
        checkOrder.clickOrderUp();
        checkOrder.pushRentalPeriod();
        checkOrder.pushRentalPeriod1();
        checkOrder.pushBlackColor();
        checkOrder.setComment("Comment");
        checkOrder.clickOrderDown();
        checkOrder.pushYes();
        Assert.assertTrue(checkOrder.checkDone());
    }
    @Test
    public void OrderCheckDown(){
        //CheckOrder checkOrder = new CheckOrder(driver);
        CheckOrder checkOrder = new CheckOrder(driver);
        checkOrder.clickCookie();
        checkOrder.skrollPage();
        checkOrder.clickOrderDown2();
        checkOrder.setFieldName("Дмитрий");
        checkOrder.setFieldSurName("Воронин");
        checkOrder.setFieldAddress("Москва ул. Саратовская д. 155 кв. 521");
        checkOrder.clickStation();
        checkOrder.setFieldTelephone("+79874561245");
        checkOrder.pushNext();
        checkOrder.setFieldDate("01.11.2022");
        checkOrder.clickOrderDown();
        checkOrder.pushRentalPeriod();
        checkOrder.pushRentalPeriod2();
        checkOrder.pushGreyColor();
        //checkOrder.setComment("Comment");
        checkOrder.clickOrderDown();
        checkOrder.pushYes();
        Assert.assertTrue(checkOrder.checkDone());
    }
    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}
