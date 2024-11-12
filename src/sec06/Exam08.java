package sec06;

import java.util.*;

// 8. 응급실
public class Exam08 {
    public static void main(String[] args) {
        Exam08 exam = new Exam08();

        Scanner sc = new Scanner(System.in);
        int[] n = new int[sc.nextInt()];
        int m = sc.nextInt();
        Random rand = new Random();
        for (int i = 0; i < n.length; i++) {
            n[i] = rand.nextInt(51) + 50;
            System.out.print(n[i] + " ");
        }

        exam.solution(n , m);
    }

    public void solution(int[] n, int m) {
        Queue<Map<Integer, Integer>> q = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            Map<Integer, Integer> map1 = new HashMap<>();
            map1.put(i, n[i]);
            q.offer(map1);
        }
        while (!q.isEmpty()) {
            Map<Integer, Integer> map2 = q.poll();
            int danger = map2.values().iterator().next();
//            for (int i = 0; i < q.size(); i++) {
//                if (danger == map2.get(i)) {}
//            }
            for (Map<Integer, Integer> entry : q) {
                if (entry.values().iterator().next() > danger) {
                    q.offer(map2);
                    break;
                }

            }
            count++;
            if (map2.size() == m) {
                System.out.println(count);
                break;
            }
        }
    }
}
