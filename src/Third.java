import java.util.Arrays;

public class Third {
//    public static void main(String[] args) {
    //문제풀이--------------------------------------------------------------------------------
    // 1 ~ 10,000 까지의 자연수 중 소수(Prime Number) 의 개수를 출력하세요.

    // 소수(Prime Number) 란, 어떠한 자연수 n을 나누어 떨어질수 있게 할수 있는 숫자
    // 가 1 과 n뿐인수를 의미합니다. 가령, 2는 1과 2로만, 3은 1과 3, 5는 1과 5,...17은 1과 17만으로
    // 나누어 떨어질 수 있음으로 소수입니다. 하지만, 9는 1,3,9 로 나누어 떨어질수 있음으로 소수가 아닙니다.

//        int count = 0;
//        //여기부터
//        for (int i = 2; i <= 10_000; i++) //10_000 == 10000
//        {
//            int dividerCount = 0; //나누어 떨어지게 하는 숫자의 개수
//            for (int j = 2; j <= i / 2; j++) {
//                if (i % j == 0) {
//                    dividerCount++;
//                }
//            }
//            if (dividerCount == 0) {
//                count++;
//            }
//        }
//        //여기까지
//        System.out.println("소수의 개수 : " + count);
//    }

    //---------------
//        int count = 0;
//        //여기부터
//        for (int i = 2; i <= 10_000; i++)//10_000 == 10000
//        {
//            boolean isPrime = true; //소수인가에 대한 여부
//            for (int j = 2; j <= i / 2; j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break; //if문이 성립되면 for j문을 즉시종료
//                }
//            }
//            if (isPrime == true) {
//                count++;
//            }
//        }
//        //여기까지
//        System.out.println("소수의 개수 : " + count + "개");
//    }

    //break & continue 문============================================

//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 0) {
//                break;
//            }
//            System.out.println(i);
//        }

    //--------
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//            System.out.println(i);
//        }
//}
        //SWITCH 문=====================================================

//    public static void main(String[] args) {
//        int num = 3;
//        switch (num){
//            case 1:
//                System.out.println("일");
//                break;
//            case 2:
//                System.out.println("이");
//                break;
//            case 3:
//                System.out.println("삼");
//                break; //break 문이 없다면 밑에 default 까지 출력된다.
//            default: //break 를 적으면 아무의미가 없다,상관없다.
//                System.out.println("모르겠다.");
//        }
//    }
        //--------------------------

//    public static void main(String[] args)
//    {
//        //출발 : 서울
//        String 목적지 = "대전"; // "부산"; 이면 밑에 대전까지 실행된다.
//
//        switch (목적지)
//        {
//            case "부산":
//                System.out.println("부산 만났었음");
//            case "대구":
//                System.out.println("대구 만났었음");
//            case "대전":
//                System.out.println("대전 만났었음");
//
//        }
//    }
    //case밑에 break문을 넣어야지 원하는것만 출력가능

    //while & do-while=========================================

//    public static void main(String[] args)
//    {
//        boolean a = false;
//
//        //while문 : 거짓일때는 실행이 안됨
//        while (a){
//            System.out.println("while 실행 됨.");
//        }
//
//        //do-while문 : 거짓이더라도 최초한번은 실행됨
//        do {
//            System.out.println("do-while 실행됨.");
//        } while (a);
//    }

    //문자열합치기-----------------------------------------------
//    public static void main(String[] args) {
//        System.out.println("나이는 " + 24); //25:피연산자 -> 문자열로 바꿈 -> 25 == "25" 타입이 문자열로 바뀜
//        System.out.println("10" + "10");
//        System.out.println("10" + 10);
//    }

    //배열======================================================

//    public static void main(String[] args) {
//        int[] odds = {1, 3, 5, 7, 9};
//        //            0  1  2  3  4
//        for (int i = 0; i < odds.length; i++) {
//            //         0 ~ i < 5
//            //   i   : 0,1,2,3,4
//            System.out.println(odds[i]);
//
////            System.out.println(odds[0]); //1
////            System.out.println(odds[1]); //3
////            System.out.println(odds[2]); //5
////            System.out.println(odds[3]); //7
////            System.out.println(odds[4]); //9
//        }
//    }


    //향상된 for 문-----------------------------------
//        public static void main(String[] args)
//        {
//            int[] odds = {1, 3, 5, 7, 9};
//                for (int odd : odds) //색이 칠해진 곳에 alt + enter
//                {
//                    System.out.println(odd);
//                }
//        }

//    public static void main(String[] args) {
//        String[] students = {"M","Y","G"};
//        for (int i = 0; i <students.length; i++)
//        {
//            System.out.println((i + 1) + "번 학생 : " + students[i]);
//        }
//    } //변수(i)를 직접 사용해야 할 코드일때는 향상된 for문을 사용할수 없다.


    //----------------------------------------------------------
    //홀수만 출력하기 (1,3,5,7,9 < 이렇게 출력하기)
//    public static void main(String[] args)
//    {
//        int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        //                0  1  2  3  4  5  6  7  8  9
//        int[] odds;
//        //여기 부터
//        int oddCount = 0; //numbers 요소 중 홀수의 개수
//
//        for (int number : numbers)
//        {
//            if (number % 2 != 0){
//                oddCount++; //2로 나누었을때 0이 아니면 oddCount 에 1더하기
//            }
//        }
//
//        odds = new int[oddCount]; // 5
//        int oddIndex = 0;
//        for (int i = numbers.length - 1; i >= 0; i--){ //역순부터
//            if (numbers[i] % 2 != 0){ // 1 % 2 != 0 ; 여기서 짝수를 걸러서 홀수만 numbers[i]에 담는다
//                odds[oddIndex] = numbers[i]; //oddIndex <= 0 최초실행 ;걸러진 홀수를 oddIndex에 넣는다.
//                oddIndex++; //== odds[oddIndex++] = numbers[i];
//                /*
//                oddIndex = 0
//                oddIndex = 1
//                oddIndex = 2
//                oddIndex = 3
//                oddIndex = 4
//
//                odds[0] = numbers[9] = 1
//                odds[1] = numbers[7] = 3
//                odds[2] = numbers[5] = 5
//                odds[3] = numbers[3] = 7
//                odds[4] = numbers[1] = 9
//                */
//            }
//        }
//        //여기 까지
//        for (int odd : odds)
//        {
//            System.out.println(odd);
//        }
//    }

    //문제--------------------------------------------------------------
    /*
    -numbers 배열의 요소가 변하여도 능동적으로 ( 코드 수정없이) 대응, =하드 코딩 금지
    -numbers 배열이 가지는 요소는 1 이상의 int 범위내의 정수임.
    -중복되는 요소를 제외할 필요 없음.
    -요소의 순서는 관계 없음.
    -양의 짝수는 evens 배열로 분리.
    -양의 홀수는 odds 배열로 분리

    출력:
        짝수출력
        8
        6
        108
        -------------
        홀수출력
        1
        11
        3
        5
        99
     */
//    public static void main(String[] args) {
//        int[] numbers = {1, 11, 3, 8, 5, 6, 99, 108}; //numbers.length = 8
//        int[] evens;
//        int[] odds;
//        //여기부터
//        //<짝수>
//        int evensCount = 0; //짝수의 총 개수를 구한다.
//        for (int number : numbers){
//            if (number % 2 == 0){ //짝수이면 evensCount 를 +해라
//                evensCount++;
//            }
//        }
//        evens = new int[evensCount]; //짝수의 총 개수를 들어가게 되면 배열 형태로 만든다.
//                                     // 배열의 길이를 구한다
//
//        int evenIndex = 0;
//        for (int i = 0 ; i < numbers.length; i++){ //정방향 ;i < numbers.length : 0 < 8 -> 1 < 8 -> 2 < 8 ... 7 < 8
//            if (numbers[i] % 2 == 0){              //짝수이면 evenIndex 를 +해라
//                evens[evenIndex++] = numbers[i];   //+한것을 numbers[i]에 넣으면
//                                                   //numbers[3],numbers[5],numbers[8]
//                                                   //배열형태로 나온다.
//            }
//        }
//        //-----------------------
//        //<홀수>
//        int oddsCount = 0; //홀수의 총 개수를 구한다.
//        for (int number : numbers){
//            if (number % 2 != 0){ //홀수이면 oddsCount 를 +해라
//                oddsCount++;
//            }
//        }
//        odds = new int[oddsCount]; //홀수의 총 개수를 들어가게 되면 배열 형태로 만든다.
//                                   // 배열의 길이를 구한다
//
//        int oddsIndex = 0;
//        for (int i = 0 ; i < numbers.length; i++){ //정방향 ;i < numbers.length : 0 < 8 -> 1 < 8 -> 2 < 8 ... 7 < 8
//            if (numbers[i] % 2 != 0){              //홀수이면 oddsIndex 를 +해라
//                odds[oddsIndex++] = numbers[i];    //+ 한것을 numbers[i]에 넣으면
//                                                   // numbers[3],numbers[5],numbers[8]를 제외한
//                                                   // 배열형태로 나온다.
//            }
//        }
//
//        //여기까지
//        System.out.println("<짝수 출력>");
//        for (int even : evens){ //even : 여기 for문에서 임시선언 for i랑 같은 의미
//            System.out.println(even); //배열형태로 나온것들의 값을 출력한다.
//        }
//        System.out.println("-------------");
//        System.out.println("<홀수 출력>");
//        for (int odd : odds){ //odd : 여기 for문에서 임시선언 for i랑 같은 의미
//            System.out.println(odd); //배열형태로 나온것들의 값을 출력한다.
//        }
//    }

    //HARD-------------------------------------------------

//    public static void main(String[] args) {
//        int[] numbers = {1, 11, 3, 8, 5, 6, 99, 108};
//
//        int[] evens = Arrays.stream(numbers).filter(x -> x % 2 == 0).toArray();
//        int[] odds = Arrays.stream(numbers).filter(x -> x % 2 != 0).toArray();
//
//        System.out.println("짝수 출력");
//        for (int even : evens) {
//            System.out.println(even);
//        }
//        System.out.println("------------");
//        System.out.println("홀수 출력");
//        for (int odd : odds){
//            System.out.println(odd);
//        }
//
//    }






























}
