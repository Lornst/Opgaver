import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class InitFromFile {
    static int highscore;
    static String mapName;
    static Player player = new Player();

    public static void main(String[] args) {
        initAttributes();
        printAttributes();
    }

    static void initAttributes(){
        File file = new File("Files/init.ini");
        Scanner scanner = null;
        HashMap<String,String> initData = new HashMap<String,String>();
        String[] lineSplitArray;

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while(scanner.hasNextLine()){
            lineSplitArray = scanner.nextLine().split("=", 2);

            initData.put(lineSplitArray[0],lineSplitArray[1]);
        }

        highscore = Integer.parseInt(initData.get("highscore"));
        mapName = initData.get("mapName");
    }

    static void printAttributes(){
        System.out.println("GAME:");
        System.out.println("Highscore: " + highscore);
        System.out.println("Map name: " + mapName);
        System.out.println("");
        System.out.println("PLAYER:");
        System.out.println("Name: " + player.getPlayerName());
        System.out.println("Score: " + player.getPlayerScore());
        System.out.println("Coordinate X: " + player.getPlayerCoorX());
        System.out.println("Coordinate Y: " + player.getPlayerCoorY());
    }
}
