package Recursion;

public class ReverseCharArray {
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        int start=0;
        int end=s.length;
        helper(s,start,end);
        for(int i=0;i<end;i++){
            System.out.println(s[i]);
        }
    }



    public static void helper(char[]s,int start,int end){
        if(start>end)
            return;
        char a=s[start];
        s[start]=s[end-1];
        s[end-1]=a;
        helper(s,start+1,end-1);
    }
}
