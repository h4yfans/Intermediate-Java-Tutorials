/**
 * Created by KAAN on 08/05/2016.
 */
public class amras {
    public static void main(String[] args) {
        String[] words = {"funk", "chunk", "furry", "baconator"};


        for (String w : words) {
            if (w.startsWith("fu"))
                System.out.println(w + "start with fu");
        }

        for (String w : words) {
            if (w.endsWith("unk"))
                System.out.println(w + "ends with enk");
        }
    }
}
