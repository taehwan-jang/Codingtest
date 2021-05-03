/**
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면
 * False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
 */
public class Stringmanage {
    public boolean solution() {

        String s = "ad1234";
        char[] test = s.toCharArray();

        for (int i = 0; i < test.length; i++) {
            if (test[i] < '0' || test[i] > '9')
                return false;
        }
        if (test.length == 4 || test.length == 6)
            return true;
        else
            return true;

    }

}