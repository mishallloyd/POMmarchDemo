package regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ForgotPassword;
import pages.Login;

public class ForgotPasswordTest {


    public void forgotPasswordTest()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/ip/");

        Login login = new Login(driver);
        login.clickForgotPassword();

        ForgotPassword forgotPassword = new ForgotPassword(driver);
        forgotPassword.setEmail("amolujagare@gmail.com");
        forgotPassword.clickReset();
    }
}
