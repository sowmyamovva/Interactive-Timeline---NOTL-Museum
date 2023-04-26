package testcase_3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class homeButtonTest {

    WebDriver driver = null;

    @BeforeEach
    public void beforeAll() {
        driver = new SafariDriver();
        driver.navigate().to("https://badger-timeline.infinityfreeapp.com/public_html/");
    }


    @AfterEach
    public void aftertest(){
        driver.quit();
    }

    @Test
    public void test (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/nav/div/ul[1]/li[1]/a")));

        element.click();

    }

    public static void main (String[] args){

    }
}
