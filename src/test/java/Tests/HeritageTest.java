package Tests;


import classes.Heritage.PrivateClassC.TestSameLevel;
import classes.Heritage.SubAbstract.SubAbstract;
import classes.Heritage.SubClasssB.SubClassB;
import classes.Heritage.SuperClassA.SuperClassA;
import classes.Multithreating.Multithreating;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

@RunWith(SerenityRunner.class)


public class HeritageTest/* extends BaseTest */{

    @Test(timeout = 600000)
    public void myTest(){
        SubClassB objB = new SubClassB(1);
    }

    @Test(timeout = 600000)
    public void reDefinistion(){
        SubClassB objB = new SubClassB();
        SuperClassA objA = new SuperClassA();
        int a = objA.multy(5,5);
        System.out.println(a);
        int c = objB.multy(5,5);
        System.out.println(c);
    }

    @Test(timeout = 600000)
    public void abstractTest(){
        SubAbstract objAbstr = new SubAbstract();
        objAbstr.show("Test");

    }

    @Test
    public void privTest(){
        TestSameLevel c = new TestSameLevel();



        int a = c.getCount();
    }

    @Test
    public void multithread() throws InterruptedException {
        new Multithreating();
        for (int i = 5; i > 0 ; i--) {
            System.out.println("The main thread!:" + i*100);
            Thread.sleep(1000);
        }
        System.out.println("The main thread is finished!");
    }

    @Test
    public void myOptionPane(){
        String name;
        int age;
        name = JOptionPane.showInputDialog("Hi!\nWhat is your name?");
        age = Integer.parseInt(JOptionPane.showInputDialog(name+", please provide your age"));
        JOptionPane.showMessageDialog(null,"Hi! \n" + name + " " + age);
        System.exit(0);
    }

    @Test
    public void fileReaders() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char[] cahrset = new char[a.length()];
        a.getChars(0,a.length(),cahrset,0);

        FileOutputStream fileOutputStream = new FileOutputStream("D:\\testOutput.txt");
        for (int i = 0; i < a.length(); i++) {
            int b = (int) cahrset[i];
            fileOutputStream.write(b);
        }
        fileOutputStream.close();
    }

    @Test
    public void input() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        System.out.println(a);
    }

    @Test
    public void subClassIsNotAllowedWithOutPublicSuperConstructor(){
        
    }
}
