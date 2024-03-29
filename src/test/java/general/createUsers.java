package general;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class createUsers {
    public ChromeDriver driver;


    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/settings");
        driver.manage().window().maximize();


    }


    @Test
    public void testLogin() throws InterruptedException {

        System.out.println("Check url");
        assertEquals("http://localhost:8080/login", driver.getCurrentUrl());

        System.out.println("Enter Email");
        driver.findElement(By.id("Email")).sendKeys("Admin@Admin.com");
        Thread.sleep(2000);

        System.out.println("Enter password");
        driver.findElement(By.id("password")).sendKeys("Admin@Admin.com");
        Thread.sleep(2000);

        System.out.println("Click Enter");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[1]/button/span[1]")).click();
        Thread.sleep(2000);

        System.out.println("Check url");
        assertEquals("http://localhost:8080/groups", driver.getCurrentUrl());

        System.out.println("Check title");
        assertEquals("IndivAMR Cloud", driver.getTitle());
        Thread.sleep(3000);

        System.out.println("Check menu");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/header[2]/div/button")).click();
        Thread.sleep(3000);

        System.out.println("Click Настройки");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/aside/div/div[2]/div/div/div/div[3]/div/a/div/span")).click();
        Thread.sleep(3000);


        System.out.println("Click Управление пользователями");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[1]/div/div/button[2]/span[1]")).click();
        Thread.sleep(3000);


        System.out.println("Click Добавить");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[2]/div[1]/div[1]/div[4]/div/div/span/button[1]")).click();
        Thread.sleep(2000);

        System.out.println("Enter Email");
        driver.findElement(By.xpath("/html/body/div[5]/form/div/div[2]/div/div[1]/div/input")).sendKeys("Admin5@Admin.com");
        Thread.sleep(2000);

        System.out.println("Enter general.Менеджер");
        driver.findElement(By.xpath("/html/body/div[5]/form/div/div[2]/div/div[2]/div/div")).sendKeys("general.Менеджер");
        Thread.sleep(2000);

        System.out.println("Enter Пароль");
        driver.findElement(By.xpath("/html/body/div[5]/form/div/div[2]/div/div[3]/div/input")).sendKeys("Admin@Admin.com");
        Thread.sleep(2000);

        System.out.println("Enter Подтверждение пароля");
        driver.findElement(By.xpath("/html/body/div[5]/form/div/div[2]/div/div[4]/div/input")).sendKeys("Admin@Admin.com");
        Thread.sleep(2000);

        System.out.println("Click Сохранить");
        driver.findElement(By.xpath("/html/body/div[5]/form/div/div[3]/div/button[2]/span[1]")).click();
        Thread.sleep(2000);

        System.out.println("Click Удалить");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[2]/div[1]/div[2]/div/div/div/table/tbody/tr[4]/td[3]/div/button[2]")).click();
        Thread.sleep(2000);

        System.out.println("Click Сохранить");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[2]/div[1]/div[2]/div/div/div/table/tbody/tr[4]/td[2]/div/button[1]/span[1]/span")).click();
        Thread.sleep(2000);

    }


        @After
        public void afterTest() {
            driver.quit();
        }
    }


