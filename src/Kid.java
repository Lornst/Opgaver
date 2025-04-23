import java.util.Comparator;

public class Kid {
    int heightInCm;
    String name;

    Kid(int heightInCm, String name){
        this.heightInCm = heightInCm;
        this.name = name;
    }

    static class CompareNames implements Comparator<Kid> {
        public int compare(Kid kid1, Kid kid2){
            return kid1.name.compareTo(kid2.name);
        }
    }

    static class CompareHeight implements Comparator<Kid> {
        public int compare(Kid kid1, Kid kid2){
            return Integer.compare(kid2.heightInCm,kid1.heightInCm);
        }
    }

    static class CompareNamesThenHeight implements Comparator<Kid> {
        public int compare(Kid kid1, Kid kid2){
            if(kid1.name.charAt(0) == kid2.name.charAt(0)){
                return Integer.compare(kid2.heightInCm, kid1.heightInCm);
            }else{
                return kid1.name.compareTo(kid2.name);
            }
        }
    }
}
