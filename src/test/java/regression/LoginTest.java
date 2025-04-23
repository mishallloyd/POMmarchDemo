package regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;
import pages.Login;

public class LoginTest {


    @Test
    public void loginTest()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/ip/");

        Login login =new Login(driver);
        login.setTxtUsername("amolujagare.gmail.com");
        login.setTxtPassword("admin123");
        login.clickLogin();

        System.out.println(driver.getTitle());
    }

}
