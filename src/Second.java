import java.util.Scanner;

public class Second {
    //2022-12-26================================================================================

    //<if문>----------------------------------------------------------------------------

//    public static void main(String[] args) {
//        int age = 24;
//        if (age >= 20) {
//            System.out.println("성인입니다.");
//        }
//    }

    //<if-else 문>-----------------------------------------------------------

//    public static void main(String[] args) {
//        int age = 10;
//        if (age >= 20) {
//            System.out.println("성인입니다.");
//        } else {
//            System.out.println("미성년자입니다.");
//        }
//    }

    //둘중 하나만 반드시 실행된다.

    //<if-else if문>---------------------------------------------------

//    public static void main(String[] args) {
//        int age = 24;
//        if (age >= 20) {
//            System.out.println("성인입니다.");
//        } else if (age >= 0){
//            System.out.println("태어났습니다.");
//        }
//        //둘다 참일경우 먼저 참이된 구문만 실행한다.
//        //먼저 실행된 구문외에도 참이 있을 경우 실행하지 않는다.
//    }

//    public static void main(String[] args) {
//        int num = 1;
//        System.out.println("IF 시작");
//        if (num == 1) {
//            System.out.println("일");
//        } else if (num == 2) {
//            System.out.println("이");
//        } else if (num == 3) {
//            System.out.println("삼");
//        } else if (num == 4) {
//            System.out.println("사");
//        } else if (num == 5) {
//            System.out.println("오");
//        }
//
//        System.out.println("IF 끝");
//    }

    //<if-else if-else 문>---------------------------------------------------

//    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("IF 시작");
//        if (num == 1) {
//            System.out.println("일");
//
//        } else if (num == 2) {
//            System.out.println("이");
//
//        } else if (num == 3) {
//            System.out.println("삼");
//
//        } else if (num == 4) {
//            System.out.println("사");
//
//        } else if (num == 5) {
//            System.out.println("오");
//        } else { //위의 모든 조건이 거짓일때 실행됨.
//            System.out.println("없는숫자입니다.");
//        }
//
//        System.out.println("IF 끝");
//    }

    //문제-----------------------------------------------------------------------
    // 위의 정수형 변수 num에 대해 그 값이 음수면 "음수입니다." 를, 0이면 "0입니다." 를,
    // 양의 짝수면 "짝수입니다." 를, 양의 홀수이면 "홀수입니다." 를 출력하는 로직을 if문 을 사용하여 작성하세요.
    //단, 위 변수 num은 동적으로 변하며, 이러한 변화에 능동적으로 대응해야합니다.
//        public static void main(String[] args)
//        {
//            int num = 0;
//
//            if (num < 0) {
//                System.out.println("음수입니다.");
//            } else if (num == 0) {
//                System.out.println("0 입니다.");
//            } else if (num % 2 == 0) {
//                System.out.println("양의 짝수입니다.");
//            } else if (num % 2 != 0) {
//                System.out.println("양의 홀수입니다.");
//            }
    //순서가 중요하다.

    //------------------------------------------------------------
    //Scanner사용..?-----------------------------------------
//            Scanner S = new Scanner(System.in);
//
//            System.out.println("num2를 입력하세요 : ");
//            int num2 = S.nextInt();
//
//            if (num2 < 0) {
//                System.out.println("음수입니다.");
//            } else if (num2 == 0) {
//                System.out.println("0 입니다.");
//            } else if (num2 % 2 == 0) {
//                System.out.println("양의 짝수입니다.");
//            } else if (num2 % 2 != 0) {
//                System.out.println("양의 홀수입니다.");
//            }
//
//        }
    //문제2--------------------------------------------------------------------
    //정수형 변수 num이 0이상이면 "0이거나 양수입니다." 를, 아니면 "음수입니다." 를 출력하세요.
    //단, 세미콜론은 한 번만 사용합니다.
    // if문을 사용한다면 ,if 문에 코드 블럭 ({, })을 생략하지 말것.

//    public static void main(String[] args) {
//        int num = -11;
//
//        System.out.println(num >= 0 ? "0이거나 양수입니다." : "음수입니다.");
//    }

    //<FOR 문>----------------------------------------------------------------

    //문제1---------------------------------------
    //1~100까지의 자연수 중 홀수들의 합을 구하여 출력하세요
//    public static void main(String[] args) {
//        int sum = 0;
//        int sum2 = 0;
//        //여기부터
//        for (int num = 1; num <= 100; num++) {
//            if (num % 2 != 0) {
//                sum += num;
//            } else {
//                sum2 += num;
//            }
//        }
//        //여기까지
//        System.out.println("1~100까지의 홀수의 합은 : " + sum + " 입니다.");
//        System.out.println("1~100까지의 짝수의 합은 : " + sum2 + " 입니다.");
//    }

    //문제2----------------------------------------
    //100 ~ 1 까지의 정수중, 10의 배수인 것만 출력하세요.
//    public static void main(String[] args) {
//        for (int i = 100; i >= 1; i--) {
//            if (i % 10 == 0) {
//
//                System.out.println(i);
//            }
//        }
//    }

    //문제3--------------------------------------------------------
    // 1 ~ 10,000 까지의 자연수 중 소수(Prime Number) 의 개수를 출력하세요.

    // 소수(Prime Number) 란, 어떠한 자연수 n을 나누어 떨어질수 있게 할수 있는 숫자
    // 가 1 과 n뿐인수를 의미합니다. 가령, 2는 1과 2로만, 3은 1과 3, 5는 1과 5,...17은 1과 17만으로
    // 나누어 떨어질 수 있음으로 소수입니다. 하지만, 9는 1,3,9 로 나누어 떨어질수 있음으로 소수가 아닙니다.

    //방법1-----------------------------------------
//    public static void main(String[] args) {
//        int count = 0; //총 합계
//        int ct = 0;    //소수가 몇개인가
//
//        for (int i = 2; i <= 10000; i++) //1은 소수가 아니므로 2부터 시작
//        {
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0) {
//                    ct++; //소수의 개수구하기
//                }
//            }
//            if (ct == 2) {
//                count++; //소수는 1과 n 뿐이니 2개이므로 총 합계에 더하기
//            }
//            ct = 0; //소수의 개수 초기화
//            //초기화 안할시 처음 한개빼고는 안찾아줌
//        }
//
//        System.out.println(count);
//    }

    //----------------------------------------------------
//    public static void main(String[] args) {
//        int count = 0;
//        int c = 0;
//
//        for (int i = 2; i <= 10; i++) {
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0) {
//                    c++;
//                }
//            }
//            if (c == 2) {
//                count++;
//            }
//            c = 0;
//        }
//
//        System.out.println("소수의 개수 : " + c);
//        System.out.println("소수는 몇개인가 : " + count);
//    }

    //방법2-------------------------------------
//    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 2; i <= 10000; i++) {
//            for (int j = 2; j <= 10000; j++) {
//                if (i % j == 0 && i != j) {
//                    break; // 소수가 아닌것
//                }
//                if (i % j == 0 && i == j) {
//                    count++; // 소수인것
//                }
//            }
//        }
//
//        System.out.println(count);
//    }

    //방법3----------------------------------------
//    public static void main(String[] args) {
//        int total = 0;
//
//        for (int i = 1; i <= 10000; i++) {
//            int count = 0; //count를 초기화시킴 (초기화 안시키면 1개만 total에 들어감)
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0) {
//                    count += 1; //소수인것을 찾으면 count를 +1해라
//                }
//            }
//            if (count == 2) {
//                total += 1; //count의 개수가 2개가되면
//                            //total에 +1해라
//            }
//        }
//        System.out.println("소수의 개수는 : " + total + "개");
//    }


}
