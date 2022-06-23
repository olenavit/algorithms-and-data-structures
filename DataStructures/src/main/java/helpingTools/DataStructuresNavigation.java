package helpingTools;

import java.util.Scanner;

public class DataStructuresNavigation {
    public static void navigate(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("There is data structures navigation.");
        System.out.println("Please choose implementation of which data structure you want to see.");
        System.out.println("Stack - press 1");
        System.out.println("Queue - press 2");

        System.out.println("If you want to exit, press 0");
        int answer = sc.nextInt();
        switch (answer){
            case 1 -> StackNavigation.navigate();
            case 0 -> System.exit(0);
        }
    }
}
