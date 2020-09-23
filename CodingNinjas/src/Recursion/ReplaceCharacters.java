package Recursion;

public class ReplaceCharacters {
    public static void main(String[] args) {
        System.out.println(replaceCharacter2("abacd", 'a', 'x'));
    }

    public static String replaceCharacter(String s, char a, char b) {
        if (s.length() == 0)
            return "";
        String result = "";
        String smallAns = replaceCharacter(s.substring(1), a, b);
        if (s.charAt(0) == a) {
            result = b + smallAns;
        } else {
            result = s.charAt(0) + smallAns;
        }
        return result;
    }

    public static String replaceCharacter2(String s, char a, char b) {
        if (s.length() == 0)
            return "";
        String result = "";
        if (s.charAt(0) == a) {
            result = result + b;
        } else {
           result=result+s.charAt(0);
        }
        String smallAns=replaceCharacter2(s.substring(1),a,b);
        return result+smallAns;
    }
}
