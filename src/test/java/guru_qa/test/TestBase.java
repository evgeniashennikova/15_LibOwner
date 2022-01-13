package guru_qa.test;

import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebDriverProvider;
import guru_qa.attach.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void setup() {

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        WebDriverProvider.webConfiguration();
    }

    @AfterEach
    public void tearDown() {

        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }

}
