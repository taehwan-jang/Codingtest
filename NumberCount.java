public class NumberCount {
    public static void main(String[] args) {
        NumberCount e = new NumberCount();
        System.out.println(e.solution());
    }

    public int solution() {
        int answer = 0;
        String a = "";
        int b = 123;
        a = Integer.toString(b);

        char[] c = a.toCharArray();
        for (int i = 0; i < c.length; i++) {
            answer += (c[i] - '0');
        }

        return answer;
    }
}
