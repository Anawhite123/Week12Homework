package Browserfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Utility extends Baseclass {

    public void clickOneElement(By by) {// this method will click on element
        WebElement element = driver.findElement(by);
        element.click();
    }

    public String getTextfromelement(By by) {//Return type method
        return driver.findElement(by).getText();//logout
    }

    public void sendTextToElement(By by, String text) {// this method will send text to elements
        WebElement element = driver.findElement(by);
        element.sendKeys(text);
    }

    public void sendKeysToElement(By by, CharSequence keys) {// this method will send text to element//Both are same, this is easy
        driver.findElement(by).sendKeys(keys);
    }

    public void clearTextFromField(By by) {//This method will clear text from field
        driver.findElement(by).sendKeys(Keys.CONTROL + "a");
        driver.findElement(by).sendKeys(Keys.DELETE);
    }
    //########################ActionClassMethods##########################################

    public void dragAndDrop(By drag, By drop) {
        Actions actions = new Actions(driver);
        WebElement draggable = driver.findElement(drag);
        WebElement droppable = driver.findElement(drop);
        actions.dragAndDrop(draggable, droppable).build().perform();
    }

    public void MouseHoverAndClick(By by, By by1) throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement mouseHoover = driver.findElement(by);
        WebElement mousehoover1 = driver.findElement(by);
        Thread.sleep(5000);
//        waitUnitVisibilityOfElementLocated(by,3000);
        actions.moveToElement(mouseHoover).moveToElement(mousehoover1).click().build().perform();
    }


}
