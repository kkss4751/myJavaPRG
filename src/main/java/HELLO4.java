import java.util.Scanner;

public class HELLO4 {
    public static void main(String[] args) {
        Scanner scan2 = new Scanner(System.in);

        // 1 - 약 21억까지 담을 수 있는 작은정수 / int number = scan2.nextInt();
        // 2 - 약 83경까지 담을 수 있는 큰 정수 / long number = scan2.nextLong();
        /***
         int number = scan2.nextInt();
         System.out.println(number);
         **/
        // 3 - 작은 실수 (3.14) / float number = scan2.nextFloat();
        // 4 - 큰 실수 / double number = scan2.nextDouble();

        /**
         * 숫자 입력 방법
         * Scanner 이름 = new Scanner(System.in);
         *
         * 문장 : String str = 이름.nexyLine();
         *
         * 작은 숫자 : int number = 이름.nextInt();
         * 큰 숫자 : long number = 이름.nextLong();
         * 작은 실수 : float number = 이름.nextFloat();
         * 큰 실수 : double number = 이름.nextDouble();
         */


        // 문장이랑 숫자랑 각각 같이 입력받는 방법
        String name = scan2.nextLine();
        int age = scan2.nextInt();

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}
