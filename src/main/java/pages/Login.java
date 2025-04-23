package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    @FindBy (id = "email")
    WebElement txtUsername;

    @FindBy (id = "password")
    WebElement txtPassword;

    @FindBy (xpath = "//button[normalize-space()='Login']")
    WebElement btnLogin;

    @FindBy (xpath = "//a[normalize-space()='I forgot my password']")
    WebElement btnForgotPassword;

    public Login(WebDriver driver)
    {
       // PageFactory.initElements(driver,new PageFactory());
        //PageFactory.initElements(driver,page:this);
    }

    public void setTxtUsername(String username)
    {
        txtUsername.sendKeys(username);
    }

    public void setTxtPassword(String pwd)
    {
        txtPassword.sendKeys(pwd);
    }

    public void clickLogin()
    {
        btnLogin.click();
    }

    public void clickForgotPassword()
    {
        btnForgotPassword.click();
    }
}
