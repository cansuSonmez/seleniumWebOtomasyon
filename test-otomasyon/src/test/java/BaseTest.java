import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {
    WebDriver driver;
    WebDriver driver1;
    PracticeFormPage practiceFormPage;

    @BeforeAll
    public  void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cansu\\Selenium\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver1=new ChromeDriver();
        

        driver.get("https://www.gittigidiyor.com/uye-girisi?s=1");
        practiceFormPage=new PracticeFormPage(driver);
    }

   // @AfterAll
   // public  void  teardown(){

      //  driver.quit();
   // }
}
