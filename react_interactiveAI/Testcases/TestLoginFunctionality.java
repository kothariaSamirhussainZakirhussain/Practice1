package react_interactiveAI.Testcases;
import react_interactiveAI.Pages.Login;
import org.testng.annotations.Test;
import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;
import static react_interactiveAI.constants.CommonVar.*;

public class TestLoginFunctionality extends Basecase {
     @Test( priority = 01)
     public void UserLogin() throws IOException, InterruptedException, SQLException, AWTException {

            logger = extent.createTest("Check login functionality is working or not.");
             Login log = new Login(driver, logger);
             driver.get(url);
             log.LoginForm("",":");

     }

}