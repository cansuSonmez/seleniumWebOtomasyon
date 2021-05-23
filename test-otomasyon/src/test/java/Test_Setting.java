import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting extends BaseTest {


    @Test
    public void setName() {
        practiceFormPage.setName("cansu");
        Assertions.assertEquals("cansu",practiceFormPage.getName(),
                "Name value is not corect!");

    }

    @Test
    public void setSifre(){
        practiceFormPage.setSifre("cansu1111");
        Assertions.assertEquals("cansu1111",practiceFormPage.getsifre(),
                "Password value is not corect!");

    }
    @Test
    public void setButon(){
        practiceFormPage.setButton();

    }



}
