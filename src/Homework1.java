import java.util.Arrays;

public class Homework1 {

    //задание 1
    public static void main(String[] args) {

    // задание 2
        int a = 0;
        long b = 0;
        short c = 0;
        boolean d = false;
        String e = "First homework";
        char f = 'f';
        float g = 0f;
        double h = 0d;

       int n = 6;
       for (int i = 0;i<3;++i){
           try {
               n/=i;

           }
           catch (Exception y) {
               n+=2;
           }
       }

       int[] arr = {1,2,3,4,5,6};
       System.out.println(Arrays.toString(arr));
       Homework2.task7(arr,2);
       System.out.println(Arrays.toString(arr));

    }

    // задание 3
    private static float formula(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    // задание 4
    private static boolean sumBetween(int a, int b) {
        int c = a+b;
        return (c >= 10 && c <= 20);
    }

    // задание 5
    private static void numberKind(int a){
        if (a >= 0)
            System.out.println( a + " это положительное число");
        else
            System.out.println( a + " это отрицательное число");
    }

    // задание 6
    private static boolean isNegativeNumber(int a) {
        return (a < 0);
    }

    // задание 7
    private static void helloName(String name) {
        System.out.println("Привет, " + name);
    }

    // задание 8
    private static void leapYear(int year) {

        boolean isLeap = false;

        if (year % 400 == 0)
            isLeap = true;
        else if (year % 100 == 0)
            isLeap = false;
        else if (year % 4 == 0)
            isLeap = true;

        if (isLeap)
            System.out.println( year + " это високосный год");
        else
            System.out.println( year + " это не високосный год");

    }

    private static String c(int f, int t) {
        if (f==t)
            return ""+t;
        else
            return (f + c(f+1,t));
    }
}
