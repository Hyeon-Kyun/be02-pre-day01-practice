package day01;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("*");
        System.out.printf("*");
        System.out.printf("*");
        System.out.printf("*");
        System.out.println(); // 다음줄로 넘어가는 코드
        
        // 1. 다음과 같이 정사각형을 출력하는 코드 작성

        //  다음 코드를 5번 반복
        //      *을 printf로 5번 반복해서 출력
        //      다음줄로 넘어가는 코드
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

        Integer num = 0;
        while(num < 5) {
            Integer num2 = 0;
            while (num2 < 5) {
                System.out.printf("*");
                num2 = num2 + 1;
            }
            System.out.println();

            num = num + 1;
        }System.out.println("----------");

        for(Integer i =0 ; i< 5 ; i = i+1) {
            for(Integer j = 0; j<5 ; j =j+1) {
                System.out.printf("*");
            }
            System.out.println();
        }System.out.println("----------");

        // 2. 다음과 같이 삼각형을 출력하는 코드 작성
        //  다음 코드를 5번 반복
        //      *을 printf로 반복 횟수만큼 반복해서 출력
        //      다음줄로 넘어가는 코드
        /*
        ----------
         *
         **
         ***
         ****
         *****
        ----------
         */

        for (Integer i =1 ; i < 6 ; i = i + 1) {
            if (i < 2) {
                System.out.printf("*");
                System.out.println();
            }else if(i < 3) {
                System.out.printf("*");
                System.out.printf("*");
                System.out.println();
            }else if(i < 4) {
                for (Integer j = 1; j < 4 ; j = j +1) {
                    System.out.printf("*");
                }
                System.out.println();
            }else if(i < 5) {
                for (Integer k = 1; k < 5 ; k = k +1) {
                System.out.printf("*");
                }
                System.out.println();
            }else {
                for (Integer l = 1; l < 6 ; l = l +1) {
                    System.out.printf("*");
                }
                System.out.println();

            }
        }System.out.println("----------");

        for(Integer i =0 ; i< 5 ; i = i+1) {
            for(Integer j = 0; j <= i ; j =j+1) { // j < i + 1;
                System.out.printf("*");
            }
            System.out.println();

        }System.out.println("----------");

        // 3. 다음과 같이 삼각형을 출력하는 코드 작성
        //  다음 코드를 5번 반복
        //      공백을 printf로  점점 줄어들게(4,3,2,1,0) 출력
        //      *을 printf로 2씩 커지면서 반복 횟수만큼 반복해서 출력
        //      다음줄로 넘어가는 코드
        /*
        ----------
             *
            ***
           *****
          *******
         *********
         ----------
         */

        for (Integer i = 1 ; i < 6 ; i = i+1) {
            if (i < 2) {
                for (Integer j = 1 ; j < 5 ; j = j+1) {
                    System.out.printf(" ");
                }
                System.out.println("*");
            }else if (i < 3) {
                for (Integer k = 1 ; k < 4 ; k = k+1) {
                    System.out.printf(" ");
                }
                System.out.println("***");
            }else if (i < 4) {
                for (Integer l = 1 ; l < 3 ; l = l+1) {
                    System.out.printf(" ");
                }
                System.out.println("*****");
            }else if (i < 5) {
                for (Integer m = 1 ; m < 2 ; m = m+1) {
                    System.out.printf(" ");
                }
                System.out.println("*******");
            }else {
                System.out.println("*********");
            }

        }System.out.println("----------");


        for(Integer i =0 ; i< 5 ; i = i+1) {
            for(Integer j = 4; j  > i ; j =j-1) {
                System.out.printf(" ");
            }for(Integer k = 4; k < i*2 + 5 ; k =k+1) {
                System.out.printf("*");
            }System.out.println();

        }System.out.println("----------");


        for(Integer i = 0; i<5; i = i + 1) {
            for(Integer j = 4 - i ; j > 0; j = j - 1) {
                System.out.printf(" ");
            }
            for(Integer k = 0 ; k < 2*i+1; k = k + 1) {
                System.out.printf("*");
            }

            System.out.println();
        }



    }
}
