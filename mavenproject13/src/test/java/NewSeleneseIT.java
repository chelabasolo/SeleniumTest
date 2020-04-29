import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NewSeleneseIT {
  //private WebDriver driver;
  //private Map<String, Object> vars;
  //JavascriptExecutor js;
  public void setUp() {
    //driver = new ChromeDriver();
    //js = (JavascriptExecutor) driver;
    //vars = new HashMap<String, Object>();
  }
  public void tearDown() {
    //driver.quit();
  }
  public void sampleapp2() {
       System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Jenkins\\workspace\\chromedriver.exe");	// <-- Change this path
       WebDriver driver = new ChromeDriver();
       String baseUrl = "https://experitest.com/free-trial/";
       String expectedTitle = "Free trial";
       String actualTitle = "";
       driver.get(baseUrl);
       actualTitle = driver.getTitle();
       if (actualTitle.contentEquals(expectedTitle)){
           System.out.println("TEST PASSED!");
       } else {
           System.out.println("TEST FAILED");
       }
       driver.close();
  }
}
