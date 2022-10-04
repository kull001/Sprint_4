package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImportantQuestions {
    private WebDriver driver;
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
    public void clickQuestion1(){
        WebElement element = driver.findElement(Question1);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(Question1).click();
    }
    public String getTextQuestion1(){
        return driver.findElement(Answer1).getText();
    }
    public void clickQuestion2(){
        WebElement element = driver.findElement(Question2);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(Question2).click();
    }
    public String getTextQuestion2(){
        return driver.findElement(Answer2).getText();
    }
    public void clickQuestion3(){
        WebElement element = driver.findElement(Question3);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(Question3).click();
    }
    public String getTextQuestion3(){
        return driver.findElement(Answer3).getText();
    }
    public void clickQuestion4(){
        WebElement element = driver.findElement(Question4);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(Question4).click();
    }
    public String getTextQuestion4(){
        return driver.findElement(Answer4).getText();
    }
    public void clickQuestion5(){
        WebElement element = driver.findElement(Question5);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(Question5).click();
    }
    public String getTextQuestion5(){
        return driver.findElement(Answer5).getText();
    }
    public void clickQuestion6(){
        WebElement element = driver.findElement(Question6);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(Question6).click();
    }
    public String getTextQuestion6(){
        return driver.findElement(Answer6).getText();
    }
    public void clickQuestion7(){
        WebElement element = driver.findElement(Question7);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(Question7).click();
    }
    public String getTextQuestion7(){
        return driver.findElement(Answer7).getText();
    }
    public void clickQuestion8(){
        WebElement element = driver.findElement(Question8);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(Question8).click();
    }
    public String getTextQuestion8(){
        return driver.findElement(Answer8).getText();
    }
}
