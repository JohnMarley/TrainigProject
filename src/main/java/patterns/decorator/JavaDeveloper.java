package patterns.decorator;

import org.openqa.selenium.WebElement;

public class JavaDeveloper implements Developer {
    @Override
    public String makeJob() {
        return "write code.";
    }

}
