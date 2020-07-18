package runner;

import org.springframework.core.env.JOptCommandLinePropertySource;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Runner {
    public static void main(String args[]) throws IOException {

        String a = JOptionPane.showInputDialog("What's your boyfriend name?");
        char[] cahrset = new char[a.length()];
        a.getChars(0,a.length(),cahrset,0);

        FileOutputStream fileOutputStream = new FileOutputStream("D:\\testOutput.txt");
        for (int i = 0; i < a.length(); i++) {
            int b = (int) cahrset[i];
            fileOutputStream.write(b);
        }
        fileOutputStream.close();


    }
}
