package Tests;

import classes.gsonTestMapping.PojoClass;
import classes.try_c_resources_test.ReadClass;
import com.google.gson.Gson;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import serialization.Cat;

import java.util.Arrays;

@RunWith(SerenityRunner.class)

public class Tests {

    @Test
    public void gsonParseTest(){
        String response = "{\n" +
                "  \"data\": {\n" +
                "    \"status\": \"200\",\n" +
                "    \"my-message\": \"Operation completed successfully\",\n" +
                "    \"items\": [\n" +
                "      {\n" +
                "        \"name\": \"LBL_FINANCIAL_APPROVAL\",\n" +
                "        \"value\": \"APPLE Engagement\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"LBL_HEADCOUNT_APPROVAL\",\n" +
                "        \"value\": \"APPLE Request Approval\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "}";

        Gson gson = new Gson();

        PojoClass pojoClass = gson.fromJson(response,PojoClass.class);
    }

    @Test
    public void tryCatchWithResourcesTest(){
        String filePath = "C:\\Users\\Evgenii\\Work\\Docs\\Java\\test.txt";
        String result = "!!!!!!!!!!!!!!\nRESULT!!!!!\n"+ ReadClass.readFirstLineOfFile(filePath,"0");
        System.out.println( result );
    }
}
