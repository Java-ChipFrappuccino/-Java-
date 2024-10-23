package sec03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 12. 멘토링
public class Exam12 {
    public static void main(String[] args) {
        Exam12 exam12 = new Exam12();

        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            arr.add(sc.nextInt());
        }
        exam12.solution(arr);
    }

    public void solution(List<Integer> arr) {

    }
}
