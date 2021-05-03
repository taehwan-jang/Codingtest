public class Keypad {
    int li = 3;
    int lj = 0;
    int ri = 3;
    int rj = 2;

    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5, 6, 7 };
        String hand = "right";
        Keypad sol = new Keypad();
        System.out.println(sol.solution(num, hand));
    }

    public String solution(int[] numbers, String hand) {
        String answer = "";
        for (int a : numbers) {
            switch (a) {
                case 1:
                    li = 0;
                    lj = 0;
                    answer += "L";
                    break;
                case 2:
                    if (Math.abs(li - 0) + Math.abs(lj - 1) > Math.abs(ri - 0) + Math.abs(rj - 1)) {
                        answer += "R";
                        ri = 0;
                        rj = 1;
                        break;
                    } else if (Math.abs(li - 0) + Math.abs(lj - 1) < Math.abs(ri - 0) + Math.abs(rj - 1)) {
                        answer += "L";
                        li = 0;
                        lj = 1;
                        break;
                    } else {
                        if (hand.equals("right")) {
                            answer += "R";
                            ri = 0;
                            rj = 1;
                            break;
                        } else {
                            answer += "L";
                            li = 0;
                            lj = 1;
                            break;
                        }
                    }
                case 3:
                    ri = 0;
                    rj = 2;
                    answer += "R";
                    break;
                case 4:
                    li = 1;
                    lj = 0;
                    answer += "L";
                    break;
                case 5:
                    if (Math.abs(li - 1) + Math.abs(lj - 1) > Math.abs(ri - 1) + Math.abs(rj - 1)) {
                        answer += "R";
                        ri = 1;
                        rj = 1;
                        break;
                    } else if (Math.abs(li - 1) + Math.abs(lj - 1) < Math.abs(ri - 1) + Math.abs(rj - 1)) {
                        answer += "L";
                        li = 1;
                        lj = 1;
                        break;
                    } else {
                        if (hand.equals("right")) {
                            answer += "R";
                            ri = 1;
                            rj = 1;
                            break;
                        } else {
                            answer += "L";
                            li = 1;
                            lj = 1;
                            break;
                        }
                    }
                case 6:
                    ri = 1;
                    rj = 2;
                    answer += "R";
                    break;
                case 7:
                    li = 2;
                    lj = 0;
                    answer += "L";
                    break;
                case 8:
                    if (Math.abs(li - 2) + Math.abs(lj - 1) > Math.abs(ri - 2) + Math.abs(rj - 1)) {
                        answer += "R";
                        ri = 2;
                        rj = 1;
                        break;
                    } else if (Math.abs(li - 2) + Math.abs(lj - 1) < Math.abs(ri - 2) + Math.abs(rj - 1)) {
                        answer += "L";
                        li = 2;
                        lj = 1;
                        break;
                    } else {
                        if (hand.equals("right")) {
                            answer += "R";
                            ri = 2;
                            rj = 1;
                            break;
                        } else {
                            answer += "L";
                            li = 2;
                            lj = 1;
                            break;
                        }
                    }
                case 9:
                    ri = 2;
                    rj = 2;
                    answer += "R";
                    break;
                case 0:
                    if (Math.abs(li - 3) + Math.abs(lj - 1) > Math.abs(ri - 3) + Math.abs(rj - 1)) {
                        answer += "R";
                        ri = 3;
                        rj = 1;
                        break;
                    } else if (Math.abs(li - 3) + Math.abs(lj - 1) < Math.abs(ri - 3) + Math.abs(rj - 1)) {
                        answer += "L";
                        li = 3;
                        lj = 1;
                        break;
                    } else {
                        if (hand.equals("right")) {
                            answer += "R";
                            ri = 3;
                            rj = 1;
                            break;
                        } else {
                            answer += "L";
                            li = 3;
                            lj = 1;
                            break;
                        }
                    }
            }
        }
        return answer;
    }
}
