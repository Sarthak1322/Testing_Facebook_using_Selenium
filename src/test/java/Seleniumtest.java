import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Seleniumtest {

    public static ChromeOptions options;
    public static WebDriver driver ;

    @BeforeTest
    void setUp() {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarth\\IdeaProjects\\facebooktest\\src\\test\\resources\\chromedriver.exe");

        // Initialize ChromeDriver
        driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com");
    }

    @Test
    void teststeps() throws InterruptedException {
        // Enter email and password
        WebElement email_input = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        email_input.sendKeys("9421950910");
        WebElement password_input = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
        password_input.sendKeys("sarthak2001");

        // Click on the login button
        WebElement login_button = driver.findElement(By.name("login"));
        login_button.click();
        Thread.sleep(5000);

        // Click on the create post button
//        WebElement menu = driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M18.5 1A1.')]"));
//        menu.click();
//        Thread.sleep(3000);

        WebElement post = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]"));
        post.click();
        Thread.sleep(3000);

        WebElement post_input = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]"));
        post_input.sendKeys("I am Sarthak Redasani, using Selenium");

        Thread.sleep(2000);

        WebElement tag_friends = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]"));
        tag_friends.click();
        Thread.sleep(5000);

        WebElement search_friend = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]"));
        search_friend.sendKeys("Sarthak");
        Thread.sleep(3000);

        WebElement select_friend = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/div[1]/div[2]/li[1]/div[1]/div[1]/div[1]/div[1]"));
        select_friend.click();
        Thread.sleep(2000);

        WebElement done_tag = driver.findElement(By.xpath("//*[@class=\"xexx8yu x1sxyh0 x18d9i69 x5ib6vp\"]"));
        done_tag.click();

        Thread.sleep(5000);
        WebElement post_button = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        post_button.click();
        Thread.sleep(5000);
        System.out.println("Post Created and posted Successfully");




//
////        deleting the post
//        Thread.sleep(2000);
//        WebElement delete_post = driver.findElement(By.xpath("//*[@class=\"xqcrz7y x78zum5 x1qx5ct2 x1y1aw1k x1sxyh0 xwib8y2 xurb0ha xw4jnvo\"]"));
//        delete_post.click();
//
//        Thread.sleep(5000);
//
//        WebElement delete = driver.findElement(By.xpath("//span[contains(text(),'Move to Recycle bin')]"));
//        delete.click();
//        Thread.sleep(2000);
//        WebElement move = driver.findElement(By.xpath("//*[@class=\"x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft\"]"));
//        move.click();
//        System.out.println("Post Deleted Successfully");




        // Close the browser
//        driver.quit();
    }
}