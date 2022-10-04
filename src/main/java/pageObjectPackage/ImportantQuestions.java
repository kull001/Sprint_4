package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImportantQuestions {
    private WebDriver driver;
    final int i = 10;
    //локатор "Сколько стоит и как оплатить?"
    private By Question1 = By.id("accordion__heading-0");
    private By Answer1 = By.xpath(".//div[@id='accordion__panel-0']/p");
    //докатор "Хочу сразу несколько самокатов! Так можно?"
    private By Question2 = By.id("accordion__heading-1");
    private By Answer2 = By.xpath(".//div[@id='accordion__panel-1']/p");
    //локатор "Как рассчитывается время аренды?"
    private By Question3 = By.id("accordion__heading-2");
    private By Answer3 = By.xpath(".//div[@id='accordion__panel-2']/p");
    //локатор "Можно ли заказать самокат прямо на сегодня?"
    private By Question4 = By.id("accordion__heading-3");
    private By Answer4 = By.xpath(".//div[@id='accordion__panel-3']/p");
    //локатор "Можно ли продлить заказ или вернуть самокат раньше?"
    private By Question5 = By.id("accordion__heading-4");
    private By Answer5 = By.xpath(".//div[@id='accordion__panel-4']/p");
    //локатор "Вы привозите зарядку вместе с самокатом?"
    private By Question6 = By.id("accordion__heading-5");
    private By Answer6 = By.xpath(".//div[@id='accordion__panel-5']/p");
    //локатор "Можно ли отменить заказ?"
    private By Question7 = By.id("accordion__heading-6");
    private By Answer7 = By.xpath(".//div[@id='accordion__panel-6']/p");
    //локатор Я жизу за МКАДом, привезёте"
    private By Question8 = By.id("accordion__heading-7");
    private By Answer8 = By.xpath(".//div[@id='accordion__panel-7']/p");

    public ImportantQuestions(WebDriver driver) {

        this.driver = driver;
    }

    //жмем на вопрос и получаем текст
    public String getText(int number){
        WebElement element = driver.findElement(Question1);
        String text = null;
        switch (number){
            case (1):
                ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
                driver.findElement(Question1).click();
                text = driver.findElement(Answer1).getText();
                break;
            case (2):
                ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
                driver.findElement(Question2).click();
                text = driver.findElement(Answer2).getText();
                break;
            case (3):
                ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
                driver.findElement(Question3).click();
                text = driver.findElement(Answer3).getText();
                break;
            case (4):
                ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
                driver.findElement(Question4).click();
                text = driver.findElement(Answer4).getText();
                break;
            case (5):
                ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
                driver.findElement(Question5).click();
                text =  driver.findElement(Answer5).getText();
                break;
            case (6):
                ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
                driver.findElement(Question6).click();
                text = driver.findElement(Answer6).getText();
                break;
            case (7):
                ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
                driver.findElement(Question7).click();
                text = driver.findElement(Answer7).getText();
                break;
            case (8):
                ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
                driver.findElement(Question8).click();
                text = driver.findElement(Answer8).getText();
                break;
        }
        return text;

    }




}
