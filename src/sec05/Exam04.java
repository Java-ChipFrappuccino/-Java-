package sec05;

import java.util.*;

// 4. 모든 아나그램 찾기 (Hash, sliding window : 시간복잡도 O(n))
public class Exam04 {
    public static void main(String[] args) {
        Exam04 exam = new Exam04();

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        exam.solution(a,b);
    }

    public void solution(String a, String b) {
        int answer = 0;
        Map<Character, Integer> am = new HashMap<>();
        Map<Character, Integer> bm = new HashMap<>();
        for (char c : b.toCharArray()) {
            bm.put(c, bm.getOrDefault(c, 0) + 1);
        }
        int first = b.length() - 1;
        for (int i = 0; i < first; i++) {
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
        }
        int lt = 0;
        for (int rt = first; rt < a.length(); rt++) {
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
            if (am.equals(bm)) {
                answer++;
            }
            am.put(a.charAt(lt), am.getOrDefault(a.charAt(lt), 0) - 1);
            if (am.get(a.charAt(lt)) == 0) {
                am.remove(a.charAt(lt));
            }
            lt++;
        }
        System.out.println(answer);
    }
}
