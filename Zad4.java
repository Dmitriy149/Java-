import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();


        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(100));
        }
        System.out.println(list);
        System.out.println("Выберите элемент, который нужно умножить на 10, введя порядковый номер от 0 до 9");
        int index = scan.nextInt();

        list.set(index,(list.get(index)*10));
        System.out.println(list);
    }
}
