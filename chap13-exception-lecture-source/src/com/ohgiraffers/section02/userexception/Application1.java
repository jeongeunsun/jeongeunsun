package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application1 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
            //et.checkEnoughMoney(30000,50000); //정상
            //et.checkEnoughMoney(-50000, 100000); //에러
            //et.checkEnoughMoney(50000,-60000); //에러
            //et.checkEnoughMoney(50000,30000);
        } catch (Exception e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }

    }
}
