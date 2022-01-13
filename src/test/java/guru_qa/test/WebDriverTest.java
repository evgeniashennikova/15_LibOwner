package guru_qa.test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WebDriverTest extends TestBase {

    @Test
    void yaSearchTest() {

        open("https://ya.ru/");
        $("[name='text']").setValue("github").pressEnter();
        $("#search-result").$(withText("Where the world builds software")).click();
        switchTo().window(1);
        assertThat(title()).isEqualTo("GitHub: Where the world builds software · GitHub");

    }

}
