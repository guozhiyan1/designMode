import java.util.ArrayList;
import java.util.List;

public class test2 {

    private Integer pId;
    private String pName;


    public static void main(String[] args) throws InterruptedException {
        final List<test2> pse=new ArrayList<>();
        int pid = 0;
        while(pid < 1000000){
            test2 person = new test2();
            person.pId=pid;
            person.pName="person_"+pid;
            pid++;
            Thread.sleep(100);
            System.out.println("person = " + person);
            pse.add(person);
        }

    }
}