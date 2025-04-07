import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Player {
    private String playerName;
    private int playerScore;
    private int playerCoorX;
    private int playerCoorY;

    Player(String playerName, int playerScore, int playerCoorX, int playerCoorY){
        this.playerName = playerName;
        this.playerScore = playerScore;
        this.playerCoorX = playerCoorX;
        this.playerCoorY = playerCoorY;
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
