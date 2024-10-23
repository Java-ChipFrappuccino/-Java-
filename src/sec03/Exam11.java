package sec03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 11. 임시반장정하기
public class Exam11 {
    public static void main(String[] args) {
        Exam11 exam11 = new Exam11();

        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            arr.add(sc.nextInt());
        }
        exam11.solution(arr);
    }

    public void solution(List<Integer> arr) {

    }
}
