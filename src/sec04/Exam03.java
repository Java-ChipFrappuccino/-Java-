package sec04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 3. 최대 매출 (Sliding window)
public class Exam03 {
    public static void main(String[] args) {
        Exam03 exam = new Exam03();

        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int days = sc.nextInt();

        for (int i = 0; i < total; i++) {
            arr.add(sc.nextInt());
        }
        exam.solution(arr , days);
    }

    public void solution(List<Integer> arr, int days) {
        int sum = 0;
        int maxSales = 0;

        for (int i = 0; i < days; i++) {
            sum += arr.get(i);
        }
        maxSales = sum;

        // 슬라이딩 윈도우 적용
        for (int i = days; i < arr.size(); i++) {
            sum += arr.get(i) - arr.get(i - days);
            maxSales = Math.max(maxSales, sum);
        }

        System.out.println("Max Sales: " + maxSales);

    }
}
