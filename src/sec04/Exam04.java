package sec04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

// 4. 연속부분수열 (복합적 문제)
public class Exam04 {
    public static void main(String[] args) {
        Exam04 exam = new Exam04();

        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int list = sc.nextInt();
        int num = sc.nextInt();

        for (int i = 0; i < list; i++) {
            arr.add(sc.nextInt());
        }
        exam.solution(arr , num);
    }

    public void solution(List<Integer> arr, int num) {
//        int count = 0;
//        int repeatIndex = 0;
//        int sum = 0;
//        for (int i = 0; i < arr.size(); i++) {
//            sum += arr.get(i);
//            if (sum == num || sum > num) {
//                if (sum == num) {
//                    count++;
//                }
//                sum = 0;
//                i = repeatIndex;
//                repeatIndex++;
//            }
//        }
//        System.out.println(count);

        int count = 0;
        int sum = 0;
        int right = 0, left = 0;
        for (; right < arr.size(); right++) {
            sum += arr.get(right);
            if (sum == num) count++;
            while (sum >= num) {
                sum -= arr.get(left++);
                if (sum == num) count++;
            }
        }
        System.out.println(count);
    }
}
