import java.util.Scanner;

public class HELLO3 {
    public static void main(String[] args){
        // 입력
        // 입력을 받을 스캐너를 만든다
        // Scanner scan(스캐너 이름 *아무거나 입력가능*)
        // (System.in) = 시스템 안으로 데이터를 가져온다 / 시스템 안으로 스캔한다
        Scanner saludo = new Scanner(System.in);
        /* 이스캐너 이름은 SALUDO이고 새로운 스캐너를 만들거고 (스템안으로 데이터를 입력받을거야) */

        // String : 문장메소드, 문장이라는 뜻
        // str : 우리가 입력받은 '문장의 이름' 입니다
        // saludo.nextLine(); : 한줄을 입력받는다.
        String str = saludo.nextLine();
        /* SALUDO는 한줄을 입력받을거고 문장을 입력받을건데 걔를 STR 이라는 이름으로 저장할거야*/

        // str 을 출력해라
        System.out.println(str);
        /* 그 str에 있는 문장을 출력해줘 */
    }
    /**
     * saludo.nextLine(); 을 하는 순간
     *
     * str 이라는 이름표가 붙은 상자가 하나 생긴다.
     * 이 상자에는 '문장'만 들어올수 있음 (String)
     *
     * System.out.println(str) 을 하게 되면 상자 안에 있는 문장을 가져와서 출력한다.
     * System.out.println("str")을 하게 되면 '문장 str'이 그대로 출력됨
     */

}

