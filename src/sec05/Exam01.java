package sec05;

import java.util.*;

// 1. 학급 회장(해쉬) (HashMap)
public class Exam01 {
    public static void main(String[] args) {
        Exam01 exam = new Exam01();

        Set<String> arr = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String vote = sc.next();

        exam.solution(vote);
    }

    public void solution(String vote) {
        Map<Character,Integer> map = new HashMap<>();
        for (char c : vote.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int maxVote = Integer.MIN_VALUE;
        char boss = ' ';
        for (Character c : map.keySet()) {
            if (map.get(c) > maxVote) {
                maxVote = map.get(c);
                boss = c;
            }
        }
        System.out.printf("학급회장은 %d표를 얻은 %c입니다!",maxVote,boss);
    }
}
