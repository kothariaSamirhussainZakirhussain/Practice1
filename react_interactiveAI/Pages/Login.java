package react_interactiveAI.Pages;
import react_interactiveAI.Actions.ActionClass;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;

public class Login {
    WebDriver driver;
    ExtentTest extentTest;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/main/div/div/div[1]/div[2]/header/div/div[3]/a[2]")
    public WebElement LoginButton;

    public Login(WebDriver driver, ExtentTest test) throws InterruptedException, IOException {
        this.driver = driver;
        this.extentTest = test;
        PageFactory.initElements(driver, this);
    }
    public void LoginForm(String username, String password) throws InterruptedException, IOException, SQLException, AWTException {

    }

    }



