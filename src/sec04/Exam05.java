package sec04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 5. 연속된 자연수의 합(two pointers)
public class Exam05 {
    public static void main(String[] args) {
        Exam05 exam = new Exam05();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        exam.solution(num);
        int n = 5;     // n의 초기값은 5
        n = 3 + n++;
        System.out.println();
        System.out.println(n);
    }
    // two pointers 기법
    public void solution(int num) {
        int count = 0;
        int sum = 0;
        int left = 1;

        for (int right = 1; right <= num / 2 + 1; right++) {
            sum += right; // 오른쪽 포인터를 증가하면서 합을 추가

            while (sum > num) { // 합이 num을 초과하면 왼쪽 포인터를 이동하여 합을 줄임
                sum -= left++;
            }

            if (sum == num) { // 합이 num과 같으면 경우의 수를 증가
                count++;
            }
        }

        System.out.println(count);
    }
    // 수학적 접근방식
//    public int solution(int n){
//        int answer=0, cnt=1;
//        n--;
//        while(n>0){
//            cnt++;
//            n=n-cnt;
//            if(n%cnt==0) answer++;
//        }
//        return answer;
//    }
}
