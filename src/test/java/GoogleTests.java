import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class GoogleTests {

  @Test
  public void shouldFindSelenideInGoogle() {
    open("https://www.google.com/");
    $("[name='q']").val("Selenide").pressEnter();
    $("#search").shouldHave(text("selenide.org"));
  }
}
