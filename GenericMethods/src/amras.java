/**
 * Created by KAAN on 08/05/2016.
 */
public class amras {
    public static void main(String[] args){

        Integer[] iray = {1,2,3,4};
        Character[] cray = {'k','a','a','n'};

        printMe(iray);
        printMe(cray);

    }

    //generic method
    public static <T> void printMe(T[] x){
        for (T k : x)
            System.out.printf("%s ",k);
        System.out.println();
    }



    /*private static void printMe(Integer[] i) {
        for (Integer x: i)
            System.out.printf("%s ",x);
        System.out.println();
    }

    private static void printMe(Character[] i) {
        for (Character x: i)
            System.out.printf("%s ",x);
        System.out.println();
    }*/
}
