package sec07;

import java.util.*;

import static java.util.Collections.swap;

// 1. 선택정렬
public class Exam01 {
    public static void main(String[] args) {
        Exam01 exam = new Exam01();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        int[] arr = new int[num];
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < num; i++) /*arr[i] = sc.nextInt();*/
        arr.add(sc.nextInt());

        System.out.println(arr);
        exam.solution(arr);
    }

    public void solution(List<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(idx) > arr.get(j)) {
                    idx = j;
                }
            }
//            int temp = arr[i];
//            arr[i] = arr[idx];
//            arr[idx] = temp;
            Collections.swap(arr , i , idx);
        }
        System.out.println(arr);
    }
}
