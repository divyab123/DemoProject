package BrowserInstance;

import static com.codeborne.selenide.Selenide.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.codeborne.selenide.WebDriverRunner;
import static com.codeborne.selenide.Condition.*;

public class CommonMethods {
	public static final long DEFAULT_WAIT = 10000;

	public void visiblewait(By icixprdctPage) {
		$(icixprdctPage).shouldNotBe(visible);
	}

	public void waitForElementToBeClickable(By element) throws Exception {
        try {
            WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); // nullify implicitlyWait()
            WebDriverWait wait = new WebDriverWait(WebDriverRunner.getWebDriver(), (DEFAULT_WAIT));
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            throw new Exception("-> element is not clickable -> " + e.getMessage());
        }

    }
	
	public void waitForElementToBeVisible(By element) throws Exception {
        try {
            WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); // nullify implicitlyWait()
            WebDriverWait wait = new WebDriverWait(WebDriverRunner.getWebDriver(), (DEFAULT_WAIT));
            wait.until(ExpectedConditions.presenceOfElementLocated(element));
        } catch (Exception e) {
            throw new Exception("-> element is not clickable -> " + e.getMessage());
        }

    }
	
}
