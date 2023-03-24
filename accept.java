package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class accept {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	    WebDriver driver=new ChromeDriver(option);
        driver.manage().window().maximize(); 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        driver.get("https://letcode.in/alert");
        driver.findElement(By.id("accept")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");

	}

}
