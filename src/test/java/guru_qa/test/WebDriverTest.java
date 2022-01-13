package guru_qa.test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WebDriverTest extends TestBase {

    @Test
    void yaSearchTest() {

        step("Открыть сайт https://ya.ru/", () ->
                open("https://ya.ru/"));

        step("Ввести в строку поиска запрос 'github'", () ->
                $("[name='text']").setValue("github").pressEnter());

        step("Найти в результатах поиска сайт Github и открыть его", () -> {
            $("#search-result").$(withText("Where the world builds software")).click();
            switchTo().window(1);
        });

        step("Проверить текст заголовка страницы", () ->
                assertThat(title()).isEqualTo("GitHub: Where the world builds software · GitHub"));

    }

}
