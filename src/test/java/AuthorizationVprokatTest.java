import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class AuthorizationVprokatTest {
    @Test
    public void testAuthorizationVprokat() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://vprokat.online/");

        driver.findElement(By.cssSelector("a[aria-label=\"Профиль\"]")).click();

        driver.findElement(By.cssSelector("[autocomplete=email]")).sendKeys("1716.06+111@gmail.com");
        driver.findElement(By.cssSelector("[autocomplete=current-password]")).sendKeys("test9876");

        List<WebElement> inputs = driver.findElements(By.cssSelector("[type=submit"));
        inputs.get(2).click();

        driver.findElement(By.cssSelector("a[aria-label=\"Профиль\"]")).click();

        List<WebElement> outputs = driver.findElements(By.cssSelector("[type=button"));
        outputs.get(2).click();

        driver.quit();
    }
}
