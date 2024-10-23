package sec03;

import java.util.*;

// 8. 등수구하기
public class Exam08 {
    public static void main(String[] args) {
        Exam08 exam08 = new Exam08();

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        exam08.solution(arr);
    }

    public void solution(int[] arr) {
        List<Integer> sortArr = new ArrayList<>();
        for (int score : arr) {
            sortArr.add(score);
        }
        // 내림차순 정렬
        Collections.sort(sortArr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < sortArr.size(); j++) {
                if (arr[i] == sortArr.get(j)) {
//                    arr[i] = j + 1;
                    System.out.print((j + 1) + " ");
                    break;
                }
            }
        }
//        System.out.println(Arrays.toString(arr));
    }
}
