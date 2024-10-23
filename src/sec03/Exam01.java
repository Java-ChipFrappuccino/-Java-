package sec03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 1. 큰 수 출력하기
public class Exam01 {
    public static void main(String[] args) {
        Exam01 exam01 = new Exam01();

        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            arr.add(sc.nextInt());
        }
        exam01.solution(arr);
    }

    public void solution(List<Integer> arr) {
        System.out.print(arr.get(0) + " ");
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                System.out.print(arr.get(i) + " ");
            }
        }
    }
}
