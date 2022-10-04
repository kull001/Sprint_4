package pageObjectPackage;

import org.openqa.selenium.*;

public class CheckOrder {
    private WebDriver driver;



    //локатор "Заказать" вверху страницы
    private By orderUp = By.xpath(".//button[text()='Заказать']");

    //локаторы "Дальше" внизу страницы
    private By orderNext = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");
    private By orderDown2 = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/*");
    //локатор для кукки
    private By cookie = By.className("App_CookieButton__3cvqF");
    //локатор поля "Имя"
    private By fieldName = By.xpath(".//input[@placeholder='* Имя']");
    //локатор поля "Фамилия"
    private By fieldSurName = By.xpath(".//input[@placeholder='* Фамилия']");
    //локатор поля "Адрес: куда привезти заказ"
    private By fieldAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //локатор поля "Станция метро"
    private By fieldStation = By.xpath(".//input[@placeholder='* Станция метро']");
    //локатор станции
    //локатор поля "Телефон"
    private By fieldTelephone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //локатор кнопки "Далее"
    private By buttonNext = By.xpath(".//div[@class='Order_NextButton__1_rCA']/*");
    //Локатор поля "Когда привезти самокат"
    private By fieldDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //локатор поля "Срок аренды"
    private By rentalPeriod = By.xpath(".//div[@class='Dropdown-control']/*");
    //локатор "сутки"
    private By rentalPeriod1 = By.xpath(".//div[@class='Dropdown-option' and text()='сутки']");
    //локатор "двое суток"
    private By rentalPeriod2 = By.xpath(".//div[@class='Dropdown-option' and text()='двое суток']");
    //локатор чек-бокса "Черный жемчуг"
    private By blackColor = By.xpath(".//label[@for='black']");
    //локатор чек-бокса "серая безысходность"
    private By greyColor = By.xpath(".//label[@for='grey']");
    //локатор поля "Комментарий"
    private By comment = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //локатор кнопки "Да"
    private By yesButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Да']");
    //локатор для "Заказ оформлен"
    private By orderIsDone = By.xpath(".//div[@class='Order_NextButton__1_rCA']/*");


    //Конструктор
    public CheckOrder(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOrder(String button){
        if(button.equals("Верх")) {
            driver.findElement(orderUp).click();
        } else driver.findElement(orderDown2).click();
    }
    //Жмем "Заказать" вверху
    public void clickOrd(){
        driver.findElement(orderUp).click();
    }
    //Жмем "Заказать" внизу
    public void clickNext(){
        driver.findElement(orderNext).click();
    }

    //закрываем куки
    public void clickCookie(){
        driver.findElement(cookie).click();
    }
    //Заполняем "Имя"
    public void setFieldName(String name){
        driver.findElement(fieldName).sendKeys(name);
    }
    //Заполняем "Фамилия"
    public void setFieldSurName(String surName){
        driver.findElement(fieldSurName).sendKeys(surName);
    }
    //Заполняем "Адрес"
    public void setFieldAddress(String address){
        driver.findElement(fieldAddress).sendKeys(address);
    }
    //Заполняем "Станция метро"
    public void clickStation(){
        driver.findElement(fieldStation).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
    }
    //Заполняем "Телефон"
    public void setFieldTelephone(String telephone){
        driver.findElement(fieldTelephone).sendKeys(telephone);
    }
    //Жмем "Далее"
    public void pushNext(){
        driver.findElement(buttonNext).click();
    }
    //Заполняем "Когда привезти самокат"
    public void setFieldDate(String date) {
        driver.findElement(fieldDate).sendKeys(date);
    }
    //Кликаем "Срок аренды"
    public void pushRentalPeriod(){
        driver.findElement(rentalPeriod).click();
    }
    //Кликаем "Сутки"
    public void pushRentalPeriod1(){
        driver.findElement(rentalPeriod1).click();
    }
    //Кликаем "Двое суток"
    public void pushRentalPeriod2(){
        driver.findElement(rentalPeriod2).click();
    }
    //Выбор цвета
    public void pushColor(String color){
        if(color.equals("Черный")){
            driver.findElement(blackColor).click();
        }else driver.findElement(greyColor).click();
    }

    //Вводим текст комментария.
    public void setComment(String text){
        driver.findElement(comment).sendKeys(text);
    }
    //Кликаеи "Да"
    public void pushYes(){
        driver.findElement(yesButton).click();
    }
    //Получаем текст из финального окна
    public boolean checkDone(){
        WebElement element = driver.findElement(orderIsDone);
        return element.isDisplayed();
    }
    public void skrollPage(){
        WebElement element = driver.findElement(orderDown2);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
}
