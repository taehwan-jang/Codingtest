import java.util.ArrayList;

public class Numbertoarray {
    public static void main(String[] args) {
        Numbertoarray test = new Numbertoarray();
        long n = 12345;
        System.out.println(test.solution(n));
    }

    public int[] solution(long n) {
        int[] answer = {};
        ArrayList<Long> temp = new ArrayList<Long>();
        while (true) {
            System.out.println(n % 10);
            temp.add(n % 10);
            if (n < 10) {
                System.out.println("프린트못하냐" + n);
                temp.add(n);
                break;
            }
            n /= 10;
        }
        answer = new int[temp.size()];
        int index = 0;
        for (Long a : temp) {
            answer[index++] = (int) (long) a;
        }
        return answer;
    }
}
