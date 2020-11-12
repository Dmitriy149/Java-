import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Random r = new Random();

        for(int i = 0; i < 10;i++){
            list.add(r.nextInt(100));
        }
        System.out.println(list);
        System.out.println("Выберите элемент, который нужно удалить, введя порядковый номер от 0 до 9");
        int index = scan.nextInt();

        list.remove(index);
        System.out.println(list);
    }
}
