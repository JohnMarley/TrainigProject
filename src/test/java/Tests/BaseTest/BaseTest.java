package Tests.BaseTest;

import Tests.EnumTestStatus.TestStatus;
import org.junit.AssumptionViolatedException;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.rules.ExternalResource;
import org.junit.rules.TestName;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import static Tests.EnumTestStatus.TestStatus.*;

public class BaseTest {
    protected TestStatus testStatus;

    @Rule public TestName name = new TestName();

    @ClassRule
    public static ExternalResource resource = new ExternalResource() {
        private Description description;
        @Override
        public Statement apply(Statement base, Description description) {
            this.description = description;
            return super.apply(base, description);
        }

        @Override
        protected void before(){
            try {

            } catch (Exception e){
                e.printStackTrace();
            }
        }

        @Override
        protected void after(){
            try {

            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
    };

    @Rule
    public TestRule watchman = new TestWatcher() {
        private Description description;
        @Override
        public Statement apply(Statement base, Description description) {
            this.description = description;
            return super.apply(base, description);
        }

        @Override
        protected void succeeded(Description description){ testStatus = PASSED; }

        @Override
        protected void failed(Throwable e, Description description){
            if(e instanceof AssertionError){
                testStatus = FAILED;
            } else {
                testStatus = ERROR;
            }
        }

        @Override
        protected void skipped(AssumptionViolatedException e, Description description){
            testStatus = IGNORED;
        }

        @Override
        protected void starting(Description description){

        }

        @Override
        protected void finished(Description description){

        }
    };
}
