package test1;

public class Application {
    public static void main(String[] args) {

        /* 1. 기본자료형 8가지를 선언 및 초기화 해주세요 */
        byte bnum = 1;
        short snum = 2;
        int inum = 4;
        long lnum = 8456L;
        float fnum = 4.0f;
        double dhum = 8.0;
        char ch = 'A';
        boolean bool = true;
        //String str = "hello world"; //참조 자료형

        /* 2. 정수 int의 값을 long 타입과 합하여 주세요 */
        int sum1 = inum + (int)lnum;

        /* 3. 삼항연산자를 이용하여 2.의 합계를 0보다 클 때 양수 입니다
        *     0보다 작을 때 음수입니다 표기해주세요 */
        String str = (sum1 > 0)? "합계는 양수입니다" : "합계는 음수입니다";
    }

}
