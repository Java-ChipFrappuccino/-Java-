package sec03;

import java.util.Scanner;

// 9. 격자판 최대합
public class Exam09 {
    public static void main(String[] args) {
        Exam09 exam09 = new Exam09();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        exam09.solution(arr);
    }

    public void solution(int[] arr) {

    }
}
