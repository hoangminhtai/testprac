import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testdemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/vulcan/Downloads/chromedriver-mac-arm64/chromedriver");


        WebDriver driver = new ChromeDriver();

        try {

            driver.get("https://example.com/login");


            WebElement usernameField = driver.findElement(By.id("username")); // Use the correct locator
            usernameField.sendKeys("my_username");


            WebElement passwordField = driver.findElement(By.id("password")); // Use the correct locator
            passwordField.sendKeys("my_password");

            WebElement loginButton = driver.findElement(By.id("login-button")); // Use the correct locator
            loginButton.click();

//            Thread.sleep(3000);
            boolean isLoggedIn = driver.getPageSource().contains("Dashboard");
            if (isLoggedIn) {
                System.out.println("Login Successful!");
            } else {
                System.out.println("Login Failed!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
