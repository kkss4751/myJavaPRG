/**     Java 숫자, 문장 특수문자 (") 혹은 엔터 는 어떻게 출력할까요?       **/

public class HELLO_2 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        // 숫자 구분
        /*   컴퓨터는 바보다.컴퓨터는 ("") 큰 따옴표가 있으면 문장으로 인식한다.
             즉 숫자 3이 아니라 문장 삼으로 인식한다.   */
        System.out.printf("3");
        // 즉 ("3") + ("3") 을 하게되면 (문장)+(문장) 이기 떄문에 33이 나온다.
        System.out.println("3" + "3");
        // 숫자는 큰따옴표 ("") 를 쓰지 않고 적는다
        System.out.println(3 + 3);
        // 숫자는 정수, 실수, 음수, 음의 실수 자유롭게 출력가능하다
        System.out.println(3, 3.14, -100, -3.14);

        //문장,문자 구분
        /* 컴퓨터는 바보다. 컴퓨터는 문장과 문자를 구분해줘야한다.
           문장은 큰따옴표(""), 문자는 작은따옴표('') */
        System.out.println('A');
        // C언어 에서는 구별을 엄격하게 하지만 Java 에서는 잘 사용하진 않는다.

        //특수문자
        /* 특수문를 출력하고 싶은 경우에는
           특수문자 앞에 역슬래시(\) 를 이용한다 */
        System.out.println(" \" ");
        // 누군가의 말을 인용하거나 생각을 말할떄 큰 따옴표를 출력하고 싶을때
        System.out.println("\"Hello World\"");
        //역슬래시를 사용할때는 역슬레시 두번사용
        System.out.println('\\',"\\");

        /* 엔터 사용 */
        // 엔터를 사용할 떄는 역슬래시n (\n) 을 사용한다
        System.out.println('\n');
        System.out.println("Hello \n world!");


    }
}
