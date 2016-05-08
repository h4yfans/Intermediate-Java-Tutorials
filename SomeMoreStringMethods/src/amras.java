import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created by KAAN on 08/05/2016.
 */
public class amras {
    public static void main(String[] args) {


        String s = "kaankaracakaankaracakaankaraca";

        System.out.println(s.indexOf("a", 6));

        String a = "Bacon ";
        String b = "       monster       ";
        System.out.println(b.trim());
        System.out.println(a.concat(b));
        System.out.println(a.replace("B","F"));
        System.out.println(b.toUpperCase());


    }
}
