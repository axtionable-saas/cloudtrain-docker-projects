import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReactProjectTest {

    @Test
    public void openGoogle() throws InterruptedException {
        // This for your browser setup
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // https://www.google.com
        driver.get("http://react-project-alb-302041935.ap-south-1.elb.amazonaws.com");

        driver.manage().window().maximize();

        // search text box
        System.out.println(driver.findElement(By.xpath("/html/body/div/div/h1")));

        Thread.sleep(3000);
        System.out.println(driver.getTitle());

        driver.quit();
    }
    
}
