package patterns.decorator;

//import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

//@Log4j
@Slf4j
public class SeniorJavaDeveloper extends DeveloperDecorator {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob(){
        log.info("My INFO logging for decorator");
        log.warn("My INFO logging for decorator");
//        System.out.println("My logging for decorator");
        return super.makeJob() + " and perform code review";
    }
}
