public class ChangeCase {
    public static void main(String[] args) {
        ChangeCase test = new ChangeCase();
        System.out.println(test.solution("try hello world"));
    }

    public String solution(String s) {
        String answer = "";
        String[] changeCase = s.split(" ");
        for (int i = 0; i < changeCase.length; i++) {
            answer += changeCase[i].substring(0, 1).toUpperCase();
            for (int j = 1; j < changeCase[i].length(); j++) {
                if (j % 2 != 0)
                    answer += Character.toString(changeCase[i].charAt(j)).toLowerCase();
                else
                    answer += Character.toString(changeCase[i].charAt(j)).toUpperCase();
            }
            answer += " ";
        }
        return answer;
    }
}
