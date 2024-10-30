package sec04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 5. 연속된 자연수의 합(two pointers)
public class Exam05 {
    public static void main(String[] args) {
        Exam05 exam = new Exam05();

        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            arr.add(sc.nextInt());
        }
        exam.solution(arr);
    }

    public void solution(List<Integer> arr) {

    }
}
