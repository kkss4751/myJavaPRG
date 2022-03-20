import java.util.Scanner;

public class 나중에_지워 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("몇단 ?: ");
        int input = in. nextInt();
        int num = 0;

        System.out.printf("%d단\n", input);
        System.out.println(input + "X" + ++num + "=" + input * num);
        System.out.println(input + "X" + ++num + "=" + input * num);
        System.out.println(input + "X" + ++num + "=" + input * num);
        System.out.println(input + "X" + ++num + "=" + input * num);
        System.out.println(input + "X" + ++num + "=" + input * num);
        System.out.println(input + "X" + ++num + "=" + input * num);
        System.out.println(input + "X" + ++num + "=" + input * num);
        System.out.println(input + "X" + ++num + "=" + input * num);
        System.out.println(input + "X" + ++num + "=" + input * num);
    }
}
