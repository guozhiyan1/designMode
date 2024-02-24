import java.util.ArrayList;
import java.util.List;

public class outofmemory {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer> ();
        for(int i=1;i>0;i++){
            a.add(i);
            System.out.println(a);
        }
    }
}
