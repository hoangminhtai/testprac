import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pageload {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/vulcan/Downloads/chromedriver-mac-arm64/chromedriver");


        WebDriver driver = new ChromeDriver();


        driver.get("https://www.example.com");

        
    }


}