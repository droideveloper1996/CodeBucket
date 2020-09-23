package Recursion;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String res=removeConsecutiveDuplicates2("xxxyyyzwwzzz");
        System.out.println(res);
    }
    public static String removeConsecutiveDuplicates(String input){
        if(input.length()==1)
            return input;
        String result="";
        String smallAns=removeConsecutiveDuplicates(input.substring(1));
        if(input.charAt(0)==input.charAt(1))
            result=smallAns;
        else
            result=input.charAt(0)+smallAns;
        return result;

    }

    public static String removeConsecutiveDuplicates2(String input){
        if(input.length()==1)
            return input;
        String result="";
        if(input.charAt(0)!=input.charAt(1)){
            result=result+input.charAt(0);
        }
        String smallAns=removeConsecutiveDuplicates2(input.substring(1));
        return result+smallAns;

    }
}
