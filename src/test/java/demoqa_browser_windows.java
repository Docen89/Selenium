import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqa_browser_windows {
  public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("http://demoqa.com/");
    WebElement element_Alerts= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]"));
    element_Alerts.click();
    WebElement element_Browser_Windows=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[3]/div/ul/li[1]"));
    element_Browser_Windows.click();
    WebElement element_New_Tab= driver.findElement(By.xpath("//*[@id=\"tabButton\"]"));
    element_New_Tab.click();
    Object[] windowHandles=driver.getWindowHandles().toArray();
    driver.switchTo().window((String) windowHandles[1]);
    //assert on title of new window
    String title=driver.getTitle();
    assertEquals("https://demoqa.com/sample",driver.getCurrentUrl());
    driver.quit();
  }
}
