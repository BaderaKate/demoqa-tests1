package badera.kate.docs.doc;

import org.jsoup.select.Evaluator;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {

    void CssXpathExamples() {
        $("[data-testid=email]");

        $(by("data-testid", "email"));

        $("#email");
        $(byId("email"));
        //$(By.id("email");
        $("[id=email]");
        $("[id='email']");
        $("[id=\"email\"]");
        $(by("id", "email"));
        $x("//*[@id='email']");
        $(byXpath("//*[@id='email']"));

        $("input[id=email]");
        $("input#email");

        $("[name=email]");
        $(byName("email"));

        $(byClassName("login_form_input_box"));
        $(".login_form_input_box");
        $(".inputtext.login_form_input_box");
        $x("//*[@class='login_form_input_box']");
    }
}




