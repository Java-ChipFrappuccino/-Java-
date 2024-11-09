package sec03;

import java.util.Scanner;

// 5. 소수 (에라토스테네스 체)
public class Exam05 {
    public static void main(String[] args) {
        Exam05 exam05 = new Exam05();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        exam05.solution(num);
    }

//    public void solution(int num) {
//        int count = 1;
//        if (num < 2) {
//            System.out.println(count);
//            return;
//        }
//        for (int i = 3; i <= num; i++) {
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) {
//                    break; // 더 이상 확인할 필요 없음
//                }
//            }
//                count++; // 소수라면 카운트
//            }
//        System.out.println(count);
//    }

    public void solution(int num) {
        int count = 0;
        int[] arr = new int[num + 1];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
                for (int j = i; j < arr.length; j += i) {
                    arr[j] = 1;
                }
            }
        }
        System.out.println(count);
    }
}
