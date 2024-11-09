package sec05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

// 2. 아나그램 (HashMap)
public class Exam02 {
    public static void main(String[] args) {
        Exam02 exam = new Exam02();

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        exam.solution(a, b);
    }

    public void solution(String a, String b) {
        String answer = "YES";
        HashMap<Character, Integer> map=new HashMap<>();
        for (char c : a.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : b.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                answer = "NO";
                break;
            }
            map.put(c, map.get(c) - 1);
        }
        System.out.println(answer);
    }
}
