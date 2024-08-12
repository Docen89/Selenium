

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class demoqa {

  public static void main(String[] args) {
    // Создаем экземпляр WebDriver
    WebDriver driver = new ChromeDriver();
    // Открываем сайт, используя драйвер
    driver.get("http://demoqa.com/");
    // Находим элемент по xpath
    WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
    // кликаем по нему
    element.click();
    WebElement element_text = driver.findElement(By.xpath("//*[@id=\"item-0\"]"));
    element_text.click();
    WebElement element_Name = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
    element_Name.sendKeys("Taras");
    WebElement element_Email = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
    element_Email.sendKeys("test@bk.ru");
    WebElement element_Cad = driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
    element_Cad.sendKeys("mars");
    WebElement element_Pad = driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]"));
    element_Pad.sendKeys("forest");
    WebElement element_Sub = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
    element_Sub.click();
    assertEquals("https://demoqa.com/text-box", driver.getCurrentUrl());
    driver.quit();
  }
}