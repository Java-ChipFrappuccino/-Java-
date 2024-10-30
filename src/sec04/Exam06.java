package sec04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 6. 최대 길이 연속부분수열
public class Exam06 {
    public static void main(String[] args) {
        Exam06 exam = new Exam06();

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
