package classes.try_c_resources_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadClass {

    public static String readFirstLineOfFile(String path, String defValue){
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            return br.readLine();

        }
        catch (IOException e){
            return defValue;
        }
        finally {
            System.out.println("test");
        }
    }
}
