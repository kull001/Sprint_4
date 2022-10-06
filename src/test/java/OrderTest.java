import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjectPackage.CheckOrder;

@RunWith(Parameterized.class)
public class OrderTest {
    private WebDriver driver;


    @Before
    public void beginning() {
        // драйвер для браузера Chrome
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        // переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");

    }

        private final String button;
        private final String name;
        private final String surName;
        private final String address;
        private final String telephon;
        private final String date;
        private final String comment;
        private final String color;


        public OrderTest(String button, String name, String surName, String address, String telephon, String date, String comment,String color) {
            this.button = button;
            this.name = name;
            this.surName = surName;
            this.address = address;
            this.telephon = telephon;
            this.date = date;
            this.comment = comment;
            this.color = color;
        }

        @Parameterized.Parameters
        public static Object[] getData() {
            return new Object[][]{
                    {"Верх", "Сергей", "Петров", "Саратов ул. Горького д 22", "89173216547", "30.11.2022", "Коммент", "Черный"},
                    {"Низ", "Дима", "Сергеев", "Саратов ул. Горького д 28", "89173245547", "01.12.2022", " ", "Серый"},
            };
        }


        @Test
        public void OrderCheck() {
            //CheckOrder checkOrder = new CheckOrder(driver);
            CheckOrder checkOrder = new CheckOrder(driver);
            checkOrder.clickCookie();
            checkOrder.clickOrder(button);
            checkOrder.setFieldName(name);
            checkOrder.setFieldSurName(surName);
            checkOrder.setFieldAddress(address);
            checkOrder.clickStation();
            checkOrder.setFieldTelephone(telephon);
            checkOrder.pushNext();
            checkOrder.setFieldDate(date);
            checkOrder.clickOrd();
            checkOrder.pushRentalPeriod();
            checkOrder.pushRentalPeriod1();
            checkOrder.pushColor(color);
            checkOrder.setComment(comment);
            checkOrder.clickNext();
            checkOrder.pushYes();
            Assert.assertTrue(checkOrder.checkDone());
        }



        @After
        public void teardown() {
            // Закрой браузер
            driver.quit();
        }

}
