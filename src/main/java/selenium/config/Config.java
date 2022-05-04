package selenium.config;

public class Config {
    public static void setupChrome(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/webdriver/chromedriver.exe");
    }

    public static void setupFirefox(){
        System.setProperty("webdriver.gecko.driver","src/main/resources/webdriver/geckodriver.exe");
    }
}
