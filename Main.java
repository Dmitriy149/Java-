
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            ArrayList<String> colors = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String color = scanner.next();
                if(!color.equals("#stop")) {
                    colors.add(color);
                } else {
                    break;
                }

            }
            System.out.println();
           for(int i = 0; i<colors.size();i++){
               System.out.println(colors.get(i));
           }
            System.out.println();

            Iterator<String> iterator = colors.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());

                }
            System.out.println();
            for(String element: colors){
                System.out.println(element);
            }
            System.out.println();

            System.out.println();
            System.out.println(colors);
        }

    }
