package sec03;

import java.util.Scanner;

// 6. 뒤집은 소수
public class Exam06 {
    public static void main(String[] args) {
        Exam06 exam06 = new Exam06();

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] arr = new String[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextLine();
        }
        exam06.solution(arr);
    }

    public void solution(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int reverseNum = Integer.parseInt(new StringBuilder(arr[i]).reverse().toString());
            if (reverseNum == 2) {
                System.out.print(reverseNum + " ");
                continue;
            }
            if (reverseNum % 2 == 0 || reverseNum == 1) {
                continue;
            }
            boolean isPrime = true;
            for (int j = 3; j <= Math.sqrt(reverseNum); j += 2) {
                if (reverseNum % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (!isPrime) {
                continue;
            }
            System.out.print(reverseNum + " ");
        }
    }
}
