package sec07;

import java.util.*;

// 2. 버블정렬
public class Exam02 {
    public static void main(String[] args) {
        Exam02 exam = new Exam02();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < num; i++) arr.add(sc.nextInt());

        System.out.println(arr);
        exam.solution(arr);
    }

    public void solution(List<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    Collections.swap(arr, j, j + 1);
                }
            }
        }
        System.out.println(arr);
    }
}
