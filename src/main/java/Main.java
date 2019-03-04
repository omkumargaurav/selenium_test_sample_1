import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World!");

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\OmKumar Gaurav\\Desktop\\testpr\\drivers\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        WebElement searchElement = driver.findElement(By.name("q"));

        WebElement gSearch = driver.findElement(By.name("btnK"));

        /*Input text in search box*/
        searchElement.sendKeys("Hello");
        //Submit search request
        //searchElement.submit();

        //Add some break time
        Thread.sleep(2000);

        //Click on the google search button
        //gSearch.click();

        //Enter performed after writing text in search box
        Actions action = new Actions(driver);

        action.moveToElement(searchElement).sendKeys(Keys.ENTER).perform();



    }
}
