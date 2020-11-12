import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {


        ArrayList<String > num = new ArrayList<>();
        System.out.println("Вводите числа");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String number = scanner.next();
            if(!number.equals("#stop")) {
                num.add(number);
            } else {
                break;
            }

            Collections.sort(num);



       /* System.out.println();
        for(int i = 0; i<num.size();i++){*/}
            System.out.println(num);

        }
}
