import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File myFile = new File("data.txt");
        FileWriter writer = new FileWriter("data.txt");

        writer.write("Hej, dette er en test. \n");
        writer.write("Her er der en til sætning. \n");

        writer.close();

        try{
            Scanner reader = new Scanner(myFile);

            while(reader.hasNextLine()){
                String line = reader.nextLine();

                System.out.println(line);
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("Filen blev ikke fundet.");
        }
    }
}
