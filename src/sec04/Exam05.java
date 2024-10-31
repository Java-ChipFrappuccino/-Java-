package sec04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 5. 연속된 자연수의 합(two pointers)
public class Exam05 {
    public static void main(String[] args) {
        Exam05 exam = new Exam05();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        exam.solution(num);
    }

    public void solution(int num) {
        int sum = 0 , count = 0 , left = 0 , right = 0;
        for (int i = 1; i <= num / 2 + 1; i++) {
            sum += i;
            if (sum == num) {
                count++;
            } else if (sum > num) {
                while (sum > num) {
                    sum -= left++;
                    if (sum == num) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
