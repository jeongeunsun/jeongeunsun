package test1;


import java.util.Scanner;

public class TestMethod {
    public void Calculator(int num1, int num2) {
        System.out.println("두 수를 더한 값은 " + (num1 += num2) + "입니다.");
        System.out.println("두 수를 뺸 값은 " + (num1 -= num2) + "입니다.");
        System.out.println("두 수를 곱한 값은 " + (num1 *= num2) + "입니다.");
        System.out.println("두 수를 나눈 몫은 " + (num1 /= num2) + "입니다.");
        System.out.println("두 수를 나눈 나머지는  " + (num1 %= num2) + "입니다.");
    }

    public double CircleArea() {
        final double pie = 3.14;

        Scanner sc = new Scanner(System.in);

        System.out.print("반지름을 입력하세요 : ");
        int r = sc.nextInt();

        double result = pie * r * r;
        return result;
    }

    public static String TestRandom() {
        int randomNumber = (int) (Math.random() * 10) + 1;
        String result = "생성한 난수는 " + randomNumber + "입니다.";
        return result;
    }

    /*TestMethod을 만들고
     * 1. 인자값을 전달받아 사칙 연산과 나머지 계산을 하는
     * 매개변수를 전달받는 메소드를 만들어 주세요. 메소드 이름 Calculator
     * 출력구문 필요
     * 2. final키워드를 이용한 실수 값 3.14를 초기화하고
     * 반지름 값을 입력 받아 실수 형태로 값을 변수로 받아 리턴 받는 CircleArea 메소드를 만들어주세요
     * 3. static 메소드를 사용하여 1~10까지의 난수를 발생시키는 TestRandom 메소드를 만들고
     * "생성된 난수는 " + randomNumber + "입니다."를 변수에 담아 리턴해주세요
     *
     * test2 패키지
     * Application을 만들고
     * 1. TestMethod의 Calculator을 전달인자로 2, 5를 주어 값을 출력해주세요
     * 2. TestMethod의 CircleAres를 원의 넓이는 **입니다를 출력하는 구문을 만들어주세요
     * 3. TestMethod의 TestRandom을 출력해주세요
     * */
}