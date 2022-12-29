public class First
{
    /*
    public static void main(String[] args) //프로그램 시작점

    {
        System.out.println("Hello"); //==cout / sout 을 치고 텝하면 자동완성 ; 실행 ctrl + shift + f10
        System.out.println("World");
        System.out.println("<애국가>");
        System.out.println("1절 : 동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세 " +
                "무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세");
        System.out.println("2절 : 남산위에 저 소나무 철갑을 두른듯 바람서리 불변함은 우리기상일세 " +
                "무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세");
        System.out.println("3절 : 가을 하늘 공활한데 높고구름 없이 밝은 달은 우리가슴 일편단심일세 " +
                "무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세");
        System.out.println("4절 : 이 기상과 이맘으로 충성을 다하여 괴로우나 즐거우나 나라사랑하세 " +
                "무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세");

        System.out.println("Hello\nWorld");
        //------------------------------------------------------------------------
        int ten1; //[타입] [변수이름]
        int ten2 = 10; //[타입] [변수이름] = [초기값]
        System.out.println(ten2);

        System.out.println("----------2022-12-22 수업완료 복습중----------");
    }
    */
//2022-12-23===============================================================================
    //상수-------------------------------------------

    /*
    public static void main(String[] args)
    {
        final double pi = 3.14D;

        //pi = 17; (x)
        // Cannot assign a value to final variable 'pi':값이 정해진 상태에서 값을 대입할수 없다.

        final double pi2; //여기에 값을 대입하지 않은 상태에서

        pi2 = 3.14D; // 딱 한번 값을 넣을수 있다.

        System.out.println(pi);
        System.out.println(pi2);
    }
    */

    //주석----------------------------------

//    public static void main(String[] args)
//    {
//        System.out.println("이 줄만 주석"); //ctrl + /  : 이 줄만 주석

//        for ()
//        {
//          드래그 후 ctrl + / : 드래그한 부분만 주석처리
//        }
//    }

    //연산자----------------------------------
    //산술연산자>>>

//    public static void main(String[] args)
//    {
//        int age = 17 + 1; //우선순위 = + ; 우선순위를 먼저 하고 age에 대입한다.
//    }

//    public static void main(String[] args)
//    {
//        int age = 17 + 1 - 5; // + 와 - 연산자는 동률의 우선순위를 가지므로 왼쪽에서 오른족으로 계산한다고 생각하면 된다.
//    }


//    public static void main(String[] args)
//    {
//        int age = 6 - 2 * 3; //곱셈먼저한후 나온 값을 6이랑 뺀다 ; 6 - 6 = 0
//    }


//    public static void main(String[] args)
//    {
//        System.out.println(10 / 3); // >>> 3
//        // 10 int / 3 int  = int 가 나와야한다
//
//        //int형이 아닌 실제값이 나오게 하려면?
//
//        System.out.println(10.0 / 3.0);
//        System.out.println(10D / 3D); //( int /  double) 이것도 가능
//        System.out.println(10F / 3F);
//    }

//
//    public static void main(String[] args)
//    {
//        System.out.println(5564122 % 2); // 0 - 짝수
//        System.out.println( 17 % 2); // 1 - 홀수
//    }

    //비교연산자>>>

//    public static void main(String[] args)
//    {
//        System.out.println(10 + 1 > 11); //우선순위가 + 가 높기때문에 더하고 비교한다.
//
//        boolean is = 10 + 1 > 11; // +(산술연산자) 가 우선순위가 높아 먼저  더한후(초과연산자) 비교한후 대입(대입연산자)한다
//    }

//    public static void main(String[] args)
//    {
//        boolean is = (17 % 2 > 0 == true); // '%' -> '>' -> '==' -> '='
//        System.out.println(is);
//    }

    //논리연산자>>>
//    public static void main(String[] args)
//    {
//        boolean is = true || false && true || false;
//        //'true || false || false' -> 'true || false' -> 'true'
//        System.out.println(is);
//    }

//    public static void main(String[] args)
//    {
//        boolean is = 7 > 3 && 10 % 2 == 0;
//        //'true && 0 == 0' -> 'true && true' -> 'true'
//        System.out.println(is);
//    }

    //삼항연산자>>>
//    public static void main(String[] args)
//    {
//        String eo = 2200 % 2 == 0 ? "짝" : "홀";
//        //0 == 0 true
//        //true ? "짝"(t값) : "홀"(f값) -> '짝' -> '=' -> eo = 짝
//        System.out.println(eo);
//    }


    //대입연산자>>>
//    public static void main(String[] args)
//    {
//        double pi;
//
//        pi = 3.14; // a = b b의값을 a에 대입한다
//
//        //3.14 = 56 (x) a = 값이 될수가 없다.
//
//        System.out.println(pi);
//    }

//    //복합대입연산자>>>
//    public static void main(String[] args) {
//        int num = 17;
//        num *= 2; //num = num * 2;  *가 우선순위가 높아서 먼저 계산 후 대입
//        System.out.println(num);
//    }

    //부호 연산자>>>
//    public static void main(String[] args) {
//        int a = 10;
//        int b = -5;
//        int result = a - -b; //- b : -와 b를 띄우면 그냥 빼기가되기때문에 주의할것
//        // -(-5) > 5 -> 10 - 5 -> 5 -> result
//        System.out.println(result);
//    }

    //ctrl + alt + L :자주 눌러볼것 (컴퓨터가 식을 어떻게 인식하고 있는지 보여줌)

    //전위 증가 연산자>>>
//    public static void main(String[] args) {
//        int num = 0;
//
//        System.out.println(num + 1);
//        System.out.println(num);
//
//        System.out.println(++num);
//        System.out.println(num);
//    }

    //논리부정 연산자>>>
//    public static void main(String[] args) {
//        boolean is = !(10 > 5); //!(true) -> false
//        System.out.println(is);
//    }

    //형변환 연산자>>>
//    public static void main(String[] args)
//    {
//        double a = (double) 10 / 3; //(double):연산자임 ; 연산자 3개있음
//        //10D / 3 -> 10D / 3D -> 3.333... -> a
//        System.out.println(a);
//
//        double b = (double)(10/3);
//        //(double)(3) -> 3.0 -> a
//        System.out.println(b);
//    }

    //객체멤버연산자>>>
//    public static void main(String[] args) {
//        System.out.println(Math.PI + 1D > 4D);
//        //Math.PI + 1D > 4D(연산자3개) ; . 이 우선순위가 높음
//        //3.1415.... + 1D > 4D -> 4.1415 > 4 -> true
//
//        System.out.println((int) Math.PI);
//        //Math.PI -> int로 형변환
//    }

    //문제-------------------------------------------
    /*
    1.리터널 사용금지 -값 바로 대입
    2.a,b,c,d 및 연산자 외 사용 금지

    100.0 이 이니라 100이 찍혀야함
    a,b,c,d 다 언써도 괜찮
    */
//    public static void main(String[] args)
//    {
//        int a = 17;
//        int b = 12;
//        int c = 51;
//        double d = 9D;
//
//        System.out.println(a+b+c+(int)d + a - ((b - (int)d) + (b - (int)d)));
//        System.out.println(b*(int)d-(a-(int)d));
//
//        System.out.println(--c + c); //재활용불가
//        System.out.println(c + c);
//    }


}


