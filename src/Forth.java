public class Forth {
    //2022-12-28=====================================================================
    //<스코프>
//    public static void main(String[] args)
//    {//여기부터1
//        int x;
//        //long i; :선언 불가
//        for (int i = 0; i <= 10; i++) //보다 상위의 스코프에 i 가 선언되었기에 사용불가하다.
//        {//여기부터2
//            for (int j = 0; j <= 100; j++)
//            {//여기부터3
//
//            }//여기까지3 : 한 스코프(3)
//
//        }//여기까지2 : 한 스코프(2)
//    }//여기까지1 : 한 스코프(1)

    //상위스코프개념 : 스코프(1) > 스코프(2) > 스코프(3)

    //<메서드> -----------------------------------------

//    public static void main(String[] args) { //main : 메서드만드는것(메서드선언)
//        //정수형 변수 a와 b를 받아 둘중 더 작은 값(int 형)을 반환 하는(반환타입 o) 메서드 getMin
//        System.out.println( getMin(3, 7) );
//        // println : 메서드 호출, getMin(~) : 메서드 호출 / (3, 7) : 전달인자(Argument)
//    }
//
//    public static int getMin(int a, int b) { //(int a, int b) : 매개변수(Parameter)
//        //int a; -> 사용 불가
//        //int args; -> 관계없기때문에 가능
//
//        if (a > b){
//            return b;
//        } else {
//            return a; //return 3이 실행 , main 에서 getMin(3, 7)을 지우고 return 3이 들어간다 == println (3);
//        }
//        // int getMin 의 타입(int 타입)과 return a,b의 타입이 동일해야한다.
//
//        //System.out.println("실행 끝"); //Unreachable statement 오류 발생 , return 은 해당구문을 즉시 종료하기 때문
//
//    }

    //----------------------
    /*
    접근 제한자 : public
    정적 : Yes
    추상적 : No
    반환 타입 : int
    메서드 이름 : getMax
    매개변수1 : int a
    매개변수2 : int b
    로직 : 전달 받은 매개변수 a 와 b중 더큰 값을 반환
     */
//    public static void main(String[] args) {
//        System.out.println(getMax(1,7));
//    }
//
//    public  static int getMax(int a, int b){
//        //방법1--------
////        if (a > b){
////            return a;
////        } else {
////            return b;
////        }
//
//        //방법2-----------
//        return a > b ? a : b;
//    }

    //----------------------------------
    /*
    접근 제한자 : public
    정적 : Yes
    추상적 : No
    반환 타입 : int
    메서드 이름 : getAbs
    매개변수 1 : int a
    로직 : 전달 받은 매개변수 a 와 b중 더큰 값을 반환
    비고 :
    -절댓값 : 어떠한 수에 부호가 없는 값으로, 양수는 절댓값과 같고,
             음수는 이에 -1을 곱한 값이 절댓값과 같다.
    호출결과:
    -getAbs(3) -> 3
    -getAbs(-17) -> 17
     */
//    public static void main(String[] args) {
//        System.out.println(getAbs(3));
//        System.out.println(getAbs(-17));
//    }
//
//    public static int getAbs(int a){//abs:절댓값(Absolute)
//        //방법1-----------------
////        if (a > 0){
////            return a;
////        } else {
////            return -a;
////        }
//        //방법2-------------
////        return a >= 0 ? a : -a;
//    }

    //---------------------------------------------------
    /*
    접근 제한자 : public
    정적 : Yes
    추상적 : No
    반환 타입 : long
    메서드 이름 : getPow
    매개변수 1 : int a
    매개변수 2 : int b
    로직 : 전달 받은 매개변수 a의 b승중 반환하는 메서드
    비고 : -단, 매개변수 a와 b는 자연수이다.
    호출결과:
    -getPow(2,4) -> 16 ; 2의 4승 은 16
    -getPow(3,8) -> 6561 ; 3의 8승은 6561
    ....
     */
//    public static void main(String[] args) {
//        System.out.println(getPow(2,4));
//        System.out.println(getPow(3,8));
//        System.out.println(getPow(16,8));
//        System.out.println(getPow(7,16));
//    }
//
//    public static long getPow(int a, int b){
//        long win = 1;
//        //int win = 1; 하면 int 범위를 넘어가게 되는 수는 0이 된다.(-가 붙으며 가장 작은 범위로 간다)
//        // -21억 -> 0 -> 21억 -> -21억.... : 범위를 넘는 수가 범위안에서 만족할만큼 계속 반복해서 돈다
//
//        for (int i = 1; i <= b; i++){ // i(a의 반복횟수를 정해주는 변수) <= b의 값
//            win *= a; // win = win * a;
//        }
//        return win;
//    }

    //---------

    /*
    접근 제한자 : public
    정적 : Yes
    추상적 : No
    반환 타입 : long
    메서드 이름 : getHighest
    매개변수 1 : int[] nums
    로직 : 전달 받은 매개변수 nums 가 가지고 있는 정수 중 가장 큰 값을 반환하는 메서드
    비고 :
    -Integer.MAX_VALUE : 정수(int)가 가질수 있는 최댓값
    -Integer.MIN_VALUE : 정수(int)가 가질수 있는 최솟값
    호출결과:
    - getHighest(new int[] {1, 10, 4, -1, 0, 6, 13, 91, 11}) -> 91
    - getHighest(new int[] {0}) -> 0
    - getHighest(new int[] {-167, -13, -1, -55, -103}) -> -1
     */

    public static void main(String[] args) {
        System.out.println(getHighest(new int[] {1, 10, 4, -1, 0, 6, 13, 91, 11}));
        System.out.println(getHighest(new int[] {0}));
        System.out.println(getHighest(new int[] {-167, -13, -1, -55, -103}));
        System.out.println("-----------------------");
        System.out.println(getAvg(new double[] {1, 3, 5}));
        System.out.println(getAvg(new double[] {10, 90}));

    }

    //방법1-----------------------------------
//    public static long getHighest(int[] nums){
//        int su = nums[0]; //배열의 첫번째 수가 와서 비교하는 숫자가된다.
//
//        for (int i = 0; i < nums.length; i++){
//            if (nums[i] > su){ //nums[i]에 배열들이 하나씩 와서 su 라는 변수와 비교함
//                               //su 는 nums 의 첫번째 숫자가 들어간다.
//                               // 첫번째 수와 배열들의 수를 하나씩 비교한다.
//                su = nums[i];  //nums[i] 배열에서 가장 큰수를 su에 넣는다.
//            }
//        }
//
//        return su;
//    }

    //---------------------------
    //방법2------------------------------------


    public static long getHighest(int[] nums){
        long su = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > su){
                su = nums[i];
            }
        }

        return su;
    }

    //-----------
    /*
    접근 제한자 : public
    정적 : Yes
    추상적 : No
    반환 타입 : double
    메서드 이름 : getAvg
    매개 변수 1 : double[] nums
    로직 : 전달 받은 실수형 변수 nums 가 가지고 있는 실수 들의 평균을 반환하는 메서드
    비고:
    호출 결과:
    - getAvg(new double[] {1, 3, 5}) -> 3.0
    - getAvg(new double[] {10, 90}) -> 50.0
     */
    public static double getAvg(double[] nums){
        double sum = 0;

        for (int i = 0; i < nums.length; i++){ //i < nums.length : i를 0으로 잡았을때 nums 의 길이 만큼
            //int i = 1; i <= nums.length; i++ 도 가능
            sum += nums[i]; //배열들의 총합 (sum = sum + num[i];) : sum 을 0으로 잡았으니 배열들을 하나씩 넣어 넣은것들의 총합
        }

        return sum / nums.length; //총합들의 평균 ; 배열들의 총합 / 배열의 길이
    }

}
