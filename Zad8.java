import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число N");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        System.out.println(list);

    }
}
