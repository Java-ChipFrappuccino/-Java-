package sec04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// 6. 최대 길이 연속부분수열
public class Exam06 {
    public static void main(String[] args) {
        Exam06 exam = new Exam06();

        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        Random rand = new Random();
        for (int i = 0; i < num; i++) {
//            arr.add(rand.nextInt(2));
            arr.add(sc.nextInt());
        }
        System.out.println(arr.toString());
        exam.solution(arr , k);
    }

    public void solution(List<Integer> arr , int k) {
        int answer=0, cnt=0, lt=0;
        for(int rt=0; rt<arr.size(); rt++){
            if(arr.get(rt)==0) cnt++;
            while(cnt>k){
                if(arr.get(lt)==0) cnt--;
                lt++;
            }
            answer=Math.max(answer, rt-lt+1);
        }
        System.out.println(answer);

    }
}
