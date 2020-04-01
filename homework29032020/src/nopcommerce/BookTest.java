package nopcommerce;

import Utility.Utilites1;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookTest extends Utilites1 {
    String baseUrl = "https://demo.nopcommerce.com/books?orderby=10";

    @Before
    public void openBrowser() {

        chromeDriver();
        maximizeWindow();
        implicitWaitSeconds(10);
        openUrl(baseUrl);
    }

    @Test
    public void test02() throws InterruptedException {

        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]"));
        List<String> jwelryName = new ArrayList<>();

        Select select = new Select(driver.findElement(By.id("products-orderby")));
        select.selectByIndex(1);
        List<WebElement> jwelryList = driver.findElements(By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//h2[1]"));

        for (WebElement jewlryall : jwelryList) {
            jwelryName.add(jewlryall.getText());
            System.out.println();
        }

        List<String> tempList = new ArrayList<>();
        tempList.addAll(jwelryName);
        Collections.sort(tempList,Collections.reverseOrder());
        Assert.assertEquals(tempList,jwelryName);
        sleepMethod();
    }

    @After
    public void closeBrowser() throws InterruptedException {
    quitMethod();
    }

}