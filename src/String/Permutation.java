package String;

public class Permutation {
    public static void main(String[] args) {
         pemutate("abc","");
    }

    static void pemutate(String s,String soFar){
        if(s.length()==0){
            System.out.println(soFar);
            return;
        }
        for(int i=0;i<s.length();i++){
            String smallAns= soFar+s.charAt(i);
            pemutate(s.substring(0,i)+s.substring(i+1),smallAns);
        }
    }
}
