import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by KAAN on 08/05/2016.
 */
public class amras {
    public static void main(String[] args){

        // convert stuff array to a list
        String[] stuff = {"apples","beef","corn","ham"};
        List<String> list1 = Arrays.asList(stuff);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("youtube");
        list2.add("google");
        list2.add("digg");

        for (String x : list2)
            System.out.printf("%s ", x);

        System.out.println();

        Collections.addAll(list2,stuff);
        for (String x : list2)
            System.out.printf("%s ", x);

        System.out.println(Collections.frequency(list2,"digg"));

        boolean tof= Collections.disjoint(list1,list2);
        System.out.println(tof);

        if (tof)
            System.out.println("these list do not have anything in common");
        else
            System.out.println("This lise must have something in common");

    }
}
