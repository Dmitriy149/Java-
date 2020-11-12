import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {

            ArrayList<Integer> list = new ArrayList<>();
            Scanner scan = new Scanner(System.in);

            for(int i = 0; i < 10;i++) {
                list.add(0,scan.nextInt());

            }


        System.out.println();
        System.out.println(list);
    }
}
