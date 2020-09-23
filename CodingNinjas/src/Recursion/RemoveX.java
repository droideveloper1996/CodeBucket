package Recursion;

public class RemoveX {
    public static void main(String[] args) {
        System.out.println(removeX2("xxxxxxs"));
    }

    public static String removeX(String s) {
        if (s.length() == 0)
            return "";
        String answer = "";
        if (s.charAt(0) != 'x') {
            answer = answer + s.charAt(0);
        }
        String smallAnswer = removeX(s.substring(1));
        return answer + smallAnswer;
    }

    public static String removeX2(String s) {
        if (s.length() == 0)
            return "";
        String answer = "";
        String smallAnswer = removeX(s.substring(1));
        if (s.charAt(0) != 'x') {
            answer = answer + s.charAt(0);
        }
        return answer + smallAnswer;
    }


}
