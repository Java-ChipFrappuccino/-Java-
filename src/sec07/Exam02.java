package sec07;

import java.util.Scanner;
import java.util.Stack;

// 2. 버블정렬
public class Exam02 {
    public static void main(String[] args) {
        Exam02 exam = new Exam02();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) arr[i] = sc.nextInt();

        exam.solution(arr);
    }

    public void solution(int[] arr) {

    }
}
