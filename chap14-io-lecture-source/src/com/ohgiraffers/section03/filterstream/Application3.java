package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application3 {
    public static void main(String[] args) {
        /*
        * 외부 데이터로부터 읽어오는 데이터를 바이트형 정수, 문자, 문자열로만 읽어오면
        * 여러 데이터 타입을 취급하는 경우 별도로 처리해 주어야 한다.
        * 예) 정수 입력 받아 처리하려면 parsing을 해주어야한다.
        * */

        /*
        * 데이터 자료형 별로 처리하는 기능을 추가된 보조스트림을 제공하고 있다.
        * DataInputStream/DataOutputStream이다
        * */

        DataOutputStream dout = null;

        try {
            dout = new DataOutputStream((new FileOutputStream("src/com/ohgiraffers/section03/filterstream/score.txt")));

            dout.writeUTF("홍길동");
            dout.writeInt(95);
            dout.writeChar('A');
            dout.writeUTF("이순신");
            dout.writeInt(87);
            dout.writeChar('B');
            dout.writeUTF("김철수");
            dout.writeInt(73);
            dout.writeChar('C');

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(dout != null){
                try {
                    dout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        DataInputStream din = null;
        try {
            din = new DataInputStream(new FileInputStream("src/com/ohgiraffers/section03/filterstream/score.txt"));

            while(true){

                /* 순서대로 읽어와 에러 발생하지 않음 */
                System.out.println(din.readUTF() + ", " + din.readInt() + ", " + din.readChar());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }

        /* 파일 읽기 완료 찍기 */
        catch (EOFException e) {
            System.out.println("파일 읽기 완료");
        }
        catch (IOException e) {
            e.printStackTrace();

        } finally {
            if(din != null) {
                try {
                    din.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
