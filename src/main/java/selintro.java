import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.Thread.sleep;

public class selintro {
        public static void main(String[] args) throws InterruptedException {
//Firefox
            System.setProperty("webdriver.gecko.driver", "D:\\Selenium drivers\\geckodriver-v0.33.0-win64/geckodriver.exe");

            WebDriver driver = new FirefoxDriver();

            driver.get("https://rahulshettyacademy.com/locatorspractice/");

            //System.out.println(driver.getTitle());
            //System.out.println(driver.getCurrentUrl());

            driver.findElement(By.id("inputUsername")).sendKeys("ranjithhp20@gmail.com");
            driver.findElement(By.name("inputPassword")).sendKeys("Password1$");
            driver.findElement(By.className("signInBtn")).click();
            //System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
            driver.findElement(By.linkText("Forgot your password?")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ranjith");
            driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Ranjithhp203@gmail.com");
            driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
            driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Ranjithhp20@gmail.com");
            driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9902706857");
            driver.findElement(By.xpath("//button[normalize-space()='Reset Login']")).click();
            System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
           driver.findElement(By.xpath("//button[normalize-space()='Go to Login']")).click();
            driver.findElement(By.id("inputUsername")).sendKeys("rahul");
            driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
            //driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
            //driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
            driver.findElement(By.className("signInBtn")).click();
            System.out.println(driver.findElement(By.tagName("p")).getText());
            //Assert.assertEquals("driver.findElement(By.xpath("//p[normalize-space()='You are successfully logged in.']").getText());","You are successfully logged in.");
            driver.findElement(By.xpath("//button[normalize-space()='Log Out']")).click();
            Thread.sleep(2000);
            driver.quit();


        }
    }

