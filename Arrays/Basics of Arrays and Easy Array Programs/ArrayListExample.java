import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);    
        
        // list.add(8);
        // list.add(25);
        // list.add(2);
        // list.add(10);
        // // You can add as many things as you want

        // System.out.println(list.contains(25));
        // System.out.println(list);

        // list.set(3, 04);
        // System.out.println(list);

        // list.remove(3);
        // System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(list);

        // get item
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

        sc.close();
    }
}


/*
1. Size is fixed internally
2. let's assume Array list fills by some amount
- It will create a new arraylist of assume double the size
- old elements are copied in the new arraylist
- old one is deleted
Time Complexity - O(1)
 */
