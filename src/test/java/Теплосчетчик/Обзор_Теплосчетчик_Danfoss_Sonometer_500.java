package Теплосчетчик;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class Обзор_Теплосчетчик_Danfoss_Sonometer_500 {
        public ChromeDriver driver;

        @Before
        public void beforeTest() {
            System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("http://localhost:8080/login");
            driver.manage().window().maximize();
        }


        @Test
        public void Danfoss_SonoCollect_111_LocalStorage() throws InterruptedException {


            System.out.println("Enter Email");
            driver.findElement(By.id("Email")).sendKeys("Admin@Admin.com");
            Thread.sleep(1000);

            System.out.println("Enter password");
            driver.findElement(By.id("password")).sendKeys("Admin@Admin.com");
            Thread.sleep(1000);

            System.out.println("Click Enter");
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[1]/button/span[1]")).click();
            Thread.sleep(1000);

            System.out.println("Check url");
            assertEquals("http://localhost:8080/groups", driver.getCurrentUrl());

            System.out.println("Check title");
            assertEquals("IndivAMR Cloud", driver.getTitle());
            Thread.sleep(1000);

            System.out.println("Click Бориса Пастернака,25");
            Actions actions = new Actions(driver);
            WebElement elementLocator = driver.findElement(By.xpath("//*[contains(text(), 'Бориса Пастернака,25')]"));
            actions.doubleClick(elementLocator).perform();
            Thread.sleep(1000);

            System.out.println("35");
            elementLocator = driver.findElement(By.xpath(".//tr[3]//td[1][@value='35']"));
            actions.doubleClick(elementLocator).perform();
            Thread.sleep(1000);

            System.out.println("Click Добавить");
            driver.findElement(By.xpath("//*[@title='Добавить']")).click();
            Thread.sleep(1000);

            System.out.println("Click Тип устройства");
            driver.findElement(By.xpath("//label[contains(text(),'Тип устройства')]/following::div")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//li[contains(text(),'Теплосчетчик')]")).click();
            Thread.sleep(1000);

            System.out.println("Click Модель");
            driver.findElement(By.xpath("//label[contains(text(),'Модель')]/following::div")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//li[contains(text(),'Danfoss Sonometer-500')]")).click();
            Thread.sleep(1000);

            System.out.println("Click Далее");
            driver.findElement(By.xpath(".//span[contains(text(), 'Далее')]")).click();
            Thread.sleep(3000);

            System.out.println("Click Добавить");
            driver.findElement(By.xpath("//*[@title='Добавить']")).click();
            Thread.sleep(1000);

            System.out.println("Enter Серийный номер");
            driver.findElement(By.xpath("//tr[2]/td[1]/div/div/input")).sendKeys("12345678992");
            Thread.sleep(1000);

            System.out.println("Click Сохранить");
            driver.findElement(By.xpath("//button[1][@title='Сохранить']")).click();
            Thread.sleep(2000);

            System.out.println("Click Сохранить");
            driver.findElement(By.xpath("//div[3]/div/button[2]/span[1]")).click();
            Thread.sleep(2000);

            System.out.println("Click Изменить");
            driver.findElement(By.xpath("//button[2][@title='Изменить']")).click();
            Thread.sleep(2000);

            System.out.println("Click Удалить");
            driver.findElement(By.xpath("//button[@title='Удалить']")).click();
            Thread.sleep(1000);

            System.out.println("Check Сохранить все изменения");
            driver.findElement(By.xpath("//*[text()='check']")).click();
            Thread.sleep(1000);

            System.out.println("Check Сохранить");
            driver.findElement(By.xpath("//*[text()='Сохранить']")).click();
            Thread.sleep(1000);


        }


            @After
            public void afterTest() {
                driver.quit();
            }
}
