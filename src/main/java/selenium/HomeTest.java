package selenium;


import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;


public class HomeTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  
  
  @Test
  public void TestGoToHomeView() {
	driver = new ChromeDriver();
	js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    driver.get("http://localhost:3000/");
    driver.manage().window().setSize(new Dimension(988, 1040));
    driver.findElement(By.linkText("Home")).click();
  }
}
