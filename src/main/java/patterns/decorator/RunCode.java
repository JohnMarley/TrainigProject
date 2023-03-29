package patterns.decorator;

import org.junit.Test;

public class RunCode {

    @Test
    public void checkDecorator() {
        Developer developer = new SeniorJavaDeveloper(new JavaDeveloper());

        System.out.println(developer.makeJob());
    }
}
