import java.util.ArrayList;
import java.util.Collections;

public class SortingOpg1 {
    public static void main(String[] args) {
        run();
    }

    static void run(){
        ArrayList<Kid> kids = new ArrayList<Kid>();

        kids.add(new Kid(106,"Mia"));
        kids.add(new Kid(101,"Evan"));
        kids.add(new Kid(108,"Isabella"));
        kids.add(new Kid(110,"Grace"));
        kids.add(new Kid(112,"Emma"));
        kids.add(new Kid(115,"Ethan"));
        kids.add(new Kid(117,"Benjamin"));

        for(Kid k : kids){
            System.out.println("Name: " + k.name + " | Height: " + k.heightInCm);
        }

        kids.sort(new Kid.CompareNames());

        System.out.println("Names------------------");

        for(Kid k : kids){
            System.out.println("Name: " + k.name + " | Height: " + k.heightInCm);
        }

        kids.sort(new Kid.CompareHeight());

        System.out.println("Height------------------");

        for(Kid k : kids){
            System.out.println("Name: " + k.name + " | Height: " + k.heightInCm);
        }

        kids.sort(new Kid.CompareNamesThenHeight());

        System.out.println("NamesThenHeight------------------");

        for(Kid k : kids){
            System.out.println("Name: " + k.name + " | Height: " + k.heightInCm);
        }
    }
}
