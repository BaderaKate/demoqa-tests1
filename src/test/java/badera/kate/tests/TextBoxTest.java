package badera.kate.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.startMaximized = true;
    }

    @Test
    void fillFormTest() {

        Configuration.startMaximized = true;
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Kate");
        $("#userEmail").setValue("Kate.badera@yandex.ru");
        $("#currentAddress").setValue("some street 1");
        $("#permanentAddress").setValue("another street 2");
        $("#submit").click();
        $("#output #name").shouldHave(text("Kate"));
        $("#output #email").shouldHave(text("Kate.badera@yandex.ru"));
        $("#output #currentAddress").shouldHave(text("some street 1"));
        $("#output #permanentAddress").shouldHave(text("another street 2"));
    }
}
