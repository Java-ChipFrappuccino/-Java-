package sec03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 4. 피보나치 수열
public class Exam04 {
    public static void main(String[] args) {
        Exam04 exam04 = new Exam04();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println(Arrays.toString(exam04.solution(arr)));
//        exam04.solution(arr);
    }

    public int[] solution(int[] arr) {
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i > 1) {
                arr[i] = arr[i - 2] + arr[i - 1];
//                System.out.printf("%d ", arr[i - 2] + arr[i - 1]);
                continue;
            }
//            System.out.printf("%d ", arr[i]);
        }
        return arr;
    }
}
