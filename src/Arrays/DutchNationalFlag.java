package Arrays;

public class DutchNationalFlag {
    /**
     *
     * TODO 3 Way partitioning
     */
    public static void main(String[] args) {

        int[] A = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int start=0;
        int end=A.length-1;
        int i=0;
        while(i<=end){
            if(A[i]==0){
                int temp=A[i];
                A[i]=A[start];
                A[start]=temp;
                ++start;
                i++;
            }
            else if(A[i]==2){
                int temp=A[i];
                A[i]=A[end];
                A[end]=temp;
                --end;
            }
             else{
                 i++;
             }
        }

        for(int ii=0;ii<A.length;ii++)
            System.out.print(A[ii]+" ");
        String s="abc";
        System.out.println(s.substring(0,0));

    }



}
