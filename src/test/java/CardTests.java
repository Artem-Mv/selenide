import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class CardTests {
    @Test
    void cardOrderPositiveTest(){
        open("http://localhost:9999/");

        $x("//input[@class='input__control']").setValue("Имя Фамилия");
        $x("//input[@name='phone']").setValue("+79012345678");
        $x("//span[@class='checkbox__box']").click();
        $x("//span[@class='button__text']").click();
        $x("//*[contains(text(), 'успешно')]").shouldBe(Condition.visible);
    }
}
