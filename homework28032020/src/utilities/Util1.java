package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Util1 { public WebDriver driver;
    private JavascriptExecutor jse;


    // this method will click on element
    public void clickOnElement(By by) {
        driver.findElement(by).click();
        // this method will send text on element
    }
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    //this method will get text from element
    public String getTextFromElement
    (By by) {
        return driver.findElement(by).getText();
    }
    // this method is for mouse hover (move to element)
    public void moveToElement(By by) {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(by)).perform();
    }
    // this method is select by visible text
    public void selectByvisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    // this method is for select by value
    public void selectByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }
    // this method is for select by index
    public void selectByIndex(By by, int x) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(x);
    }
    // this mehtod is implicit wait in seconds
    public void implicitWaitSeconds(int y) {
        driver.manage().timeouts().implicitlyWait(y, TimeUnit.SECONDS);
    }
    // this method is
//    public void explicitWait (int z){
//        WebDriverWait wait = new WebDriverWait(z,);
//        wait.
    public void sleepMethod () throws InterruptedException {
        Thread.sleep(2000);
    }
    public void quitMethod (){
        driver.quit();
    }
    public void closeMethod(){
        driver.close();
    }
    public void chromeDriver (){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }
    public void maximizeWindow (){
        driver.manage().window().maximize();
    }
    public void openUrl(String a){
        driver.get(a);
    }
    public void javaScriptExecuter (int x,int y){
        jse = (JavascriptExecutor) driver;
        jse.executeScript ("window.scrollBy(0,500);");
    }
    public void selectDropDown (By by,String text){
        WebElement productDropDown = driver.findElement(by);
    }
    //    public void listWebElement(By by){
//        List<String> objectNames = new ArrayList<>();
//        List<WebElement> objectList = driver.findElements(by);
//    }
    public void randomMethod (By by){
        WebElement emailField;
        Random email = new Random();
        char c = (char) (email.nextInt(26) + 'a');
        emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys(c + "ravee123@gmail.com");


    }
    public void arrayListforEachLooopAssertEquals(By by){

    }


}
