import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PracticeFormPage {
    private WebDriver driver;
    private By name=By.id("L-UserNameField");
    private By password=By.id("L-PasswordField");
    private  By arama =By.id("k");


    public PracticeFormPage(WebDriver driver){
        this.driver=driver;
    }

    public void setName(String nametext){
        WebElement namespace=driver.findElement(name);
        namespace.click();
        namespace.sendKeys(nametext);


}
    public void setSifre(String passwordtext){
        WebElement sifre=driver.findElement(password);
        sifre.click();
        sifre.sendKeys(passwordtext);
    }
    public void setButton(){
        WebElement buton=driver.findElement(By.id("gg-login-enter"));
        buton.click();


    }


    public String getName(){
        WebElement namespace =driver.findElement(name);
       return namespace.getAttribute("value");
    }
    public String getsifre(){
        WebElement sifre =driver.findElement(password);
        return sifre.getAttribute("value");
    }
}
