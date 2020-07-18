package runnerMain;

import classes.commonSteps.CommonSteps;
import classes.Serializable_Training.diplomacyInfo.DiplomacyInfo;
import classes.Serializable_Training.resourcesInfo.ResourcesInfo;
import classes.Serializable_Training.savedGame.SavedGame;
import classes.Serializable_Training.territoriesInfo.TerritoriesInfo;
import net.thucydides.core.annotations.Steps;

import java.io.*;



public class RunnerMain {

    @Steps private CommonSteps commonSteps;

    public static void main(String[]args) throws IOException, ClassNotFoundException {
        TerritoriesInfo territoryInfo = new TerritoriesInfo("У Испании 6 провинций, У России 10 провинций, У Франции 8 провинций");
        ResourcesInfo resourcesInfo = new ResourcesInfo("У Испании 100 золота, У России 80 золота, У Франции 90 золота");
        DiplomacyInfo diplomacyInfo = new DiplomacyInfo("Франция воюет с Россией, Испания заняла позицию нейтралитета");

        String path = "D:\\Docs\\Java\\save.ser";
//
//        SavedGame savedGame = new SavedGame(territoryInfo, resourcesInfo, diplomacyInfo);
//
//        //создаем 2 потока для сериализации объекта и сохранения его в файл
//        FileOutputStream outputStream = new FileOutputStream("D:\\Docs\\Java\\save.ser");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//
//        //сохраняем игру в файл
//        objectOutputStream.writeObject(savedGame);
//
//        //закрываем поток и освобождаем ресурсы
//        objectOutputStream.close();

//        FileInputStream inputStream = new FileInputStream("D:\\Docs\\Java\\save.ser");
//        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
//
//        SavedGame savedGame = (SavedGame) objectInputStream.readObject();
//
//        System.out.println(savedGame);

        CommonSteps commonSteps = new CommonSteps();

//        commonSteps.serialization(savedGame,path);

        SavedGame savedGame = (SavedGame) commonSteps.deSerialization(path).readObject();

        System.out.println(savedGame);
    }
}
