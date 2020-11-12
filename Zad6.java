import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Random r = new Random();

        for (int i = 0; i < 30; i++) {
            list.add(r.nextInt(100));
        }
        System.out.println(list);
        System.out.println("Введите ваше число");


        while (true) {
            int index = scan.nextInt();
            if (list.contains(index)) {
                System.out.println(true);

            } else {
                System.out.println(false);

            }


        }
    }
}