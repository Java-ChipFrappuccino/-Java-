package sec05;

import java.util.*;

// 3. 매출액의 종류 (Hash, sliding window)
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
        exam.solution(total,days,arr);
    }

    public void solution(int total, int days, List<Integer> arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < days - 1; i++) {
            map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);
        }
        int lt = 0;
        for (int rt = days - 1 ; rt < total; rt++) {
            map.put(arr.get(rt), map.getOrDefault(arr.get(rt), 0) + 1);
            System.out.print(map.size() + " ");
            map.put(arr.get(lt), map.getOrDefault(arr.get(lt), 0) - 1);
            if (map.get(arr.get(lt)) == 0) {
                map.remove(arr.get(lt));
            }
            lt++;
        }

    }
}
