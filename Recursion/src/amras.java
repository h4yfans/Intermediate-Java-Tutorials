/**
 * Created by KAAN on 08/05/2016.
 */
public class amras {
    public static void main(String[] args){

        System.out.println(fact(23));

    }


    // factorial funciton
    public static long fact(long n){
        if (n<=1)
            return 1;
        else
            return n * fact(n-1);
    }
}
