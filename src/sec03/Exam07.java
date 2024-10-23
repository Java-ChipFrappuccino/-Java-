package sec03;

import java.util.Scanner;

// 7. 점수계산
public class Exam07 {
    public static void main(String[] args) {
        Exam07 exam07 = new Exam07();

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        exam07.solution(arr);
    }

    public void solution(int[] arr) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count = 0;
                continue;
            } else if (arr[i] == 1) {
                    count++;
                    sum += count;
            }
        }
        System.out.println(sum);
    }
}
