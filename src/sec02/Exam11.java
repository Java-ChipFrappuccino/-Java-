package sec02;

import java.util.Scanner;

// 11. 문자열 압축
public class Exam11 {
    public static void main(String[] args) {
        Exam11 exam11 = new Exam11();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        exam11.solution(str);
    }

    public void solution(String str) {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < chars.length; i++) {
            count = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                } else {
                    if (count == 1) {
                        sb.append(chars[i]);
                        i++;
                    } else {
                        sb.append(chars[i])
                        .append(count);
                        i += count;
                    }
                    break;
                }

            }
        }
        System.out.println((sb.toString())); // 인트형으로 바꿔서 앞에 불필요하게 붙는 0들을 잘라줄수있다!
    }
}
