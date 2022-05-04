package selenium.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import selenium.config.Config;
import selenium.websites.Websites;

import java.util.ArrayList;
import java.util.List;

public class TestCase01 {
    public List<WebElement> searchJavaOnFireFox() throws InterruptedException {
        Config.setupFirefox();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.baidu.com/");
        driver.manage().window().maximize();
        WebElement search_text = driver.findElement(By.id("kw"));
        search_text.sendKeys("java");
        search_text.submit();
        Thread.sleep(2000);

        //get all titles in the first page
        List<WebElement> search_result = driver.findElements(By.xpath("//div/div/h3"));
        System.out.println("Number of title in the first page : "+search_result.size());
        for(WebElement result : search_result){
            System.out.println(result.getText());
        }
        //get titles that contain keyword 'java'
        List<WebElement> final_result = new ArrayList<>();
        for(WebElement result : search_result){
            if(result.getText().contains("Java") ||result.getText().contains("java") ||result.getText().contains("JAVA")){
                final_result.add(result);
            }
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("Number of title having 'java' in the first page : "+final_result.size());
        for(WebElement result : final_result){
            System.out.println(result.getText());
        }
        return final_result;
    }
}
