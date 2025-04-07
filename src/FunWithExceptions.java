public class FunWithExceptions {
    public static void main(String[] args) {
        FunWithExceptions myClass = new FunWithExceptions();
        myClass.run();
    }

    public void run(){
        String[] array = new String[10];

        for(int i=0;i<=10;i++){
            array[i] = i + "";
        }

        for(String a : array){
            System.out.println(a);
        }
    }
}
