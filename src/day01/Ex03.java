package day01;

public class Ex03 {
    public static void main(String[] args) {
        // 1. 다음과 같이 정사각형을 출력하는 코드 작성
        /*
        ----------
         *****
         *****
         *****
         *****
         *****
        ----------
         */

        for (Integer i =1 ; i < 8 ; i = i + 1) {
            if (i == 1) {
                System.out.println("----------");
            }else if(i < 7) {
                System.out.println("*****");
            }else {
                System.out.println("----------");
            }
        }

        // 2. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
         *
         **
         ***
         ****
         *****
        ----------
         */

        for (Integer i =1 ; i < 8 ; i = i + 1) {
            if (i == 1) {
                System.out.println("----------");
            }else if(i < 3) {
                System.out.println("*");
            }else if(i < 4) {
                System.out.println("**");
            }else if(i < 5) {
                System.out.println("***");
            }else if(i < 6) {
                System.out.println("****");
            }else if(i < 7) {
                System.out.println("*****");
            }else {
                System.out.println("----------");
            }
        }

        // 3. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
             *
            ***
           *****
          *******
         *********
         ----------
         */

        for (Integer i =1 ; i < 8 ; i = i + 1) {
            if (i == 1) {
                System.out.println("----------");
            }else if(i < 3) {
                System.out.println("    *    ");
            }else if(i < 4) {
                System.out.println("   ***   ");
            }else if(i < 5) {
                System.out.println("  *****  ");
            }else if(i < 6) {
                System.out.println(" ******* ");
            }else if(i < 7) {
                System.out.println("*********");
            }else {
                System.out.println("----------");
            }
        }


    }
}
