import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int a, b, c, number;
        Set<Integer> students = new TreeSet<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("How many students for course A?");
        a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            number = sc.nextInt();
            students.add(number);
        }
        System.out.print("How many students for course B?");
        b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            number = sc.nextInt();
            students.add(number);
        }
        System.out.print("How many students for course C?");
        c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            number = sc.nextInt();
            students.add(number);
        }
        System.out.printf("Total students: %d", students.size());

    }
}