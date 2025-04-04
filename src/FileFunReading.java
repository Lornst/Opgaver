import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileFunReading {
    public static void main(String[] args) {
        FileFunReading myClass = new FileFunReading();

        myClass.run();
    }

    public void run(){
        try{
            File myFile = new File("text.txt");
            FileWriter writer = new FileWriter(myFile);
            Scanner scanner = new Scanner(myFile);

            writer.write("linje1\n");
            writer.write("linje2\n");
            writer.close();

            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        }catch(IOException e){
            System.out.println("Filen blev ikke fundet.");
        }
    }
}
