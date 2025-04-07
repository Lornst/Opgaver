import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Player {
    private String playerName;
    private int playerScore;
    private int playerCoorX;
    private int playerCoorY;

    Player(){
        initAttributes();
    }

    void initAttributes(){
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

        playerName = initData.get("playerName");
        playerScore = Integer.parseInt(initData.get("playerScore"));
        playerCoorX = Integer.parseInt(initData.get("playerCoorX"));
        playerCoorY = Integer.parseInt(initData.get("playerCoorY"));
    }

    String getPlayerName(){
        return playerName;
    }

    int getPlayerScore(){
        return playerScore;
    }

    int getPlayerCoorX(){
        return playerCoorX;
    }

    int getPlayerCoorY(){
        return playerCoorY;
    }
}
