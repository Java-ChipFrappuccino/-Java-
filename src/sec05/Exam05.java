package sec05;

import java.util.*;

// 5. K번째 큰 수
public class Exam05 {
    public static void main(String[] args) {
        Exam05 exam = new Exam05();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        exam.solution(n,k,arr);
    }

    public void solution(int n, int k, int[] arr) {
        int answer = -1;
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int c=j+1; c<n; c++){
                    set.add(arr[i] + arr[j] + arr[c]);
                }
            }
        }
        Iterator<Integer> it = set.iterator();
        int count = 0;
//        while(it.hasNext()){
//            answer = it.next(); // hasNext()는 단순히 다음값이 있는지 여부(boolean)만 반환하기때문에 next()로 값을 꺼내주지 않으면 이터레이터가 무한루프에 빠지게 된다!
//            count++;
//            if(count == k){
//                System.out.println(answer);
//                return;
//            }
//        }
        for (Integer i : set) {
            count++;
            if (count == k) {
                answer = i;
                System.out.println(answer);
                return;
            }
        }
        System.out.println(answer);
    }
}
