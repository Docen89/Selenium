

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class demoqa {

  WebDriver driver;

  @BeforeEach
  public void setup() {
    driver = new ChromeDriver();
    driver.get("http://demoqa.com/");
    driver.manage().window().maximize();
  }

  @Test
  void TestDemoQa_1() {
    WebElement element = driver.findElement(
        By.xpath("//div[@class='card mt-4 top-card']"));
    element.click();
    WebElement elementText = driver.findElement(
        By.xpath("//li[@id='item-0']"));
    elementText.click();
    WebElement elementName = driver.findElement(
        By.xpath("//input[@id='userName']"));
    elementName.sendKeys("Taras");
    WebElement elementEmail = driver.findElement(
        By.xpath("//input[@id='userEmail']"));
    elementEmail.sendKeys("test@bk.ru");
    WebElement elementCad = driver.findElement(
        By.xpath("//textarea[@id='currentAddress']"));
    elementCad.sendKeys("mars");
    WebElement elementPad = driver.findElement
    By.xpath("//textarea[@id='permanentAddress']"));
    elementPad.sendKeys("forest");
    WebElement elementSub = driver.findElement(
        By.xpath("//button[@id='submit']"));
    elementSub.click();
    assertEquals("https://demoqa.com/text-box", driver.getCurrentUrl());
  }

  @Test
  void TestDemoQa_2() {
    WebElement elementAlerts = driver.findElement(
        By.xpath("//div[@class='category-cards']/div[3]"));
    elementAlerts.click();
    WebElement elementBrowserWindows = driver.findElement(
        By.xpath("//li[@class='btn btn-light active']"));
    elementBrowserWindows.click();
    WebElement elementNewTab = driver.findElement(
        By.xpath("//button[@id='tabButton']"));
    elementNewTab.click();
    Object[] windowHandles = driver.getWindowHandles().toArray();
    driver.switchTo().window((String) windowHandles[1]);
    String title = driver.getTitle();
    assertEquals("https://demoqa.com/sample", driver.getCurrentUrl());
  }

  @AfterEach
  public void tearDown() {
    driver.quit();
  }
}
