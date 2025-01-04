import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class queue {
    public static void main(String[] args) {
        List<Integer>a=new ArrayList<>();
        a.add(12);
        a.add(15);
        a.add(18);
        a.add(25);
        a.add(30);
        System.out.println("After insertion :- ");
        System.out.println(a);

        System.out.println("After deletion");
        //a.remove(a);
        a.remove(1);
        System.out.println(a);



    }
}
