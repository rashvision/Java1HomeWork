/** Домашнее задание №2
 * @version 19.07.2018
 * @author Рашид Бахмутов
 */

public class Homework2 {

    public static void task1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0;i < arr.length; i++) {
            arr[i] = Math.abs(arr[i]-1);
        }
    }

    public static void task2() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i*3;
        }
    }

    public static void task3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i=0; i<arr.length;i++) {
            if (arr[i] < 6)
                arr[i] *= 2;
        }
    }

    public static void task4() {
        int[][] arr = new int[10][10];
        for(int i=0; i<arr.length;i++) {
            arr[i][i] = 1;
            arr[i][arr.length-i-1] = 1;
        }
    }

    public static void task5() {
        int[] arr = {1,2,3,4,5,6,7,8};
        int max = 0;
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max])
                max = i;
            if (arr[i] < arr[min])
                min = i;
        }

        System.out.println("Максимальный элемент массива: " + arr[max] + " под номером " + max+1);
        System.out.println("Минимальный элемент массива: " + arr[min] + " под номером " + min+1);
    }

    public static boolean task6(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            if (sumOfArrayPart(arr,0,i) == sumOfArrayPart(arr,i+1,arr.length-1) )
                return true;
        }
        return false;
    }

    public static int sumOfArrayPart(int[] arr, int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void task7(int[] arr, int n) {

        int vector = n > 0 ? 1:-1;
        for (int i = 0; i < n*vector; i++) {

            int a = vector < 0 ? 0 : arr.length - 1 ;
            int buffer = arr[a];
            for (int j = 0; j < arr.length-1; j++) {
                arr[a-j*vector] = arr[a-j*vector-vector];
            }
            arr[(arr.length-1)-a] = buffer;
        }



    }

}
