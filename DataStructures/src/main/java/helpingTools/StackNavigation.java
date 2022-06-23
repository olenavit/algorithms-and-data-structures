package helpingTools;

import ua.com.StackImpl;

import java.util.Random;
import java.util.Scanner;

public class StackNavigation {

    public static void navigate() {
        StackImpl<Integer> stack = new StackImpl<>();
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            System.out.println("push - 1");
            System.out.println("pop - 2");
            System.out.println("peek - 3");
            System.out.println("empty - 4");
            System.out.println("full - 5");
            System.out.println("to string - 6");
            System.out.println("go to previous - 7");
            System.out.println("exit - 0");
            int a = sc.nextInt();
            switch (a) {
                case 1 -> stack.push(random.nextInt(100));
                case 2 -> stack.pop();
                case 3 -> System.out.println("Peeking -> " + stack.peek());
                case 4 -> System.out.println(stack.isEmpty());
                case 5 -> System.out.println(stack.isFull());
                case 6 -> System.out.println(stack);
                case 7 -> DataStructuresNavigation.navigate();
                case 0 -> System.exit(0);

            }
        }
    }
}
